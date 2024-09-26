module com.gl0w1e.metlinux {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.gl0w1e.metlinux to javafx.fxml;
    exports com.gl0w1e.metlinux;
}