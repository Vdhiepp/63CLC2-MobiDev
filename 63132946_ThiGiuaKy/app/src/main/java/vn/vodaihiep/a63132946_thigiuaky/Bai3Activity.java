package vn.vodaihiep.a63132946_thigiuaky;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Bai3Activity extends AppCompatActivity {
    ArrayList<Country> dsQuocGia;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai3);

        dsQuocGia = new ArrayList<Country>();
        Country nation1 = new Country("Việt Nam", "vn", 700000);
        Country nation2 = new Country("Thái Lan", "tl", 6000000);
        Country nation3 = new Country("Lào", "la", 1600000);

        dsQuocGia.add(nation1);
        dsQuocGia.add(nation2);
        dsQuocGia.add(nation3);

        ListView listViewQG = findViewById(R.id.lvQuocGia);

        CountryAdapter adapter = new CountryAdapter(dsQuocGia, this);

        listViewQG.setAdapter(adapter);

    }
}