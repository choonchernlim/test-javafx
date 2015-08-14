package com.github.choonchernlim.testJavaFx.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.MenuBar;

public final class MenuController {
    public MenuBar menuBar;

    @FXML
    private void handleAboutAction(ActionEvent actionEvent) {
        System.out.println("about action!");
    }
}
