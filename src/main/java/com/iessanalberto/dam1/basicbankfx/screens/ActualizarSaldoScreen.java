package com.iessanalberto.dam1.basicbankfx.screens;

import com.iessanalberto.dam1.basicbankfx.models.Cliente;
import com.iessanalberto.dam1.basicbankfx.navigation.Navigation;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class ActualizarSaldoScreen {
    private VBox root = new VBox();
    private HBox fila1 = new HBox();

    private Label lblMensaje = new Label();
    private TextField txtDinero = new TextField();
    private Button btnOperar = new Button();
    private Button btnVolver = new Button ("Volver");

    public ActualizarSaldoScreen(Cliente cliente, String operacion) {
        root.setPadding(new Insets(10));
        root.setSpacing(20);
        root.setAlignment(Pos.CENTER);
        fila1.setAlignment(Pos.CENTER_RIGHT);
        fila1.setPadding(new Insets(0,20,0,0));
        fila1.setSpacing(5);
        fila1.getChildren().addAll(lblMensaje,txtDinero);
        root.getChildren().addAll(fila1,btnOperar,btnVolver);
        if (operacion.equals("Ingreso")){
            lblMensaje.setText("Introduce cantidad a ingresar");
            btnOperar.setText("Ingresar");
        } else {
            lblMensaje.setText("Introduce cantidad a retirar");
            btnOperar.setText("Retirar");
        }
        btnOperar.setOnAction(actionEvent -> {
            if(operacion.equals("Ingreso")){
                cliente.actualizarSaldo(Float.parseFloat(txtDinero.getText()));
                Alert alert = new Alert (Alert.AlertType.INFORMATION);
                alert.setHeaderText("Operación realizada");
                alert.setTitle(cliente.getNombre());
                alert.setContentText("Su nuevo saldo es: " +cliente.getSaldo());
                alert.showAndWait();
            } else {
               if(cliente.actualizarSaldo(-Float.parseFloat(txtDinero.getText()))) {
                   Alert alert = new Alert (Alert.AlertType.INFORMATION);
                   alert.setHeaderText("Operación realizada");
                   alert.setTitle(cliente.getNombre());
                   alert.setContentText("Su nuevo saldo es: " +cliente.getSaldo());
                   alert.showAndWait();
               } else {
                   Alert alert = new Alert (Alert.AlertType.ERROR);
                   alert.setHeaderText("Operación no realizada");
                   alert.setTitle(cliente.getNombre());
                   alert.setContentText("Saldo insuficiente\n"+ "Su saldo es: "+cliente.getSaldo());
                   alert.showAndWait();
               }
            }
        });

        btnVolver.setOnAction(actionEvent -> Navigation.navigate("MenuScreen",cliente));
    }

    public VBox getRoot() {
        return root;
    }
}
