package Interface_Fullyabstraction;

public class Child implements Parent1, Parent2 {

	@Override
	public void name(String s) {
		System.out.println("Customer Name :" + s);

	}

	@Override
	public void acc_No(int a) {
		System.out.println("Customer Account no:" + a);

	}

	@Override
	public void mobile(long l) {
		System.out.println("Mobile No :" + l);

	}

	@Override
	public void email(String e) {
		System.out.println("Email :" + e);

	}

	@Override
	public void address(String a) {
		System.out.println("Customer Address :" + a);

	}

	@Override
	public void branch_Name(String b) {
		System.out.println("Branch Name" + b);

	}

	@Override
	public void branch_add(String a) {
		System.out.println("Branch Address :" + a);

	}

	@Override
	public void ifsc(String i) {
		System.out.println("IFSC Code :" + i);

	}

	@Override
	public void contactno(long c) {
		System.out.println("Branch Contact no:" + c);

	}

	public static void main(String[] args) {

		Child ch = new Child();

		System.out.println("Interface / Fully Abstraction");
		System.out.println("*******************************");

		System.out.println(" Customer Detail");
		System.out.println("=================");

		ch.name("Jayashree");
		ch.acc_No(23466427);
		ch.mobile(8765432190l);
		ch.email("husgh54@gmail.com");
		ch.address("Chennai");

		System.out.println("Branch Detail");
		System.out.println("==============");

		ch.branch_Name("SBI");
		ch.branch_add("T.Nagar");
		ch.ifsc("SBI0098765");
		ch.contactno(4465421676l);

	}

}
