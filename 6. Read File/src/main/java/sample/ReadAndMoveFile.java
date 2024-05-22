package sample;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.Path;
import java.util.Scanner;
import java.io.BufferedReader;
public class ReadAndMoveFile 
{	
		public static void main(String[] args) throws Exception 
		{
			File file=new File("/home/dell/Documents/demo");
			if(file.renameTo(new File("/home/dell/Desktop/myfile")))
			{
				file.delete();
				System.out.println("file moved");
			    file=new File("/home/dell/Desktop/myfile");
			    FileReader fileReader = new FileReader(file);
//				BufferedReader bufferedReader = new BufferedReader(fileReader);
//				String s1 = bufferedReader.readLine();
//				while (s1 != null) {
//					System.out.println(s1);
//					s1 = bufferedReader.readLine();
//				}
			    
			}
			else 
			{
				System.out.println("file is not moved");
			}

		}
}
			
		
