import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PeaoTest {
    @Test
    public void deveRetornarDanoPeaoGuerreiro(){
        IClasse classe = new Guerreiro();
        Peao peao = new Peao(20f);
        peao.setClasse(classe);
        Assertions.assertEquals(60.0f, peao.calcularDano());
    }
    @Test
    public void deveRetornarDanoPeaoMago(){
        IClasse classe = new Mago();
        Peao peao = new Peao(20f);
        peao.setClasse(classe);
        Assertions.assertEquals(100.0f, peao.calcularDano());
    }
}
