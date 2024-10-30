import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class moneda  implements  gestionConversion {
    int cantidad;
    String entrada;
    String salida;

    private void getEntrada(int x){
        this.entrada=tasaDeConversion.getOpcion(x); }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;}


    @Override
   public void getSolicitud(int opcion) {
getEntrada(opcion);
        String direccion = "https://v6.exchangerate-api.com/v6/2958c704ea28742fd07d154c/latest/";
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(direccion + entrada))
                .build();
        client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
                .thenApply(HttpResponse::body)
                .thenAccept(System.out::println)
                .join();
    }
public void transform(){System.out.println("hola");}
    }

