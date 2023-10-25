package com.vodaihiep.viduintentnangcao;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void NhapLieu(View v){
        //Tạo mới một Intent
        Intent iNhap = new Intent(this, DataExchangeIntent.class);
        //Chuyển sang màn hình nhập liệu
        //Nhưng có đợi kết quả trả về, mã của yêu cầu này ta đặt là 8000 chẳng hạn
        startActivityForResult(iNhap, 8000);
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode==8000)
            if (resultCode==RESULT_OK) {
                // Lấy dữ Liệu gửi vẽ
                // Ở đây, ta chú ý, dữ liệu được gửi về theo cặp Key(Name) --Value
                // Ta bóc dữ liệu ra theo key

                String hotenNhanDuoc = data.getStringExtra("HT");          // HT là key ta đặt ở Activity nhập Liêu
                int namsinhNhanDuoc = data.getIntExtra("NS",2020); // HT là key ta đặt ở Activity nhập Liệu
                // Đưa lên điều khiến ta muốn hiện kết quá nhận được
                TextView tvHT = (TextView) findViewById (R.id.tvHoTen);        // Lấy tham chiếu
                TextView tvNS = (TextView)findViewById (R.id.tvNamSinh);
                tvHT. setText (hotenNhanDuoc);                                  // gán cho thuộc tính Text
                tvNS. setText (String.valueOf(namsinhNhanDuoc));
            }
        else
                Toast.makeText(this, "Trả về thất bại", Toast.LENGTH_SHORT);
        else
            super.onActivityResult(requestCode, resultCode, data);
    }
}