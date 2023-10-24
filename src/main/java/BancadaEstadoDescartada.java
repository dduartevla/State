public class BancadaEstadoDescartada extends BancadaEstado{

    private BancadaEstadoDescartada() {};

    private static BancadaEstadoDescartada instance = new BancadaEstadoDescartada();

    public static BancadaEstadoDescartada getInstance(){
        return instance;
    }

    @Override
    public String getEstado() {
        return "Descartada";
    }
}
