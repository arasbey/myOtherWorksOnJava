package com.vektorel.javaexample3;

import java.util.Random;
import java.util.Scanner;

public class say�tahminoyunu {

	
	public static void main(String[] args) {
		say�tahminoyunu sayitahmin = new say�tahminoyunu();
		sayitahmin.giris();
	}
	
	public void giris() {
		Scanner al = new Scanner(System.in);
		Random rnd = new Random();
		int hak=10;
		System.out.println("Sayi tahmin oyununa hosgeldiniz,10 adet tahmin hakk�n�z var puanlandirmamiz soyledir:");
		System.out.println("1.tahminde dogru ise = 100 puan && 10.tahminde dogru ise 10 puan ");
		System.out.println("Simdi sizin icin sayi tutuyorum..");
		System.out.println("Tuttum l�tfen tahmin ediniz..:");
		int sayim=rnd.nextInt(100);
		
		for (int i = 0; i < hak; i++) {
			int tahmin= al.nextInt();
			
			if(sayim==tahmin){
				System.out.println("BULDUNUZ TEBR�KLER");
				System.out.println(i+". tahminizde dogruyu buldunuz");
				if(i>=1 && i<=3){System.out.println("Harika sansiniz var");}
				else if(i>3 && i<=7){System.out.println("Ortalama bir sansiniz var");}
				else if (i>7){System.out.println("Kotu bir sansiniz var");};
			}else{
			System.out.println((i+1)+" inci tahmininizi yapt�n�z");
			tahminKontrol(tahmin, sayim);
		}}

	}
	
	public void tahminKontrol(int th,int sy) {
		
		int fark=sy-th;
		if(fark>1 && fark<=10){
			System.out.println("�nanilmaz yakinsiniz");
			System.out.println(fark);
		}
		
		else if(fark>10 && fark<=20){
			System.out.println("Cok yaklastiniz");
			System.out.println(fark);

		}
		else if(fark>20 && fark<=30){
			System.out.println("Yakinsiniz");
			System.out.println(fark);

		}
		else if(fark>30 && fark<=40){
			System.out.println("Biraz uzaksiniz");
			System.out.println(fark);

			
		}
		else if(fark>40 && fark<=50){
			System.out.println("Uzaktasiniz");
			System.out.println(fark);

		}
		else if(fark>50){
			System.out.println("Cok uzaks�niz");
			System.out.println(fark);

		}
	}
}
