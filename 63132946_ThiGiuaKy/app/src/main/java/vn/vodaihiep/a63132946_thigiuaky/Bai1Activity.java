package vn.vodaihiep.a63132946_thigiuaky;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class Bai1Activity extends AppCompatActivity {
    EditText edCao, edNang;
    TextView tvKqua;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai1);
        findControls();
    }
    public void tinh_BMI(View view){
        float height = Float.parseFloat(edCao.getText().toString());
        float weight = Float.parseFloat(edNang.getText().toString());
        String result;
        height = height / 100;
        float bmi = weight / (height * height);

        DecimalFormat decimalFormat = new DecimalFormat("#.0");
        bmi = Float.parseFloat(decimalFormat.format(bmi));
        tvKqua.setText(String.valueOf(bmi));
    }
    void findControls(){
        edCao = findViewById(R.id.edCao);
        edNang = findViewById(R.id.edNang);
        tvKqua = findViewById(R.id.tvKqua);
    }
}