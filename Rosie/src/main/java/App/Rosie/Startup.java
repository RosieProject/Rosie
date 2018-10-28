package App.Rosie;

import App.Controller.CpuController;

import App.Models.Cpu;

import Infrastructure.MicrosoftJDBC.AzureDatabaseConnection;

import javax.sql.DataSource;
import java.sql.SQLException;

public class Startup {
    public static void main(String[] args) throws InterruptedException, SQLException {
        final Cpu cpu = new Cpu();
        final CpuController cpuController = new CpuController(cpu);
        DataSource dataSource = new AzureDatabaseConnection().getDataSource();
while(true){
    Thread.sleep(2500);

            System.out.print(String.format("\n Cpu Usage: %.2f%%", cpuController.getHandler().getCpuUsage()));
            cpuController.sendHandler(dataSource);
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

}
