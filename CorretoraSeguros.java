package Interface_e_Polimorfismo;
/*
5. Agora que já temos as classes que implementam a interface Seguravel, vamos criar uma outra classe chamada CorretoraSeguros.
Ela será responsável por fazer a proposta de seguro do bem segurável e mostrar na tela.
Veja que o método fazerPropostaSeguro() recebe como parâmetro um objeto do tipo Seguravel, ou seja, pode ser um Carro ou um Imovel,
mas no futuro poderia receber também uma Aeronave ou Barco, desde que essas classes implementem a interface Seguravel.
 */
public class CorretoraSeguros implements Seguravel {
    private int IdadeCondutor;
    private Object CorretoraSeguros;

    Double fazerPropostaSeguro(double valorDaFIPE) {
        if (IdadeCondutor == 18 || IdadeCondutor == 19 || IdadeCondutor == 20 ||IdadeCondutor == 21 ||IdadeCondutor == 22 ||IdadeCondutor == 23 ||IdadeCondutor == 24) {
            CorretoraSeguros + 5,26%;
        }
        //   if IdadeCondutor 18 a 24 anos
        //   else IdadeCondutor 25 a 49 anos
        //    else IdadeCondutor 50 a 80 anos
        //    else IdadeCondutor 81 a 120 anos não e possivel realizar o seguro.
        return null;
    }
}
