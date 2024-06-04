class StartUp
{
	public static void main (String[] args)
	{
		//Classen l = new Classen(s,f);
		int programKlar=0;
		java.util.Scanner in = new java.util.Scanner(System.in);
		while (!(programKlar==3))
		{
			System.out.println("skriv 1 för program, 2 för tester och 3 för att avsluta:");
			programKlar=in.nextInt();
			if(programKlar==1)
			{
				//Controller controllerare = new Controller();
				View vy = new View();
				ExternalHandler fakeExternSak =new ExternalHandler();
				//Id identifikation = new Id();
				SaleInfo infoSale = new SaleInfo();
				vy.roligMetodSomFixarSaker();
			}
			/*




			tester
			|
			|
			|
			V




















			*/
			if(programKlar==2)
			{
				TestKlass a=new TestKlass();

				a.beforeAllTest();

				a.testAvSaleInfoNamn();
				a.testAvSaleInfoAmount(3);
				a.testAvSaleInfoAmount(7);
				a.testAvSaleInfoAmount(-5);
				a.testAvSaleInfoValue();
				a.testAvExternaIdetifierareBanan();
				a.testAvExternaIdetifierareMorot();
				a.testAvExternaIdetifierareAtomBomb();
				a.testAvExternaIdetifierareEjKorrekt();

				a.testAvReciept();
				a.testAvSale();

				a.testAvCTRLChange();
				a.testAvCTRLReg("banan");
				a.testAvCTRLReg("morot");
				a.testAvControlPayment(3);

				a.afterAllTest();

			}
			//här kod klar
		}
	}

}





