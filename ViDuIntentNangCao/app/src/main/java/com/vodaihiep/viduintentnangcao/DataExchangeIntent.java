package com.vodaihiep.viduintentnangcao;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class DataExchangeIntent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_exchange_intent);
    }
    public void Nhap_QuayVe(View v){
        EditText edHT = (EditText)findViewById(R.id.edHoTen);
        EditText edNS = (EditText)findViewById(R.id.edNamSinh);
        // Lấy dữ Liệu
        String hoten = edHT.getText().toString();
        int namsinh = Integer.parseInt(edNS.getText().toString());
        // Tạo mới Intent
        Intent iKQnhapLieu = new Intent();
        // Đưa dữ Liệu vào Intent để gửi về
        // Dữ Liệu được được vào ở dạng KEY (name) --> Value
        iKQnhapLieu.putExtra("HT",hoten);        // HT là key do ta đặt, dùng để truy xuất/ bóc dữ Liệu ở bên nhận
        iKQnhapLieu.putExtra("NS", namsinh);    // tương tự cho NS
        // Gửi kết quả về cho Activity đã gọi nó
        setResult (RESULT_OK, iKQnhapLieu);
        // Đóng Activity nhập Liệu (này)
        finish();
    }
}