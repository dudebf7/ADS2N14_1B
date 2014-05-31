import java.util.Scanner;

/**
 *
 * @author Leone
 */
public class Main {

    /**
     * @param args the command line arguments
     */
	public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);
		Pilha p = new Pilha();
		String aux = "";
                String op;
		do {
			String menu = "1 - Empilhar \n" + "2 - Desempilhar  \n"
					+ "3 - listar Pilha \n" + "4 - verificar palindrome \n";
			System.out.print(menu);
			op = scan.nextLine();
			switch (op) {
			case "1":
                                System.out.print("Digite a palavra:\n");
				p.empilhar(scan.nextLine());
                                System.out.print("Palavra adicionada com sucesso!\n\n");
				break;
			case "2":
				System.out.print(p.desempilhar() + "\n\n");
				break;
			case "3":
				System.out.print(p.mostrarPilha() + "\n\n");
				break;
			case "4":
				System.out.print("Digite a palavra:\n");
                                if(p.isPalindromo(scan.nextLine()))
                                    System.out.print("A palavra digitada é palindromo\n\n");
                                else 
                                    System.out.print("A palavra digitada nao palindromo\n\n");
				break;
			case "5":
				System.out.print("Fim do Programa");
				System.exit(0);
				break;

			}
		} while (op != "5");
	}
}