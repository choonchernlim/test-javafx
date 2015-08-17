package com.github.choonchernlim.testJavaFx.controller;

import com.github.choonchernlim.testJavaFx.event.ShowHideEvent;
import com.google.common.eventbus.EventBus;
import javafx.fxml.FXML;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;

public final class LeftPaneController {
    private static final Logger LOGGER = LoggerFactory.getLogger(LeftPaneController.class);
    private final EventBus eventBus;

    @Inject
    public LeftPaneController(final EventBus eventBus) {
        LOGGER.debug("left pane controller constructor");
        this.eventBus = eventBus;
    }

    @FXML
    protected void hideRightSide() {
        LOGGER.debug("hiding right side....");
        eventBus.post(new ShowHideEvent(false));
    }

    @FXML
    protected void showRightSide() {
        LOGGER.debug("showing right side....");
        eventBus.post(new ShowHideEvent(true));
    }
}
