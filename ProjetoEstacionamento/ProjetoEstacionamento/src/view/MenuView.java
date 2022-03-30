package view;

import java.util.Scanner;

public class MenuView {

	public void menu() {
		
		int opcao;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("*** Menu Principal***");

		System.out.println("-");

		System.out.println("- 1 - Cadastrar usuário ");
		System.out.println("- 2 - Cadastrar tipo de veiculo ");
		System.out.println("- 3 - Cadastrar veiculo");
		System.out.println("- 4 - Cadastrar pessoa ");
		System.out.println("- 5 - Cadastrar tipo de estacionamento ");
		System.out.println("- 9 - Sair ");
		System.out.println("-");
		System.out.println("*********");
		opcao = entrada.nextInt();

		switch (opcao) {
		case 9:
			System.exit(0);
			System.out.println("Programa finalizado");
			break;
		case 1:
			UsuarioView uv = new UsuarioView();
			uv.menuUsuario(null);
			break;
		}

	}

}
