public abstract class BancadaEstado {

    public abstract String getEstado();

    public boolean bancadaVazia(Bancada bancada){
        return false;
    }

    public boolean bancadaPlantioRecente(Bancada bancada){
        return false;
    }

    public boolean bancadaEmNaoConformidade(Bancada bancada){
        return false;
    }

    public boolean bancadaDescartada(Bancada bancada){
        return false;
    }

    public boolean bancadaProntaParaColheita(Bancada bancada){
        return false;
    }

    public boolean bancadaColhida(Bancada bancada){
        return false;
    }
}
