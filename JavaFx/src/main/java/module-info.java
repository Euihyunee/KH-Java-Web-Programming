module test.kh.javafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens test.kh.javafx to javafx.graphics, javafx.fxml;
}