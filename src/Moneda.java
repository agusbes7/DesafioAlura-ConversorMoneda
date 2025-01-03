
import com.google.gson.Gson;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.security.Key;

public class Moneda {
   private  float cantidad;
    private String entrada;
    private String salida;
//------------------setters--------------------------
public void setEntrada(int x) {        this.entrada = TasaDeConversion.getOpcion(x);}
public void setSalida(int x) {          this.salida = TasaDeConversion.getOpcion(x);}
public void setCantidad(float cantidad) {           this.cantidad = cantidad;}
//--------------------------getters--------------------------
public float getCantidad() {        return cantidad;}
public String getEntrada() {        return entrada;    }
public String getSalida() {        return salida;}
//--------------------------------------------------------------------------------------------------------
    public void calculoTransformado() {
        String aux = getSolicitud();
        Tasas factor = transform(aux);
        if(factor.operacionExitosa()==true){
        factor.getTasa();
        float rate = factor.findRate(salida);
        cantidad = cantidad * rate;
        System.out.println("La conversion de capitales resulta en:" + cantidad);
        System.out.println("----------------------------------");
    }
else {System.out.println("Lo siento fallo la operacion");}
        }
//-----------------------conexion con la Api proporcionada ---------------------------------
 private String getSolicitud() {
String clave="null";
    String direccion = "https://v6.exchangerate-api.com/v6/"+clave+"/latest/";

     String datos="null";
      try {

       HttpClient client = HttpClient.newHttpClient();
       //creacion del cliente para enviar solicitudes
        HttpRequest request = HttpRequest.newBuilder()
/*Uri.create creacion de la direccion
 request realizacion de una solicitud
  */
                .uri(URI.create(direccion + this.entrada))
                .build();
        HttpResponse<String> respuesta = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        datos=respuesta.body();}
      //guardar respuesta de la solicitud
      catch (IOException | InterruptedException  e) {
          e.printStackTrace();
return  "Lo siento intenta mas tarde estamos experimentando problemas con el servidor" ;}
      return datos;}

//--------------Transformar la informacion obtenida en clase record tasas----------
private static   Tasas transform(String respuesta){
    Gson gson = new Gson();
   Tasas aux=gson.fromJson(respuesta, Tasas.class);
return  aux;}}



