package Program;

import java.util.ArrayList;
import java.util.Scanner;

public class index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		ArrayList<String> lista = new ArrayList();

		int opc = 1;
		
		create c = new create();
		read r = new read();
		update u = new update();
		delete d = new delete();
		Fibonacci f = new Fibonacci();
		

		System.out.println("Olá, Seja Muito Bem-Vindo(a)");
		do {

			System.out.println("Escolha uma Opção: ");
			System.out.println("1 - Listar");
			System.out.println("2 - Adicionar");
			System.out.println("3 - Excluir");
			System.out.println("4 - Alterar");
			System.out.println("5 - trocar itens de lugar");
			System.out.println("5 - Verificar se a lista está vazia");
			System.out.println("6 - Verificar se um item específico está na lista");
			System.out.println("7 - Contar quantos itens existem na lista");
			System.out.println("8 - Esvaziar Lista");
			System.out.println("9 - Fibonacci");
			System.out.println("0 - Sair do Programa");
			opc = sc.nextInt();

			switch (opc) {

			case 0: {

				System.out.println("Saindo do programa, Obrigado por usar...");
				System.out.println(".");
				System.out.println(".");
				System.out.println(".");
				System.exit(0);
			}
				break;

			case 1: {

				r.listar(lista);
			}
				break;

			case 2: {

				c.adicionar(lista);
			}
				break;

			case 3: {

				d.excluir(lista);
			}
				break;

			case 4: {

			}
				break;

			case 5: {

			}
				break;

			case 6: {

			}
				break;

			case 7: {

			}
				break;

			case 8: {

			}
				break;

			case 9: {

				
				
			}
			
			
			} //Fim do switch

		} while (opc != 0);
	}

}
