package test.java.command;

import main.java.command.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AgenciaTest {
    Agencia agencia;
    CaixaEletronico caixa;

    @BeforeEach
    void setUp() {
        agencia = new Agencia();
        caixa = new CaixaEletronico ("João Victor Lopes", 2000.0f);
    }

    @Test
    void deveRealizarSaque(){
        Tarefa saque = new SaqueCaixaEletronicoTarefa(caixa);
        agencia.executarTarefa(saque);

        assertEquals("Saque realizado", caixa.getSituacao());
    }

    @Test
    void deveRealizarDeposito(){
        Tarefa deposito = new DepositoCaixaEletronicoTarefa(caixa);
        agencia.executarTarefa(deposito);

        assertEquals("Depósito realizado", caixa.getSituacao());
    }

    @Test
    void deveCancelarUltimaOperacao(){
        Tarefa saque = new SaqueCaixaEletronicoTarefa(caixa);
        Tarefa deposito = new DepositoCaixaEletronicoTarefa(caixa);

        agencia.executarTarefa(saque);
        agencia.executarTarefa(deposito);

        agencia.cancelarUltimaTarefa();

        assertEquals("Operação cancelada", caixa.getSituacao());
    }
}
