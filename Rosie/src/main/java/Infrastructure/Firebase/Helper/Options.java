package Infrastructure.Firebase.Helper;


import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseOptions;

public class Options {
    final private FirebaseOptions _options;
    
    public Options(GoogleCredentials googleCredentials){
        _options = new FirebaseOptions.Builder().setCredentials(googleCredentials).build();
    }
    
    public FirebaseOptions getFirebaseOptions(){
        return _options;
    }
}
