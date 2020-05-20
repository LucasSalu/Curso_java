import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Principall {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner palavra = new Scanner(System.in);
		Scanner numero = new Scanner(System.in);
		int numeroContribuentes,contribuentes;

		String nome;
		double renda, gastos;
		char tipoConta;
		List<Pessoa> list = new ArrayList<>();

		System.out.println("Digite o número de contribuintes: ");
		numeroContribuentes = numero.nextInt();

		for (int c = 0; c < numeroContribuentes ; c++) {
			System.out.println(String.format("Entre com os dados do Cliente numero #%d ",c+1));
			System.out.println("Pessoa ou empresa (p/e)");
			tipoConta = palavra.next().charAt(0);
			if (tipoConta == 'p') {

				System.out.println("Nome: ");
				nome = palavra.next();

				System.out.println("Renda anual: ");
				renda = numero.nextDouble();

				System.out.println("Gastos com saude: ");
				gastos = numero.nextDouble();

				list.add(new pessoaFisica(nome, renda, gastos));

			} else if (tipoConta == 'e' ) {

				System.out.println("Nome: ");
				nome = palavra.next();

				System.out.println("Renda anual: ");
				renda = numero.nextDouble();

				System.out.println("numero de funcionarios ");
				contribuentes = numero.nextInt();
				list.add(new PessoaJuridica(nome, renda, contribuentes));
			}

		}
        double soma = 0;
		for(Pessoa lista: list ) {
			System.out.println(String.format("%s $ %.2f", lista.nome, lista.imposto()));
			soma += lista.imposto();

		}
		System.out.println(String.format("Total de Taxas %.2f", soma));
	}

}
