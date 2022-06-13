package Interface_e_Polimorfismo;
/*
Uma corretora de seguros e precisa de um sistema para calcular o valores de apólices para facilitar o processo de venda de seguros.

A corretora trabalha apenas com seguros de carros e imóveis, mas em breve serão adicionados outros tipos de contratos de seguros.
Essa informação é muito importante, pois o software deve ter a capacidade de receber novos tipos de seguros facilmente, como por exemplo,
notebook, barcos, aeronaves, etc.
Cada tipo de apólice possui uma fórmula diferente para calcular seu valor. Uma apólice de imóvel é calculada diferente de uma de um carro.
Usando interfaces e polimorfismo, precisamos desenvolver algo simples e inteligente para resolver o problema do tiozão.
1. Vamos criar uma interface chamada Seguravel.

2. Agora criamos a classe Carro, que implementa a interface Seguravel, pois a corretora está apta a vender seguros para carros.

6. Para testar tudo que foi feito, vamos criar uma classe chamada Principal, que possui o método main().
No método main(), instanciamos uma corretora de seguros, um carro e um imóvel, depois chamamos o método fazerPropostaSeguro() da corretora passando como parâmetro o carro e depois o imóvel.
8. Compile tudo e execute a classe Principal.
9. Quando tudo estiver funcionando, crie uma classe chamada Barco e outra chamada Notebook. As duas classes devem implementar a interface Seguravel. Implemente os métodos da interface e adicione algumas linhas na classe Principal para testar as novas classes.
 */

public class Principal {

    private static double Resultado;

    public static Double main(String[] args) {
        CorretoraSeguros corretoraSeguros = new CorretoraSeguros();
        System.out.print("Desejaria fazer um seguro de um carro, ou imóvel?");
        System.out.println("1 para Carro, e 2 para imóvel");
        Double seguroInformado = corretoraSeguros.fazerPropostaSeguro();
        if (corretoraSeguros.equals (1)) {
            Double ValorDaFipe;
            ValorDaFipe = seguroInformado;
            System.out.print("Por favor senhor(a) cliente, informe o valor da FIPE de seu VEÍCULO:");
            ValorDaFipe = corretoraSeguros.fazerPropostaSeguro();
            return ValorDaFipe;
        }
        else if (corretoraSeguros.equals (2)) {
            Double ValorDoImovel;
            ValorDoImovel = seguroInformado;
            System.out.print("Por favor senhor(a) cliente, informe o valor do seu IMÓVEL:");
            ValorDoImovel = corretoraSeguros.fazerPropostaSeguro();
            Resultado = ValorDoImovel / 20;
            return Resultado;
        }
        corretoraSeguros.fazerPropostaSeguro();
        return seguroInformado;
    }
}
