package Application;

import Application.Handlers.GetHardwareDataHandler;
import Application.Handlers.SendHardwareDataHandler;
import Application.Models.Cpu;
import Application.Models.Disk;
import Application.Models.Memory;
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
    
        @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/Telas/TelaLogin.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
        
        
        
        
    }
    
    public static void main(String[] args) throws InterruptedException  {
        
        
                launch(args); 
      
              
      /*
        
        while (true) {
            Thread.sleep(5000);
            new GetHardwareDataHandler();
            new SendHardwareDataHandler();

            System.out.println(Cpu.getCpuUsage());
            System.out.println(Memory.getMemoryTotal() - Memory.getMemoryAvailable());
            System.out.println(Disk.getDiskTotal() - Disk.getDiskAvailable());
        }
*/
    }
    


}