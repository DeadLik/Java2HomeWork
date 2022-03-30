package ru.gb.mychat.mychat;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ChatController {

    private String text;

    @FXML
    private TextArea messageArea;

    @FXML
    private TextField messageField;


    @FXML
    private void checkButtonClick(ActionEvent actionEvent) {
        text = messageField.getText();
        messageField.clear();

        if (text.isEmpty()) {
            return;
        }

        messageArea.appendText(text + "\n");
    }

    public void exitClick(ActionEvent actionEvent) {
        System.exit(0);
    }
}