package com.lcpan.m04;

public class ThreeDimArray2 {
	public static void main(String[] args) {
		int sum = 0;
		int[][][] arr = { {{2,6,1}, {4,3,5} }, 
						{ {3,6,7}, {1,2,3} } ,
						{ {2,6,1}, {4,3,5} }, 
						{ {3,6,7}, {1,2,3} }};//三維陣列 4*2*3
		for (int i = 0; i < arr.length; i++)
			for (int j = 0; j < arr[i].length; j++)
				for(int z=0;z<arr[i][j].length;z++) {
					sum+=arr[i][j][z];
				}
		System.out.print(sum);
	}
}
