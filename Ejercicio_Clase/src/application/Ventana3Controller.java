package application;

import javafx.fxml.FXML;

import javafx.scene.control.Button;

import javafx.scene.control.TextField;

import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class Ventana3Controller {
	@FXML
	private TextField TextApellido;
	@FXML
	private TextField TextTelefono;
	@FXML
	private TextField TextNombreUsuario;
	@FXML
	private TextField TextContraseña;
	@FXML
	private TextField TextNombre;
	@FXML
	private Button BotonListo;
	@FXML
	
	private String Nombre;
    private String Apellido;
    private String Telefono;
    private String NombreUsuario;
    private String Contraseña;

    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public String getTelefono() {
        return Telefono;
    }

    public String getNombreUsuario() {
        return NombreUsuario;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void procesarDatos() {
        Nombre = TextNombre.getText();
        Apellido = TextApellido.getText();
        Telefono = TextTelefono.getText();
        NombreUsuario = TextNombreUsuario.getText();
        Contraseña = TextContraseña.getText();
    }
    
	public void BotonController3(MouseEvent event) {
		 procesarDatos();
		 
		 Stage stage = (Stage) BotonListo.getScene().getWindow();
	     stage.close();
	}
}
