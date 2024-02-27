package view;

import java.util.Scanner;

import controller.MdcController;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		MdcController mc = new MdcController();
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		System.out.println(mc.mdc(x, y));
		
		sc.close();

	}

}
