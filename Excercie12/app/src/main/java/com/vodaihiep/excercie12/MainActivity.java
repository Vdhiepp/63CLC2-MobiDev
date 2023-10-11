package com.vodaihiep.excercie12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.BreakIterator;
import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    EditText editHeight, editWeight;
    Button button;
    TextView BMI, status;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findControls();
    }
    public void tinh_BMI(View view){
        float height = Float.parseFloat(editHeight.getText().toString());
        float weight = Float.parseFloat(editWeight.getText().toString());
        String result;
        height = height / 100;
        float bmi = weight / (height * height);

        DecimalFormat decimalFormat = new DecimalFormat("#.0");
        decimalFormat.format(bmi);

        BMI.setText(String.valueOf(bmi));
            if (bmi <= 18.5)
                result = "GẦY";
            else if (bmi <= 22.9)
                result = "BÌNH THƯỜNG";
            else if (bmi == 23)
                result = "THỪA CÂN";
            else if (bmi <= 24.9)
                result = "TIỀN BÉO PHÌ";
            else if (bmi <= 29.9)
                result = "BÉO PHÌ ĐỘ I";
            else if (bmi == 30)
                result = "BÉO PHÌ ĐỘ II";
            else   result = "BÉO PHÌ ĐỘ III";
        status.setText(result);
    }
    void findControls(){
        EditText editHeight = findViewById(R.id.height);
        EditText editWeight = findViewById(R.id.weight);
        Button button = findViewById(R.id.button);
        TextView bmi = findViewById(R.id.bmi);
        TextView status = findViewById(R.id.status);
    }
}