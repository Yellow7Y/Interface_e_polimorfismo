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

    Double fazerPropostaSeguro() {
        if (IdadeCondutor == 18 || IdadeCondutor == 19 || IdadeCondutor == 20 ||IdadeCondutor == 21 ||IdadeCondutor == 22 ||IdadeCondutor == 23 ||IdadeCondutor == 24) {
            CorretoraSeguros + 5,26%;
        }
        else (IdadeCondutor == 25 || IdadeCondutor == 26 || IdadeCondutor == 27 || IdadeCondutor == 28 || IdadeCondutor == 29 || IdadeCondutor == 30 || IdadeCondutor == 31 ||  IdadeCondutor == 32 ||  IdadeCondutor == 33
                || IdadeCondutor == 34 || IdadeCondutor == 35 || IdadeCondutor == 36 || IdadeCondutor == 37 || IdadeCondutor == 38 || IdadeCondutor == 39 || IdadeCondutor == 40 || IdadeCondutor == 41 || IdadeCondutor == 42
                || IdadeCondutor == 43 || IdadeCondutor == 43 || IdadeCondutor == 43 || IdadeCondutor == 44 || IdadeCondutor == 45 || IdadeCondutor == 46 || IdadeCondutor == 47 || IdadeCondutor == 48 || IdadeCondutor == 49
) {
            CorretoraSeguros + 5,15%;
        }
        //   else IdadeCondutor 25 a 49 anos
        //    else IdadeCondutor 50 a 80 anos
        //    else IdadeCondutor 81 a 120 anos não e possivel realizar o seguro.
        return null;
    }
}
// int = numero inteiro double números quebrados.
