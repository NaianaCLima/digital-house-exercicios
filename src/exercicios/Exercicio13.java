package exercicios;

public class Exercicio13 {

	public static void main(String[] args) {
		double salarioBase = 1000.0;
		int numDependentesFuncionario = 2;
		double salarioBruto = salarioBase + (100 * numDependentesFuncionario);
		double salarioLiquido = salarioBruto - (salarioBase * 0.1);
		
		System.out.println("Sal�rio Base R$: " + salarioBase);
		System.out.println("Sal�rio Bruto R$: " + salarioBruto);
		System.out.println("Sal�rio Liquido R$: " + salarioLiquido);

	}

}
