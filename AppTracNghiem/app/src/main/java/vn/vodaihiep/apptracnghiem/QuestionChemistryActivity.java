package vn.vodaihiep.apptracnghiem;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class QuestionChemistryActivity extends AppCompatActivity {
    SQLiteDatabase dbQuestion;
    Cursor contro;
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
            }
        }
    };
}