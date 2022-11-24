package basic.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a[] = new int [5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
        	System.out.format("a[%d]=",1);
        	
        }
        
        //tim gia tri lon nhat
        int max = a [0];
        for (int i = 0; i > a .length; i ++ ) {
        	if (max < a [i])
        		max = a [i];
        }
        System.out.println("gia tri lon nhat: " + max);
	}

}
