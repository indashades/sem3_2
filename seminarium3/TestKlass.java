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
			Item sak =new Item("varunamn", 1, 102,"blablabla");
			SaleInfo viktigDTO = new SaleInfo(sak, 0.5);
			//assertEquals(viktigDTO.taNamn()[0].equals("varunamn"));					//funkar ej
			if(viktigDTO.taNamn()[0].equals("varunamn"))
				System.out.println("lyckad: namnet stämmer");
			else
				System.out.println("misslyckad: namnet stämmer inte");

		}
		public void testAvSaleInfoValue()
				{
					Item sak =new Item("varunamn", 1, 102,"blablabla");
					SaleInfo viktigDTO = new SaleInfo(sak, 0.5);
					//assertEquals(viktigDTO.taNamn()[0].equals("varunamn"));					//funkar ej
					if(viktigDTO.taValue()[0]==102)
						System.out.println("lyckad: värdet stämmer");
					else
						System.out.println("misslyckad: värdet stämmer inte");

		}
		public void testAvSaleInfoAmount(int amount)
				{
					Item sak =new Item("varunamn", amount, 102,"blablabla");
					SaleInfo viktigDTO = new SaleInfo(sak, 0.5);
					//assertEquals(viktigDTO.taNamn()[0].equals("varunamn"));					//funkar ej
					if(viktigDTO.taAmount()[0]==amount)
						System.out.println("lyckad: mängden stämmer för mängden: "+amount);
					else
						System.out.println("misslyckad: mängden stämmer inte för: "+amount);

		}

		public void testAvReciept()
		{
			Item sak =new Item("varunamn", 1, 102,"blablabla");
			SaleInfo viktigDTO = new SaleInfo(sak, 0.5);
			Reciept testKvitto = new Reciept(viktigDTO);
		}
		public void testAvSale()
				{
					Item sak =new Item("varunamn", 1, 102,"blablabla");
					SaleInfo viktigDTO = new SaleInfo(sak, 0.5);
					Sale testKvitto = new Sale();
					testKvitto.getInfoAndReciept(viktigDTO);
		}


		private String testAvExternaIdetifierare(String id)
		{
			ExternalHandler ex = new ExternalHandler();
			SaleInfo bliNamnSen=ex.taxAndDesc(id);
			return bliNamnSen.taNamn()[0];

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


		public void afterAllTest()
			{
				Controller controllerare = null;
				View vy = null;
				ExternalHandler fakeExternSak =null;
				SaleInfo infoSale = null;

	}
}
