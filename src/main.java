
public void main(String[] args) {
    Scanner opcion = new Scanner(System.in);
    int opc=0;

    while (true) {linea();

System.out.println("Bienvenidos pueden obtener tasas de conversion actualizadas");
linea(); menu(); linea(); //pueden observar el menu de opciones
System.out.print("Ingresen la opcion correspondiente a la moneda de origen");

try {
      opc = opcion.nextInt();
      if (opc == 7) {
      System.out.println("Esperamos haberlo ayudado...Nos vemos pronto!!");
      break;}
      else if (opc > 7) {
      System.out.println("Recuerda ingresar solo opciones del menu [1-7]");
      continue;}

} catch (Exception e) {
      System.out.println("Recuerda ingresar solo opciones del menu [1-7]");
      opcion.nextLine();}
moneda cambio=new moneda();
cambio.getSolicitud(opc);

}}


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
        System.out.println("opcion 6---->Estados Unidos");}

