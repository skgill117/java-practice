package com.dsa.ArrayList;

public class ArrayList {
	
	long [] arr;
	int nElems;
	
	public ArrayList(int size) {
		arr = new long[size];
		nElems = 0;
	}
	
	private void insert(long data) {
		arr[nElems] = data;
		nElems++;
	}
	
	private void delete(long data) {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
