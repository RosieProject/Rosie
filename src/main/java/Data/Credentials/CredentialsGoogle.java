package Data.Credentials;

import java.io.FileInputStream;
import java.io.InputStream;
import com.google.auth.oauth2.GoogleCredentials;
import java.io.FileNotFoundException;
import java.io.IOException;

public final class CredentialsGoogle {
    
    static final String JSON_CREDENTIAL = "Rosie-73161cfb2237.json";
    
    private GoogleCredentials _credentials;
    
    public CredentialsGoogle() {
        try(InputStream serviceAccount = new FileInputStream(JSON_CREDENTIAL)){
            _credentials = GoogleCredentials.fromStream(serviceAccount);
        } 
        catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        catch (IOException ex){
        }
    }
    
    public GoogleCredentials getGoogleCredentials() {
        return _credentials;
    }

}
