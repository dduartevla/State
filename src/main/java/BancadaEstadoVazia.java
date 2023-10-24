public class BancadaEstadoVazia extends BancadaEstado{

    private BancadaEstadoVazia() {};

    private static BancadaEstadoVazia instance = new BancadaEstadoVazia();

    public static BancadaEstadoVazia getInstance(){
        return instance;
    }

    @Override
    public String getEstado() {
        return "Vazia";
    }

    public boolean bancadaPlantioRecente(Bancada bancada){
        bancada.setEstado(BancadaEstadoPlantioRecente.getInstance());
        return true;
    }
}
