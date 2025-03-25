package abstractfactory;

public class FabricaBolsaLateralEstampado implements FabricaAbstrata {

    @Override
    public Modelo createModelo() {
        return new ModeloLateral();
    }

    @Override
    public Padrao createPadrao() {
        return new PadraoEstampado();
    }
}
