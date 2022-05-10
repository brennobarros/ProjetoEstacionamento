package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Arquivo {

	public void EscreverArquivo() {
		try {
			Scanner entrada = new Scanner(System.in);
			FileWriter myWriter = new FileWriter("C:\\Users\\Brenno\\Desktop\\bancoteste.txt");
			System.out.println();
			myWriter.write(entrada.next());
			myWriter.close();
			System.out.println("Gravado com sucesso.");
		} catch (IOException e) {
			System.out.println("Erro ao escrever arquivo.");
			e.printStackTrace();
		}
	}

	public void LerArquivo() {
		try {
			File myObj = new File("C:\\Users\\Brenno\\Desktop\\bancoteste.txt");
			Scanner myReader = new Scanner(myObj);
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				System.out.println(data);
			}
			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("Erro ao ler arquivo.");
			e.printStackTrace();
		}
	}

	public void DeletarArquivo() {
		File myObj = new File("C:\\Users\\Brenno\\Desktop\\bancoteste.txt");
		if (myObj.delete()) {
			System.out.println("Arquivo deletado: " + myObj.getName());
		} else {
			System.out.println("Erro ao apagar arquivo.");
		}
	}

}
