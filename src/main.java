import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.net.URI;

public void main(String[] args) {
    System.out.println("Bienvenidos pueden obtener tasas de conversion actualizadas");
/*    Scanner opcion= new Scanner(System.in);
Implementar a futuro el tratado de errores de malos inresos por teclado como ingresar una letra en un int
    try {
        opcion.nextInt();}
    catch (NumberFormatException e){
        System.out.println("Recuerda ingresar solo numeros enteros en el rango [1-7]");}*/

    String direccion="https://v6.exchangerate-api.com/v6/2958c704ea28742fd07d154c/latest/";
    HttpClient client = HttpClient.newHttpClient();
    HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create(direccion+"USD"))
            .build();
    client.sendAsync(request, BodyHandlers.ofString())
            .thenApply(HttpResponse::body)
            .thenAccept(responseBody-> {
        System.out.println("JSON Response:\n" + responseBody);})
            .join();}

