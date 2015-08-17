package com.github.choonchernlim.testJavaFx.main;

import com.github.choonchernlim.testJavaFx.constant.FxmlEnum;
import com.github.choonchernlim.testJavaFx.guice.GuiceModule;
import com.github.choonchernlim.testJavaFx.service.FxmlLoaderService;
import com.google.inject.Guice;
import com.google.inject.Injector;
import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public final class Main extends Application {
    public static final Injector INJECTOR = Guice.createInjector(new GuiceModule());

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(final Stage primaryStage) throws Exception {

        final FxmlLoaderService fxmlLoaderService = INJECTOR.getInstance(FxmlLoaderService.class);

        final Parent root = fxmlLoaderService.load(FxmlEnum.MAIN);

        primaryStage.setTitle("FXML Welcome");
        primaryStage.setScene(new Scene(root));
        primaryStage.setMinWidth(800);
        primaryStage.setMinHeight(600);
        primaryStage.show();
    }
}
