package localvariable;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class Java8LocalVariable {
    public void connectGoogle() throws IOException {
        URL url = new URL("https://www.google.com");
        HttpURLConnection connection=
                (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
    }
}
