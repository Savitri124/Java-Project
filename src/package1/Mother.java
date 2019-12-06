 class Mother
  {
  	void purchaseandgive()
  	{
  		System.out.println("mom will buy toy");

  		Shopkeeper sh=new Shopkeeper();

  		Toy tt=sh.selltoy(137.50);
  		System.out.println("mom bought toy");
       Child ch=new Child();

       System.out.println("mom gives toy");
       ch.recievetoy(tt);
       ch.playwithtoy();


  	}
  }