package com.github.choonchernlim.testJavaFx.service.impl;

import com.github.choonchernlim.testJavaFx.constant.FxmlEnum2;
import com.github.choonchernlim.testJavaFx.main.Main;
import com.github.choonchernlim.testJavaFx.service.FxmlLoaderService2;
import com.google.common.io.Resources;
import javafx.fxml.FXMLLoader;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.Parent;

import java.io.IOException;

public final class FxmlLoaderServiceImpl2 implements FxmlLoaderService2 {
    @Override
    public Parent load(final FxmlEnum2 fxmlEnum) {
        try {
            return FXMLLoader.load(Resources.getResource(fxmlEnum.getPath()),
                                   null,
                                   new JavaFXBuilderFactory(),
                                   Main.INJECTOR::getInstance);
        }
        catch (IOException e) {
            throw new RuntimeException("Unable to load FXML from path: " + fxmlEnum.getPath(), e);
        }
    }
}
