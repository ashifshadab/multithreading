package com.ashifshadab.example2;

public class MarriagePartyOrganise {

	public static void main(String[] args) {

		WeddingVenuThread wedingVenuThread = new WeddingVenuThread("WeddingVenu");
		
		CardPrintingThread cardPrintingThread = new CardPrintingThread("CardPrinting", wedingVenuThread);
		
		CardDistributionThread cardDistributionThread = new CardDistributionThread("CardDistribution", cardPrintingThread);
		
		
		cardDistributionThread.start();
		
		cardPrintingThread.start();
		
		wedingVenuThread.start();

	}

}
