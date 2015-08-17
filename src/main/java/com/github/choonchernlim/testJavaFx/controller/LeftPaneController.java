package com.github.choonchernlim.testJavaFx.controller;

import com.github.choonchernlim.testJavaFx.event.ShowHideEvent;
import com.google.common.eventbus.EventBus;
import javafx.fxml.FXML;

import javax.inject.Inject;

public final class LeftPaneController {
    private final EventBus eventBus;

    @Inject
    public LeftPaneController(final EventBus eventBus) {
        System.out.println("left pane controller constructor");
        this.eventBus = eventBus;
    }

    @FXML
    protected void hideRightSide() {
        System.out.println("hiding right side....");
        eventBus.post(new ShowHideEvent(false));
    }

    @FXML
    protected void showRightSide() {
        System.out.println("showing right side....");
        eventBus.post(new ShowHideEvent(true));
    }
}
