import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import org.json.simple.*;
import org.json.simple.parser.*;

public class Solution {

    public static String getPhoneNumbers(String country, String phoneNumber) {
        // Replace spaces in the country name with '%20' to ensure the URL is encoded properly
        String queryUrl = "https://jsonmock.hackerrank.com/api/countries?name=" + country.replace(" ", "%20");
        
        try {
            // Create a URL object from the String representation
            URL url = new URL(queryUrl);
            // Open a connection to the URL
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            // Set the request method to GET
            conn.setRequestMethod("GET");
            // Get the input stream of the connection
            InputStream responseStream = conn.getInputStream();

            // Read the input stream into a String
            Scanner scanner = new Scanner(responseStream);
            String responseBody = scanner.useDelimiter("\\A").next();
            scanner.close();

            // Parse the response body as JSON
            JSONParser parser = new JSONParser();
            JSONObject jsonResponse = (JSONObject) parser.parse(responseBody);
            JSONArray data = (JSONArray) jsonResponse.get("data");

            // Check if the data array is empty
            if (data.isEmpty()) {
                return "-1";
            }

            // Extract the calling codes array from the data
            JSONObject countryInfo = (JSONObject) data.get(0);
            JSONArray callingCodes = (JSONArray) countryInfo.get("callingCodes");

            // Use the last calling code in the array
            String callingCode = (String) callingCodes.get(callingCodes.size() - 1);

            // Return the formatted phone number
            return "+" + callingCode + " " + phoneNumber;
        } catch (Exception e) {
            e.printStackTrace();
            return "-1";
        }
    }

    public static void main(String[] args) {
        // Example usage
        System.out.println(getPhoneNumbers("Afghanistan", "656445445"));
    }
}
