package view;

import java.util.Scanner;

import model.Usuario;

public class LoginView {
	
	


	public void login() {

		Usuario us = new Usuario();

	
		Scanner sc = new Scanner(System.in);

		
		MenuView mv = new MenuView();

		System.out.println("*** LOGIN ***");

		System.out.println("-");
		System.out.println("-");

		System.out.println(" Informe o USUARIO: ");
		us.setLogin(sc.next());

		System.out.println(" Informe a SENHA: ");
		us.setSenha(sc.next());

		System.out.println("-");

		System.out.println("- LOGADO COM SUCESSO!");
		System.out.println("***      ***");
		
		mv.menu();
	}
}
