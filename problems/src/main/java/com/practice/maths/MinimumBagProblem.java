package com.practice.maths;

public class MinimumBagProblem {
	
	public static void main(String[] args) {
		
		int minBags = findBags(16,2,10);
		System.out.println(minBags);
		
		
	}

	private static int findBags(int items, int availableLargeBags, int availableSmallBags) {
		
		int totalCapacity = availableLargeBags*5 + availableSmallBags;
		if(items > totalCapacity)
			return -1;
		
		int totalPackage = 0;
		int largeBagTotalCapacity = availableLargeBags * 5;
		if(largeBagTotalCapacity > 0 && items >= largeBagTotalCapacity) {
			int remainingItem = items - largeBagTotalCapacity;
			int usedLargeBags = availableLargeBags;
			totalPackage = totalPackage + usedLargeBags;
			if(remainingItem > availableSmallBags) {
				totalPackage = -1;
			}else {
				int smallBagUsed = remainingItem;
				totalPackage = totalPackage + smallBagUsed;
			}
		}else if(largeBagTotalCapacity > items) {
			int remainingCapacity = largeBagTotalCapacity - items;
			if(remainingCapacity > 5) {
				int remainingBags = remainingCapacity/5;
				int usedLargeBag = availableLargeBags - remainingBags;
				totalPackage = totalPackage + usedLargeBag;
			}else {
				totalPackage = totalPackage + availableLargeBags;
			}
		}else {
			return -1;
		}
		
		return totalPackage;
	}

}
