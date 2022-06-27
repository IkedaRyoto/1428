class ProductJudgeclass{
	
	// 入力	
	public boolean []  productjudgeMethod(int STOCK[]){
		
		// 数字の判定
		boolean judge_product [] = new boolean[STOCK.length];
		
		for(int i = 0; i< STOCK.length; i++) {
			if(STOCK[i] == 0) {
				judge_product[i] = true;
			}
			else {
				judge_product[i] = false;
			}
		}
		 return judge_product;
	}
	

	

}