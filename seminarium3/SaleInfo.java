
class SaleInfo extends SaleInfoDTO	//denna implementerar till sem 5 SaleInfoDTO så att den kan ge värden till view utan att ge view åtkomst att ändra värden
{
	//variabler för dto
		private double totalPrice;
		private double vAT;
		private int payment;
		private double change;
		private Item[] saker;
		int amountOfSaker;
	SaleInfo(Item sak, double vAT)
	{
		//konstruktor
		this.saker=new Item[100];
		saker[0]=sak;
		this.vAT=vAT;
		amountOfSaker=1;

	}
	SaleInfo()
		{
			//konstruktor
			this.saker=new Item[100];
	}
	public void gepayment(int payment)
		{
				/*
				*ger mängd pengar som betalas
				*
				*@åaram payment ger mängd pengar som betalas
				*/
				this.payment=payment;
	}
	private void kalkuleringar()
	{
			/*
			*räknar ut change och total
			*
			*/
			totalPrice=0;
			for(int i=0; i<amountOfSaker;i++)
			{
				totalPrice=totalPrice+saker[i].getPrice();
			}
			//vet inte varför int ej erkänns finnas här
			double vatPris= totalPrice * vAT;
			double vatPris2=vatPris+totalPrice;
			change=payment - vatPris2;
			totalPrice=vatPris2;
	}
	public void increaseAndItem(Item sakNy)
	{
			/*
			*lägger till sak
			*
			*@param sakNy ny sak att lägga till
			*/

		int tempVar=1;
		for(int i=0; i<amountOfSaker;i++)
		{
			if(sakNy.getName().equals(saker[i].getName()))
			{
				tempVar=2;
				saker[i].changeAmountBy(1);

			}

		}
		if(tempVar==1)
		{
			amountOfSaker++;
			saker[amountOfSaker-1]=sakNy;

		}


	}
	//variablar ut
		public double taTotal()
		{
			/*
			*hämtar variabel
			*
			*@return totalPrice vilket är totala priset
			*/
			kalkuleringar();
			return totalPrice;
		}
		public double taVAT()
		{
					/*
					*hämtar variabel
					*
					*@return vAt vilket är VAT
					*/
					return vAT;
		}
		public int taPayment()
		{
							/*
							*hämtar variabel
							*
							*@return payment vilket är betalning
							*/
							return payment;
		}
		public double taChange()
		{
			/*
			*hämtar variabel
			*
			*@return change vilket är betalning minus belopp att betala
			*/
			kalkuleringar();
			return change;
		}
		public String[] taNamn()
		{
			/*
			*hämtar variabel
			*
			*@return retur vilket är det från Item
			*/
			String[] retur = new String[amountOfSaker];
			for(int i=0; i<amountOfSaker;i++)
			{
				retur[i]=saker[i].getName();
			}
			return retur;
		}
		public int[] taValue()
		{
			/*
			*hämtar variabel
			*
			*@return retur vilket är det från Item
			*/
			int[] retur = new int[amountOfSaker];
			for(int i=0; i<amountOfSaker;i++)
			{
				retur[i]=saker[i].getPrice();
			}
		return retur;
		}
		public int[] taAmount()
				{
					/*
					*hämtar variabel
					*
					*@return retur vilket är det från Item
					*/
					int[] retur = new int[amountOfSaker];
					for(int i=0; i<amountOfSaker;i++)
					{
						retur[i]=saker[i].changeAmountBy(0);
					}
				return retur;
		}
		public String[] taDesc()
				{
					/*
					*hämtar variabel
					*
					*@return retur vilket är det från Item
					*/
					String[] retur = new String[amountOfSaker];
					for(int i=0; i<amountOfSaker;i++)
					{
						retur[i]=saker[i].getdesc();
					}
					return retur;
		}
		public int taItemAmount()
		{
			/*
			*hämtar variabel
			*
			*@return amountOfSaker vilket är antal Item
			*/
		return amountOfSaker;
		}

}
