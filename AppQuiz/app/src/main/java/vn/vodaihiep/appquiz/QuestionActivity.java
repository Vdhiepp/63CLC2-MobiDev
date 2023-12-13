package vn.vodaihiep.appquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.List;

public class QuestionActivity extends AppCompatActivity {

    private TextView tvQuestion;
    private TextView tvScore;
    private TextView tvCount;
    private TextView tvCountDown;
    private RadioGroup rd;
    private RadioButton rb1;
    private RadioButton rb2;
    private RadioButton rb3;
    private RadioButton rb4;
    private Button btnConfirm;

    private List<Question> questionList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);

        tvQuestion = findViewById(R.id.tv_question);
        tvScore = findViewById(R.id.tv_view_score);
        tvCount = findViewById(R.id.tv_question_count);
        tvCountDown = findViewById(R.id.tv_countdown);
        rd = findViewById(R.id.radio_group);
        rb1 = findViewById(R.id.radio_bt1);
        rb2 = findViewById(R.id.radio_bt2);
        rb3 = findViewById(R.id.radio_bt3);
        rb4 = findViewById(R.id.radio_bt4);
        btnConfirm = findViewById(R.id.btn_next);

        QuestionHelper dbHelper = new QuestionHelper(this);
        questionList = dbHelper.getAllQuestions();
    }
}