class Reciept
{
	SaleInfo saleInfo;
	String dateAndTimeOfSale;
	Reciept(SaleInfo saleInfo)
	{
		//konstruktor som även ska skriva ut
		dateAndTimeOfSale = java.time.Instant.now().toString();
		this.saleInfo=saleInfo;
		printReciept();
	}
	private void printReciept()
	{
		/*
		*den här metoden skriver ut kvittot (helst med någon form av kvittoutskrivare) men för tillfället i consolen
		*
		*/
		System.out.println("---------------------------------------------------------------------------");
		System.out.println("time of sale: "+dateAndTimeOfSale);
		int amount=saleInfo.taItemAmount();
		String[] namn=saleInfo.taNamn();
		int[] qua=saleInfo.taAmount();
		int[] pri=saleInfo.taValue();
		for(int i=0;i<amount;i++)
		{
			System.out.println(namn[i]+" x"+qua[i]+"    pris: "+pri[i]+"kr");
		}
		System.out.println("");
		System.out.println("total: "+saleInfo.taTotal()+"kr");
		System.out.println("");
		saleInfo.taPayment();
		saleInfo.taChange();
		System.out.println("paid: "+saleInfo.taPayment()+" change: "+saleInfo.taChange());
		System.out.println("---------------------------------------------------------------------------");
	}
}