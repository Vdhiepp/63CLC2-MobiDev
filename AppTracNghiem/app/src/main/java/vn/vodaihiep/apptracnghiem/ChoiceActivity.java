package vn.vodaihiep.apptracnghiem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ChoiceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice);
    }
    public void sangManHinhCauHoi(View v){
        Intent intent = new Intent( getBaseContext(),
                QuestionActivity.class);
        startActivity(intent);
    }
    public void sangManHinhMain(View v){
        Intent intent = new Intent( getBaseContext(),
                MainActivity.class);
        startActivity(intent);
    }
    public void sangManHinhVatLy(View v){
        Intent intent = new Intent( getBaseContext(),
                QuestionPhysicsActivity.class);
        startActivity(intent);
    }
    public void sangManHinhHoaHoc(View v){
        Intent intent = new Intent( getBaseContext(),
                QuestionChemistryActivity.class);

        startActivity(intent);
    }
}