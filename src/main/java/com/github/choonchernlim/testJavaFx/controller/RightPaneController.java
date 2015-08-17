package com.github.choonchernlim.testJavaFx.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.GridPane;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class RightPaneController {
    private static final Logger LOGGER = LoggerFactory.getLogger(RightPaneController.class);

    @FXML
    private GridPane container;

    @FXML
    protected void hideLeftSide(ActionEvent actionEvent) {
        LOGGER.debug("hiding left side....");
    }
}
