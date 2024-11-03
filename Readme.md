# **Bienvenidos**

## Presentacion 🚀
*Buenas soy Agustin y como parte del programa [ONE de oracle](https://www.oracle.com/ar/education/oracle-next-education/) quiero compartir con ustedes el desarrollo de mi primer Aplicacion java como desafio para [Alura Latam](https://www.aluracursos.com/).Fue todo un desafio pasar de las ideas en mi cabeza de modelado UML al que estaba acostumbrado por mi carrera de estudio a codificar en java. Seguramente es un codigo que se puede mejorar,limpiar,modularizar y hacerlo mas eficiente,pero como mi primer desafio es un gran paso. A lo largo de las descripciones iré dejando algunas ideas para posibles mejoras

## Requisitos ⭐
A continuacion describiré los softwares usados durante el proyecto y librerias que no pueden faltar.
Los softwares principales usados durante el proyecto son:  

🟢[Intellij IDEA](https://www.jetbrains.com/idea/download/?section=windows) en su version gratituita como entorno del proyecto.  

🟢 [Postman](https://www.postman.com/) para estudiar los resultados de mis peticiones de manera mas comoda y rapida.  

🟢[Git bash](https://git-scm.com/downloads) una herramienta muy poderosa  para llevar versionados de mi proyecto.  

#### Si te sentis comodo usando otro tipo entornos sos libre de hacerlo
Es fundamental para el manejo de la notacion JSON el uso de la libreria [Gson](https://mvnrepository.com/artifact/com.google.code.gson/gson/2.11.0) la cual puede descargar e importar al proyecto desde Maven repository. tambien pueden optar por importarla usando Maven pero deberan hacerlo por su cuenta

##Introduccion
### *A continuacion voy a describir  brevemente un poco lo que es modelo y los metodos y funcionamiento*

#### En primer lugar el funcionamiento basico es un conversor entre 2 tipos de monedas distintas. Se ingresa la moneda de origen,el monto y la moneda de destino. Todo programa debe ser robusto asi que nos aseguramos con bloques **try-catch** que nuestra aplicacion no se rompa si el usuario ingresa letras en un entero. En cualquier punto del camino el usuario puede arrepentirse de la operacion y simplemente salir. Al finalizar las N conversiones que desees realizar se mostrará una lista con todas las conversiones realizadas.

 1. Clase **Moneda**-> Los atributos de moneda son privados y solo pueden ser modificados a traves de los metodos.
Los atributos de moneda son:
  + Entrada de tipo String
  + Salida de tipo String
  + Cantidad de tipo flotante
#### construimos los getter y setter de dichas clase.

[Exchange Rate API] (https://www.exchangerate-api.com/docs/java-currency-api)


**Metodos clase Moneda**
+ private String getSolicitud();
 + private static   Tasas transform(String respuesta);
+  public void calculoTransformado();

  El metodo get solicitud se encarga de interactuar con el servidor de la pagina web
