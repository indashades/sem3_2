class Item
{
	//variabler för dto
	private String name;
	private int amount;
	private int price;
	private String desc;
	double vAt;
	Item(String name, int amount, int price,String desc,double vAt)
	{
		this.name=name;
		this.amount=amount;
		this.price=price;
		this.desc=desc;
		this.vAt=vAt;
	}
	public int changeAmountBy(int changeAmount)
	{
		/*
		*ändrar värdet amount genom att ta amount+changeAmount
		*
		*@param changeAmount är värdet som förändrar amount
		*@return amount värdet på amount
		*/
		amount+=changeAmount;
		return amount;
	}
	public int getPrice()
		{
			/*
			*hämtar priset
			*
			*@return price värdet för föremålet
			*/
			return (price*amount);
	}
	public String getName()
			{
				/*
				*hämtar namnet
				*
				*@return name föremålets namn
				*/
			return name;
		}
		public String getdesc()
					{
						/*
						*hämtar namnet
						*
						*@return name föremålets namn
						*/
					return desc;
		}
		public double getVat()
		{
			/*
									*hämtar vat
									*
									*@return vAt skatt eller vad det nu var
									*/
					return vAt;
		}
}