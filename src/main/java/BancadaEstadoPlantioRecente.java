public class BancadaEstadoPlantioRecente extends BancadaEstado{

    private BancadaEstadoPlantioRecente() {};

    private static BancadaEstadoPlantioRecente instance = new BancadaEstadoPlantioRecente();

    public static BancadaEstadoPlantioRecente getInstance(){
        return instance;
    }

    @Override
    public String getEstado() {
        return "Plantio Recente";
    }

    public boolean bancadaNaoConformidade(Bancada bancada){
        bancada.setEstado(BancadaEstadoNaoConformidade.getInstance());
        return true;
    }

    public boolean bancadaProntaParaColheita(Bancada bancada){
        bancada.setEstado(BancadaEstadoProntaParaColheita.getInstance());
        return true;
    }
}
