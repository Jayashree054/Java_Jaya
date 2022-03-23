package Polymorphism_Overloading;

public class Child_Overriding extends Parent_Overriding {

	@Override
	public void emp_Name(String name) {

		System.out.println("Raju");
		super.emp_Name(name);
	}

	@Override
	public void emp_Id(int id) {

		super.emp_Id(id);
		System.out.println("ID :" + id);
	}

	@Override
	public void emp_Salary(float salary) {

		super.emp_Salary(salary);
		System.out.println("Salary :" + salary);
	}

	@Override
	public void emp_Mobile(long mobile) {

		super.emp_Mobile(mobile);
		System.out.println("Mobile :" + mobile);
	}

	public static void main(String[] args) {

		Child_Overriding c = new Child_Overriding();

		System.out.println("Over Riding");
		System.out.println("==============");
		c.emp_Name("Jayashree");
		c.emp_Id(76348);
		c.emp_Salary(45000.0F);
		c.emp_Mobile(9876543290L);

	}
}
