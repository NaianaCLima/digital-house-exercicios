package exercicios;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("*=*=*=*=* Informa��es sobre o produto =*=*=*=*");
		System.out.println("\nC�digo do produto: ");
		String codigo = sc.nextLine();
		System.out.println("Descri��o do produto: ");
		String descricao = sc.nextLine();
		System.out.println("Quantidade do produto: ");
		int qntd = sc.nextInt();
		System.out.println("Pre�o de compra produto: ");
		double precoDeCompra = sc.nextDouble();
		System.out.println("Percentual de lucro do produto: ");
		float percentual = sc.nextFloat();

		percentual /= 100;

		double valorVenda = (precoDeCompra * percentual) + precoDeCompra;

		double precoTotal = valorVenda * qntd;

		System.out.printf("Pre�o de compra do produto R$: %.2f", precoDeCompra);
		System.out.println("\nPercentual de lucro do produto: " + percentual);
		System.out.printf("Pre�o da venda do produto R$: %.2f", valorVenda);
		System.out.printf("\nQuantidade do produto: %d", qntd);
		System.out.printf("\nPre�o total do produto R$: %.2f", precoTotal);

		sc.close();
	}

}
