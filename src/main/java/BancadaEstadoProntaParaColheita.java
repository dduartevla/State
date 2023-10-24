public class BancadaEstadoProntaParaColheita extends BancadaEstado{

    private BancadaEstadoProntaParaColheita() {};

    private static BancadaEstadoProntaParaColheita instance = new BancadaEstadoProntaParaColheita();

    public static BancadaEstadoProntaParaColheita getInstance(){
        return instance;
    }

    @Override
    public String getEstado() {
        return "Pronto para Colheita";
    }

    public boolean bancadaColhida(Bancada bancada){
        bancada.setEstado(BancadaEstadoColhida.getInstance());
        return true;
    }

    public boolean bancadaEmNaoConformidade(Bancada bancada){
        bancada.setEstado(BancadaEstadoNaoConformidade.getInstance());
        return true;
    }
}
