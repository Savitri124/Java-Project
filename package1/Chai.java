class Chai
{
	void makingtea()
	{
		System.out.println("jahrili chai");
	}
}
class Komolika extends Chai
{
	void makingtea()
	{
		System.out.println("Komolika making jahrili chai");
	}
}

	class Anurag extends Chai
	{
		void makingtea()
		{
		System.out.println("Anurag making nice chai");
	}
}

	class Pari extends Chai
	{
		void makingtea()
		{
		System.out.println("Pari making awesome chai");
	}
}

     class TestChai
     {
     	public static void main(String[] args) {
     		Komolika k=new Komolika();
     		k.makingtea();

     		Anurag a=new Anurag();
     		a.making tea();

     		Pari p=new Pari();
     		p.makingtea();
     	}
     }