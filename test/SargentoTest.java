import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SargentoTest {
    @Test
    public void deveRetornarDanoSargentoGuerreiro(){
        IClasse classe = new Guerreiro();
        Sargento sargento = new Sargento(20f);
        sargento.setClasse(classe);
        Assertions.assertEquals(120.0f, sargento.calcularDano());
    }
    @Test
    public void deveRetornarDanoSargentoMago(){
        IClasse classe = new Mago();
        Sargento sargento = new Sargento(20f);
        sargento.setClasse(classe);
        Assertions.assertEquals(200.0f, sargento.calcularDano());
    }
}
