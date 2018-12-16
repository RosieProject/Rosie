package Telas;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import Application.Handlers.GetHardwareDataHandler;
import Application.Handlers.SendHardwareDataHandler;
import Application.Helper.GetLog;
import Application.Models.Computer;
import Application.Models.Cpu;
import Application.Models.Disk;
import Application.Models.Memory;
import Application.Startup;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
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
        String texto = "Ola estamos finalizando o monitoramento no computador";
        try {
            Application.Startup.slackConecxao(texto);
        } catch (Exception ex) {
            Logger.getLogger(TelaPosLoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            Application.Startup.slackConecxao(todosLog);
        } catch (Exception ex) {
            Logger.getLogger(TelaPosLoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.exit(0);
    }
    String todosLog = null;
    @FXML
    void comecar(ActionEvent event) throws InterruptedException {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                String texto = "Ola estamos iniciando o monitoramento no computador";
                try {
                    Application.Startup.slackConecxao(texto);
                } catch (Exception ex) {
                    Logger.getLogger(TelaPosLoginController.class.getName()).log(Level.SEVERE, null, ex);
                }
                int n = 0;
                while (true) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(TelaPosLoginController.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    new GetHardwareDataHandler();
                    new SendHardwareDataHandler(Computer.idPc);
                    
                    GetLog log = new GetLog();
                    todosLog += log.getLog();

                    File logArquivo = new File("logArquivo.txt");
                    try {
                        logArquivo.createNewFile();
                    } catch (IOException ex) {
                        Logger.getLogger(TelaPosLoginController.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    try (FileWriter fileWriter = new FileWriter(logArquivo, true);
                            BufferedWriter escrever = new BufferedWriter(fileWriter)) {
                        escrever.write(log.getLog());

                        
                    } catch (IOException ex) {
                        System.out.println(ex);
                    }
                    
                    
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
