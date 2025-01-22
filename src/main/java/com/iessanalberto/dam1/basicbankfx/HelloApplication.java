package com.iessanalberto.dam1.basicbankfx;

import com.iessanalberto.dam1.basicbankfx.navigation.Navigation;
import com.iessanalberto.dam1.basicbankfx.screens.LoginScreen;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Navigation.navigate("LoginScreen");
    }

    public static void main(String[] args) {
        launch();
    }
}