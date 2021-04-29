package ar.edu.unahur.obj2.bicicletas

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe

class PedidoBicicletaTest : DescribeSpec({
  describe("Un pedido de bicicleta") {
    PedidoBicicleta.colorMasBarato = "verde"

    it("puede tener un color") {
      val biciPersonalizada = PedidoBicicleta("rojo")
      biciPersonalizada.color.shouldBe("rojo")
    }

    it("permite cambiar el color por defecto") {
      val biciConColorAnterior = PedidoBicicleta()
      PedidoBicicleta.colorMasBarato = "negro"
      val biciConColorNuevo = PedidoBicicleta()

      biciConColorAnterior.color.shouldBe("verde")
      biciConColorNuevo.color.shouldBe("negro")
    }

    it("utiliza el color verde si no se elige ninguno") {
      val biciComun = PedidoBicicleta()
      biciComun.color.shouldBe("verde")
    }
  }
})
