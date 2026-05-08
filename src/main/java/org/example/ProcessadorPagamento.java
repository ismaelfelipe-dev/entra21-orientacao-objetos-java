package org.example;

public class ProcessadorPagamento {
    private CartaoCredito cartaoCredito;

    public ProcessadorPagamento(CartaoCredito cartaoCredito){
        this.cartaoCredito = cartaoCredito;
    }

    public void executarVenda(double valor){
        if(valor <= cartaoCredito.getLimiteDisponivel()){
            double novoLimete = cartaoCredito.getLimiteDisponivel() - valor;
            cartaoCredito.alterarLimite(novoLimete);
        }else {
            System.out.println("Transação Negada");
        }
    }

    public void estornarVenda(double valor){
        double novoLimite = cartaoCredito.getLimiteDisponivel() + valor;
        cartaoCredito.alterarLimite(novoLimite);
    }
}
