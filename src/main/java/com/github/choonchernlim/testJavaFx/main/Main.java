package com.github.choonchernlim.testJavaFx.main;

import com.github.choonchernlim.testJavaFx.constant.FxmlEnum2;
import com.github.choonchernlim.testJavaFx.guice.GuiceModule;
import com.github.choonchernlim.testJavaFx.service.FxmlLoaderService2;
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

        final FxmlLoaderService2 fxmlLoaderService = INJECTOR.getInstance(FxmlLoaderService2.class);

        final Parent root = fxmlLoaderService.load(FxmlEnum2.MAIN);

        primaryStage.setTitle("FXML Welcome");
        primaryStage.setScene(new Scene(root));
        primaryStage.setMinWidth(800);
        primaryStage.setMinHeight(600);
        primaryStage.show();
    }
}
