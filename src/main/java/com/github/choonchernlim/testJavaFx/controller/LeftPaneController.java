package com.github.choonchernlim.testJavaFx.controller;

import com.github.choonchernlim.testJavaFx.event.ShowHideEvent;
import com.github.choonchernlim.testJavaFx.service.EventBusService;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import javax.inject.Inject;

public final class LeftPaneController {
    private final EventBusService eventBusService;

    @Inject
    public LeftPaneController(final EventBusService eventBusService) {
        System.out.println("left pane controller constructor");
        this.eventBusService = eventBusService;
    }

    @FXML
    protected void hideRightSide(ActionEvent actionEvent) {
        System.out.println("hiding right side....");
        eventBusService.post(new ShowHideEvent(false));
    }

    @FXML
    protected void showRightSide(ActionEvent actionEvent) {
        System.out.println("showing right side....");
        eventBusService.post(new ShowHideEvent(true));
    }
}
