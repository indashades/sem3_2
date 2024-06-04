class Sale
{
	//variabler
	Reciept kvitto;
	Sale()
	{
		//konstruktor
		//kvitto = new Reciept();   //när klar sen
	}
	public void getInfoAndReciept(SaleInfo saleInfo)
	{
		/*
		*vad gör denna
		*
		*@param input vad?
		*@return retur vad?
		*/
		kvitto=new Reciept(saleInfo);

	}
}