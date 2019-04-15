Exercício Extra TDD: Abastecer com etanol ou gasolina?

Hoje, com tantos veículos "flex" é comum surgir a pergunta: devo abastecer com etanol ou gasolina?

Se simplificarmos este cenário para uma decisão meramente econômica a resposta costuma ser: se o etanol estiver com preço pelo menos 70% menor que o da gasolina, abasteça com etanol. Caso contrário, opte pela gasolina.

Nos baseando nesta regra, vamos implementar um software que automaticamente nos indique qual combustível abastacer.

Para saber o preço atual da gasolina e do etanol, vamos acionar (ou melhor, simular o acionamento) de um web-service que nos dará esta informação. Para isso, implemente um método de cacordo com o seguinte algoritmo:

```
public double obterPrecoCombustivel(String siglaCombustivel) {
    // Vamos simular que existe uma chance de 1% da chamada lançar uma exception. 
    // Afinal, é uma integração via web-service e por isso pode ocorrer erros imprevistos!

    bool ocorreuErro = (numeroRandomico(1, 100) == 1)

    if (ocorreuErro) {

       lançar exception IntegracaoConsultaCombustivelIndisponivelException;

    }


    // Aqui vamos imaginar que estamos fazendo uma chamada a um web-service, mas na verdade 
    // vamos apenas retornar um valor aleatório qualquer.

    retornar valor aleatório entre 1.00 e 10.00 reais.

} 


```



Utilize o método acima para implementar a seguinte lógica de negócio da sua aplicação:

```
   
    - Acione a integração para obter os preços do etanol e da gasolina.
    - Caso preço do etanol seja 70% ou menos do valor do preço da gasolina, retorne para usuário que ele deveria comprar etanol.

        - Caso contrário, retorne que deveria comprar gasolina.

   - Em caso de falhar na integração, capture a exception lançada pelo método que faz a integração e lance uma nova exception ConsultaCombustivelIndisponivelException;

```
 
 

marcio.david 15:38   

O que pode usar para resolver o problema: Java 8 ou 11, Maven ou Gradle (ou nenhum dos 2, se preferir), jUnit 4 ou 5.
O que *NÃO* pode usar: frameworks de mocks.
Não esqueça de realizar commits a cada etapa! (Teste, Implementação, Refatoração)