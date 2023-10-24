package com.vodaihiep.excercie13;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText soA, soB;
    TextView kQ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findControls();
    }
    void findControls(){
        soA = findViewById(R.id.editA);
        soB = findViewById(R.id.editB);
        kQ = findViewById(R.id.kqua);
    }
    public void XuLy_Cong(View v) {
        // Lấy số thứ nhất
        // Lấy dữ liệu chứa trong điều khiển, chuyển sang kiểu số nguyên
        int A = Integer.parseInt(soA.getText().toString());
        // Lấy số thứ hai
        int B = Integer.parseInt(soB.getText().toString());
        int KetQua = A + B;
        // Hiện kết quả
        // Quy định text cho điều khiển này là kết quả tính toán được
        kQ.setText(A + " + " + B + " = " + KetQua);
    }
    // Hàm xử lý sự kiện click lên nút "-"
    public void XuLy_Tru(View v) {
        int A = Integer.parseInt(soA.getText().toString());
        int B = Integer.parseInt(soB.getText().toString());
        int KetQua = A - B;
        kQ.setText(A + " - " + B + " = " + KetQua);
    }
    // Hàm xử lý sk click lên nút "*"
    public void XuLy_Nhan(View v) {
        int A = Integer.parseInt(soA.getText().toString());
        int B = Integer.parseInt(soB.getText().toString());
        int KetQua = A * B;
        kQ.setText(A + " * " + B + " = " + KetQua);
    }
    // Hàm xử lý sk click lên nút "/"
    public void XuLy_Chia(View v) {
        int A = Integer.parseInt(soA.getText().toString());
        int B = Integer.parseInt(soB.getText().toString());
        if (B == 0) {
            Toast.makeText(this, "Không thể chia cho 0!", Toast.LENGTH_SHORT).show();
            return;
        }
        else {
            int KetQua = A / B;
            kQ.setText(A + " / " + B + " = " + KetQua);
        }
    }
}