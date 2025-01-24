package com.iessanalberto.dam1.basicbankfx.navigation;

import com.iessanalberto.dam1.basicbankfx.models.Cliente;
import com.iessanalberto.dam1.basicbankfx.screens.LoginScreen;
import com.iessanalberto.dam1.basicbankfx.screens.MenuScreen;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Navigation {
    public static Stage stage = new Stage();
    public static void navigate(String destination){
        switch (destination) {
            case "LoginScreen" -> {
                LoginScreen loginScreen = new LoginScreen();
                Scene loginScene = new Scene(loginScreen.getRoot(),320,240);
                stage.setTitle("Conexión");
                stage.setScene(loginScene);
                stage.show();
            }

        }
    }
    public static void navigate (String destination, Cliente cliente){
        switch (destination){
            case "MenuScreen" -> {
                MenuScreen menuScreen = new MenuScreen(cliente);
                Scene menuScene = new Scene(menuScreen.getRoot(),320,240);
                stage.setTitle(cliente.getNombre()+ " "+cliente.getApellidos());
                stage.setScene(menuScene);
                stage.show();
            }
        }
    }
}
