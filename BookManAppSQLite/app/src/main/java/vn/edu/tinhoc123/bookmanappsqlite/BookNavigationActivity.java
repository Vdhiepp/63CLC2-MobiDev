package vn.edu.tinhoc123.bookmanappsqlite;

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

        btnNext.setOnClickListener(xulyNext);
        btnFirst.setOnClickListener(xulyFirst);
    }//het Create
    public void CapNhatManHinhTheoConTro(){

        //lấy dữ liệu ở dòng hiện tại đang được trỏ bởi controBanGhi
        int maSach = controBanGhi.getInt(0);
        String tenSach = controBanGhi.getString(1);
        //int soTrang = controBanGhi.getInt(2);
        //float gia = controBanGhi.getFloat(3);
        //String moTa = controBanGhi.getString(4);

        //đặt vào các điều khiển ???
        EditText edMaSach = findViewById(R.id.edMaSach);
        EditText edTenSach = findViewById(R.id.edTenSach);
        edMaSach.setText(String.valueOf(maSach));
        edTenSach.setText(tenSach);
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

    //=================================================================
}