module com.iessanalberto.dam1.basicbankfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.iessanalberto.dam1.basicbankfx to javafx.fxml;
    exports com.iessanalberto.dam1.basicbankfx;
}