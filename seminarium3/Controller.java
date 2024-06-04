class Controller
{
	//variabler
	int kassa;
	Sale handelsBedrivelse;
	ExternalHandler externalHandler;
	SaleInfo samling;
	Item tempItem;
	Controller()
	{
		//konstruktor
		externalHandler=new ExternalHandler();
		kassa=105;//antal pengar i kassa, kanske skulle vara annt men inget som man får veta
		samling = new SaleInfo();
	}
	//saker
	public int payment(int amount)
	{
		/*
		*vad gör denna
		*
		*@param input vad?
		*@return retur vad?
		*/
		kassa=kassa+amount;
		samling.gepayment(amount);

		//ej klar
		return kassa;
	}
	public void newSale()
	{
		/*
		*skapar klass Sale
		*
		*/

		handelsBedrivelse = new Sale();
	}
	public SaleInfo register(String itemIdentifier)
	{
		/*
		*letar upp vad sak är och om den finns
		*
		*@param itemIdentifier namn
		*@return saleinfo information om föremål
		*/

		//ej klar
		tempItem=externalHandler.taxAndDesc(itemIdentifier);
		samling.increaseAndItem(tempItem);
		return samling;
	}
	public SaleInfo register(String itemIdentifier, int quantity)
	{
		/*
		*vad gör denna
		*
		*@param input vad?
		*@return retur vad?
		*/

		//ej klar
		return new SaleInfo();
	}
	public double endSale()
	{
		/*
		*vad gör denna
		*
		*@param input vad?
		*@return retur vad?
		*/
		return samling.taTotal();


	}
	public int discountRequest(Id customerId)
	{
		/*
		*vad gör denna
		*
		*@param input vad?
		*@return retur vad?
		*/

		//ej klar
		return 1;
	}
	public int changeKassaAmountBy(int changeAmount)
		{
			/*
			*ändrar värdet kassa genom att ta kassa+changeAmount
			*
			*@param changeAmount är värdet som förändrar kassa
			*@return kassa värdet på kassa vilket är pengarna där
			*/
			kassa+=changeAmount;
			return kassa;
	}
	public void lastMethod()
	{
		handelsBedrivelse.getInfoAndReciept(samling);
	}
}