module com.maddy.third_tutorial {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.maddy.third_tutorial to javafx.fxml;
    exports com.maddy.third_tutorial;
}