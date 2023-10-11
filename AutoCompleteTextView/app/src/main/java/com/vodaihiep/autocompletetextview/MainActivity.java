package com.vodaihiep.autocompletetextview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatTextView;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> dsQuocGia;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //buoc 0:
        findControls();
        //buoc 1: Chuan bi nguon du lieu, cat vao bien
        dsQuocGia = new ArrayList<String>();
        dsQuocGia.add("VietNam");
        dsQuocGia.add("England");
        dsQuocGia.add("Australia");
        dsQuocGia.add("USA");
        dsQuocGia.add("Albania");
        dsQuocGia.add("Algeria");
        //buoc 2: Tao adapter
        ArrayAdapter<String> adapterQG;
        adapterQG = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, dsQuocGia);
        //buoc 3: gan adapter
        autoQuocGia.setAdapter(adapterQG);
    }
    public void findControls(){
        autoQuocGia = findViewById(R.id.autoCompleteQUOCGIA);
    }
    AutoCompleteTextView autoQuocGia;
}