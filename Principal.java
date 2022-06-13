package Interface_e_Polimorfismo;

import java.util.Scanner;

public class Principal {
    private static double Resultado;

    public static void main(String[] args) {
        CorretoraSeguros corretoraSeguros = new CorretoraSeguros();
        System.out.print("Desejaria fazer um seguro de um carro, ou imóvel?\n");
        System.out.println("1 para Carro, e 2 para imóvel");
        Double seguroInformado = corretoraSeguros.fazerPropostaSeguro();
        if (corretoraSeguros.equals(1)) {
            Double ValorDaFipe;
            ValorDaFipe = seguroInformado;
            System.out.print("Por favor senhor(a) cliente, informe o valor da FIPE de seu VEÍCULO:");
            Scanner scanner = new Scanner(System.in);
            Resultado = ValorDaFipe / 20;
        } else if (corretoraSeguros.equals(2)) {
            Double ValorDoImovel;
            ValorDoImovel = seguroInformado;
            System.out.print("Por favor senhor(a) cliente, informe o valor do seu IMÓVEL:");
            ValorDoImovel = corretoraSeguros.fazerPropostaSeguro();
            Resultado = ValorDoImovel / 20;
        }
        System.out.println("Qual seria a sua IDADE:");
        Double IdadeDoCliente = corretoraSeguros.fazerPropostaSeguro();
        corretoraSeguros.fazerPropostaSeguro();
    }
}
