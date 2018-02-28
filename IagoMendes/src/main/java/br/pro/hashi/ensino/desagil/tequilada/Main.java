package br.pro.hashi.ensino.desagil.tequilada;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		//System.out.println("Projeto1");

		try{
			FileReader file = new FileReader("labirinto.txt");
			BufferedReader readFile = new BufferedReader(file);
			String line = readFile.readLine();

			//Skipping first line
			line = readFile.readLine();

			//Character array
			char[] character = null;

			//Using while to read each line in the file
			while(line != null){

				//Breaking each line into array char
				character = line.toCharArray();

				//Using for to read each character in the line
				for(int i=0; i<character.length; i++){

					//Changing character to 'X' if it's '#'
					if(character[i] == '#'){
						character[i] = 'X';
					}
				}

				//Printing the characters already changed
				System.out.println(character);

				//Redefining line for the next loop
				line = readFile.readLine();
			}

			file.close();

		} catch (IOException e){
			System.out.printf("Erro abrindo o arquivo", e.getMessage());
		}


	}

}
