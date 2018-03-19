package swabhav.techlabs.crud.test;

import com.techlab.com.CustomerDB;
import com.techlab.com.EmployeeDB;
import com.techlab.com.ICRUD;
import com.techlab.com.OrderDB;

public class Test {

	public static void main(String[] args) {
		doManageOperation(new EmployeeDB());
		doManageOperation(new CustomerDB());
		doManageOperation(new OrderDB());

		ICRUD[] crud = new ICRUD[3];
		crud[0] = new EmployeeDB();
		crud[1] = new CustomerDB();
		crud[2] = new OrderDB();

		for (int i = 0; i < crud.length; i++) {
			doManageOperation(crud[i]);

		}

	}

	private static void doManageOperation(ICRUD ob) {
		System.out.println("Doing different DB operation");
		ob.add();
		ob.create();
		ob.get();
		ob.read();
		ob.select();

	}

}
