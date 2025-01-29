package com.iessanalberto.dam1.basicbankfx.screens;

import com.iessanalberto.dam1.basicbankfx.models.Cliente;
import com.iessanalberto.dam1.basicbankfx.navigation.Navigation;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Alert;
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
    public MenuScreen(Cliente cliente) {
        //Configuramos los elementos del layout
        root.setPadding(new Insets(10));
        root.setSpacing(20);
        root.setAlignment(Pos.CENTER);
        //Añadimos los componentes al layout
        root.getChildren().addAll(btnIngresar,btnSacar,btnConsultar);
        //Añadimos la interactividad a los componentes
        btnIngresar.setOnAction(actionEvent -> {
            Navigation.navigate("ActualizarSaldoScreen",cliente,"Ingreso");
        });
        btnSacar.setOnAction(actionEvent -> {
            Navigation.navigate("ActualizarSaldoScreen",cliente,"Efectivo");
        });
        btnConsultar.setOnAction(actionEvent -> {
            Alert alert = new Alert (Alert.AlertType.INFORMATION);
            alert.setHeaderText("Saldo del cliente");
            alert.setTitle(cliente.getNombre());
            alert.setContentText("Su saldo es: " +cliente.getSaldo());
            alert.showAndWait();
        });
    }
        //Métodos getter
    public VBox getRoot() {
        return root;
    }
}
