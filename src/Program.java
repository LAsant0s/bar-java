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

	}

}
