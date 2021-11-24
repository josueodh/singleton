import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmpresaTest {
    @Test
    void deveRetornarNomeEmpresa(){
        Empresa.getInstance().setNomeEmpresa("Lorem");
        assertEquals("Lorem", Empresa.getInstance().getNomeEmpresa());
    }

    @Test
    void deveRetornarNomeDiretor(){
        Empresa.getInstance().setNomeDiretor("Lorem Ipsum");
        assertEquals("Lorem Ipsum", Empresa.getInstance().getNomeDiretor());
    }
}