package vn.vodaihiep.apptracnghiem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class EndActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end);
        //Lấy điểm từ Intent
        int diem = getIntent().getIntExtra("DIEM", 0);

        // Hiển thị điểm
        TextView tvDiem = findViewById(R.id.tv_diem);
        tvDiem.setText(diem);

    }
    // Xử lý nút quay lại
    public void sangManHinhChinh (View v){
        Intent intent = new Intent(getBaseContext(), MainActivity.class);
        startActivity(intent);
    }
}