class Id
{
	//variabler för dto
	private String name;
	private int personnummer;
	Id(String name, int personnummer)
	{
		this.name=name;
		this.personnummer=personnummer;
	}
	public String taNamn()
	{
		/*
				*hämtar variabel
				*
				*@return name är namnet som ges
		*/
		return name;
	}
	public int taperson()
		{
			/*
					*hämtar variabel
					*
					*@return personnummer är identifikationsnummret
			*/
			return personnummer;
	}
}