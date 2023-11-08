package vn.edu.tinhoc123.vieccanlam;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        List<TASKS> lstVCL;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Tạo kết nối đến CSDL
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference databaseReference = database.getReference("TASKS");
        //Lắng nghe và xử lý
        lstVCL = new ArrayList<TASKS>();
        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                //Lấy dữ liệu từ biến snapshot, đưa vào một biến danh sách để xử lý
                for (DataSnapshot obj: snapshot.getChildren()  ) {
                    TASKS tasks = obj.getValue(TASKS.class);
                    lstVCL.add(tasks);
                    Log.w("VCL app", "Tên việc cần làm : "+ tasks.getName()  );

                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }

}