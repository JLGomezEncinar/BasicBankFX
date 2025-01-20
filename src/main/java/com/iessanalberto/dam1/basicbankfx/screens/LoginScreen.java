package com.iessanalberto.dam1.basicbankfx.screens;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class LoginScreen {
    //Elementos del layout
    private VBox root = new VBox();
    private HBox fila1 = new HBox();
    private HBox fila2 = new HBox();
    //Componentes de la ventana
    private Label lblUsuario = new Label("Usuario");
    private TextField txtUsuario = new TextField();
    private Label lblPassword = new Label("Contraseña");
    private PasswordField txtPassword = new PasswordField();
    private Button btnConectar = new Button("Conectar");
    public LoginScreen(){
        //Configuramos los elementos del layout
        root.setPadding(new Insets(10));
        root.setSpacing(20);
        root.setAlignment(Pos.CENTER);
        fila1.setAlignment(Pos.CENTER_RIGHT);
        fila1.setPadding(new Insets(0,20,0,0));
        fila1.setSpacing(5);
        fila2.setAlignment(Pos.CENTER_RIGHT);
        fila2.setPadding(new Insets(0,20,0,0));
        fila2.setSpacing(5);

        //Añadimos los componentes a su layout
        fila1.getChildren().addAll(lblUsuario,txtUsuario);
        fila2.getChildren().addAll(lblPassword,txtPassword);
        root.getChildren().addAll(fila1,fila2,btnConectar);
    }

    public VBox getRoot() {
        return root;
    }
}
