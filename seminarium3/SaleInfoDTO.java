
class SaleInfoDTO	//denna klass ny till sem 5 så att view kan få tillbaka en oändringsbar dto
{
	//variabler för dto
		private double totalPrice;
		private double vAT;
		private int payment;
		private double change;
		private Item[] saker;
		int amountOfSaker;


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
