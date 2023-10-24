public class BancadaEstadoColhida extends BancadaEstado{

    private BancadaEstadoColhida() {};

    private static BancadaEstadoColhida instance = new BancadaEstadoColhida();

    public static BancadaEstadoColhida getInstance(){
        return instance;
    }

    @Override
    public String getEstado() {
        return "Colhida";
    }
}
