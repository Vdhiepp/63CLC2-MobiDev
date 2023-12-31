package vn.vodaihiep.apptracnghiem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class QuestionChemistryActivity extends AppCompatActivity {
    SQLiteDatabase dbQuestion;
    Cursor contro;
    CountDownTimer countDownTimer;
    TextView countDown;
    int diem = 0; // Biến để lưu điểm
    TextView tvDiem; // TextView để hiển thị điểm
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_chemistry);

        dbQuestion = openOrCreateDatabase("QuestionChemistry.db", MODE_PRIVATE, null);
        contro = dbQuestion.rawQuery("Select * from QUESTIONS", null);
        contro.moveToFirst();

        CapNhatManHinh();

        Button btnNext = findViewById(R.id.btn_next);
        btnNext.setOnClickListener(xulyNext);

        //Count Down
        countDown = findViewById(R.id.tv_countdown);
        startCountdown(5 * 60 * 1000);
        //Hien thi Diem
        tvDiem = findViewById(R.id.tv_view_score);
    }
    public void CapNhatManHinh(){

        int idQuestion = contro.getInt(0);
        String question = contro.getString(1);
        String option1 = contro.getString(2);
        String option2 = contro.getString(3);
        String option3 = contro.getString(4);
        String option4 = contro.getString(5);
        int answer = contro.getInt(6);

        TextView idQues = findViewById(R.id.tv_question_id);
        TextView ques = findViewById(R.id.tv_question);
        RadioButton op1 = findViewById(R.id.radio_bt1);
        RadioButton op2 = findViewById(R.id.radio_bt2);
        RadioButton op3 = findViewById(R.id.radio_bt3);
        RadioButton op4 = findViewById(R.id.radio_bt4);

        idQues.setText(String.valueOf(idQuestion));
        ques.setText(String.valueOf(question));
        op1.setText(String.valueOf(option1));
        op2.setText(String.valueOf(option2));
        op3.setText(String.valueOf(option3));
        op4.setText(String.valueOf(option4));

    }
    View.OnClickListener xulyNext = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (!contro.isLast()) {
                contro.moveToNext();
                CapNhatManHinh();
            } else
            // Nếu là câu hỏi cuối cùng, hiển thị điểm và chuyển đến EndActivity
                showScoreAndFinish();
        }
    };
    private void startCountdown(long millisInFuture) {
        countDownTimer = new CountDownTimer(millisInFuture, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                updateCountdownText(millisUntilFinished);
            }

            @Override
            public void onFinish() {
                countDown.setText("Hết thời gian!");
                redirectToEndActivity();
            }
        }.start();
    }
    private void redirectToEndActivity() {
        Intent intent = new Intent(QuestionChemistryActivity.this, EndActivity.class);
        startActivity(intent);

        finish();
    }
    private void updateCountdownText(long millisUntilFinished) {
        int minutes = (int) (millisUntilFinished / 1000) / 60;
        int seconds = (int) (millisUntilFinished / 1000) % 60;

        String timeLeftFormatted = String.format("%02d:%02d", minutes, seconds);
        countDown.setText(timeLeftFormatted);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }

    public void checkAnswer(int selectedOption) {
        int questionId = contro.getInt(0);
        int correctAnswer = contro.getInt(6);

        if (selectedOption == correctAnswer) {
            diem+= 10; // Tăng điểm lên 10 nếu tùy chọn đã chọn là đúng
        }

        // Hiển thị điểm được cập nhật
        updateDiemTextView();
    }
    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        if (checked) {
            int selectedOption = Integer.parseInt(view.getTag().toString());

            checkAnswer(selectedOption);

            if (contro.isLast()) {
                // Nếu đến câu hỏi cuối cùng, hiển thị điểm và kết thúc
                showScoreAndFinish();

            } else {
                contro.moveToNext();
                CapNhatManHinh();
            }
        }
    }

    private void updateDiemTextView() {
        tvDiem.setText("Điểm: " + diem);
    }
    private void showScoreAndFinish() {
        updateDiemTextView();
        // Tạo Intent để chuyển sang KetThucActivity
        Intent intent = new Intent(QuestionChemistryActivity.this, EndActivity.class);
        // Truyền điểm sang KetThucActivity
        intent.putExtra("DIEM", diem);
        startActivity(intent);
    }
}