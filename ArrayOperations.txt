import java.util.Scanner;

public class ArrayOperations {
	static ArrayNonStaticMethods ob = new ArrayNonStaticMethods();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Size");
		int size = sc.nextInt();
		int a[] = new int[size];
		for (int i = 0; i < a.length; i++) {
			System.out.println("Enter Element:" + (i + 1));
			a[i] = sc.nextInt();
		}
		boolean bool = true;
		while (bool) {

			System.out.println("1:Insert");
			System.out.println("2:InsertAll");
			System.out.println("3:Delete");
			System.out.println("4:DeleteAll");
			System.out.println("5:Update");
			System.out.println("6:UpdateAll");
			System.out.println("7:Ascending");
			System.out.println("8:descending");
			System.out.println("9:Reverse");
			System.out.println("10:Occurence");
			System.out.println("11:Maximum");
			System.out.println("12:Minimum");
			System.out.println("13:FirstOccurence");
			System.out.println("14:LastOccurence");
			System.out.println("15:Display");
			System.out.println("16:Clear");
			System.out.println("17:Size");
			System.out.println("18:Isempty");
			System.out.println("19:Sum");
			System.out.println("20:Product");
			System.out.println("21:Avereage");
			System.out.println("22:Exit");
			System.out.println("Choose Any Option");
		
			int option = sc.nextInt();
			switch (option) {
			case 1: {
				System.out.println("Enter  new Element ");
				int ele = sc.nextInt();
				System.out.println("Enter Position ");
				int pos = sc.nextInt();
				a = ob.insert(a, pos, ele);
				ob.display(a);
				break;
			}
			case 2: {
				System.out.println("Enter  new Element size to Insert ");
				int s1 = sc.nextInt();
				int b[] = new int[s1];
				for (int i = 0; i < a.length; i++) {
					System.out.println("Enter Elements" + (i + 1));
					b[i] = sc.nextInt();
				}
				a = ob.insetAll(a, b);
				ob.display(a);
				break;
			}
			case 3: {
				System.out.println("Enter Element ");
				int ele = sc.nextInt();
				a = ob.delete(a, ele);
				ob.display(a);
				break;
			}
			case 4: {
				System.out.println("Enter  Element");
				int ele = sc.nextInt();
				a = ob.deleteAll(a, ele);
				ob.display(a);
				break;
			}
			case 5: {
				System.out.println("Enter the Old Element");
				int old_element = sc.nextInt();
				System.out.println("Enter the New Element");
				int new_element = sc.nextInt();
				System.out.println("Enter Position");
				int pos = sc.nextInt();
				ob.update(old_element, a, new_element);
				break;
			}
			case 6: {
				System.out.println("Enter the Old Element");
				int old_element = sc.nextInt();
				System.out.println("Enter the New Element");
				int new_element = sc.nextInt();
				System.out.println("Enter Position");
				int pos = sc.nextInt();
				ob.UpdateAll(a, pos, old_element, new_element);
//			 ob.display(a);
				break;
			}
			case 7: {
				a = ob.Accending(a);
				ob.display(a);
				break;
			}
			case 8: {

				a = ob.descending(a);// where ever we are returning anything we need to store in same array
				ob.display(a);
				break;
			}
			case 9: {
				a = ob.reverse(a);
				ob.display(a);
				break;
			}
			case 10: {
				System.out.println("Enter Element");
				int ele = sc.nextInt();
				System.out.println(ob.occurence(a, ele));
				break;
			}
			case 11: {
				System.out.println("Maximum Is :" + ob.maximum(a));
				break;
			}
			case 12: {
				System.out.println("Minimum is :" + ob.minimum(a));
				break;
			}
			case 13: {
				System.out.println("Enter the element");
				int ele = sc.nextInt();
				int ind = ob.firstOccurance1(a, ele);
				if (ind == -1) {
					System.out.println("Element Not Found");
				} else {
					// System.out.println("Firstoccurance is :" + ob.firstOccurance1(a, ele));
					System.out.println("Firstoccurance is :" + (ind + 1));
				}
				break;

			}
			case 14: {
				System.out.println("Enter the element");
				int ele = sc.nextInt();
				int ind = ob.lastOccurance(a, ele);
				if (ind == -1) {
					System.out.println("Element Not Found");
				} else {
					// System.out.println("Lastoccurance is :" + ob.lastOccurance(a, ele));
					System.out.println("Lastoccurance is :" + (ind + 1));
				}
				break;

			}
			case 15: {
				ob.display(a);
				break;
			}
			case 16: {
				a = ob.clear(a);
				ob.display(a);
				break;
			}
			case 17: {
				System.out.println("Size is :" + ob.size(a));
				break;
			}
			case 18: {
				if (ob.isEmpty(a)) {
					System.out.println("Array is Empty");
				} else {
					System.out.println("Array is not  Empty");
				}
				break;
			}
			case 19: {
				System.out.println("sum of Array is :" + ob.sum(a));
				break;
			}
			case 20: {
				System.out.println("Product of Array is:" + ob.product(a));
				break;
			}
			case 21: {
				System.out.println("Averege of Array is:" + ob.avg(a));
				break;

			}
			case 22: {
				bool = false;
				break;
				// or System.exit(0);
				// or
				// return ;
			}
			default: {
				System.out.println("Invalid option");
			}
			}

	}

	}
}
