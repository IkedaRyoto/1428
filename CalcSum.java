package vend;

public class CalcSum {

	public static void main(String[] args) {
		//10,50,100,500,1000円の枚数
		int money[] = {10, 10, 100, 100, 50};
		int num[] = {10, 10, 10, 10, 10};
		int sum = 0;
		
		//投入金額合計計算
		sum = Calc(num, money, sum);

		System.out.println("投入金額合計:"+sum+"\\");

	}

	private static int Calc(int num[], int money[], int sum) {
		for(int i = 0; i <= money.length-1; i++) {
			sum += money[i];
		}
		

		return sum;
		}
}
