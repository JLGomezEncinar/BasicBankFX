package com.iessanalberto.dam1.basicbankfx.screens;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

public class MenuScreen {
    //Elementos del layout
    private VBox root = new VBox();
    // Añadimos los componentes
    private Button btnIngresar = new Button("Ingresar dinero");
    private Button btnSacar = new Button("Sacar dinero");
    private Button btnConsultar= new Button("Consultar saldo");
    //Constructor
    public MenuScreen() {
        //Configuramos los elementos del layout
        root.setPadding(new Insets(10));
        root.setSpacing(20);
        root.setAlignment(Pos.CENTER);
        //Añadimos los componentes al layout
        root.getChildren().addAll(btnIngresar,btnSacar,btnConsultar);
    }
        //Métodos getter
    public VBox getRoot() {
        return root;
    }
}
