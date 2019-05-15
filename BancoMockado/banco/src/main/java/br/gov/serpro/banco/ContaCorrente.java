package br.gov.serpro.banco;

import java.math.BigDecimal;

public class ContaCorrente {

    private String nrConta;
    private BigDecimal saldo;
    private static final BigDecimal LIMITE=BigDecimal.valueOf(500);

    public ContaCorrente(String nrConta){
        this.nrConta=nrConta;
        this.saldo=BigDecimal.valueOf(0);
    }

    public BigDecimal getSaldo() {
        return saldo.add(LIMITE);
    }

    public String getNrConta() {
        return this.nrConta;
    }

    public void sacar(BigDecimal valor){
        this.saldo.subtract(valor);
    }

}
