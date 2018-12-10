package Telas;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Application.Handlers.GetHardwareDataHandler;
import Application.Handlers.SendHardwareDataHandler;
import Application.Models.Cpu;
import Application.Models.Disk;
import Application.Models.Memory;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

/**
 * FXML Controller class
 *
 * @author campos.lucas
 */
public class TelaPosLoginController implements Initializable {

    @FXML
    private Button btnfechar;

    @FXML
    private Label lblOsDadosEstaoSendoEnviados;

    @FXML
    private ImageView imgUpload;
    
    @FXML
    private Button btnComecar;

    @FXML
    void pararESair(ActionEvent event) {
        System.exit(0);
    }
    
    @FXML
    void comecar(ActionEvent event) throws InterruptedException{
        Runnable r = new Runnable() {
            @Override
            public void run() {
                
                int n = 0;
                while (true){
                    System.out.println("Teste" + n);
                    n++;
                }
            }
            
        };
        
        Thread t = new Thread(r);
        t.start();
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }
    
}
