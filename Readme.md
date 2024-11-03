<style>
  h2 {
    color: rgb(0, 255, 0); /* Cambia el color a verde */
  }
</style>


# **Bienvenidos**


## Presentacion 🚀

<small>Buenas soy Agustin y como parte del programa [ONE de oracle](https://www.oracle.com/ar/education/oracle-next-education/) quiero compartir con ustedes el desarrollo
de mi primer Aplicacion java como desafio para [Alura Latam](https://www.aluracursos.com/).
Fue todo un desafio pasar de las ideas en mi cabeza de modelado UML al que estaba acostumbrado por mi carrera de estudio a codificar en java. Seguramente es un codigo que se puede mejorar,
limpiar,modularizar y hacerlo mas eficiente,pero como mi primer desafio es un gran paso. A lo largo de las descripciones iré dejando algunas ideas para posibles mejoras</small>
---
## Requisitos ⭐
A continuacion describiré los softwares usados durante el proyecto y librerias que no pueden faltar.  

Los softwares principales usados durante el proyecto son:

>🟢 [Intellij IDEA](https://www.jetbrains.com/idea/download/?section=windows) en su version gratituita como entorno del proyecto.
>
>🟢 [Postman](https://www.postman.com/) para estudiar los resultados de mis peticiones de manera mas comoda y rapida.
>
>🟢 [Git bash](https://git-scm.com/downloads) una herramienta muy poderosa  para llevar versionados del proyecto.  
>
Si te sentis comodo usando otro tipo entornos sos libre de hacerlo!
Hay numerosas alternativas como por ej.
+ eclipse
+ visual estudios
+ NetBeans
+ Insomnia(en vez de usar postman)  
---
 ✅Es fundamental para el manejo de la notacion JSON el uso de la libreria ___[Gson](https://mvnrepository.com/artifact/com.google.code.gson/gson/2.11.0)___
A traves de esta libreria podremos manipular la informacion obtenida del servidor de la pagina web.  
 🧑‍💻️ Deben descargarla e incorporarla al proyecto. Tambien pueden optar por configurar Maven en su sistema para tener acceso a la misma.  

>En el siguiente enlace encontraran toda la documentacion para manipular la informacion  ___🔹[Libreria GSON](https://github.com/google/gson)🔹___ 


 ☑️Una alternativa a Gson es Usar ___🔹Jackson🔹___ otra libreria que permite manipular Json para convertir la informacion en algo util para nuestro proyecto.
Para usarla deberan realizar las implementaciones pertinente de los metodos en los que utilice Gson
---
## Introduccion💻

#### A continuacion voy a describir  brevemente un poco lo que es modelo y los metodos y funcionamiento.

> En primer lugar el funcionamiento basico es un conversor entre 2 tipos de monedas distintas. Se ingresa la moneda de origen,el monto y la moneda de destino.   

💣 _Todo programa debe ser **robusto** asi que nos aseguramos con bloques ___🔒try-catch🔒___ que nuestra aplicacion puede **manejar excepciones** ante un uso inadecuado por parte del **usuario**._   

En cualquier punto de la operacion el usuario puede arrepentirse y simplemente finalizar. 

📑 <small>_podria considerarse para el futuro que el usuario presiono mal y se equivoco durante el ingreso e implementar que el salir simplemente sea el comenzar una nueva operacion y no finalizar el bucle._</small>

Al finalizar las N conversiones que desees realizar se mostrará una lista con todas las conversiones realizadas.*
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