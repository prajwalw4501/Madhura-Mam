package fruitsassignment;

import java.util.Scanner;

public class Basket {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of basket: ");
		int sz = sc.nextInt();
		Fruits f[] = new Fruits[sz];
//		Scanner sc=new Scanner(System.in);
		int choice = 0;
		int c = 0;
		while (choice != sz) {
			System.out.println(" --MENU--");
			System.out.print("1.ADD Apple\n2.ADD Orange\n3.ADD Mango\n4.Display Fruits\n5.Display " + "fresh Fruits"
					+ "\n6.Stale Fruits \n7.Special Functionality\n8.Exit!");
			choice = sc.nextInt();
			switch (choice) {

			case 1:
				if (c < sz) {
//				String name; String color; double weight; String loc;
//				System.out.println("Enter the Name,Color,Weight,Speciality");
//				name=sc.next();
//				color=sc.next();
//				weight=sc.nextDouble();
//				loc=sc.next();
					f[c] = new Apple("Apple", "Red", 15, "Kashmir");

					c++;
				}
				break;
			case 2:
				if (c < sz) {
//				String name; String color; double weight; String loc;
//				System.out.println("Enter the Name,Color,Weight,Speciality");
//				name=sc.next();
//				color=sc.next();
//				weight=sc.nextDouble();
//				loc=sc.next();
					f[c] = new Orange("Orange", "Orange", 20, "Nagpur");
					c++;
				}
				break;
			case 3:
				if (c < sz) {
//				String name; String color; double weight; String loc;
//				System.out.println("Enter the Name,Color,Weight,Speciality");
//				name=sc.next();
//				color=sc.next();
//				weight=sc.nextDouble();
//				loc=sc.next();
					f[c] = new Mango("Mango", "Yellow", 25, "Ratnagiri");
					c++;
				}
				break;
			case 4:
				if (c < sz) {
					for (int k = 0; k < c; k++) {

						if (f[k] instanceof Apple) {
							((Apple) f[k]).toString();
						}

						if (f[k] instanceof Orange) {
							((Orange) f[k]).toString();
						}

						if (f[k] instanceof Mango) {
							((Mango) f[k]).toString();
						}
						System.out.println(f[k].toString());
					}
				}
				break;

			case 5:
				if (c < sz) {
					int ap = 0;
					int ma = 0;
					int or = 0;
					for (int j = 0; j < c; j++) {
						System.out.println(f[j].toString());
						System.out.println(f[j].taste());

						if (f[j] instanceof Apple) {
							
//							((Apple) f[j]).jam();
							ap++;
							

						}
						if (f[j] instanceof Mango) {
							((Mango) f[j]).taste();
//							((Mango) f[j]).pulp();
							ma++;

						}
						if (f[j] instanceof Orange) {
							((Orange) f[j]).taste();
//							((Orange) f[j]).juice();
							or++;

						}
					}
					System.out.println("Apple Quantity: " + ap);
					System.out.println("Mango Quantity: " + ma);
					System.out.println("Orange Quantity: " + or);
					System.out.println("Total Quantity: " + c);
				}
				break;
			case 6:// STALE
				if (c < sz) {
					for (int l = 0; l < c; l++) {
						if (f[l].taste().equals("SOUR")) {
							System.out.println("Fruit is Stale!");
						}
					}
				}

				break;
			case 7:
				if (c < sz) {
					for (int m = 0; m < c; m++) {
						if (f[m] instanceof Apple) {
							((Apple) f[m]).jam();
						}
						if (f[m] instanceof Mango) {
							((Mango) f[m]).pulp();
						}
						if (f[m] instanceof Orange) {
							((Orange) f[m]).juice();

						}
					}

				}
				break;
			case 8:
				if (c < sz) {
					System.out.println("EXITTT!");
					break;
				}
			}

		}
	}

}
