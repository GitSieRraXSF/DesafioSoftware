package controller;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class MainMenuController {
	
	 @FXML
	 private Button IniciarSesion;

	 @FXML
	 private Button Registrar;

	 @FXML
	 void LoginSesion(ActionEvent event) {

		 Main.loadView("SesionStudents.fxml");
	 }

	 @FXML
	 void RegistarUser(ActionEvent event) {

		 Main.loadView("RegisterStudents.fxml");
	 }
	
    public void goToStudents() {
        Main.loadView("Students.fxml");
    }

    public void goToCourses() {
        Main.loadView("Courses.fxml");
    }

    public void goToEnrollment() {
        Main.loadView("Enrollments.fxml");
    }

}
