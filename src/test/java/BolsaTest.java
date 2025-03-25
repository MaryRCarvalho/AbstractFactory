package abstractfactory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BolsaTest {

    @Test
    void deveExibirBolsaLateral() {
        FabricaAbstrata fabrica = new FabricaBolsaLateralEstampado();
        Bolsa bolsa = new Bolsa(fabrica);
        assertEquals("Bolsa modelo lateral", bolsa.exibirModelo());
    }

    @Test
    void deveExibirBolsaEstampado() {
        FabricaAbstrata fabrica = new FabricaBolsaLateralEstampado();
        Bolsa bolsa = new Bolsa(fabrica);
        assertEquals("Bolsa com tecido estampado", bolsa.exibirPadrao());
    }

    @Test
    void deveExibirBolsaDeMao() {
        FabricaAbstrata fabrica = new FabricaBolsaDeMaoXadrez();
        Bolsa bolsa = new Bolsa(fabrica);
        assertEquals("Bolsa modelo de mão", bolsa.exibirModelo());
    }

    @Test
    void deveExibirBolsaXadrez() {
        FabricaAbstrata fabrica = new FabricaBolsaDeMaoXadrez();
        Bolsa bolsa = new Bolsa(fabrica);
        assertEquals("Bolsa com tecido padrão xadrez", bolsa.exibirPadrao());
    }

    @Test
    void deveExibirBolsaTiraColo() {
        FabricaAbstrata fabrica = new FabricaBolsaTiraColoSolido();
        Bolsa bolsa = new Bolsa(fabrica);
        assertEquals("Bolsa modelo tira-colo", bolsa.exibirModelo());
    }

    @Test
    void deveExibirBolsaSolido() {
        FabricaAbstrata fabrica = new FabricaBolsaTiraColoSolido();
        Bolsa bolsa = new Bolsa(fabrica);
        assertEquals("Bolsa com tecido monocromático", bolsa.exibirPadrao());
    }

}