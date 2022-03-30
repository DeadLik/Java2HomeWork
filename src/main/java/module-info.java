module ru.gb.mychat.mychat {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.gb.mychat.mychat to javafx.fxml;
    exports ru.gb.mychat.mychat;
}