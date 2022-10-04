package com.dsa.recursion;

/* here we draw a pattern. Till
 * now we see single recursive call.
 * before recursive call all things printed
 * bottom to top in stack. After recursive call
 * all things printed top to bottom.
 * But in this we will make two recursive calls,
 * where recursive tree will be generated in call stack
 * you have to try to draw that recursive calls tree on paper.
 * Always try to draw tree from top, like we draw binary tree.
 * */
public class Recursion6 {

	public static void main(String[] args) {

		pzz(3);

	}

	private static void pzz(int n) {

		if (n == 0) {
			return;
		}

		System.out.println("Pre  :" + n);
		pzz(n - 1);
		System.out.println("In   :" + n);
		pzz(n - 1);
		System.out.println("Post :" + n);

	}

}
