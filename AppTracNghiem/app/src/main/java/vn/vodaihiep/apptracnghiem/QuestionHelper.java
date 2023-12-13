package vn.vodaihiep.apptracnghiem;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

import vn.vodaihiep.apptracnghiem.QuestionContract.*;
import vn.vodaihiep.apptracnghiem.model.Question;

public class QuestionHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "MyAwesomeQuestion.db";
    private static final int DATABASE_VERSION = 1;

    private SQLiteDatabase db;
    public QuestionHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        this.db = db;

        final String SQL_CREATE_QUESTIONS_TABLE = "CREATE TABLE " +
                QuestionContract.QuestionsTable.TABLE_NAME + " ( " +
                QuestionsTable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                QuestionsTable.COLUMN_QUESTION + " TEXT, " +
                QuestionsTable.COLUMN_OPTION1 + " TEXT, " +
                QuestionsTable.COLUMN_OPTION2 + " TEXT, " +
                QuestionsTable.COLUMN_OPTION3 + " TEXT, " +
                QuestionsTable.COLUMN_OPTION4 + " TEXT, " +
                QuestionsTable.COLUMN_ANSWER + " INTEGER " +
                " ) ";
        db.execSQL(SQL_CREATE_QUESTIONS_TABLE);
//        fillQuestionsTable();
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + QuestionsTable.TABLE_NAME);
        onCreate(db);
    }

//    private void fillQuestionsTable() {
//        Question q1 = new Question("Giải phương trình sau: x^2 - 4x + 4 = 0",
//                "A. x = 2","B. x = 4","C. x = -2","D. x = -4", 1);
//        addQuestion(q1);
//        Question q2 = new Question("Giải phương trình sau: 2x^2 - 8x + 6 = 0",
//                "A. x = 1", "B. x = 2", "C. x = 3", "D. x = -0.5", 2);
//        addQuestion(q2);
//
//        Question q3 = new Question("Tính giá trị của x khi: 3x + 7 = 16",
//                "A. x = 3", "B. x = 4", "C. x = 5", "D. x = 6", 3);
//        addQuestion(q3);
//        Question q4 = new Question("Giải phương trình sau: x^2 + 5x + 6 = 0",
//                "A. x = -2", "B. x = -3", "C. x = -1", "D. x = -6", 4);
//        addQuestion(q4);
//        Question q5 = new Question("Tìm giá trị của x khi: 4x - 9 = 7",
//                "A. x = 4", "B. x = 2", "C. x = 3", "D. x = 5", 1);
//        addQuestion(q5);
//        Question q6 = new Question("Giải phương trình sau: 2x^2 + 3x - 5 = 0",
//                "A. x = 1", "B. x = -2", "C. x = 0.5", "D. x = -1", 2);
//        addQuestion(q6);
//        Question q7 = new Question("Tìm giá trị của x khi: 2(x + 4) = 18",
//                "A. x = 6", "B. x = 7", "C. x = 5", "D. x = 8", 3);
//        addQuestion(q7);
//        Question q8 = new Question("Giải phương trình sau: 3x^2 - 12 = 0",
//                "A. x = 2", "B. x = -2", "C. x = 4", "D. x = -4", 4);
//        addQuestion(q8);
//        Question q9 = new Question("Tìm giá trị của x khi: 5x + 2 = 27",
//                "A. x = 4", "B. x = 5", "C. x = 6", "D. x = 7", 1);
//        addQuestion(q9);
//        Question q10 = new Question("Giải phương trình sau: x^2 - 9 = 0",
//                "A. x = 3", "B. x = -3", "C. x = 0", "D. x = 9", 2);
//        addQuestion(q10);
//    }
    private void addQuestion(Question question) {
        ContentValues cv = new ContentValues();
        cv.put(QuestionsTable.COLUMN_QUESTION, question.getQuestion());
        cv.put(QuestionsTable.COLUMN_OPTION1,question.getOption1());
        cv.put(QuestionsTable.COLUMN_OPTION2,question.getOption2());
        cv.put(QuestionsTable.COLUMN_OPTION3,question.getOption3());
        cv.put(QuestionsTable.COLUMN_OPTION4,question.getOption4());
        cv.put(QuestionsTable.COLUMN_ANSWER,question.getAnswer());
        db.insert(QuestionsTable.TABLE_NAME,null,cv);
    }

    @SuppressLint("Range")
    public List<Question> getAllQuestions() {
        List<Question> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM " + QuestionsTable.TABLE_NAME, null);

        if (c.moveToFirst()) {
            do {
                Question question = new Question();
                question.setQuestion(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_QUESTION)));
                question.setOption1(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_OPTION1)));
                question.setOption2(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_OPTION2)));
                question.setOption3(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_OPTION3)));
                question.setOption4(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_OPTION4)));
                question.setAnswer(c.getInt(c.getColumnIndex(QuestionsTable.COLUMN_ANSWER)));
                questionList.add(question);
            } while (c.moveToNext());
        }

        c.close();
        return questionList;
    }
}
