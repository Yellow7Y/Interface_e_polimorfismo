package Interface_e_Polimorfismo;

/*
3. Se Carro diz que implementa a interface Seguravel, ela deve implementar todos os métodos especificados na interface, pois uma interface é um contrato,
ou seja, a classe deve garantir que faz o que ela pede.
No código, incluímos os métodos obterDescricao() e calcularValorApolice(), além de dois atributos e um construtor.
Os atributos são usados pelos métodos para calcular o valor da apólice e retornar a descrição do carro.
 */
public class Carro implements Seguravel {

    private int Resultado;
    private Object CorretoraSeguros;

    void obterDescricao() {
        int ValorDaFipe;
        int IdadeDoCondutor;
    }

    double calcularValorApolice() {
        double fazerPropostaSeguro = Resultado * 12 % + 19.36;
        return (double) CorretoraSeguros;
    }

}
