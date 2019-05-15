package br.gov.serpro.banco;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by 27352403809 on 15/05/19.
 */
public class ServicoRemotoMock implements ServicoRemoto {

    private List<ContaCorrente> contas = new ArrayList(Arrays.asList(new ContaCorrente("1234-5"), new ContaCorrente("1111-2"), new ContaCorrente("5678-9")));

    @Override
    public ContaCorrente recuperarConta(String nrConta) {
        for (ContaCorrente conta: contas){
            if (conta.getNrConta().equals(nrConta)) {
                return new ContaCorrente(nrConta);
            } else {
                return null;
            }
        } return null;

    }

    @Override
    public void persistirConta(ContaCorrente cc, BigDecimal valor) {
        cc.sacar(valor);

    }
}
