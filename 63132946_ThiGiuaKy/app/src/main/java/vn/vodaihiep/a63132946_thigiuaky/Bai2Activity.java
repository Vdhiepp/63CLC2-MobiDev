package vn.vodaihiep.a63132946_thigiuaky;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Bai2Activity extends AppCompatActivity {
    ArrayList<String> dsBaiHat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai2);
        findControls();
        //buoc 1:
        dsBaiHat = new ArrayList<String>();
        dsBaiHat.add("Lệ Lưu Ly - Vũ Phụng Tiên");
        dsBaiHat.add("Body Shaming - ChoCo Trúc Phương");
        dsBaiHat.add("Đại Minh Tinh - Văn Mai Hương");
        dsBaiHat.add("Cung Trăng - MiNa Young");
        dsBaiHat.add("You And Me - Kim Jennie");
        dsBaiHat.add("Money - Lisa");
        //buoc 2: tạo adaapter
        ArrayAdapter<String> adapterBH;
        adapterBH = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, dsBaiHat);
        //buoc 3: gan adapter
        listViewBaiHat.setAdapter(adapterBH);
        //buoc 4: bắt sự kiện xử lý
        listViewBaiHat.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                // i là vị trí của mục vừa được chọn
                // xử lý: ví dụ ta lấy về bài ta vừa chọn
                /*String itemChon = adapterBH.getItem(i);*/
                // hoac ta co the lay tu nguon du lieu
                String itemChon = dsBaiHat.get(i);
                // thong bao ra man hinh
                String thongBao = "Ban chon bai: " + itemChon;
                Toast.makeText(Bai2Activity.this, thongBao, Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void findControls(){
        listViewBaiHat = findViewById(R.id.lvBaiHat);
    }
    ListView listViewBaiHat;
}