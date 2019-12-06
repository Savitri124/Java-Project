class Employee
{
	int empid;
	String name;
	static String company="TCS";

	Employee(int empid,String name)
	{
		this.empid=empid;
		this.name=name;
		//this.company=company;
	}
	void display()
	{
	System.out.println(empid+" "+name+" "+company+" ");
    }
    public static void main(String[] args) {
    	Employee e1=new Employee(101,"Ram");
    	e1.display();
    	Employee e2=new Employee(102,"shyam");
    	e2.display();

    }


}