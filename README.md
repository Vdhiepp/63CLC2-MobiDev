# Nơi lưu các dự án android của Vo Dai Hiep
## ⚡DỰ ÁN APP TRẮC NGHIỆM KHỐI A01 (TOÁN-LÝ-HÓA)
### Mục đích:
Cho người dùng làm trắc nghiệm 20 câu với thời gian giới hạn để người dùng củng cố kiến thức cho khối A01.</br></br>
![Example GIF](https://github.com/Vdhiepp/63CLC2-MobiDev/blob/main/gif/page1.gif) 
</br>
![Example Image](https://github.com/Vdhiepp/63CLC2-MobiDev/blob/main/gif/page2.png) 
</br>

#### Trang đăng nhập sử dụng địa chỉ email và mật khẩu để đăng nhập
</br>

![Example GIF](https://github.com/Vdhiepp/63CLC2-MobiDev/blob/main/gif/page3.gif)
</br>
- TextViews: "Trắc nghiệm" và "Toán-Lý-Hóa" hiển thị ở phía trên với các kiểu và màu chữ cụ thể. "ĐĂNG NHẬP" là tiêu đề cho phần đăng nhập với màu chữ cụ thể.
- ImageViews và FrameLayout: Một ImageView (@drawable/logo1) và hai FrameLayout với nền và kích thước cụ thể. Một trong hai FrameLayout chứa một biểu tượng (@drawable/icon).
- TextInputLayout: Hai ô nhập văn bản với các gợi ý "Nhập email" và "Nhập mật khẩu". Ô nhập email có biểu tượng (@drawable/ic email), và ô nhập mật khẩu có biểu tượng (@drawable/ic password).
- Nút (Button): Một nút đăng nhập với nền tùy chỉnh (@drawable/btn_bg), văn bản và thuộc tính onClick để xử lý sự kiện đăng nhập.</br>
-> Giao diện này được thiết kế cho màn hình đăng nhập với logo, các ô nhập email, mật khẩu và nút đăng nhập. Các thiết lập bao gồm màu sắc, font chữ và biểu tượng cụ thể.
</br>

#### Sau khi đã đăng nhập vào trang chủ sẽ hiển thị quy tắc của bài trắc nghiệm
</br>

![Example Image](https://github.com/Vdhiepp/63CLC2-MobiDev/blob/main/gif/page4.png)
</br>
- Logo và Tiêu đề: Tiêu đề "Trắc nghiệm Toán-Lý-Hóa" được hiển thị giữa màn hình với các thuộc tính về màu sắc, kiểu chữ, và kích thước.
- Nút "Bắt đầu" (bt start): Một nút để chuyển sang Màn hình chọn chủ đề. Màu sắc, vị trí và kích thước được định rõ.
- Hình ảnh và Đối tượng FrameLayout: Các đối tượng FrameLayout chứa các hình ảnh như icon (@drawable/icon 2), icon (@drawable/nguyentu), và các hình nền khác.</br>
-> Giao diện này tạo ra một trải nghiệm người dùng hấp dẫn với hình ảnh, màu sắc và các nút tương tác để điều hướng giữa các màn hình trong ứng dụng trắc nghiệm Toán-Lý-Hóa.
</br>

#### Sẽ có 3 chủ đề riêng biệt để bạn ôn tập
</br>

![Example Image](https://github.com/Vdhiepp/63CLC2-MobiDev/blob/main/gif/page5.png)
</br>
- Logo và Tiêu đề: Hiển thị một đối tượng FrameLayout chứa logo (@drawable/logo1). Tiêu đề "Chủ Đề" được hiển thị giữa màn hình với các thuộc tính về màu sắc, kiểu chữ, và kích thước.
- Nút chọn chủ đề Toán Học (bt toán), Vật Lý (bt lý), Hóa Học (bt hóa): Các nút dùng để chuyển đến màn hình câu hỏi của từng chủ đề tương ứng. Nút “Toán học” để chuyển sang Màn hình câu hỏi toán. Nút “Vật lý” để chuyển sang Màn hình câu hỏi lý. Nút “Hóa học” để chuyển sang Màn hình câu hỏi hóa. Màu sắc, vị trí, kích thước và sự kiện onClick được định rõ.
- Hình ảnh và Đối tượng FrameLayout: Các đối tượng FrameLayout chứa các hình ảnh như icon (@drawable/icon 2, @drawable/icon 1), icon (@drawable/nguyentu), và các hình nền khác.
- Nút "Back" (btn_back main): Một nút dùng để quay lại màn hình chính. Kích thước, màu sắc và vị trí được định rõ.</br>
-> Giao diện này tạo ra một trải nghiệm người dùng trực quan với hình ảnh, màu sắc và các nút tương tác để chọn chủ đề và điều hướng trong ứng dụng trắc nghiệm Toán-Lý-Hóa.
</br>

#### Trang câu hỏi để ôn tập
</br>

![Example GIF](https://github.com/Vdhiepp/63CLC2-MobiDev/blob/main/gif/page6.gif)
![Example GIF](https://github.com/Vdhiepp/63CLC2-MobiDev/blob/main/gif/page7.gif)
![Example Image](https://github.com/Vdhiepp/63CLC2-MobiDev/blob/main/gif/page8.png)
![Example GIF](https://github.com/Vdhiepp/63CLC2-MobiDev/blob/main/gif/page9.gif)
</br>
- TextView đầu tiên: tv countdown: TextView hiển thị đồng hồ đếm ngược. tv view score: TextView hiển thị điểm người dùng. tv question_id: TextView hiển thị số thứ tự câu hỏi. tv category: TextView hiển thị chủ đề của câu hỏi.
- Câu hỏi và Lựa chọn: tv question: TextView hiển thị nội dung câu hỏi. RadioGroup và RadioButton: Nhóm và lựa chọn các đáp án.
- Kết nối cơ sở dữ liệu: Mở hoặc tạo cơ sở dữ liệu "Question Math.db" và truy vấn toàn bộ dữ liệu từ bảng "QUESTIONS". Dữ liệu được lấy bởi con trỏ (con trỏ) và di chuyển đến dòng đầu tiên.
- Hiển thị Câu Hỏi và Lựa Chọn: Phương thức CapNhat ManHinh cập nhật giao diện với câu hỏi và các lựa chọn từ dữ liệu cơ sở dữ liệu.
- Điểm và Hiển Thị Điểm: Biến điểm được sử dụng để tính và lưu trữ điểm người dùng. Mỗi khi người dùng chọn một lựa chọn, phương thức check Answer được gọi để kiểm tra và cập nhật điểm. Điểm được hiển thị thông qua TextView với phương thức update Diem TextView.
- Chuyển Câu Hỏi và Kết Thúc Trò Chơi: Khi người dùng nhấn nút "Next" (btn_next), chuyển đến câu hỏi tiếp theo. Nếu là câu hỏi cuối cùng, hiển thị điểm và chuyển đến End Activity.
- Đếm Ngược và Kết Thúc Trò Chơi: Sử dụng CountDownTimer để thực hiện đếm ngược với thời gian là 5 phút. Hiển thị thời gian còn lại và khi hết thời gian, chuyển đến End Activity.
- Xử lý Sự kiện RadioButton: Khi người dùng chọn một lựa chọn, sự kiện onRadioButtonClicked được gọi. Kiểm tra xem lựa chọn có đúng không và cập nhật điểm. Nếu là câu hỏi cuối cùng, hiển thị điểm và kết thúc trò chơi.
- Chuyển đến Màn hình Kết Thúc (End Activity): Khi trò chơi kết thúc, chuyển đến End Activity và truyền điểm.</br>
-> Là một ứng dụng trắc nghiệm với tính năng hỏi đáp và đếm ngược thời gian để hoàn thành các câu hỏi
</br>

#### Điểm số
</br>

![Example GIF](https://github.com/Vdhiepp/63CLC2-MobiDev/blob/main/gif/page10.gif)
</br>

#### Tạo Cơ Sở Dữ Liệu
</br>
- dbQuestion = openOrCreateDatabase("Question.db", MODE_PRIVATE, null); //Dòng này mở hoặc tạo một cơ sở dữ liệu SQLite có tên là "Question.db" ở chế độ riêng tư.
- dbQuestion.execSQL("DROP TABLE IF EXISTS QUESTIONS"); //Xóa bảng có tên "QUESTIONS" nếu nó đã tồn tại. Điều này được thực hiện để đảm bảo bắt đầu mới.
- String sqlTaoBangQuestion = "CREATE TABLE QUESTIONS(QuestionID integer PRIMARY KEY, " + "Question text, " + "Option1 text, " + "Option2 text, " + "Option3 text, " + "Option4 text, " + "Answer integer )";
dbQuestion.execSQL(sqlTaoBangQuestion); //Định nghĩa một câu lệnh SQL để tạo một bảng có tên "QUESTIONS" với các cột: QuestionID, Question, Option1, Option2, Option3, Option4, và Answer.
- Chèn Câu Hỏi Trắc Nghiệm: Mỗi dòng đại diện cho một câu lệnh SQL để chèn một câu hỏi trắc nghiệm vào bảng "QUESTIONS". Nó bao gồm ID câu hỏi, câu hỏi, bốn lựa chọn (Option 1 đến Option 4), và đáp án đúng.
- Đóng Cơ Sở Dữ Liệu: dbQuestion.close(); //Đóng cơ sở dữ liệu sau khi tạo bảng và chèn tất cả các câu hỏi.</br>
-> Khởi tạo một cơ sở dữ liệu SQLite cho một bài kiểm tra, tạo một bảng để lưu trữ các câu hỏi kiểm tra và chèn 20 câu hỏi mẫu với các lựa chọn và đáp án đúng vào bảng. Cấu trúc của cơ sở dữ liệu được tổ chức để lưu trữ các câu hỏi của bài kiểm tra.
</br>

#### Các công việc đã làm được
</br>

![Example Image](https://github.com/Vdhiepp/63CLC2-MobiDev/blob/main/gif/page11.png)


