class TestKlass
{





	public void beforeAllTest()
		{
			Controller controllerare = new Controller();
			View vy = new View();
			ExternalHandler fakeExternSak =new ExternalHandler();
			SaleInfo infoSale = new SaleInfo();

		}


		public void testAvSaleInfoNamn()
		{
			Item sak =new Item("varunamn", 1, 102,"blablabla",1.1);
			SaleInfo viktigDTO = new SaleInfo(sak, 0.5);
			//assertEquals(viktigDTO.taNamn()[0].equals("varunamn"));					//funkar ej
			if(viktigDTO.taNamn()[0].equals("varunamn"))
				System.out.println("lyckad: namnet stämmer");
			else
				System.out.println("misslyckad: namnet stämmer inte");

		}
		public void testAvSaleInfoValue()
				{
					Item sak =new Item("varunamn", 1, 102,"blablabla",1.1);
					SaleInfo viktigDTO = new SaleInfo(sak, 0.5);
					//assertEquals(viktigDTO.taNamn()[0].equals("varunamn"));					//funkar ej
					if(viktigDTO.taValue()[0]==102)
						System.out.println("lyckad: värdet stämmer");
					else
						System.out.println("misslyckad: värdet stämmer inte");

		}
		public void testAvSaleInfoAmount(int amount)
				{
					Item sak =new Item("varunamn", amount, 102,"blablabla",1.1);
					SaleInfo viktigDTO = new SaleInfo(sak, 0.5);
					//assertEquals(viktigDTO.taNamn()[0].equals("varunamn"));					//funkar ej
					if(viktigDTO.taAmount()[0]==amount)
						System.out.println("lyckad: mängden stämmer för mängden: "+amount);
					else
						System.out.println("misslyckad: mängden stämmer inte för: "+amount);

		}

		public void testAvReciept()
		{
			Item sak =new Item("varunamn", 1, 102,"blablabla",1.1);
			SaleInfo viktigDTO = new SaleInfo(sak, 0.5);
			Reciept testKvitto = new Reciept(viktigDTO);
		}
		public void testAvSale()
				{
					Item sak =new Item("varunamn", 1, 102,"blablabla",1.1);
					SaleInfo viktigDTO = new SaleInfo(sak, 0.5);
					Sale testKvitto = new Sale();
					testKvitto.getInfoAndReciept(viktigDTO);
		}


		private String testAvExternaIdetifierare(String id)
		{
			ExternalHandler ex = new ExternalHandler();
			Item bliNamnSen=ex.taxAndDesc(id);
			SaleInfo a = new SaleInfo();
			a.increaseAndItem(bliNamnSen);
			return a.taNamn()[0];

		}
		public void testAvExternaIdetifierareBanan()
		{
			if(testAvExternaIdetifierare("banan").equals("banan"))
				System.out.println("lyckad: varan stämmer");
			else
				System.out.println("misslyckad: fel vara?");
		}
		public void testAvExternaIdetifierareMorot()
				{
					if(testAvExternaIdetifierare("morot").equals("morot"))
						System.out.println("lyckad: varan stämmer");
					else
						System.out.println("misslyckad: fel vara?");
		}
		public void testAvExternaIdetifierareAtomBomb()
				{
					if(testAvExternaIdetifierare("atombomb").equals("atombomb"))
						System.out.println("lyckad: varan stämmer");
					else
						System.out.println("misslyckad: fel vara?");
		}
		public void testAvExternaIdetifierareEjKorrekt()
				{
					if(testAvExternaIdetifierare("dinosaurie").equals("unknown"))
						System.out.println("lyckad: varan stämmer");
					else
						System.out.println("misslyckad: fel vara?");
		}
		//test av controller
				public void testAvControlPayment(int amount)
				{
					Controller controllerare = new Controller();
					int c=controllerare.payment(amount);
					int c2=105+amount;
					if(c2==c)
						System.out.println("lyckad: rätt mängd pengar: " +c);
					else
						System.out.println("misslyckad: fel mängd pengar: "+c);
				}
				public void testAvCTRLReg(String vara)
				{
					Controller controllerare = new Controller();
					SaleInfo s=controllerare.register(vara);
					String text[]=s.taNamn();
					if(text[0].equals(vara))
						System.out.println("lyckad: ctrl vara stämmer");
									else
						System.out.println("misslyckad: fel ctrl vara, ska vara "+vara+" är: "+s.taNamn());
				}
				public void testAvCTRLChange()
				{
					Controller s = new Controller();
					s.changeKassaAmountBy(-100);
					int c=s.payment(0);
					if(5==c)
						System.out.println("lyckad: rätt mängd pengar, ska vara 5: " +c);
					else
						System.out.println("misslyckad: fel mängd pengar, ska vara 5: "+c);
				}



		public void afterAllTest()
			{
				Controller controllerare = null;
				View vy = null;
				ExternalHandler fakeExternSak =null;
				SaleInfo infoSale = null;

	}
}
