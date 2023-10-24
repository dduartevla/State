import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BancadaTest {

    Bancada bancada;

    @BeforeEach
    public void setUp(){
        bancada = new Bancada();
    }

    //Bancada vazia

    @Test
    void naoDeveEsvaziarBancadaVazia(){
        bancada.setEstado(BancadaEstadoVazia.getInstance());
        assertFalse(bancada.bancadaEstadoVazia());
    }

    @Test
    void naoDeveColherBancadaVazia(){
        bancada.setEstado(BancadaEstadoVazia.getInstance());
        assertFalse(bancada.bancadaColhida());
    }

    @Test
    void bancadaVaziaNaoFicaProntaParaColheita(){
        bancada.setEstado(BancadaEstadoVazia.getInstance());
        assertFalse(bancada.bancadaEstadoProntoParaColheita());
    }

    @Test
    void bancadaVaziaNaoEntraEmNaoConformidade(){
        bancada.setEstado(BancadaEstadoVazia.getInstance());
        assertFalse(bancada.bancadaEmNaoConformidade());
    }

    @Test
    void devePlantarNaBancadaVazia(){
        bancada.setEstado(BancadaEstadoPlantioRecente.getInstance());
        assertEquals(BancadaEstadoPlantioRecente.getInstance(),bancada.getEstado());
    }

    //Bancada de Plantio Recente

    @Test
    void deveBancadaEntrarEmNaoConformidade(){
        bancada.setEstado(BancadaEstadoPlantioRecente.getInstance());
        assertTrue(bancada.bancadaEmNaoConformidade());
        assertEquals(BancadaEstadoNaoConformidade.getInstance(),bancada.getEstado());
    }

    @Test
    void plantioRecenteFicaProntaParaColheita(){
        bancada.setEstado(BancadaEstadoPlantioRecente.getInstance());
        assertTrue(bancada.bancadaEstadoProntoParaColheita());
        assertEquals(BancadaEstadoProntaParaColheita.getInstance(),bancada.getEstado());
    }

    @Test
    void naoDeveColherPlantiorecente(){
        bancada.setEstado(BancadaEstadoPlantioRecente.getInstance());
        assertFalse(bancada.bancadaColhida());
    }
    @Test
    void naoDescartarPlantioRecenteEmConformidade(){
        bancada.setEstado(BancadaEstadoPlantioRecente.getInstance());
        assertFalse(bancada.bancadaEstadoDescartada());
    }

    @Test
    void naoDeveEsvaziarPlantioRecente(){
        bancada.setEstado(BancadaEstadoPlantioRecente.getInstance());
        assertFalse(bancada.bancadaEstadoVazia());
    }

    //Bancada Em Não Coformidade

    @Test
    void deveDescartarBancadaEmNaoConformidade(){
        bancada.setEstado(BancadaEstadoNaoConformidade.getInstance());
        assertTrue(bancada.bancadaEstadoDescartada());
        assertEquals(BancadaEstadoDescartada.getInstance(),bancada.getEstado());
    }

    @Test
    void deveTornarBancadaProntaParaColheita(){
        bancada.setEstado(BancadaEstadoNaoConformidade.getInstance());
        assertTrue(bancada.bancadaEstadoProntoParaColheita());
        assertEquals(BancadaEstadoProntaParaColheita.getInstance(), bancada.getEstado());
    }

    @Test
    void naoDeveColherBancadaEmNaoConformidade(){
        bancada.setEstado(BancadaEstadoNaoConformidade.getInstance());
        assertFalse(bancada.bancadaColhida());
    }

    @Test
    void naoDeveVoltarParaPlantioRecente(){
        bancada.setEstado(BancadaEstadoNaoConformidade.getInstance());
        assertFalse(bancada.bancadaEstadoPlantiorecente());
    }

    //Bancada pronta para Colheita

    @Test
    void deveColherBancadaProntaParaColheita(){
        bancada.setEstado(BancadaEstadoProntaParaColheita.getInstance());
        assertTrue(bancada.bancadaColhida());
        assertEquals(BancadaEstadoColhida.getInstance(), bancada.getEstado());
    }

    @Test
    void bancadaProntaParaColheitaEntraEmNaoConformidade(){
        bancada.setEstado(BancadaEstadoProntaParaColheita.getInstance());
        assertTrue(bancada.bancadaEmNaoConformidade());
        assertEquals(BancadaEstadoNaoConformidade.getInstance(), bancada.getEstado());
    }

    @Test
    void naoDeveVoltarParaPlantioRecentePronta(){
        bancada.setEstado(BancadaEstadoProntaParaColheita.getInstance());
        assertFalse(bancada.bancadaEstadoPlantiorecente());
    }

    //Bancada Descartada

    @Test
    void bancadaDescartadaFicaVazia(){
        bancada.setEstado(BancadaEstadoDescartada.getInstance());
        assertTrue(bancada.bancadaEstadoVazia());
        assertEquals(BancadaEstadoVazia.getInstance(), bancada.getEstado());
    }

    @Test
    void bancadaDescartadaNaoFicaProntaParaColheita(){
        bancada.setEstado(BancadaEstadoDescartada.getInstance());
        assertFalse(bancada.bancadaEstadoProntoParaColheita());
    }


    //Bancada Colhida
    @Test
    void bancadaColhidaFicaVazia(){
        bancada.setEstado(BancadaEstadoColhida.getInstance());
        assertTrue(bancada.bancadaEstadoVazia());
        assertEquals(BancadaEstadoVazia.getInstance(), bancada.getEstado());
    }
}