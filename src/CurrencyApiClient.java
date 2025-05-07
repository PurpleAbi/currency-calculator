import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class CurrencyApiClient {
     public Currency search( String baseCode,
                             String targetCode,
                             double amount){
         String url = "https://v6.exchangerate-api.com/v6/465156d94f40651b5226cf9f/pair/"
                 + baseCode + "/" + targetCode + "/" + amount;

         HttpClient client = HttpClient.newHttpClient();
         HttpRequest request = HttpRequest.newBuilder()
                 .uri(URI.create(url))
                 .build();

         try {
             HttpResponse<String> response = null;
             response = client
                     .send(request, HttpResponse.BodyHandlers.ofString());
             return new Gson().fromJson(response.body(), Currency.class);
         } catch (Exception ex) {
             throw new RuntimeException(ex);
         }
     }
}
