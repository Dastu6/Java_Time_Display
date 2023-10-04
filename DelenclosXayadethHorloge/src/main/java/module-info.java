module org.openjfx.DelenclosXayadethHorloge {
    requires javafx.controls;
    requires javafx.fxml;

    opens org.openjfx.DelenclosXayadethHorloge to javafx.fxml;
    exports org.openjfx.DelenclosXayadethHorloge;
}
