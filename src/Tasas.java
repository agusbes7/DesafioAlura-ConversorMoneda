import com.google.gson.annotations.SerializedName;

import java.util.HashMap;
import java.util.Map;

public record Tasas(
    @SerializedName("result")           String result,
    @SerializedName("time_last_update_utc")              String fecha,
@SerializedName("base_code")    String base,
@SerializedName("conversion_rates")              Map<String,Float>rates){

    public void getTasa(){
            System.out.println("El resultado de la operacion fue:"+     result);
        System.out.println("Moneda de origen: "+base+ " ");
        System.out.println("fecha de operacion: "+ fecha);}

   public void getRates(){      System.out.println(rates);}

public   Float findRate(String pais){return  rates.get(pais);}


}
