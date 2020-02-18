package sample;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Controller {

    @FXML
    private JFXButton btn_login;
    @FXML
    private JFXTextField tf_user;
    @FXML
    private JFXPasswordField tf_pass;
    @FXML
    private JFXComboBox cb_rol;
    @FXML
    private JFXButton btn_reg;
    @FXML
    private JFXTextField tf_nombre;


    @FXML
    public void log_in(ActionEvent event) throws Exception {


        if(tf_user.getText().equals("user")  && tf_pass.getText().equals("pass")){

            Stage primaryStage = new Stage();

            Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
            primaryStage.initStyle(StageStyle.TRANSPARENT);

            Scene login = new Scene(root);

            primaryStage.setTitle("Aplicación Amochital *pollito*");


            primaryStage.setScene(login);
            primaryStage.show();
        }

    }

    @FXML
    public void registro(ActionEvent event) throws Exception{
        String nombre = tf_nombre.getText();

    }

}