package com.vektorel.javaexample6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class files {
	
	public static void main(String[] args) throws IOException {
		String yaz = "Dosyaya yaz";
		
		File dosya = new File("dosya.txt");
		if(!dosya.exists()){
			//YAZMA
			dosya.createNewFile();
			FileWriter fileWriter = new FileWriter(dosya, false);
	        BufferedWriter bWriter = new BufferedWriter(fileWriter);
	        bWriter.write(yaz);
	        bWriter.close();
	      
	        
	        
	}
		//OKUMA
		FileReader fileReader = new FileReader(dosya);
        String yazd�g�m ;
        BufferedReader bfr = new BufferedReader(fileReader);
        
        
        while((yazd�g�m = bfr.readLine())!= null){
        	System.out.println(yazd�g�m);
        }
        bfr.close();
        
	
		
		
		}
		}
	
	

