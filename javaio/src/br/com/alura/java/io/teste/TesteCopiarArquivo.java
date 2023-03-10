package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class TesteCopiarArquivo {
	public static void main(String[] args) throws IOException {
		
		// Fluxo de entrada com arquivo
		
		Socket s = new Socket();
		
//		FileInputStream fis = new FileInputStream("Lorem.txt");
//		InputStream fis = System.in;
		InputStream fis = s.getInputStream();
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		
//		OutputStream fos = new FileOutputStream("LoremCopia.txt");
//		OutputStream fos = System.out;
		OutputStream fos = s.getOutputStream();
		OutputStreamWriter osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		
		String linha = br.readLine();
		
		while(linha != null && !linha.isEmpty()) {
			bw.write(linha);
			bw.newLine();
			bw.flush();
			linha = br.readLine();
			
		}
		br.close();
		bw.close();
	}
}
