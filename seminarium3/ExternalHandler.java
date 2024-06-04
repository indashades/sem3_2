class ExternalHandler
{
	Item[] i1;
	ExternalHandler()
	{
			//konstruktor
			i1=new Item[4];
			i1[0]=new Item("banan", 1, 25,"en frukt från afrika",0.2);
			i1[1]=new Item("morot", 1, 15,"ätabar orange sak",0.2);
			i1[2]=new Item("atombomb", 1, 1000000,"vapen av massförstörelse",0.2);
			i1[3]=new Item("unknown", 1, 0,"denna artikel finns ej",0.2);
	}
	//metoder
	public static void sparaSaleInfo(SaleInfo saleInfo)
	{
		/*
		*vad gör denna
		*
		*@param input vad?
		*@return retur vad?
		*/

	}
	public static void inventoryUpdate(SaleInfo saleInfo)
	{
		/*
		*vad gör denna
		*
		*@param input vad?
		*@return retur vad?
		*/

	}
	public Item taxAndDesc(String itemIdentifier)
	{
		/*
		*vad gör denna
		*
		*@param input vad?
		*@return retur vad?
		*/
		int z=3;
		for(int i=0;i<3;i++)
		{
			if(itemIdentifier.equals(i1[i].getName()))
			{
				z=i;
			}
		}
		//ej klar
		return i1[z];
	}
	public static int fetchDiscount(Id customerId)
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
}