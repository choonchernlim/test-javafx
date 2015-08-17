package com.github.choonchernlim.testJavaFx.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.GridPane;

public final class RightPaneController {
    @FXML
    private GridPane container;

    @FXML
    protected void hideLeftSide(ActionEvent actionEvent) {
        System.out.println("hiding left side....");
    }
}
