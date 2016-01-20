/**
 *
 * @author Yooju Choi
 */

import java.io.*;

public class Lab1_4 
{
	public static void main(String[] args)
	{
		try{
			FileReader fr = new FileReader("C:\\JavaFiles\\myFile.txt");
			FileWriter fw = new FileWriter("C:\\JavaFiles\\myFileOut.txt");
			while (fr.ready()){
				char c = (char)(fr.read());
				fw.write(c);
			}
			fr.close();
			fw.close();
		}catch (IOException e){
			System.out.println("Error" +e.toString());
		}
	}
}
