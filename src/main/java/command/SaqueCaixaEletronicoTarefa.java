package main.java.command;

public class SaqueCaixaEletronicoTarefa implements Tarefa {
    private CaixaEletronico caixa;

    public SaqueCaixaEletronicoTarefa(CaixaEletronico caixa){ this.caixa = caixa; }

    public void executar(){ this.caixa.saque(); }

    public void cancelar(){ this.caixa.encerrarOperacao(); }
}
