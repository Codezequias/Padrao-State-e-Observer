package padroescomportamentais.stateobserver;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTest {

    Funcionario funcionario;
    Empresa empresa;

    @BeforeEach
    void setUp() {
        funcionario = new Funcionario("Lucas");
        empresa = new Empresa("Tech Solutions", "Tecnologia", "Vassouras", "RJ");
    }

    @Test
    void deveIniciarFuncionarioAtivo() {
        assertEquals("Ativo", funcionario.getNomeEstado());
    }

    @Test
    void deveAfastarFuncionarioAtivo() {
        assertTrue(funcionario.afastar());
        assertEquals("Afastado", funcionario.getNomeEstado());
    }

    @Test
    void deveAposentarFuncionarioAtivo() {
        assertTrue(funcionario.aposentar());
        assertEquals("Aposentado", funcionario.getNomeEstado());
    }

    @Test
    void deveDemitirFuncionarioAtivo() {
        assertTrue(funcionario.demitir());
        assertEquals("Demitido", funcionario.getNomeEstado());
    }

    @Test
    void deveTransferirFuncionarioAtivo() {
        assertTrue(funcionario.transferir());
        assertEquals("Transferido", funcionario.getNomeEstado());
    }

    @Test
    void deveNotificarFuncionarioVinculado() {
        funcionario.vincular(empresa);
        empresa.lancarComunicado();
        assertEquals("Lucas, comunicado lançado na Empresa{nome='Tech Solutions', setor='Tecnologia', cidade='Vassouras', estado='RJ'}",
                funcionario.getUltimaNotificacao());
    }

    @Test
    void naoDeveNotificarFuncionarioNaoVinculado() {
        empresa.lancarComunicado();
        assertNull(funcionario.getUltimaNotificacao());
    }

    @Test
    void deveManterObserverAposMudancaDeEstado() {
        funcionario.vincular(empresa);
        funcionario.afastar();
        empresa.lancarComunicado();
        assertEquals("Afastado", funcionario.getNomeEstado());
        assertNotNull(funcionario.getUltimaNotificacao());
    }

    @Test
    void deveNotificarDoisFuncionarios() {
        Funcionario funcionario2 = new Funcionario("Maria");
        funcionario.vincular(empresa);
        funcionario2.vincular(empresa);
        empresa.lancarComunicado();
        assertNotNull(funcionario.getUltimaNotificacao());
        assertNotNull(funcionario2.getUltimaNotificacao());
    }
}
