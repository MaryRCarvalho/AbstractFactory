package abstractfactory;

public class FabricaEM implements FabricaAbstrata{

    @Override
    public Diploma createDiploma() {
        return new DiplomaEM();
    }

    @Override
    public Historico createHistorico() {
        return new HistoricoEM();
    }
}
