package application;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class VentanaController {
    @FXML
    private Button BotonIngresar;
    @FXML
    private TextField TextUsuario;
    @FXML
    private TextField TextContraseña;
    @FXML
    private Button BotonRegistrar;
    private String NombreUsuarioVentana3;
    private String ContraseñaVentana3;

    public void setDatosVentana3(String NombreUsuario, String Contraseña) {
        this.NombreUsuarioVentana3 = NombreUsuario;
        this.ContraseñaVentana3 = Contraseña;
    }

    public void BotonController(MouseEvent event) {
        String usuario = TextUsuario.getText();
        String contraseña = TextContraseña.getText();

        if ((usuario.equals("Kevin") && contraseña.equals("1234")) || 
                (NombreUsuarioVentana3 != null && ContraseñaVentana3 != null && usuario.equals(NombreUsuarioVentana3) && contraseña.equals(ContraseñaVentana3))) {
            try {
                Stage currentStage = (Stage) BotonIngresar.getScene().getWindow();
                currentStage.close();
                FXMLLoader loader = new FXMLLoader(getClass().getResource("Ventana2.fxml"));
                Stage stage = new Stage();
                stage.setScene(new Scene(loader.load()));
                stage.show();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void BotonController2(MouseEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Ventana3.fxml"));
            Parent root = loader.load();

            Ventana3Controller ventana3Controller = loader.getController();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.showAndWait(); 

            setDatosVentana3(ventana3Controller.getNombreUsuario(), ventana3Controller.getContraseña());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
