package vending;

import java.util.Scanner;

public class vending {


				if(rest[m] == 0){
					break;
				}

				if(j == 5){
					CanPrint[m] = true;
					//f = true;
					break;
				}

			}while(true);


//			if(f){
//				System.out.println("購入不可能です。");
//
//			}else{
//				for(int k = 0;k < 5;k++){
//					System.out.println(MONEY[k] + "円：" + COUNT[k] + "枚");
//				}
//			}
		}

		System.out.printf("%-12s：%4s：%7s：\n", "商品名", "値段", "ボタン番号");

		for(int s = 0;s < VALUE.length;s++){
			if(!CanPrint[s]){
				//System.out.println(NAME[s] + "\t\t：" + VALUE[s] + "：\t" + (s + 1) + "：\t");
				//System.out.format("%-12s：%5s：%8s：\n", NAME[s], VALUE[s], s+1);
				System.out.printf("%-15s：\t%d：\t\t\t%d：\t\n", NAME[s], VALUE[s], s + 1);
			}
		}


		System.out.println("ボタン番号を入力してください");
		System.out.print(">");
		Scanner inbt = new Scanner(System.in);
		int button = inbt.nextInt();

		return;
	}
}
