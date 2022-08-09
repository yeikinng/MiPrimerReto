#language:es

Característica: Cancelar compras Exitoso

  Antecedentes:
    Dado el usuario se encuentre en la pagina web
    Cuando el ingrese el correo y la clave


  Escenario: cancelar compra de productos exitoso
    Dado el usuario se encuentra en el menu toda la tienda
    Cuando el usuario añade los productos al carrito
    Y el cancela la compra de los productos
    Entonces el visualizara carrito de compras vacio