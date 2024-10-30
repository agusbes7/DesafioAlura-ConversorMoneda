En tasaDeConversion
cargué la nomenclatura pedida por el desafio como conversiones
con la idea de clave-valor con clave de tipo entero para seguir el ingreso por teclado 
realizado en la consola por el usuario

opcionesMenu.put(1, "ARS");
opcionesMenu.put(2, "BOB");
opcionesMenu.put(3, "BRL");
opcionesMenu.put(4, "CLP");
opcionesMenu.put(5, "COP");
opcionesMenu.put(6, "USD");}
Es flexible para agregar otros paises mas o eliminar sin afectar el funcionamiento
Para incorporar mas Api-key de otros paises se pueden implementar ideas similares
ya que es probable que no trabajen con la misma nomenclatura

https://www.exchangerate-api.com/docs/pair-conversion-requests
Con la Api key solo podemos realizar solicitudes de un pais no permite conversiones entre paises y su valor
devuelve todo la base de tasas


es flexible para agregar más numeracion de una forma rapida y que no afecta al resto del codigo

La gestionConversion es una interfaz que obliga a moneda a implementar  el pedido de la request
y el transformar la informacion en algo util 