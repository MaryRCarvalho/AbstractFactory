package abstractfactory;

public class Bolsa {

    private Modelo modelo;
    private Padrao padrao;

    public Bolsa(FabricaAbstrata fabrica) {
        this.modelo = fabrica.createModelo();
        this.padrao = fabrica.createPadrao();
    }

    public String exibirModelo() {
        return this.modelo.emitir();
    }

    public String exibirPadrao() {
        return this.padrao.emitir();
    }
}
