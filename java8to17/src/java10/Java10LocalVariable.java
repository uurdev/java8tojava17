package java10;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class Java10LocalVariable {
    public void connectGoogle() throws IOException {
        var url = new URL("https://www.google.com");
        var connection =
                (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
    }

    public void useVarKeyword() {
        var string = "uurdev";
        var integer = 7;
        //string = integer;
    }
}
