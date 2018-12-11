package Application;

import Application.Handlers.GetHardwareDataHandler;
import Application.Handlers.SendHardwareDataHandler;
import Application.Helper.GetLog;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javafx.application.Application;
import static javafx.application.Application.launch;
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

    public void end() throws Exception {

    }

    public static void main(String[] args) throws InterruptedException, IOException {
        //launch(args);
        
            Thread.sleep(5000);
            new GetHardwareDataHandler();
            new SendHardwareDataHandler(2);
        
        /*GetLog log = new GetLog();

        File logArquivo = new File("logArquivo.txt");
        logArquivo.createNewFile();

        try (FileWriter fileWriter = new FileWriter(logArquivo, true);
                BufferedWriter escrever = new BufferedWriter(fileWriter)) {
            escrever.write(log.getLog());
        } catch (IOException ex) {
        }*/
    }
}
