package mock;

public class Tester {
	public static void main(String[] args) {
		String[] availJewelArr = {"Bentex","Silver","Gold","Platinum"};
		int[] availPriceArr ={20,50,2600,3000};
		
		String[] purchasedJewelsArr= {"Silver","Gold","Platinum"};
		int[] purchasedQuantityArr= {20, 7, 3};
		
		System.out.println(new Solution().calculateBillAmount(availJewelArr,availPriceArr,purchasedJewelsArr,purchasedQuantityArr));
	}
}
