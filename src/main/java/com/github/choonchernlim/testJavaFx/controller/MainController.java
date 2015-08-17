package com.github.choonchernlim.testJavaFx.controller;

import com.github.choonchernlim.testJavaFx.constant.FxmlEnum2;
import com.github.choonchernlim.testJavaFx.event.ShowHideEvent;
import com.github.choonchernlim.testJavaFx.service.EventBusService;
import com.github.choonchernlim.testJavaFx.service.FxmlLoaderService2;
import com.google.common.eventbus.Subscribe;
import javafx.fxml.FXML;
import javafx.scene.layout.BorderPane;

import javax.inject.Inject;

public final class MainController {
    private final FxmlLoaderService2 fxmlLoaderService;

    @FXML
    private BorderPane borderPane;

    @Inject
    public MainController(final FxmlLoaderService2 fxmlLoaderService, final EventBusService eventBusService) {
        this.fxmlLoaderService = fxmlLoaderService;
        eventBusService.register(this);
    }

    @Subscribe
    public void toggleRightContainerVisibility(ShowHideEvent event) {
        System.out.println("hiding right side from main controller....");

        if (event.isShow()) {
            borderPane.setRight(fxmlLoaderService.load(FxmlEnum2.RIGHT_PANE));
        }
        else {
            borderPane.setRight(null);
        }
    }

}
