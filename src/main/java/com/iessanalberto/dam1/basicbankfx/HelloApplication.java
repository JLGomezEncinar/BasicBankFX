package com.iessanalberto.dam1.basicbankfx;

import com.iessanalberto.dam1.basicbankfx.screens.LoginScreen;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        LoginScreen loginScreen = new LoginScreen();
        Scene scene = new Scene(loginScreen.getRoot(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}