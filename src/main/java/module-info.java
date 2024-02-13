module com.example.githubdemo5 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.githubdemo5 to javafx.fxml;
    exports com.example.githubdemo5;
}