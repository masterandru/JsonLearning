import org.json.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

public class JsonWrite {
    public static void main(String[] args) {

        // Prepare JSON object
        JSONObject obj = new JSONObject();
        obj.put("fullname", "Ivan Bublik");
        obj.put("balance", new Double(1000.21));
        obj.put("isvip", new Boolean(true));
        obj.put("countnumber", new Long(400035345345453453L));

        // Write JSON object to file
        try (FileWriter file = new FileWriter("JSONfile.json")) {
            file.write(obj.toString());
            System.out.println("Successfully Copied JSON Object to File...");
            System.out.println("\nJSON Object: " + obj);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
