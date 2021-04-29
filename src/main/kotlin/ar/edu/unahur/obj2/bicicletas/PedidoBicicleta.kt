package ar.edu.unahur.obj2.bicicletas

/*
Una fabricante de bicicletas nos pide armar un modelo para sus pedidos.

Por ahora, solo le interesa poder registrar el *color* de cada pedido.

Si el cliente elige alguno, se utilizará ese y si no elige ninguno se utilizará el color
más barato, que hoy en día es el verde. Hay que contemplar la posibilidad de que ese color
pueda cambiar, y si eso ocurre debería afectar a todos los nuevos pedidos.
 */

class PedidoBicicleta(var color: String = colorMasBarato) {
  companion object {
    var colorMasBarato = "verde"
  }
}
