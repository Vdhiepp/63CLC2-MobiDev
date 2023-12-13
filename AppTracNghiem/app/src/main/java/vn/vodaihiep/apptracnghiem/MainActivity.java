package vn.vodaihiep.apptracnghiem;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

import vn.vodaihiep.apptracnghiem.model.Category;

public class MainActivity extends AppCompatActivity {
    private TextView textViewHighScore;
    private Spinner spinnerCategory;
    private Button buttonStartQuestion;
    private static final int REQUEST_CODE_QUESTION = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Button btStart = findViewById(R.id.bt_start);
//        btStart.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startQuestion();
//            }
//        });
//        AnhXa();
//        //Load chủ đề
//        loadCategories();
//        //click bắt đầu
//        buttonStartQuestion.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startQuestion();
//            }
//        });
    }
//    private void startQuestion(){
//        Intent intent = new Intent(MainActivity.this, QuestionActivity.class);
//        startActivity(intent);
//    }
    public void sangManHinhChuDe(View v){
        Intent intent = new Intent( getBaseContext(),
                ChoiceActivity.class);
        startActivity(intent);
    }
    public void sangManHinhLogin(View v){
        Intent intent = new Intent(getBaseContext(),
                LoginActivity.class);
        startActivity(intent);
    }
//    //Hàm bắt đầu câu hỏi qua activity question
//    private void startQuestion(){
//        Category category = (Category) spinnerCategory.getSelectedItem();
//        int categoryID = category.getId();
//        String categoryName = category.getName();
//        //chuyển qua activity question
//        Intent intent = new Intent(MainActivity.this, QuestionActivity.class);
//        intent.putExtra("idcategories", categoryID);
//        intent.putExtra("categoriesname", categoryName);
//        //sử dụng startActivityForResult để có thể nhận lại dữ liệu kết quả trả về thông báo qua phương thức onActivityResult()
//        startActivityForResult(intent,REQUEST_CODE_QUESTION);
//    }
//
//    //phương thức ánh xạ id
//    private void AnhXa(){
//        textViewHighScore = findViewById(R.id.tv_high_score);
//        buttonStartQuestion = findViewById(R.id.bt_start);
//        spinnerCategory = findViewById(R.id.spinner_category);
//    }
//    //load chủ đề
//    private void loadCategories(){
//        Database database = new Database(this);
//        //lấy dữ liệu danh sách chủ đề
//        List<Category> categories = database.getDataCategories();
//
//        ArrayAdapter<Category> categoryArrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, categories);
//        //bố cục hiển thị chủ đề
//        categoryArrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        //gán chủ đề lên spinner hiển thị
//        spinnerCategory.setAdapter(categoryArrayAdapter);
//    }
}