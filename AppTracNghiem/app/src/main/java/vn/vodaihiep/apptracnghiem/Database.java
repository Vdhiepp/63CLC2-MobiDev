package vn.vodaihiep.apptracnghiem;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

import vn.vodaihiep.apptracnghiem.model.Category;
import vn.vodaihiep.apptracnghiem.model.Question;

public class Database extends SQLiteOpenHelper {
    //tên database
    private static final String DATABASE_NAME = "Question.db";
    //version
    private static final int VERSION = 1;
    private SQLiteDatabase db;

    public Database(@Nullable Context context) {
        super(context, DATABASE_NAME, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        this.db = sqLiteDatabase;
        //biến bảng chuyên mục
        final String CATEGORIES_TABLE = "CREATE TABLE " +
                Table.CategoriesTable.TABLE_NAME + "( " +
                Table.CategoriesTable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                Table.CategoriesTable.COLUMN_NAME + " TEXT " +
                ")";
        //biến bảng question
        final String QUESTIONS_TABLE = "CREATE TABLE " +
                Table.QuestionsTable.TABLE_NAME + " ( " +
                Table.QuestionsTable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                Table.QuestionsTable.COLUMN_QUESTION + " TEXT, " +
                Table.QuestionsTable.COLUMN_OPTION1 + " TEXT, " +
                Table.QuestionsTable.COLUMN_OPTION2 + " TEXT, " +
                Table.QuestionsTable.COLUMN_OPTION3 + " TEXT, " +
                Table.QuestionsTable.COLUMN_OPTION4 + " TEXT, " +
                Table.QuestionsTable.COLUMN_ANSWER + " INTEGER, " +
                Table.QuestionsTable.COLUMN_CATEGORY_ID + " INTEGER, " +
                "FOREIGN KEY(" + Table.QuestionsTable.COLUMN_CATEGORY_ID + ") REFERENCES " +
                Table.CategoriesTable.TABLE_NAME + "(" + Table.CategoriesTable._ID + ")" + "ON DELETE CASCADE" +
                ")";
        //Tạo bảng
        db.execSQL(CATEGORIES_TABLE);
        db.execSQL(QUESTIONS_TABLE);

        //insert dữ liệu
        CreatCategories();
        CreateQuestions();
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + Table.CategoriesTable.COLUMN_NAME);
        db.execSQL("DROP TABLE IF EXISTS " + Table.QuestionsTable.TABLE_NAME);
        onCreate(db);
    }
    //insert chủ đề vào cơ sở dữ liệu
    private void insertCategories(Category category){
        ContentValues values = new ContentValues();
        values.put(Table.CategoriesTable.COLUMN_NAME, category.getName());
        db.insert(Table.CategoriesTable.TABLE_NAME, null, values);
    }
    //các giá trị insert
    private void CreatCategories(){
        Category c1 = new Category("Toán Học");
        Category c2 = new Category("Vật Lý");
        Category c3 = new Category("Hoá Học");
    }
    //insert câu hỏi và đáp án vào cơ sở dữ liệu
    private void insertQuestion(Question question){
        ContentValues values = new ContentValues();
        values.put(Table.QuestionsTable.COLUMN_QUESTION,question.getQuestion());
        values.put(Table.QuestionsTable.COLUMN_OPTION1,question.getOption1());
        values.put(Table.QuestionsTable.COLUMN_OPTION2,question.getOption2());
        values.put(Table.QuestionsTable.COLUMN_OPTION3,question.getOption3());
        values.put(Table.QuestionsTable.COLUMN_OPTION4,question.getOption4());
        values.put(Table.QuestionsTable.COLUMN_ANSWER,question.getAnswer());
        values.put(Table.QuestionsTable.COLUMN_CATEGORY_ID,question.getCategoryID());
        db.insert(Table.QuestionsTable.TABLE_NAME, null, values);
    }
    //tạo dữ liệu bảng câu hỏi
    private void CreateQuestions(){
        Question q1 = new Question("Giải phương trình sau: x^2 - 4x + 4 = 0",
                "A. x = 2", "B. x = 4", "C. x = -2", "D. x = -4", 1, 3);
        insertQuestion(q1);

        Question q2 = new Question("Tính giá trị của log₂(8)",
                "A. 2", "B. 3", "C. 4", "D. 8", 2, 3);
        insertQuestion(q2);

        Question q3 = new Question("Phương trình vi phân của hàm số y = x³ là gì?",
                "A. y' = 2x", "B. y' = 3x²", "C. y' = 4x³", "D. y' = 1/x²", 2, 3);
        insertQuestion(q3);

        Question q4 = new Question("Tính đạo hàm của hàm số y = ln(x) tại x = 1",
                "A. 0", "B. 1", "C. -1", "D. Không tồn tại", 2, 3);
        insertQuestion(q4);

        Question q5 = new Question("Cho ma trận A = |1 2|, tính định thức của A.",
                "A. 1", "B. 2", "C. 3", "D. 4", 1, 3);
        insertQuestion(q5);

        Question q6 = new Question("Tính tích phân ∫(2x + 1) dx từ 0 đến 1",
                "A. 1", "B. 2", "C. 3", "D. 4", 3, 2);
        insertQuestion(q6);

        Question q7 = new Question("Phương trình hóa học biểu diễn quá trình cháy hoàn toàn một hidrocarbon không no có mạch hở là CnH2n+2. Xác định giá trị của n.",
                "A. n = 2", "B. n = 4", "C. n = 6", "D. n = 8", 4, 2);
        insertQuestion(q7);

        Question q8 = new Question("Tính giá trị của sin(π/6)",
                "A. 0", "B. 1/2", "C. √3/2", "D. 1", 2, 3);
        insertQuestion(q8);

        Question q9 = new Question("Phương trình đường tròn có tâm tại điểm (1, -2) và bán kính bằng 3 là gì?",
                "A. (x - 1)² + (y + 2)² = 3²", "B. (x + 1)² + (y - 2)² = 3²", "C. (x - 1)² + (y + 2)² = 9", "D. (x + 1)² + (y - 2)² = 9", 1, 3);
        insertQuestion(q9);

        Question q10 = new Question("Tính giá trị của cos(π/3)",
                "A. 0", "B. 1/2", "C. √3/2", "D. 1", 3, 2);
        insertQuestion(q10);

        Question q11 = new Question("Phương trình vi phân của hàm số y = e^x là gì?",
                "A. y' = e^x", "B. y' = 1/x", "C. y' = ln(x)", "D. y' = e^x + 1", 1, 3);
        insertQuestion(q11);

        Question q12 = new Question("Giải phương trình log₄(x) = 2",
                "A. x = 8", "B. x = 16", "C. x = 4", "D. x = 2", 3, 2);
        insertQuestion(q12);

        Question q13 = new Question("Tìm nghiệm của phương trình sin(x) = 0",
                "A. x = 0", "B. x = π/2", "C. x = π", "D. x = 2π", 1, 3);
        insertQuestion(q13);

        Question q14 = new Question("Tính giá trị của log₃(81)",
                "A. 2", "B. 3", "C. 4", "D. 5", 4, 2);
        insertQuestion(q14);

        Question q15 = new Question("Tính giá trị của tan(π/4)",
                "A. 0", "B. 1", "C. √3/3", "D. 1/√3", 2, 3);
        insertQuestion(q15);

        Question q16 = new Question("Tính giá trị của √25",
                "A. 2", "B. 5", "C. 10", "D. 25", 2, 3);
        insertQuestion(q16);

        Question q17 = new Question("Phương trình vi phân của hàm số y = x⁴ là gì?",
                "A. y' = 4x³", "B. y' = 3x²", "C. y' = 2x", "D. y' = 5x³", 1, 3);
        insertQuestion(q17);

        Question q18 = new Question("Tính giá trị của ∫(x² + 3x) dx từ 1 đến 2",
                "A. 2", "B. 4", "C. 6", "D. 8", 3, 2);
        insertQuestion(q18);

        Question q19 = new Question("Tính giá trị của log₁₀(1000)",
                "A. 1", "B. 2", "C. 3", "D. 4", 3, 2);
        insertQuestion(q19);

        Question q20 = new Question("Phương trình hóa học biểu diễn quá trình oxi-hóa của kim loại nào đó là 2Al + 3Cl₂ → 2AlCl₃. Xác định số mol Cl₂ tiêu thụ khi oxi-hóa hoàn toàn 1 mol Al.",
                "A. 2", "B. 3", "C. 4", "D. 6", 2, 3);
        insertQuestion(q20);

        Question q21 = new Question("Tính giá trị của √(16 + 9)",
                "A. 4", "B. 5", "C. 7", "D. 25", 3, 2);
        insertQuestion(q21);

        Question q22 = new Question("Phương trình vi phân của hàm số y = cos(x) là gì?",
                "A. y' = -sin(x)", "B. y' = cos(x)", "C. y' = -cos(x)", "D. y' = sin(x)", 1, 3);
        insertQuestion(q22);

        Question q23 = new Question("Tìm giá trị lớn nhất của hàm số y = -x² + 4x",
                "A. 1", "B. 2", "C. 4", "D. 5", 3, 2);
        insertQuestion(q23);

        Question q24 = new Question("Tính giá trị của ∫(2/x) dx từ 1 đến 3",
                "A. ln(3)", "B. ln(2)", "C. ln(3/2)", "D. ln(1/3)", 1, 3);
        insertQuestion(q24);

        Question q25 = new Question("Tìm giá trị nhỏ nhất của hàm số y = x² - 4x + 5",
                "A. 1", "B. 2", "C. 3", "D. 4", 3, 2);
        insertQuestion(q25);
    }
    //hàm trả về dữ liệu các chủ đề
    @SuppressLint("Range")
    public List<Category> getDataCategories(){
        List<Category> categoryList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM " + Table.CategoriesTable.TABLE_NAME, null);
        if (c.moveToFirst()){
            do {
                Category category = new Category();
                category.setId(c.getInt(c.getColumnIndex(Table.CategoriesTable._ID)));
                category.setName(c.getString(c.getColumnIndex(Table.CategoriesTable.COLUMN_NAME)));
                categoryList.add(category);
            }
            while (c.moveToNext());
        }
        c.close();
        return categoryList;
    }

    @SuppressLint("Range")
    public ArrayList<Question> getQuestions(int catgoryID){
        ArrayList<Question> questionArrayList = new ArrayList<>();

        db = getReadableDatabase();

        String selection = Table.QuestionsTable.COLUMN_CATEGORY_ID +" = ? ";
        String[] selectionArgs = new String[]{String.valueOf(catgoryID)};

        Cursor c = db.query(Table.QuestionsTable.TABLE_NAME, null, selection, selectionArgs, null, null, null);

        if (c.moveToFirst()){
            do {
                Question question = new Question();

                question.setId(c.getInt(c.getColumnIndex(Table.QuestionsTable._ID)));
                question.setQuestion(c.getString(c.getColumnIndex(Table.QuestionsTable.COLUMN_QUESTION)));
                question.setOption1(c.getString(c.getColumnIndex(Table.QuestionsTable.COLUMN_OPTION1)));
                question.setOption2(c.getString(c.getColumnIndex(Table.QuestionsTable.COLUMN_OPTION2)));
                question.setOption3(c.getString(c.getColumnIndex(Table.QuestionsTable.COLUMN_OPTION3)));
                question.setOption4(c.getString(c.getColumnIndex(Table.QuestionsTable.COLUMN_OPTION4)));
                question.setAnswer(c.getInt(c.getColumnIndex(Table.QuestionsTable.COLUMN_ANSWER)));
                question.setCategoryID(c.getInt(c.getColumnIndex(Table.QuestionsTable.COLUMN_CATEGORY_ID)));

                questionArrayList.add(question);
            }
            while (c.moveToNext());
        }
        c.close();
        return questionArrayList;
    }
}
