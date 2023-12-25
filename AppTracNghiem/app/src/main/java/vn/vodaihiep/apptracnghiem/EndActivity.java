package vn.vodaihiep.apptracnghiem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class EndActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end);
        // Lấy điểm từ Intent
        int diem = getIntent().getIntExtra("DIEM", 0);

        // Hiển thị điểm trong giao diện của KetThucActivity
        TextView tvDiem = findViewById(R.id.tv_diem);
        tvDiem.setText(diem);

        // Xử lý nút quay lại
        Button btnQuayLai = findViewById(R.id.btn_quay_lai);
        btnQuayLai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EndActivity.this, ChoiceActivity.class);
                startActivity(intent);

                finish();
            }
        });
    }
}