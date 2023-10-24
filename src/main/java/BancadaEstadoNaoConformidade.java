public class BancadaEstadoNaoConformidade extends BancadaEstado{

    private BancadaEstadoNaoConformidade() {};

    private static BancadaEstadoNaoConformidade instance = new BancadaEstadoNaoConformidade();

    public static BancadaEstadoNaoConformidade getInstance(){
        return instance;
    }

    @Override
    public String getEstado() {
        return "Em Não Conformidade";
    }

    public boolean bancadaEstadoDescartada(Bancada bancada){
        bancada.setEstado(BancadaEstadoDescartada.getInstance());
        return true;
    }

    public boolean bancadaProntaParaColheita(Bancada bancada){
        bancada.setEstado(BancadaEstadoProntaParaColheita.getInstance());
        return true;
    }
}
