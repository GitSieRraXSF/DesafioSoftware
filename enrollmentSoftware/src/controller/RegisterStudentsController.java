package controller;

import java.sql.Connection;

import data.BookDAO;
import data.DBConnection;
import data.DatabaseConnection;
import data.StudentDAO;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class RegisterStudentsController {

    @FXML
    private TextField Emailfield;

    @FXML
    private TextField Nombrefield;

    @FXML
    private Button RegistroEstudent;

    @FXML
    private TextField idfield;
    
 // Singleton Connection
 	private Connection connection = DBConnection.getInstance().getConnection();
 	// BookDAO Instance
 	private StudentDAO studentDAO = new StudentDAO(connection);

    @FXML
    void RegistlogStudent(ActionEvent event) {
    	String ID = idfield.getText().trim();
    	String Nombre = Nombrefield.getText().trim();
    	String eMAIL = Emailfield.getText().trim();
    	
    	if ((ID.isEmpty() || Nombre.isEmpty()) || eMAIL.isEmpty()){
    		mostrarAlerta("Error!", "Campos Vacios", "Por favor rellenar los campos obligatorios");
    		return;
    	}
    	
    	try {
    		
    	}
    }
    
    private void mostrarAlerta(String titulo, String cabecera, String mensaje) {
		Alert alert = new Alert(Alert.AlertType.INFORMATION);
		alert.setTitle(titulo);
		alert.setHeaderText(cabecera);
		alert.setContentText(mensaje);
		alert.showAndWait();
	}

	private void limpiarCampos() {
		idfield.clear();
		Nombrefield.clear();
		Emailfield.clear();
	}
}