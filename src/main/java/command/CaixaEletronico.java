package main.java.command;

public class CaixaEletronico {
    private String gerenteResponsavel;
    private float limiteSaque;
    private String situacao;

    public CaixaEletronico(String gerenteResponsavel, float limiteSaque){
        this.gerenteResponsavel = gerenteResponsavel;
        this.limiteSaque = limiteSaque;
    }

    public String getSituacao(){ return situacao; }

    public void saque(){ this.situacao = "Saque realizado"; }

    public void encerrarOperacao(){ this.situacao = "Operação cancelada"; }

    public void deposito(){ this.situacao = "Depósito realizado"; }
}
