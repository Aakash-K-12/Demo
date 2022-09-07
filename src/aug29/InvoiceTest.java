package aug29;

import java.util.*;

class Invoice {
	String partnum;
	String partdesc;
	int quantity;
	double priceperitem;

	Invoice(String partnum, String partdesc, int quantity, double priceperitem) {
		this.partnum = partnum;
		this.partdesc = partdesc;
		this.quantity = quantity;
		this.priceperitem = priceperitem;
	}

	void set_partnum(String partnum) {
		this.partnum = partnum;
	}

	void set_partdescription(String partdesc) {
		this.partdesc = partdesc;
	}

	void set_quantity(int quantity) {
		this.quantity = quantity;
	}

	void set_price(double priceperitem) {
		this.priceperitem = priceperitem;
	}

	String get_partnum() {
		return partnum;
	}

	String get_partdescription() {
		return partdesc;
	}

	int get_quantity() {
		return quantity;
	}

	double get_priceperitem() {
		return priceperitem;
	}

	double getInvoiceAmount() {
		return quantity * priceperitem;
	}
}

public class InvoiceTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Invoice in = new Invoice("123", "abc", 10, 5);

		System.out.println(" Enter part number , part description, quantity , price per item");
		String partnum = sc.nextLine();
		String partdesc = sc.nextLine();
		int q = sc.nextInt();

		if (q < 0) {
			q = 0;
		}

		double pr = sc.nextDouble();

		if (pr < 0) {
			pr = 0;
		}

		in.set_partnum(partnum);
		in.set_partdescription(partdesc);
		in.set_quantity(q);
		in.set_price(pr);

		System.out.println("Part Number:" + in.get_partnum());
		System.out.println("Part description:" + in.get_partdescription());
		System.out.println("Quantity:" + in.get_quantity());
		System.out.println("Pice per Item:" + in.get_priceperitem());

		// TODO Auto-generated method stub

	}

}
