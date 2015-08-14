package com.github.choonchernlim.testJavaFx.controller;

import com.github.choonchernlim.testJavaFx.event.ShowHideEvent;
import com.github.choonchernlim.testJavaFx.service.EventBusService;
import com.google.common.eventbus.Subscribe;
import com.google.inject.Inject;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.GridPane;

public final class RightPaneController {
    private final EventBusService eventBusService;

    @FXML
    private GridPane container;

    @Inject
    public RightPaneController(final EventBusService eventBusService) {
        System.out.println("right pane controller constructor");
        this.eventBusService = eventBusService;
        this.eventBusService.register(this);
    }

    @Subscribe
    public void hideContainer(ShowHideEvent event) {
        System.out.println("hiding right side from right controller....");
        container.setVisible(event.isShow());
    }

    @FXML
    protected void hideLeftSide(ActionEvent actionEvent) {
        System.out.println("hiding left side....");
    }
}
