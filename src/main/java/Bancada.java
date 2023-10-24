public class Bancada {

    private int id;
    private String nomeCultura;
    private BancadaEstado estado;

    public Bancada(){
        this.estado = BancadaEstadoVazia.getInstance();
    }

    public boolean bancadaEstadoVazia(){
        return estado.bancadaVazia(this);
    }

    public boolean bancadaEstadoPlantiorecente(){
        return estado.bancadaPlantioRecente(this);
    }

    public boolean bancadaEmNaoConformidade(){
        return estado.bancadaEmNaoConformidade(this);
    }

    public boolean bancadaEstadoDescartada(){
        return estado.bancadaEstadoDescartada(this);
    }

    public boolean bancadaEstadoProntoParaColheita(){
        return estado.bancadaProntaParaColheita(this);
    }

    public boolean bancadaColhida(){
        return estado.bancadaColhida(this);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeCultura() {
        return nomeCultura;
    }

    public void setNomeCultura(String nomeCultura) {
        this.nomeCultura = nomeCultura;
    }

    public BancadaEstado getEstado() {
        return estado;
    }

    public void setEstado(BancadaEstado estado) {
        this.estado = estado;
    }
}
