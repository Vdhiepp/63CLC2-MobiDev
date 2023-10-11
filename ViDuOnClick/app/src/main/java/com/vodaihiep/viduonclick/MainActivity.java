package com.vodaihiep.viduonclick;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //khai báo biến trc khi vào onCreate
    EditText editText_Name;
    Button buttonSayHi, buttonXinChao;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Bước 1: Tìm điều khiển, sẵn để dùng sau này
                    //ở các hàm xử lý khác nhau
//        editText_Name = findViewById(R.id.editName);
//            //từ đây, ta dùng biến editText_Name để làm việc
//        buttonSayHi = findViewById(R.id.btnHello);
//        buttonXinChao = findViewById(R.id.btnXinChao);
        //có thể gộp vào 1 hàm
        findControls();
        //.....
    }

    void findControls(){
        // điền hết toàn bộ điều khiển vào
        editText_Name = findViewById(R.id.editName);
        buttonSayHi = findViewById(R.id.btnHello);
        buttonXinChao = findViewById(R.id.btnXinChao);
    }

    //viết hàm xử lý sự kiện ở đây
    public void XuLyNoiHello(View v){
        //Bước 2: Lấy chuỗi user nhập
        String strName = editText_Name.getText().toString();
        //Xuất theo yêu cầu
        String strThongBao = "Nice to see you \n" + strName;

        //String strThongBao = "Xin chào, tôi là Hiệp";
        Toast.makeText(this, strThongBao, Toast.LENGTH_LONG).show();
    }

    public void XuLyNoiXinChao(View v){
        String strName = editText_Name.getText().toString();
        String strThongBao = "Chào bạn \n" + strName;
        Toast.makeText(this, strThongBao, Toast.LENGTH_LONG).show();
    }
}