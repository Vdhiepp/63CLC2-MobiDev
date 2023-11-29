package vn.edu.tinhoc123.quanlysachappsqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class BookNavigationActivity extends AppCompatActivity {
    SQLiteDatabase dbSACH;
    Cursor controBanGhi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_navigation);

        //Mở CSDL
        dbSACH = openOrCreateDatabase("QuanLySach.db", MODE_PRIVATE, null);
        //Đọc toàn bộ bảng Book
        controBanGhi = dbSACH.rawQuery("Select * from BOOKS", null);
        //Chuyển con trỏ về bản ghi đầu tiên
        controBanGhi.moveToFirst();
        //Hiện bản ghi đầu tiên lên màn hình (view)
        CapNhatManHinhTheoConTro();

        Button btnNext = findViewById(R.id.btnTiepTheo);
        Button btnFirst = findViewById(R.id.btnDauTien);
        Button btnEnd = findViewById(R.id.btnCuoiCung);

        btnNext.setOnClickListener(xulyNext);
        btnFirst.setOnClickListener(xulyFirst);
        btnEnd.setOnClickListener(xulyEnd);
    }//het Create
    public void CapNhatManHinhTheoConTro(){

        //lấy dữ liệu ở dòng hiện tại đang được trỏ bởi controBanGhi
        int maSach = controBanGhi.getInt(0);
        String tenSach = controBanGhi.getString(1);
        int soTrang = controBanGhi.getInt(2);
        float gia = controBanGhi.getFloat(3);
        String moTa = controBanGhi.getString(4);

        //đặt vào các điều khiển ???
        EditText edMaSach = findViewById(R.id.edMaSach);
        EditText edTenSach = findViewById(R.id.edTenSach);
        EditText edSoTrang = findViewById(R.id.edSoTrang);
        EditText edGiaSach = findViewById(R.id.edGiaSach);
        EditText edMoTa = findViewById(R.id.edMoTa);
        edMaSach.setText(String.valueOf(maSach));
        edTenSach.setText(tenSach);
        edSoTrang.setText(soTrang);
        edGiaSach.setText(String.valueOf(gia));
        edMoTa.setText(moTa);
    }
    //==========CÁC BỘ LẮNG NGHE=========================================
    View.OnClickListener xulyNext = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            //nếu ko phải bản ghi cuối cùng mới di chuyển đến bản tiếp theo
            if (!controBanGhi.isLast()) {
                controBanGhi.moveToNext();
                //lấy dữ liệu và cập nhật lên màn hình
                CapNhatManHinhTheoConTro();
            }
        }
    };
    View.OnClickListener xulyFirst = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            controBanGhi.moveToFirst();
            //lấy dữ liệu và cập nhật lên màn hình
            CapNhatManHinhTheoConTro();
        }
    };
    View.OnClickListener xulyEnd = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            controBanGhi.isLast();
            //lấy dữ liệu và cập nhật lên màn hình
            CapNhatManHinhTheoConTro();
        }
    };

    //=================================================================
}