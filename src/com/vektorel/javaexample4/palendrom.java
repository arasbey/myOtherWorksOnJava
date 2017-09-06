package com.vektorel.javaexample4;

import java.util.Scanner;



public class palendrom {
	
	public static void main(String[] args) {
		palendrom palendrom = new palendrom();
		palendrom.kelimePalendromu();
	}

	
	public void kelimePalendromu() {
		String kelime,terskelime = "";
		Scanner al = new Scanner(System.in);
		System.out.println("Palendrom kontrolu icin kelime veya cümle giriniz");
		kelime = al.nextLine();
		int uzunluk;
		uzunluk = kelime.length();
		
		for (int i = 0; i < uzunluk; i++) {
			terskelime += kelime.charAt(uzunluk-1-i);
			
		}
		System.out.println("Kelimenin tersi = "+terskelime);
		
		if(kelime.equals(terskelime)){
			System.out.println("Kelime palendromiktir");
			
		}
		else {
			System.out.println("Kelime palendromik degildir");
		
		}
		
		
	}
}
