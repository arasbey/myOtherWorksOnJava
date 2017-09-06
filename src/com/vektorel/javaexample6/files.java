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
        String yazdýgým ;
        BufferedReader bfr = new BufferedReader(fileReader);
        
        
        while((yazdýgým = bfr.readLine())!= null){
        	System.out.println(yazdýgým);
        }
        bfr.close();
        
	
		
		
		}
		}
	
	

