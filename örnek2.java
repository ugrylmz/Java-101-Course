

import java.util.*;

public class örnek2 {

	public static void main(String[] args) {
		Random rn = new Random();
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=rn.nextInt(100);

		}
		for (int a : Ciftsayi(arr)) {
			System.out.print(a+" ");
		}System.out.println();
		for (int b : teksayi(arr)) {
			System.out.println(b);
		}
		int[][] son = new int[Ciftsayi(arr).size()][teksayi(arr).size()];
		for (int i = 0; i < son.length; i++) {
			son[i][0]=Ciftsayi(arr).get(i);
			for (int j = 0; j < son[i].length; j++) {
				
				son[5][j]=teksayi(arr).get(j);
				System.out.print(son[i][j]+ " ");
			}
			System.out.println();
		}


	}public static ArrayList<Integer> Ciftsayi(int[] arr ){
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]%2==0){
				list.add(arr[i]);
			}
		}return list;
		
	}public static ArrayList<Integer> teksayi(int[] arr ){
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%2!=0){
				list.add(arr[i]);
			}
		}return list;
	}

}
