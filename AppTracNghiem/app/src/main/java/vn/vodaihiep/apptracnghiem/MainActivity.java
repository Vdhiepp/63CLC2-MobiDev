package vn.vodaihiep.apptracnghiem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    SQLiteDatabase dbQuestion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DataBaseToan();
        DataBaseLy();
        DataBaseHoa();
    }

    public void sangManHinhChuDe(View v){
        Intent intent = new Intent( getBaseContext(),
                ChoiceActivity.class);
        startActivity(intent);
    }
    public void sangManHinhLogin(View v){
        Intent intent = new Intent(getBaseContext(),
                LoginActivity.class);
        startActivity(intent);
    }
    void DataBaseToan (){
        dbQuestion = openOrCreateDatabase("QuestionMath.db",MODE_PRIVATE,null);
        dbQuestion.execSQL("DROP TABLE IF EXISTS QUESTIONS");

        String sqlTaoBangQuestion = "CREATE TABLE QUESTIONS(QuestionID integer PRIMARY KEY, " +
            "Question text, " +
            "Option1 text, " +
            "Option2 text, " +
            "Option3 text, " +
            "Option4 text, " +
            "Answer integer )";
        dbQuestion.execSQL(sqlTaoBangQuestion);

        String sqlCau1 = "INSERT INTO QUESTIONS VALUES(1,'Giải phương trình sau: x^2 - 4x + 4 = 0', 'A. x = 2', 'B. x = 4', 'C. x = -2', 'D. x = -4', 1)";
        dbQuestion.execSQL(sqlCau1);
        String sqlCau2 = "INSERT INTO QUESTIONS VALUES(2, 'Tính giá trị của log₂(8)', 'A. 2', 'B. 3', 'C. 4', 'D. 8', 2)";
        dbQuestion.execSQL(sqlCau2);
        String sqlCau3 = "INSERT INTO QUESTIONS VALUES(3, 'Phương trình vi phân của hàm số y = x³ là gì?', 'A. y'' = 2x', 'B. y'' = 3x²', 'C. y'' = 4x³', 'D. y'' = 1/x²', 2)";
        dbQuestion.execSQL(sqlCau3);
        String sqlCau4 = "INSERT INTO QUESTIONS VALUES(4, 'Tính đạo hàm của hàm số y = ln(x) tại x = 1', 'A. 0', 'B. 1', 'C. -1', 'D. Không tồn tại', 2)";
        dbQuestion.execSQL(sqlCau4);
        String sqlCau5 = "INSERT INTO QUESTIONS VALUES(5, 'Cho ma trận A = |1 2|, tính định thức của A.', 'A. 1', 'B. 2', 'C. 3', 'D. 4', 1)";
        dbQuestion.execSQL(sqlCau5);
        String sqlCau6 = "INSERT INTO QUESTIONS VALUES(6, 'Tính tích phân ∫(2x + 1) dx từ 0 đến 1', 'A. 1', 'B. 2', 'C. 3', 'D. 4', 3)";
        dbQuestion.execSQL(sqlCau6);
        String sqlCau7 = "INSERT INTO QUESTIONS VALUES(7, 'Phương trình hóa học biểu diễn quá trình cháy hoàn toàn một hidrocarbon không no có mạch hở là CnH2n+2. Xác định giá trị của n.', 'A. n = 2', 'B. n = 4', 'C. n = 6', 'D. n = 8', 4)";
        dbQuestion.execSQL(sqlCau7);
        String sqlCau8 = "INSERT INTO QUESTIONS VALUES(8, 'Tính giá trị của sin(π/6)', 'A. 0', 'B. 1/2', 'C. √3/2', 'D. 1', 2)";
        dbQuestion.execSQL(sqlCau8);
        String sqlCau9 = "INSERT INTO QUESTIONS VALUES(9, 'Phương trình đường tròn có tâm tại điểm (1, -2) và bán kính bằng 3 là gì?', 'A. (x - 1)² + (y + 2)² = 3²', 'B. (x + 1)² + (y - 2)² = 3²', 'C. (x - 1)² + (y + 2)² = 9', 'D. (x + 1)² + (y - 2)² = 9', 1)";
        dbQuestion.execSQL(sqlCau9);
        String sqlCau10 = "INSERT INTO QUESTIONS VALUES(10, 'Tính giá trị của cos(π/3)', 'A. 0', 'B. 1/2', 'C. √3/2', 'D. 1', 3)";
        dbQuestion.execSQL(sqlCau10);
        dbQuestion.close();
    }
    void DataBaseLy (){
        dbQuestion = openOrCreateDatabase("QuestionPhysics.db",MODE_PRIVATE,null);
        dbQuestion.execSQL("DROP TABLE IF EXISTS QUESTIONS");

        String sqlTaoBangQuestion = "CREATE TABLE QUESTIONS(QuestionID integer PRIMARY KEY, " +
                "Question text, " +
                "Option1 text, " +
                "Option2 text, " +
                "Option3 text, " +
                "Option4 text, " +
                "Answer integer )";
        dbQuestion.execSQL(sqlTaoBangQuestion);

        String sqlCau1 = "INSERT INTO QUESTIONS VALUES(1, 'Tính vận tốc trung bình khi biết quãng đường S = 120m và thời gian t = 30s.', 'A. 2 m/s', 'B. 4 m/s', 'C. 6 m/s', 'D. 8 m/s', 2)";
        dbQuestion.execSQL(sqlCau1);
        String sqlCau2 = "INSERT INTO QUESTIONS VALUES(2, 'Đặt công thức liên quan giữa lực, khối lượng, và gia tốc.', 'A. F = ma', 'B. F = m/g', 'C. F = a/m', 'D. F = mg', 1)";
        dbQuestion.execSQL(sqlCau2);
        String sqlCau3 = "INSERT INTO QUESTIONS VALUES(3, 'Áp suất của 1kg khí lý tưởng ở nhiệt độ 27°C là bao nhiêu?', 'A. 100 kPa', 'B. 200 kPa', 'C. 300 kPa', 'D. 400 kPa', 3)";
        dbQuestion.execSQL(sqlCau3);
        String sqlCau4 = "INSERT INTO QUESTIONS VALUES(4, 'Một vật nặng 5kg đặt trên mặt đất, tìm lực nặng và áp suất mà vật tạo ra.', 'A. 50 N, 50 kPa', 'B. 50 N, 500 kPa', 'C. 500 N, 50 kPa', 'D. 500 N, 500 kPa', 3)";
        dbQuestion.execSQL(sqlCau4);
        String sqlCau5 = "INSERT INTO QUESTIONS VALUES(5, 'Tính năng lượng cơ học của vật có khối lượng 2kg và vận tốc 4 m/s.', 'A. 4 J', 'B. 8 J', 'C. 16 J', 'D. 32 J', 3)";
        dbQuestion.execSQL(sqlCau5);
        String sqlCau6 = "INSERT INTO QUESTIONS VALUES(6, 'Khi nào đối tượng nằm trong tâm của trái đất, trọng lực trên nó bằng 0. Điều này xảy ra ở đâu?', 'A. Cực Bắc', 'B. Cực Nam', 'C. Xích Đạo', 'D. Địa Cực', 3)";
        dbQuestion.execSQL(sqlCau6);
        String sqlCau7 = "INSERT INTO QUESTIONS VALUES(7, 'Theo định luật Pascal, áp suất tăng ở một điểm của chất lỏng được truyền đều đến mọi nơi. Điều này đúng hay sai?', 'A. Đúng', 'B. Sai', 'C. Không đủ thông tin để đưa ra kết luận', 'D. Cả A và B', 1)";
        dbQuestion.execSQL(sqlCau7);
        String sqlCau8 = "INSERT INTO QUESTIONS VALUES(8, 'Loại năng lượng nào được chuyển đổi thành năng lượng nhiệt khi một vật nằm trên mặt đất?', 'A. Năng lượng cơ học', 'B. Năng lượng điện', 'C. Năng lượng hạt nhân', 'D. Năng lượng tiềm ẩn', 4)";
        dbQuestion.execSQL(sqlCau8);
        String sqlCau9 = "INSERT INTO QUESTIONS VALUES(9, 'Đặc điểm nào của sóng âm không thể nghe được bởi tai người?', 'A. Tần số cao', 'B. Biên độ lớn', 'C. Tần số thấp', 'D. Độ dài sóng ngắn', 3)";
        dbQuestion.execSQL(sqlCau9);
        String sqlCau10 = "INSERT INTO QUESTIONS VALUES(10, 'Định luật nào mô tả rằng tổng moment lực tác động lên một vật là không đổi khi vật đó ở trạng thái cân bằng?', 'A. Định luật Newton thứ nhất', 'B. Định luật Newton thứ hai', 'C. Định luật biến đổi nhiệt', 'D. Định luật bảo toàn moment lực', 4)";
        dbQuestion.execSQL(sqlCau10);
        dbQuestion.close();
    }
    void DataBaseHoa (){
        dbQuestion = openOrCreateDatabase("QuestionChemistry.db",MODE_PRIVATE,null);
        dbQuestion.execSQL("DROP TABLE IF EXISTS QUESTIONS");

        String sqlTaoBangQuestion = "CREATE TABLE QUESTIONS(QuestionID integer PRIMARY KEY, " +
                "Question text, " +
                "Option1 text, " +
                "Option2 text, " +
                "Option3 text, " +
                "Option4 text, " +
                "Answer integer )";
        dbQuestion.execSQL(sqlTaoBangQuestion);

        String sqlCau1 = "INSERT INTO QUESTIONS VALUES(1, 'Cho một hợp chất có công thức hóa học là H2SO4. Xác định phân tử của hợp chất này chứa bao nhiêu nguyên tử hydrogen.', 'A. 2', 'B. 4', 'C. 6', 'D. 8', 1)";
        dbQuestion.execSQL(sqlCau1);
        String sqlCau2 = "INSERT INTO QUESTIONS VALUES(2, 'Phản ứng nào sau đây là phản ứng oxi hóa - khử?', 'A. 2H2 + O2 → 2H2O', 'B. Cu + 2AgNO3 → Cu(NO3)2 + 2Ag', 'C. 2HCl + Na2S → 2NaCl + H2S', 'D. CaCO3 → CaO + CO2', 2)";
        dbQuestion.execSQL(sqlCau2);
        String sqlCau3 = "INSERT INTO QUESTIONS VALUES(3, 'Số mol của 0.5 mol H2SO4 là bao nhiêu?', 'A. 0.5', 'B. 1', 'C. 2', 'D. 3', 2)";
        dbQuestion.execSQL(sqlCau3);
        String sqlCau4 = "INSERT INTO QUESTIONS VALUES(4, 'Tính chất nào sau đây không phải là của kim loại?', 'A. Dẫn điện', 'B. Bền', 'C. Kết tủa với axit', 'D. Có màu kim loại', 3)";
        dbQuestion.execSQL(sqlCau4);
        String sqlCau5 = "INSERT INTO QUESTIONS VALUES(5, 'Nguyên tắc nào mô tả sự phân tán đồng đều của các phân tử trong dung dịch?', 'A. Nguyên tắc Avogadro', 'B. Nguyên tắc hòa tan', 'C. Nguyên tắc chuẩn mực', 'D. Nguyên tắc Raoult', 4)";
        dbQuestion.execSQL(sqlCau5);
        String sqlCau6 = "INSERT INTO QUESTIONS VALUES(6, 'Trạng thái tự do của phốt pho là gì?', 'A. P4', 'B. P2', 'C. P8', 'D. P10', 1)";
        dbQuestion.execSQL(sqlCau6);
        String sqlCau7 = "INSERT INTO QUESTIONS VALUES(7, 'Sự liên kết ion xảy ra giữa các nguyên tố nào sau đây?', 'A. Na và Cl', 'B. H và O', 'C. C và N', 'D. Cl và F', 1)";
        dbQuestion.execSQL(sqlCau7);
        String sqlCau8 = "INSERT INTO QUESTIONS VALUES(8, 'Cấu trúc hạt nhân của nguyên tố nào sau đây chứa 7 proton và 8 neutron?', 'A. Nitơ', 'B. Oxygen', 'C. Carbon', 'D. Fluor', 1)";
        dbQuestion.execSQL(sqlCau8);
        String sqlCau9 = "INSERT INTO QUESTIONS VALUES(9, 'Phản ứng nào sau đây không phải là phản ứng trùng hợp?', 'A. 2H2 + O2 → 2H2O', 'B. N2 + 3H2 → 2NH3', 'C. 2Na + Cl2 → 2NaCl', 'D. 2HgO → 2Hg + O2', 4)";
        dbQuestion.execSQL(sqlCau9);
        String sqlCau10 = "INSERT INTO QUESTIONS VALUES(10, 'Công thức hóa học của amoniac là gì?', 'A. NH3', 'B. N2H4', 'C. NO2', 'D. NH4OH', 1)";
        dbQuestion.execSQL(sqlCau10);
        dbQuestion.close();
    }
}
