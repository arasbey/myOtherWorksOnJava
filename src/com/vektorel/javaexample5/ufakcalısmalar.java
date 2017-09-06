package com.vektorel.javaexample5;

import java.util.Random;
import java.util.Scanner;

public class ufakcalýsmalar {

	public static void main(String[] args) {
		ufakcalýsmalar yeni = new ufakcalýsmalar();
		yeni.asalMý();

	}

	public void randomSayýurettopla() {

		Random rasgele = new Random();

		int sayi = rasgele.nextInt(1000);

		int birler = sayi % 10;
		int onlar = sayi / 10 % 10;
		int yuzler = sayi / 100 % 100;

		System.out.println("Uretilen sayi = " + sayi);

		int toplam = onlar + birler + yuzler;
		System.out.println("Basamaklarýn toplamý " + toplam);
	}

	public void yýldýzCiz() {
		Scanner al = new Scanner(System.in);
		System.out.println("Kac tane yildiz cizelim alt alta ?");
		int giris = al.nextInt();

		for (int i = 1; i <= giris; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}

	public void sayýSekilleri() {
		Scanner al = new Scanner(System.in);
		System.out.println("Bir sayi girin");
		int sayi=al.nextInt();
		
		for (int i = sayi; i >=1 ; i--) {
			for (int j = i; j>=1; j--) {
				System.out.print(j+" ");
				
			}
			for (int k = 2; k <=i; k++) {
				System.out.print(k+" ");
			}
			System.out.println("");
				
			}
		}
		
	public void asalMý() {
		System.out.println("Asal sayýlar kendisinden baska boleni olmayan sayilardir");
		System.out.println("Bir sayi denemek icin girin");
		Scanner al = new Scanner(System.in);
		int sayi = al.nextInt();
		int bolunme=0;
		for (int i = 2; i < sayi; i++) {
			if(sayi%i==0){
				bolunme++;
			}
			
		}
		if(bolunme==0){
			System.out.println("Bu bir asalsayidir");
		}
		else{
			System.out.println("Bu bir asalsayi degildir");
		}
	}
	}


