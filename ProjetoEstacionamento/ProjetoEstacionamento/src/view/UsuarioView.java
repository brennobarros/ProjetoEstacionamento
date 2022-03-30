package view;

import java.util.Scanner;

import model.Usuario;

public class UsuarioView {

	public void menuUsuario(Usuario user) {

		int opcao;
		
		Scanner entrada = new Scanner(System.in);

		System.out.println("*** Menu Usuario ***");
		System.out.println("-");
		System.out.println("- 1 - Cadastrar ");
		System.out.println("- 2 - Listar ");
		System.out.println("- 3 - Atualizar");
		System.out.println("- 4 - Deletar ");
		System.out.println("- 9 - Volta para o menu ");
		System.out.println("-");
		System.out.println("*********");

		opcao = entrada.nextInt();
		//entrada.close();

		switch (opcao) {
		case 9:
			MenuView mv = new MenuView();
			mv.menu();
			break;
		case 1:
			menuCadastrar();
			break;
		case 2:
			menuListar(user);
			break;
		}
	}

	public void menuCadastrar() {
		
		
		Usuario us = new Usuario();

		Scanner entrada2 = new Scanner(System.in);

		
		System.out.println("*** Menu Usuario ***");
		System.out.println("-");

		System.out.println("- Informe o usuario: ");
		us.setLogin(entrada2.next());

		System.out.println("- Informe a senha: ");
		us.setSenha(entrada2.next());
		
		System.out.println("-");
		System.out.println("- Cadastro realizado!!!");
		
		menuUsuario(us);
		//entrada2.close();
		
		

	}
	
	public void menuListar(Usuario user) {
		System.out.println("*** Lista de Usuario ***");
		System.out.println("-");

		System.out.println("- Usuario: " + user.getLogin());
		System.out.println("- Senha: " + user.getSenha());
		System.out.println("*********");

	}

}
