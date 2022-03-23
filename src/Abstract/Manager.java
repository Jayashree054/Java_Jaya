package Abstract;

public class Manager extends Clerk {

	@Override
	void name() {

		System.out.println(" Name : Jayashree");

	}

	@Override
	void ifsc() {

		System.out.println(" IFSC No : SBI009765");

	}

	@Override
	void mobile() {

		System.out.println(" Mobile No :9876543210");

	}

	@Override
	void address() {

		System.out.println(" Address : Chennai");

	}

	@Override
	void password() {

		System.out.println(" Password : As@3424");

	}

	public static void main(String[] args) {

		Manager m = new Manager();

		System.out.println(" Customer Detail");
		System.out.println("******************");

		m.acc_No();
		m.name();
		m.mobile();
		m.ifsc();
		m.address();
		m.password();

	}

}
