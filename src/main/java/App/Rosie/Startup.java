package App.Rosie;

import App.Controller.Memory;
import App.Controller.Cpu;

import Data.Credentials.CredentialsGoogle;

import Infrastructure.Firebase.CloudFirestoreFirebase;
import Infrastructure.Firebase.Helper.Options;

import com.google.auth.oauth2.GoogleCredentials;

import com.google.firebase.FirebaseOptions;

public class Startup {
    public static void main(String[] args){

        Memory memory = new Memory();
        Cpu cpu = new Cpu();
        
            System.out.print(String.format("\n Memory Usage: %s%%", memory.getMemoryUsage() * 1048576));
            System.out.print(String.format("\n Cpu Usage: %s%%", cpu.getCpuUsage()));

        GoogleCredentials credentialsGoogle = new CredentialsGoogle().getGoogleCredentials();
        FirebaseOptions firebaseOptions = new Options(credentialsGoogle).getFirebaseOptions();
        CloudFirestoreFirebase firebaseCloudDatabase = new CloudFirestoreFirebase(credentialsGoogle, firebaseOptions);

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
