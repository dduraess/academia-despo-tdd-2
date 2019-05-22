package br.gov.serpro.banco;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import br.gov.serpro.banco.CaixaEletronico.Operacao;

/**
 * Created by 27352403809 on 15/05/19.
 */
public class ServicoRemotoMock implements ServicoRemoto {

	public boolean persistiuConta;
	private List<String> contas = new ArrayList<String>(Arrays.asList("1234-5","0567-8", "4321-0"));

	@Override
	public ContaCorrente recuperarConta(String conta) {
		if (contas.contains(conta)) {
			return new ContaCorrente();
		} throw new RuntimeException("Não é possível criar conta inexistente");
	}

	@Override
	public void persistirConta(ContaCorrente cc, Operacao op, Double valor) {
		if (op == Operacao.SAQUE) {
			verificaSaldoDisponivel(cc, valor);
		} else {
			cc.depositar(valor);
			persistiuConta = true;
		}
	}

	private void verificaSaldoDisponivel(ContaCorrente cc, Double valor) {
		if (cc.getSaldo() >= valor) {
			cc.sacar(valor);
			persistiuConta = true;
		} else {
			throw new RuntimeException();
		}
	}

}
