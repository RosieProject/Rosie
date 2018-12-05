/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;

/**
 * FXML Controller class
 *
 * @author campos.lucas
 */
public class TelaLoginController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    @FXML
    private ImageView imgLogo;

    @FXML
    private JFXButton btnEntrar;

    @FXML
    private JFXButton btnAindaNaoECadastrado;

    @FXML
    private JFXTextField lblLogin;

    @FXML
    private ImageView imgPessoa;

    @FXML
    private ImageView imgCadeado;

    @FXML
    private JFXButton btnEsqueceuASenha;

    @FXML
    private JFXPasswordField lblSenha;

    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        btnEntrar.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("COLA AQUI");
            }
        });
        
    };
}
