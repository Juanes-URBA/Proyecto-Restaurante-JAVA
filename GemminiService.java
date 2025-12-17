import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
public class GemminiService {
    private static final String API_KEY = "TU_API_KEY_GEMINI";

    public String generarAnalisis(String reporte) {
        try {
            String json = """
            {
                "contents": [{
                    "parts": [{
                        "text": "Analiza el siguiente reporte financiero y genera un resumen claro:\\n%s"
                    }]
                }]
            }
            """.formatted(reporte);
    
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(
                        "https://generativelanguage.googleapis.com/v1beta/models/gemini-pro:generateContent?key=" + API_KEY
                    ))
                    .header("Content-Type", "application/json")
                    .POST(HttpRequest.BodyPublishers.ofString(json))
                    .build();
            HttpClient client = HttpClient.newHttpClient();
            HttpResponse<String> response =
                    client.send(request, HttpResponse.BodyHandlers.ofString());

            return response.body();

        } catch (Exception e) {
            return "Error al generar análisis con IA";
        }
    }
}
