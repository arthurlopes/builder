/**
 * 
 * @author Arthur Costa Lopes e Eric Krakauer
 * RA: 157999 e 155253
 */

package fullApp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CreateCharacterApp {

public static final String root_dir = "bin/textFiles/";
	
	public static StringBuilder getFileContent(String file_path)
	{
		StringBuilder contents = new StringBuilder();

		try {
			BufferedReader input =  new BufferedReader(new FileReader(file_path));
			try {
				String line = null;
				while (( line = input.readLine()) != null){
					contents.append(line);
					contents.append(System.getProperty("line.separator"));
				}
			}
			finally {
				input.close();
			}
		}
		catch (IOException ex){
			ex.printStackTrace();
		}

		return contents;
	}

	public static void main(String[] args)  {
		
		Scanner teclado = new Scanner(System.in);		
		System.out.println("Ingresse o tipo de personagem: ");
		String tipo = teclado.nextLine();
		teclado.close();
		
		Director dir = new Director();
		
		/*Determina o personagem a ser criado e manda ao diretor*
		 * para construi-lo */
		switch(tipo.toLowerCase()) {
		case "soldier":
			SoldierBuilder soldierBuilder = new SoldierBuilder();
			dir.Construct(soldierBuilder);
			System.out.println(soldierBuilder.getResult());
			break;
		case "student":
			StudentBuilder studentBuilder = new StudentBuilder();
			dir.Construct(studentBuilder);
			System.out.println(studentBuilder.getResult());
			break;
		case "thief":
			ThiefBuilder thiefBuilder = new ThiefBuilder();
			dir.Construct(thiefBuilder);
			System.out.println(thiefBuilder.getResult());
			break;
		case "pikachu":
			PikachuBuilder pikachuBuilder = new PikachuBuilder();
			dir.Construct(pikachuBuilder);
			System.out.println(pikachuBuilder.getResult());
			break;
		default:
			System.out.print("Tipo de personagem no soportado, por favor tente de novo");
			System.exit(1);
		}
	}
}
