import javax.swing.*;

public void main(String[] args) {
    int bandera=0;
List<Moneda> listaDeConversiones= new ArrayList<>();
    while (true) {

        Moneda cambio = new Moneda();
        System.out.println("Bienvenidos pueden obtener tasas de conversion actualizadas");
        linea();
        bandera=existePais("origen: ");
        if(bandera==-1){break;}
cambio.setEntrada(bandera);
        if(operacion()==0){break;}
cambio.setCantidad(monto());
        if(operacion()==0){break;}
bandera=existePais("salida: ");
        if(bandera==-1){break;}
cambio.setSalida(bandera);
        linea();

cambio.calculoTransformado();
listaDeConversiones.add(cambio);
        if(operacion()==0){break;}

}

    System.out.println("Esperamos haberlo ayudado...Nos vemos pronto!!");
    if(listaDeConversiones.isEmpty()==false){

    }
}



//----------------Interfaz de usuario---------------------
public static void linea(){
        String linea = String.valueOf("*").repeat(50);
        System.out.println(linea);}
public static  void  menu(){
        System.out.println("opcion 1---->Argentina");
        System.out.println("opcion 2---->BOlivia");
        System.out.println("opcion 3---->Brasil");
        System.out.println("opcion 4---->Chile");
        System.out.println("opcion 5---->Colombia");
        System.out.println("opcion 6---->Estados Unidos");
         System.out.println("opcion 7---->Salir");}
public  static int existePais(String entrada_salida){

    Scanner opcion = new Scanner(System.in);
    int opc=0;
    while (opc<=0 || opc>7){
        menu(); linea();
        System.out.print("Seleccione la moneda de "+entrada_salida);
        try {
            opc = opcion.nextInt();
        } catch (Exception e) {
            System.out.println("Recuerda ingresar solo opciones del menu [1-7]");
            opcion.nextLine();
            continue;}}
        if (opc == 7) {return  -1;}
        else {return  opc;}}
public  static float monto(){

    Scanner opcion = new Scanner(System.in);
  float opc=0;

    while (opc<=0){
       linea();
        System.out.print("ingrese el monto:  ");
        try {
            opc = opcion.nextFloat();
        } catch (Exception e) {
            System.out.println("1--> Recuerda que hablamos de cantidad son numeros no caracteres o letras");
            System.out.println("2--> Recuerda que el monto debe ser una cantidad positiva");
            opcion.nextLine();
            continue;}}
   return  opc;}
public  static int operacion(){
    Scanner opcion = new Scanner(System.in);
    int opc=2;
    while (opc!=1 && opc!=0){
        System.out.println("Deseas continuar con la operacion? ");
        System.out.print("""
                *****************
                Presiona 1 para Si
                Presiona 0 para No
                *****************
                Respuesta: """);
        try {
            opc = opcion.nextInt();
        } catch (Exception e) {
            linea();
            System.out.println("presiona solamente 1 o 0");
            linea();
            opcion.nextLine();
            continue;}
    }
return  opc;}