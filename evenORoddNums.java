

import java.util.*;

public class evenORoddNums {

	public static void main(String[] args) {
		Random rn = new Random();
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=rn.nextInt(100);

		}
		for (int a : evenNumber(arr)) {
			System.out.print(a+" ");
		}System.out.println();
		for (int b : oddNumber(arr)) {
			System.out.println(b);
		}
		int[][] son = new int[evenNumber(arr).size()][oddNumber(arr).size()];
		for (int i = 0; i < son.length; i++) {
			son[i][0]=evenNumber(arr).get(i);
			for (int j = 0; j < son[i].length; j++) {
				
				son[5][j]=oddNumber(arr).get(j);
				System.out.print(son[i][j]+ " ");
			}
			System.out.println();
		}


	}public static ArrayList<Integer> evenNumber(int[] arr ){
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]%2==0){
				list.add(arr[i]);
			}
		}return list;
		
	}public static ArrayList<Integer> oddNumber(int[] arr ){
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%2!=0){
				list.add(arr[i]);
			}
		}return list;
	}

}
