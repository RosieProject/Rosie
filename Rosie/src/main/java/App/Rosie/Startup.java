package App.Rosie;

import App.Controller.CpuController;
import App.Controller.DiskController;
import App.Controller.MemoryController;

import App.Models.Cpu;
import App.Models.Disk;
import App.Models.Memory;

import Infrastructure.MicrosoftJDBC.AzureDatabaseConnection;

import javax.sql.DataSource;
import java.sql.SQLException;
import javafx.application.Application;
import javafx.stage.Stage;
import oshi.SystemInfo;
import oshi.hardware.platform.windows.WindowsGlobalMemory;
import oshi.software.os.OSFileStore;
import oshi.util.FormatUtil;

public class Startup extends Application {
    public static void main(String[] args) throws InterruptedException, SQLException {
        final Cpu cpu = new Cpu();
        final Memory memory = new Memory();
        final Disk disk = new Disk();
        final CpuController cpuController = new CpuController(cpu);
        final MemoryController memoryController = new MemoryController(memory);
        final DiskController diskController = new DiskController(disk);
        
        WindowsGlobalMemory gm = new WindowsGlobalMemory();
        DataSource dataSource = AzureDatabaseConnection.getDataSource();
        int i = 0;
        
        while(true){
            
            Thread.sleep(5000);
            /*OSFileStore[] fileStores = new SystemInfo().getOperatingSystem().getFileSystem().getFileStores();
            long total = arr[0].getTotalSpace() + arr[1].getTotalSpace() + arr[2].getTotalSpace();
            long usavel = arr[0].getUsableSpace()+ arr[1].getUsableSpace()+ arr[2].getUsableSpace();
            System.out.print(FormatUtil.formatBytesDecimal(total - usavel) + "\n");
            long a = gm.getTotal() - gm.getAvailable();
            System.out.print(FormatUtil.formatBytes(a) + "\n");*/
            
            
            System.out.print(String.format("\n Cpu Usage: %.2f%%", cpuController.getHandler().getCpuUsage()));
            System.out.print(String.format("\n Memory Usage: %d%%", memoryController.getHandler().getMemoryUsage()));
            System.out.print(String.format("\n Disk Usage: %d%%", diskController.getHandler().getDiskUsage()));
            if(i > 0){
                cpuController.sendHandler(dataSource);
                memoryController.sendHandler(dataSource);
                diskController.sendHandler(dataSource);
            }
            i = 1;
        }

        /*GoogleCredentials credentialsGoogle = new CredentialsGoogle().getGoogleCredentials();
        FirebaseOptions firebaseOptions = new Options(credentialsGoogle).getFirebaseOptions();
        CloudFirestoreFirebase firebaseCloudDatabase = new CloudFirestoreFirebase(credentialsGoogle, firebaseOptions);*/

        /*InputStream serviceAccount = new FileInputStream("Rosie-73161cfb2237.json");
        GoogleCredentials credentials = GoogleCredentials.fromStream(serviceAccount);

        FirebaseApp.initializeApp(firebaseOptions);

        Firestore db = FirestoreClient.getFirestore();

        DocumentReference docRef = db.collection("users").document("heio");
        Map<String, Object> data = new HashMap<>();
        data.put("first", "he");
        data.put("last", "io");
        data.put("born", 1815);
        ApiFuture<WriteResult> result = docRef.set(data);

        System.out.println("Update time : " + result.get().getUpdateTime());*/
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
