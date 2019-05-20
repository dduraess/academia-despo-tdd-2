package br.gov.serpro.banco;

/**
 * Created by 27352403809 on 15/05/19.
 */
public class HardwareMock implements Hardware {
	
	public boolean validadoNoHardware=false;
	private String contaLida;

	public HardwareMock(String leitura) {
		this.contaLida=leitura;
	}

	/* (non-Javadoc)
	 * @see br.gov.serpro.Hardware#pegarNumeroDaContaCartao()
	 */
	@Override
	public String pegarNumeroDaContaCartao() {
		validadoNoHardware = true;
		if (contaLida.equals("Erro!")) {
			throw new RuntimeException();
		} return contaLida;
	}

	@Override
	public void entregarDinheiro() {
		validadoNoHardware = true;
	}

	@Override
	public void lerEnvelope() {
		validadoNoHardware = true;
		
	}

}
