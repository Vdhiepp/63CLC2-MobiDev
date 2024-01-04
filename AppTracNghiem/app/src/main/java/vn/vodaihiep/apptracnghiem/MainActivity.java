package vn.vodaihiep.apptracnghiem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    SQLiteDatabase dbQuestion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //DataBaseToan();
        //DataBaseLy();
        //DataBaseHoa();
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
        String sqlCau7 = "INSERT INTO QUESTIONS VALUES(7, 'Tính giá trị của sin²(π/4) + cos²(π/4)', 'A. 0', 'B. 1', 'C. √2/2', 'D. √3/2', 2)";
        dbQuestion.execSQL(sqlCau7);
        String sqlCau8 = "INSERT INTO QUESTIONS VALUES(8, 'Tính giá trị của sin(π/6)', 'A. 0', 'B. 1/2', 'C. √3/2', 'D. 1', 2)";
        dbQuestion.execSQL(sqlCau8);
        String sqlCau9 = "INSERT INTO QUESTIONS VALUES(9, 'Phương trình đường tròn có tâm tại điểm (1, -2) và bán kính bằng 3 là gì?', 'A. (x - 1)² + (y + 2)² = 3²', 'B. (x + 1)² + (y - 2)² = 3²', 'C. (x - 1)² + (y + 2)² = 9', 'D. (x + 1)² + (y - 2)² = 9', 1)";
        dbQuestion.execSQL(sqlCau9);
        String sqlCau10 = "INSERT INTO QUESTIONS VALUES(10, 'Tính giá trị của cos(π/3)', 'A. 0', 'B. 1/2', 'C. √3/2', 'D. 1', 3)";
        dbQuestion.execSQL(sqlCau10);
        String sqlCau11 = "INSERT INTO QUESTIONS VALUES(11, 'Tìm giới hạn của hàm số f(x) = (x² - 4)/(x - 2) khi x tiến đến 2', 'A. 4', 'B. 2', 'C. 1', 'D. Không tồn tại', 1)";
        dbQuestion.execSQL(sqlCau11);
        String sqlCau12 = "INSERT INTO QUESTIONS VALUES(12, 'Tính tích phân ∫(e^x + 2x) dx từ 0 đến 1', 'A. e + 1', 'B. e + 2', 'C. 2e + 1', 'D. e + 3', 3)";
        dbQuestion.execSQL(sqlCau12);
        String sqlCau13 = "INSERT INTO QUESTIONS VALUES(13, 'Phương trình vi phân của hàm số y = ln(x) là gì?', 'A. y = 1/x', 'B. y = 1/x²', 'C. y = 1/xln(x)', 'D. y = x', 1)";
        dbQuestion.execSQL(sqlCau13);
        String sqlCau14 = "INSERT INTO QUESTIONS VALUES(14, 'Cho tam giác ABC vuông tại A, cạnh huyền BC có độ dài 5 và cạnh góc A có độ dài 30 độ. Tính độ dài cạnh AC của tam giác.', 'A. 5', 'B. 10', 'C. 5√3', 'D. 10√3', 3)";
        dbQuestion.execSQL(sqlCau14);
        String sqlCau15 = "INSERT INTO QUESTIONS VALUES(15, 'Tính giá trị của √(4 + √3) - √(4 - √3)', 'A. 2', 'B. √2', 'C. 1', 'D. √3', 4)";
        dbQuestion.execSQL(sqlCau15);
        String sqlCau16 = "INSERT INTO QUESTIONS VALUES(16, 'Giải phương trình sau: 2x² + 5x - 3 = 0', 'A. x = 1', 'B. x = -3', 'C. x = 0.5', 'D. x = -1', 2)";
        dbQuestion.execSQL(sqlCau16);
        String sqlCau17 = "INSERT INTO QUESTIONS VALUES(17, 'Tính giá trị của tan(3π/4)', 'A. 0', 'B. -1', 'C. 1', 'D. √3', 2)";
        dbQuestion.execSQL(sqlCau17);
        String sqlCau18 = "INSERT INTO QUESTIONS VALUES(18, 'Tính giá trị của log₄(64)', 'A. 1', 'B. 2', 'C. 3', 'D. 4', 3)";
        dbQuestion.execSQL(sqlCau18);
        String sqlCau19 = "INSERT INTO QUESTIONS VALUES(19, 'Cho hai đường tròn (C₁) và (C₂) có bán kính lần lượt là 5 và 8. Tính khoảng cách giữa hai tâm đường tròn khi chúng không tiếp xúc nhau.', 'A. 3', 'B. 6', 'C. 11', 'D. 13', 4)";
        dbQuestion.execSQL(sqlCau19);
        String sqlCau20 = "INSERT INTO QUESTIONS VALUES(20, 'Tìm phương trình của đường thẳng đi qua điểm A(2, -1) và có hệ số góc bằng -2', 'A. y = -2x - 5', 'B. y = -2x + 3', 'C. y = 2x - 3', 'D. y = 2x + 5', 3)";
        dbQuestion.execSQL(sqlCau20);
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
        String sqlCau11 = "INSERT INTO QUESTIONS VALUES(11, 'Tính công của lực trọng trường khi nâng một vật từ mặt đất lên độ cao h', 'A. mgh', 'B. mgh/2', 'C. mgh²', 'D. mg/h', 1)";
        dbQuestion.execSQL(sqlCau11);
        String sqlCau12 = "INSERT INTO QUESTIONS VALUES(12, 'Một vật nhỏ đặt trước một gương phẳng, tạo ra một hình ảnh bằng gương. Nếu vật di chuyển gần gương, hình ảnh sẽ thay đổi như thế nào?', 'A. Phình to', 'B. Phình nhỏ', 'C. Thu nhỏ', 'D. Đứt đoạn', 3)";
        dbQuestion.execSQL(sqlCau12);
        String sqlCau13 = "INSERT INTO QUESTIONS VALUES(13, 'Theo định luật biến đổi nhiệt, năng lượng nhiệt được chuyển đổi từ một hệ thống sang hệ thống khác mà không tạo ra năng lượng mới. Điều này có đúng không?', 'A. Đúng', 'B. Sai', 'C. Phụ thuộc vào hệ thống', 'D. Chưa xác định', 1)";
        dbQuestion.execSQL(sqlCau13);
        String sqlCau14 = "INSERT INTO QUESTIONS VALUES(14, 'Một lò làm việc theo chu kỳ Carnot, với nhiệt độ nóng là 600 K và nhiệt độ lạnh là 300 K. Tìm hiệu suất của lò Carnot này.', 'A. 33.3%', 'B. 50%', 'C. 66.7%', 'D. 75%', 3)";
        dbQuestion.execSQL(sqlCau14);
        String sqlCau15 = "INSERT INTO QUESTIONS VALUES(15, 'Trong một mạch điện xoay chiều, tổng điện áp hiệu dụng và tổng điện dung hiệu dụng được ký hiệu lần lượt là U và I. Công suất trung bình của mạch là công thức nào?', 'A. P = UI', 'B. P = U/I', 'C. P = U²/I', 'D. P = IU²', 1)";
        dbQuestion.execSQL(sqlCau15);
        String sqlCau16 = "INSERT INTO QUESTIONS VALUES(16, 'Theo định luật Ampere, dòng điện tạo ra từ sự chuyển động của các điện tử. Điều này đúng hay sai?', 'A. Đúng', 'B. Sai', 'C. Phụ thuộc vào môi trường', 'D. Không đủ thông tin để đưa ra kết luận', 2)";
        dbQuestion.execSQL(sqlCau16);
        String sqlCau17 = "INSERT INTO QUESTIONS VALUES(17, 'Một vật nằm trên mặt đất và không chịu lực nào ngoại trừ lực trọng trường. Tổng năng lượng của vật là bao nhiêu?', 'A. 0', 'B. Âm', 'C. Dương', 'D. Vô hạn', 3)";
        dbQuestion.execSQL(sqlCau17);
        String sqlCau18 = "INSERT INTO QUESTIONS VALUES(18, 'Tại sao vật nặng rơi xuống mặt đất có vận tốc tăng dần theo thời gian?', 'A. Do lực trọng trường', 'B. Do ma sát không khí', 'C. Do lực cản không khí', 'D. Do không gian và thời gian cong', 1)";
        dbQuestion.execSQL(sqlCau18);
        String sqlCau19 = "INSERT INTO QUESTIONS VALUES(19, 'Đặt công thức tính điện trở R trong mạch điện có điện áp U và dòng điện I', 'A. R = U/I', 'B. R = UI', 'C. R = I/U', 'D. R = IU', 1)";
        dbQuestion.execSQL(sqlCau19);
        String sqlCau20 = "INSERT INTO QUESTIONS VALUES(20, 'Tính gia tốc của một vật nếu lực tác động lên vật có khối lượng m là F = 3m. (G = 9.8 m/s²)', 'A. 0.3 m/s²', 'B. 3 m/s²', 'C. 9.8 m/s²', 'D. 29.4 m/s²', 2)";
        dbQuestion.execSQL(sqlCau20);
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
        String sqlCau11 = "INSERT INTO QUESTIONS VALUES(11, 'Hãy cho biết công thức hóa học của axit sulfuric.', 'A. H2SO4', 'B. HNO3', 'C. HCl', 'D. H3PO4', 1)";
        dbQuestion.execSQL(sqlCau11);
        String sqlCau12 = "INSERT INTO QUESTIONS VALUES(12, 'Trong quá trình oxy hóa - khử, kim loại nào bị oxy hóa nhất?', 'A. Kali', 'B. Natri', 'C. Kẽm', 'D. Nhôm', 4)";
        dbQuestion.execSQL(sqlCau12);
        String sqlCau13 = "INSERT INTO QUESTIONS VALUES(13, 'Công thức hóa học của muối natri cacbonat là gì?', 'A. NaCl', 'B. Na2CO3', 'C. NaOH', 'D. NaHCO3', 2)";
        dbQuestion.execSQL(sqlCau13);
        String sqlCau14 = "INSERT INTO QUESTIONS VALUES(14, 'Phương trình hóa học biểu diễn sự tác dụng giữa axit clohidric và nước xút là gì?', 'A. HCl + NaOH → NaCl + H2O', 'B. HCl + KOH → KCl + H2O', 'C. HCl + Ca(OH)2 → CaCl2 + H2O', 'D. HCl + NH4OH → NH4Cl + H2O', 1)";
        dbQuestion.execSQL(sqlCau14);
        String sqlCau15 = "INSERT INTO QUESTIONS VALUES(15, 'Nguyên tố nào sau đây không thuộc nhóm kim loại kiềm?', 'A. Kali', 'B. Natri', 'C. Lithium', 'D. Calcium', 4)";
        dbQuestion.execSQL(sqlCau15);
        String sqlCau16 = "INSERT INTO QUESTIONS VALUES(16, 'Sự chuyển động của các phân tử trong chất lỏng được mô tả bởi nguyên tắc nào?', 'A. Nguyên tắc Avogadro', 'B. Nguyên tắc Brown', 'C. Nguyên tắc Boyle', 'D. Nguyên tắc Archimedes', 2)";
        dbQuestion.execSQL(sqlCau16);
        String sqlCau17 = "INSERT INTO QUESTIONS VALUES(17, 'Công thức hóa học của etanol là gì?', 'A. CH4', 'B. C2H6', 'C. C3H8', 'D. C2H5OH', 4)";
        dbQuestion.execSQL(sqlCau17);
        String sqlCau18 = "INSERT INTO QUESTIONS VALUES(18, 'Nguyên tắc nào mô tả sự giữ lại ánh sáng trong chất khí?', 'A. Nguyên tắc Brewster', 'B. Nguyên tắc Snell', 'C. Nguyên tắc Pascal', 'D. Nguyên tắc Tyndall', 4)";
        dbQuestion.execSQL(sqlCau18);
        String sqlCau19 = "INSERT INTO QUESTIONS VALUES(19, 'Công thức hóa học của muối magie clorua là gì?', 'A. MgCl2', 'B. MgSO4', 'C. Mg(NO3)2', 'D. Mg(OH)2', 1)";
        dbQuestion.execSQL(sqlCau19);
        String sqlCau20 = "INSERT INTO QUESTIONS VALUES(20, 'Một phản ứng hoá học xảy ra nếu và chỉ nếu năng lượng tự do (Gibbs) của hệ tăng. Điều này đúng hay sai?', 'A. Đúng', 'B. Sai', 'C. Phụ thuộc vào điều kiện', 'D. Chưa xác định', 1)";
        dbQuestion.execSQL(sqlCau20);
        dbQuestion.close();
    }
}
