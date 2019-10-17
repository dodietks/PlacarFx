module placarfx {
    requires javafx.controls;
    requires javafx.fxml;
    
    opens org.dodie to javafx.fxml;
    exports org.dodie;
}
