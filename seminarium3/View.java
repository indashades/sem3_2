class View
{
	Controller controllerare;
	View()
	{
		//konstruktor
		controllerare=new Controller();
	}
	public void roligMetodSomFixarSaker()
	{

		java.util.Scanner in = new java.util.Scanner(System.in);
		System.out.println("skriv valfri siffra förutom 0 för att starta sale:");
		int saleKlar=in.nextInt();
		if(saleKlar!=0)
		{
			controllerare.newSale();
		}
		while (saleKlar!=0)
		{
			System.out.println("skriv item id:");
			String temp4 = in.next();
			SaleInfoDTO infoSale = controllerare.register(temp4); //ändrad till sem 5 för att fixa så att view ej kommer åt något
			int temp=infoSale.taItemAmount();
			int[] temp2 = infoSale.taValue();
			System.out.println("kostar "+temp2[temp-1]+"kr");
			System.out.println("vat: "+infoSale.taVAT());
			String[] temp3 = infoSale.taDesc();

			if(temp3[temp-1].equals("en frukt från afrika"))													//kommentaren säger It is not OK that the taNamn, taDesc returns strings to the view, which the view prints. These strings are part of the user interface, and therefore must be created in the view. The controller should just return the data, and the view should create the strings that present the data.
			{														//taNamn metoden används alldrig i view och att inte kunna ta desc verkar idiotiskt men här är förändring till sem 5 gällande det
				System.out.println("description: en frukt från afrika");
			}
			if(temp3[temp-1].equals("ätabar orange sak"))													//kommentaren säger It is not OK that the taNamn, taDesc returns strings to the view, which the view prints. These strings are part of the user interface, and therefore must be created in the view. The controller should just return the data, and the view should create the strings that present the data.
						{														//taNamn metoden används alldrig i view och att inte kunna ta desc från där den sparas verkar idiotiskt men här är förändring till sem 5 gällande det
							System.out.println("description: ätabar orange sak");
			}
			if(temp3[temp-1].equals("vapen av massförstörelse"))													//kommentaren säger It is not OK that the taNamn, taDesc returns strings to the view, which the view prints. These strings are part of the user interface, and therefore must be created in the view. The controller should just return the data, and the view should create the strings that present the data.
						{														//taNamn metoden används alldrig i view och att inte kunna ta desc verkar idiotiskt men här är förändring till sem 5 gällande det
							System.out.println("description: vapen av massförstörelse");
			}
			else
			{
				System.out.println("description: föremålet finns ej");
			}


			//System.out.println("description: "+temp3[temp-1]);			//borttagen till sem 5 till förmån för rad 29-45
			//end sale? mellan varje
			System.out.println("0 för att avsluta");
			saleKlar=in.nextInt();
		}
		System.out.println("totalt: "+controllerare.endSale());
		//enter amount paid
		System.out.println("enter payment: ");
		int temp5 = in.nextInt();
		System.out.println("i kassa: "+controllerare.payment(temp5));
		//höj pengar i kassa
		//reciept och change
		controllerare.lastMethod();
	}
}