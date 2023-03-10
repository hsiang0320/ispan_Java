package hw3;

public class Sales {

	public static void main(String[] args) {
		String[] employee = { "Jean", "Tom", "Tina" };
		String[] productName = { "產品A", "產品B", "產品C", "產品D", "產品E" };
		int[][] productSales = { { 33, 32, 56, 45, 33 }, { 77, 33, 68, 45, 23 }, { 43, 55, 43, 67, 65 } };
		int[] productPrice = { 12, 16, 10, 14, 15 };
		int[] e_sales = new int[3];
		int sales_MVP = 0;
		int product_MVP = 0;
		int[] p_sales = new int[5];
		for (int i = 0; i < productSales.length; i++) {// 銷售額
			for (int j = 0; j < productSales[i].length; j++) {
				e_sales[i] = e_sales[i] + productPrice[j] * productSales[i][j];
			}
			System.out.println(employee[i] + "的銷售	總額為:" + e_sales[i]);
		}
		for (int i = 1; i < e_sales.length; i++) {// 銷售冠軍
			if (e_sales[i] > e_sales[sales_MVP]) {
				sales_MVP = i;
			}
		}
		System.out.println(employee[sales_MVP] + "為銷售冠軍");
		for (int i = 0; i < productSales[0].length; i++) {
			for (int j = 0; j < productSales.length; j++) {
				p_sales[i] = p_sales[i] + productPrice[i] * productSales[j][i];
			}
			System.out.println(productName[i] + "的銷售額為" + p_sales[i]);
		}
		for (int i = 1; i < productSales[0].length; i++) {
			if (p_sales[product_MVP] < p_sales[i]) {
				product_MVP = i;
			}
		}
		System.out.println(productName[product_MVP] + "為銷售冠軍");
	}

}
