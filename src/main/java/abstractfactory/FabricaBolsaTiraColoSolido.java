package abstractfactory;

public class FabricaBolsaTiraColoSolido implements FabricaAbstrata{

    @Override
    public Modelo createModelo() {return new ModeloTiraColo();}

    @Override
    public Padrao createPadrao() {return new PadraoSolido();}
}
