

import java.util.*;

public class hesapmakinas� {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		double sonuc;
		int sayi1 ,sayi2,secim;


		do {

			secim = Menudegeral();
			switch (secim) {
			case 1: sayi1 =Sayial();
			sonuc = Fac(sayi1);
			showresult(sonuc);//System.out.println(sonuc);
			break;
			case 2:  
				System.out.println("!!ilk girece�iniz say� taban ,\n ikincisi �s!!!");
				sayi1 = Sayial();
				sayi2 = Sayial();
				sonuc = pow(sayi1,sayi2);
				//showresult(sonuc); yerine 
				System.out.println(sayi1+"'in "+sayi2+".kuvveti="+sonuc);
				break;
			case 3:
				sayi1 = Sayial();
				sonuc =sqr(sayi1);
				showresult(sonuc);
				//System.out.println(sonuc);
			case 4:
				sayi1=Sayial();
				sayi2=Sayial();
				sonuc = mod(sayi1,sayi2);
				showresult(sonuc);
			case 5:

				sonuc =zar();
				int no = (int) sonuc;
				System.out.println("gelen zar "+no);

				default:
					System.out.println("\n ");
				break;
			
			}

		} while (secim!=6);
		System.out.println("hesap mak. kulland���n�z i�in te�ekk�rler\n");
		System.out.println("��kt�n");
	
		

	}//main end


	public static void menug�ster(){
		System.out.println("ho� geldiniz\n1-fakt�riyel al\n2-�s al\n3-k�k al\n4-mod al\n5-zar at\n6-��k��-------");
	}public static int Menudegeral(){
		Scanner sc= new Scanner(System.in);
		menug�ster();
		int sayi1 = sc.nextInt();

		while (sayi1<1 || sayi1>6){
			menug�ster();
			System.out.println("\nge�erli bi se�im yap�n�z");
			 sayi1 = sc.nextInt();
		}
		return sayi1;
	}
	public static int Sayial(){
		Scanner sc= new Scanner(System.in);
		System.out.println("sayi giriniz");
		int sayii = sc.nextInt();
		return sayii;

	}public static double Fac(int f){
		int fakt=1;
		for (int i=1;i<=f;i++){
			fakt=fakt*i;
		}double sonucf = fakt;
		return sonucf;

	}
	public static double pow(int p,int u){
		return Math.pow(p, u);
	}public static double sqr(int s){
		return Math.sqrt(s);
	}public static double mod(int m,int n){
		double sonuc = m%n;
		return sonuc;
	}public static double zar(){
		Random rn = new Random();		
		double d = rn.nextInt(6)+1;
		return d;
	}public static double showresult(double num ){
		System.out.println("sonuc = "+num);
		return num;
	}

}//class end 
