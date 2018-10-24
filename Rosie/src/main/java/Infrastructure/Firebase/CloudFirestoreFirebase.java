package Infrastructure.Firebase;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseOptions;

public class CloudFirestoreFirebase{
    
    final private GoogleCredentials _googleCredentials;
    final private FirebaseOptions _options;
    
    public CloudFirestoreFirebase(GoogleCredentials googleCredentials,
            FirebaseOptions options)
    {
        _googleCredentials = googleCredentials;
        _options = options;
    }
        /*
        DocumentReference docRef2 = db.collection("users").document("aturing");
        // Add document data with an additional field ("middle")
        Map<String, Object> data2 = new HashMap<>();
        data2.put("first", "Alan");
        data2.put("middle", "Mathison");
        data2.put("last", "Turing");
        data2.put("born", 1912);

        ApiFuture<WriteResult> result2 = docRef2.set(data2);
        System.out.println("Update time : " + result2.get().getUpdateTime());  */
}

