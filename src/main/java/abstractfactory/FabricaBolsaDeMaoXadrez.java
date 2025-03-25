package abstractfactory;

public class FabricaBolsaDeMaoXadrez implements FabricaAbstrata {

    @Override
    public Modelo createModelo() {
        return new ModeloDeMao();
    }

    @Override
    public Padrao createPadrao() {
        return new PadraoXadrez();
    }
}
