package com.github.choonchernlim.testJavaFx.main;

import com.github.choonchernlim.testJavaFx.guice.AppModule;
import com.google.common.io.Resources;
import com.google.inject.Guice;
import com.google.inject.Injector;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public final class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(final Stage primaryStage) throws Exception {
        final Injector injector = Guice.createInjector(new AppModule());

        final Parent root = FXMLLoader.load(Resources.getResource("fxml/main.fxml"),
                                            null,
                                            new JavaFXBuilderFactory(),
                                            injector::getInstance);

        primaryStage.setTitle("FXML Welcome");
        primaryStage.setScene(new Scene(root));
        primaryStage.setMinWidth(800);
        primaryStage.setMinHeight(600);
        primaryStage.show();
    }
}
