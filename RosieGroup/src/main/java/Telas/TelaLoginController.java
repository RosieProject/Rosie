/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import Application.DAO.DatabaseConnection;
import Application.Startup;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
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

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

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
    private AnchorPane conteudo;

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
    
    @FXML
    public void abrirProximaTela() {
        try{

                Parent root = FXMLLoader.load(getClass().getResource("TelaPosLogin.fxml"));
                Stage stage = new Stage();
                Scene scene = new Scene(root, 400, 240);
                stage.setScene(scene);
                stage.show();

        }catch (IOException e) {
            e.printStackTrace();
        }


    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        btnEntrar.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                //System.out.println(lblLogin.getText() + lblSenha.getText());
               
               // String original = lblSenha.getText();
                //String login = lblLogin.getText();
                Criptografia();
                /*if (original.equals("1234") && login.equals("root")) {
                    abrirProximaTela();
                } else {
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("Erro");
                    alert.setHeaderText("Login ou senha invalida");
                    alert.setContentText("Login ou senha invalida, certifique-se de que esta digitando corretamente");
                    alert.show();
                }
*/
                /*try {
                    String hashString = gerarSha256(original);
                    if (ValidaSenha(hashString) == true){
                        System.out.println("teste 2");
                        
                    }else{
                        System.out.println("teste 3");
                        System.exit(0); 
                    }
                } catch (NoSuchAlgorithmException ex) {
                    Logger.getLogger(TelaLoginController.class.getName()).log(Level.SEVERE, null, ex);
                }*/
            }

        });

    }

    ;
    
    

     public void Criptografia() {

        String original = lblSenha.getText();

        String hashString = null;
        try {
            hashString = gerarSha256(original);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(TelaLoginController.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println(hashString);
        ValidaSenha(hashString);

    }

    private static String gerarSha256(String original) throws NoSuchAlgorithmException {

        MessageDigest digest = MessageDigest.getInstance("SHA-256");

        byte[] encodedhash = digest.digest(original.getBytes(StandardCharsets.UTF_8));

        StringBuffer hexString = new StringBuffer();

        for (int i = 0; i < encodedhash.length; i++) {

            String hex = Integer.toHexString(0xff & encodedhash[i]);

            if (hex.length() == 1) {
                hexString.append('0');
            }

            hexString.append(hex);

        }

        return hexString.toString();

    }

    public void ValidaSenha(String hashString) {

        String select = "select senha_usuario from usuario where email_usuario = ?";

        Connection connection = null;
        try {
            connection = DatabaseConnection.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(TelaLoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {

            PreparedStatement preparedStatement = connection.prepareStatement(select);
            preparedStatement.setString(1, lblLogin.getText().toString());
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                String userPassword = resultSet.getString("Senha_Usuario");
                if (userPassword.equals(hashString)) {
                    //FAZ COISAS SE FOR IGUAL
                    System.out.println("igual");
                   // return true;
                } else {
                    //FAZ COISAS SE NÃO FOR IGUAL
                    System.out.println("diferente");
                   // return false;
                }
            } 

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("to aqui");
        } /*finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }*/

    }
}
