package br.gov.serpro.banco;

/**
 * Created by 27352403809 on 15/05/19.
 */
public class HardwareMock implements Hardware{

    private String contaLida;

    public HardwareMock(String contaLida){
        this.contaLida=contaLida;
    }

    @Override
    public String pegarNumeroDaContaCartao() {
        return contaLida;
    }

    @Override
    public void entregarDinheiro() {

    }

    @Override
    public void lerEnvelope() {

    }
}
