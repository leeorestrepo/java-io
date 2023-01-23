package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class TesteEscrita {
	public static void main(String[] args) throws IOException {
		
		// Fluxo de entrada com arquivo
		OutputStream fos = new FileOutputStream("Lorem.txt");
		OutputStreamWriter osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		
		bw.write("Lorem Ipsum is simply dummy text of the printing and typesetting industry.");
		bw.newLine();
		bw.newLine();
		bw.newLine();
		bw.write("Lorem Ipsum is not simply dummy text of the printing and test front-end");
		bw.close();
	}
}
