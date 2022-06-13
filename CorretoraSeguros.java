package Interface_e_Polimorfismo;
/*
5. Agora que já temos as classes que implementam a interface Seguravel, vamos criar uma outra classe chamada CorretoraSeguros.
Ela será responsável por fazer a proposta de seguro do bem segurável e mostrar na tela.
Veja que o método fazerPropostaSeguro() recebe como parâmetro um objeto do tipo Seguravel, ou seja, pode ser um Carro ou um Imovel,
mas no futuro poderia receber também uma Aeronave ou Barco, desde que essas classes implementem a interface Seguravel.
 */
public class CorretoraSeguros implements Seguravel {
    void fazerPropostaSeguro() {

    }
}
