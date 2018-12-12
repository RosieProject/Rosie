package Application;

import Application.Handlers.GetHardwareDataHandler;
import Application.Handlers.SendHardwareDataHandler;
/*import Application.Models.Computer;
import Application.Models.Cpu;
import Application.Models.Disk;
import Application.Models.Memory;
import Application.Models.Sensors;
import Application.Helper.GetLog;*/
//-----------------------------

import Application.Helper.GetLog;
import com.github.seratch.jslack.Slack;
import com.github.seratch.jslack.api.webhook.Payload;
import com.github.seratch.jslack.api.webhook.WebhookResponse;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Startup extends Application {
    static String todosLog = null;

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/Telas/TelaLogin.fxml"));

        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();
    }

    public static void slackConecxao(String texto) throws Exception {
        String url = "https://hooks.slack.com/services/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";
    
    Payload payload = Payload.builder()
            .channel("#random")
            .username("BotSlack")
            .iconEmoji(":smile_cat:")
            .text(texto)
            .build();
    
    Slack slack = Slack.getInstance();
        try {
            WebhookResponse response = slack.send(url, payload);
        } catch (IOException ex) {
            Logger.getLogger(SlackConecxao.class.getName()).log(Level.SEVERE, null, ex);
        }    
    }
    
    public static String todosLogs(){
        return todosLog;
    }
    

    public static void main(String[] args) throws InterruptedException, IOException {
        try {
            
            launch(args);
            //System.out.println("teste 2");
            
            //while (true) {
            Thread.sleep(5000);
            new GetHardwareDataHandler();
            //new SendHardwareDataHandler();
            
            //System.out.println(Cpu.getCpuUsage());
            //System.out.println(Memory.getMemoryTotal() - Memory.getMemoryAvailable());
            //System.out.println(Disk.getDiskTotal() - Disk.getDiskAvailable());
            //System.out.println(Cpu.getCpuName());
            //System.out.println(Cpu.getProcessadoresLogicos());
            //System.out.println(Cpu.getProcessadoresFisicos());
            //System.out.println(Cpu.getInterrupts());
            //System.out.println(Cpu.getSystemUpTime());
            //System.out.println(Computer.getProcessCount());
            //System.out.println(Computer.getThreadCount());
            //System.out.println(Computer.getVersion());
            //System.out.println(Computer.getManufacturer());
            //System.out.println(Computer.getNetworkParams());
            //System.out.println(Memory.getPageSize());
            //System.out.println(Disk.getName());
            //System.out.println(Sensors.getCpuTemperature());
            //System.out.println(Sensors.getCpuVoltage());
            //System.out.println(Sensors.getFanSpeed());
            //------------------------------------------------
            //System.out.println(Computer.getIpv4());
            //System.out.println(Computer.getIpv6());
            //System.out.println(Computer.getDomainName());
            //System.out.println(Computer.getHostName());
            /*File file = new File("ArquivoLog");
            file.mkdir();*/
            GetLog log = new GetLog();
            
            File logArquivo = new File("logArquivo.txt");
            logArquivo.createNewFile();
            
            
            try (FileWriter fileWriter = new FileWriter(logArquivo, true);
                    BufferedWriter escrever = new BufferedWriter(fileWriter)) {
                escrever.write(log.getLog());
                
                todosLog += log.getLog();
            } catch (IOException ex) {
                System.out.println(ex);
            }
        } catch (Exception ex) {
            Logger.getLogger(Startup.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
