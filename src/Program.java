import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//Armazenamento de dados
		double ingresso, couvert;

		System.out.print("SEXO: ");
		char sexo = sc.next().charAt(0);

		System.out.print("Quantidade de cerveja: ");
		int cerveja = sc.nextInt();

		System.out.print("Quantidade de refrigerantes: ");
		int refri = sc.nextInt();

		System.out.print("Quantidade de espetinhos: ");
		int espetinhos = sc.nextInt();
		
		//cálculo dos dados
		double consumo = cerveja * 5 + refri * 3 + espetinhos * 7;
		System.out.println();	
		
		//impressão do relatório
		System.out.println("RELATÓRIO:");
		System.out.printf("Consumo = %.2f\n", consumo);
		if (consumo > 30) {
			couvert = 0.0;
			System.out.println("Isento de Couvert");
		} else {
			couvert = 4.00;
			System.out.printf("Couvert = %.2f\n", couvert);
		}
		if (sexo == 'M') {
			ingresso = 10.00;
		} else {
			ingresso = 8.00;
		}
		System.out.printf("Ingresso = R$ %.2f\n\n", ingresso);

		System.out.printf("Valor a pagar = R$ %.2f\n", (consumo + couvert + ingresso));

	}

}


