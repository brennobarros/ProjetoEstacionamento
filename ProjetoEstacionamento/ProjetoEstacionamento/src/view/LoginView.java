package view;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import model.Usuario;

public class LoginView {
	



	public void login() throws IOException {

		Scanner sc = new Scanner(System.in);

		FileWriter arq = new FileWriter("C:\\Users\\Brenno\\Desktop\\BD.txt");
		PrintWriter gravarArq = new PrintWriter(arq);
		
		gravarArq.printf("*** LOGIN ***");
		//System.out.println("*** LOGIN ***");

		System.out.println("-");
		System.out.println("-");

		System.out.println(" Informe o USUARIO: ");
		String username = sc.next();

		System.out.println(" Informe a SENHA: ");
		String password = sc.next();

		System.out.println("-");

		System.out.println("- LOGADO COM SUCESSO!");
		System.out.println("***      ***");
		
		MenuView mv = new MenuView();
		mv.menu();
	}
}
