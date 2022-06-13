package Interface_e_Polimorfismo;

import java.util.Scanner;

public class Principal {
    private static double Resultado;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CorretoraSeguros corretoraSeguros = new CorretoraSeguros();
        System.out.print("Desejaria fazer um seguro de um carro, ou imóvel?\n");
        System.out.println("1 para Carro, e 2 para imóvel");
        int carroOuImovel = scanner.nextInt();
        //Double seguroInformado = corretoraSeguros.fazerPropostaSeguro(valorDaFIPE);
        if (carroOuImovel == 1 ) {
            Double ValorDaFipe;
            //ValorDaFipe = seguroInformado;
            System.out.print("Por favor senhor(a) cliente, informe o valor da FIPE de seu VEÍCULO:");
            double valorDaFIPE = scanner.nextDouble();
            ValorDaFipe = corretoraSeguros.fazerPropostaSeguro(valorDaFIPE);
            Resultado = ValorDaFipe / 20;
        } else if (corretoraSeguros.equals(2)) {
            Double ValorDoImovel;
            //ValorDoImovel = seguroInformado;
            System.out.print("Por favor senhor(a) cliente, informe o valor do seu IMÓVEL:");
            ValorDoImovel = corretoraSeguros.fazerPropostaSeguro(valorDaFIPE);
            Resultado = ValorDoImovel / 20;
        }
        System.out.println("Qual seria a sua IDADE:");
        Double IdadeDoCliente = corretoraSeguros.fazerPropostaSeguro(valorDaFIPE);
        corretoraSeguros.fazerPropostaSeguro(valorDaFIPE);
    }
}
