import java.util.HashMap;
import java.util.Map;

public abstract class TasaDeConversion {
    private static final Map<Integer, String> opcionesMenu = new HashMap<>();
    static {
        opcionesMenu.put(1, "ARS");
        opcionesMenu.put(2, "BOB");
        opcionesMenu.put(3, "BRL");
        opcionesMenu.put(4, "CLP");
        opcionesMenu.put(5, "COP");
        opcionesMenu.put(6, "USD");}

    public static String getOpcion(int codigo) {
        return opcionesMenu.get(codigo);
    }
}