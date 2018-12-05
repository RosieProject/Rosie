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
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    private JFXTextField lblLogin;

    @FXML
    private ImageView imgPessoa;

    @FXML
    private ImageView imgCadeado;


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
                
                 System.out.println(lblLogin.getText() + lblSenha.getText());
                         

               Criptografia();
            }

           
        });
        
        
        
    };

     public void Criptografia() {
         
         String original = lblSenha.getText();
         
        


        String hashString = null;
        try {
            hashString = gerarSha256(original);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(TelaLoginController.class.getName()).log(Level.SEVERE, null, ex);
        }



        System.out.println(hashString);

    }



    private static String gerarSha256(String original) throws NoSuchAlgorithmException {

        MessageDigest digest = MessageDigest.getInstance("SHA-256");

        byte[] encodedhash = digest.digest(original.getBytes(StandardCharsets.UTF_8));



        StringBuffer hexString = new StringBuffer();

        for (int i = 0; i < encodedhash.length; i++) {

        String hex = Integer.toHexString(0xff & encodedhash[i]);

        if(hex.length() == 1) hexString.append('0');

    hexString.append(hex);

    }

    return hexString.toString(); 

    }


         
         
            
}
