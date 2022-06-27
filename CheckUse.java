package vending_machine11;

import java.util.Scanner;

public class CheckUse {
	public static void main(String[] args){
		
		int money[]=new int[4];
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<money.length;i++){
			System.out.println("整数を入力");
			money[i]= sc.nextInt();
		}
		for(int i=0;i<money.length;i++){
			
			System.out.printf("s[%2d]=%d\n",i,money[i]);
			sc.close();
		}
	}
		
}

