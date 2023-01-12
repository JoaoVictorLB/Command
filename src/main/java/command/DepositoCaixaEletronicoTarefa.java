package main.java.command;

public class DepositoCaixaEletronicoTarefa implements Tarefa {
    private CaixaEletronico caixa;

    public DepositoCaixaEletronicoTarefa(CaixaEletronico caixa){ this.caixa = caixa; }

    public void executar(){ this.caixa.deposito(); }

    public void cancelar(){ this.caixa.encerrarOperacao(); }
}
