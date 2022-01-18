package test;

import java.util.List;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

final class A {

	int i;
	int j;

	A(int i, int j) {
		this.i = i;
		this.j = j;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "(" + i + "," + j + ")";
	}
}

class book implements Serializable {
	String title;
	int price;
	transient A y;

	public book(String title, int price) {
		super();
		this.title = title;
		this.price = price;
		this.y = new A(1, 2);
	}

	private void writeObject(ObjectOutputStream oos) throws IOException {
		System.out.println("hello");
		oos.defaultWriteObject();
		oos.writeInt(8);
	}

	private void readObject(ObjectInputStream ois) throws ClassNotFoundException, IOException {
		System.out.println("hero");
		ois.defaultReadObject();
		this.y = new A(ois.readInt(), 8);
	}
	                                                   
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "title:" + title + "price:" + price + " y:" + y;
	}
}     

public class ser {
                                                                   
	public static void main(String[] args) {
                                                   
//		try {                        
//			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("serializable.txt"));
//			book b = new book("let us c", 400);
//			oos.writeObject(b);
//		} catch (FileNotFoundException ex) {                                               
//
//		} catch (IOException ex) {
//     
//		}

//		System.out.println("hero");
		                  
		             
//		try {  
//			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("serializable.txt"));
//			book e = (book) ois.readObject();
//			System.out.println("yoyo");
//			System.out.println(e);                                     
//		} catch (FileNotFoundException ex) {
//			System.out.println(ex);                   
//		} catch (IOException ex) {
//			System.out.println(ex);            
//		} catch (ClassNotFoundException e) {
//			System.out.println(e);
//		}
		                                  
//		BufferedInputStream br=new BufferedInputStream(new FileInputStream("sahil.txt"));
//		BufferedOutputStream bw=new BufferedOutputStream(new FileOutputStream("harshul.txt"));

//		int i = 0;
//		while ((i = fr.read()) != -1) {
//			fw.write(i);
//		}
//		fw.close();

//		try {
//
//			FileInputStream fr = new FileInputStream("sahil.txt");
//
//			FileOutputStream fw = new FileOutputStream("harshul.txt");
//
//			int i = 0;
//
//			while ((i = fr.read()) != -1) {
//				fw.write(i);
//			}
//			fw.close();
//		} catch (FileNotFoundException ex) {
//			System.out.println(ex);
//		} catch (IOException ex) {
//
//		}

		try {
			BufferedInputStream br = new BufferedInputStream(new FileInputStream(new File("sahil.txt")));
			BufferedOutputStream bw = new BufferedOutputStream(new FileOutputStream(new File("harshul.txt")));

			int i = 0;
			while ((i = br.read()) != -1) {

				bw.write(i);
			}
			bw.close();

		} catch (FileNotFoundException ex) {
			System.out.println(ex);
		} catch (IOException ex) {
			System.out.println(ex);
		}
//		List<Employee1> list = new ArrayList<>();
//		Employee1 e1 = new Employee1(15, "harshul", "jind", 1000000.00);
//		Employee1 e2 = new Employee1(10, "sahil", "jind", 1000000.00);
//		Employee1 e3 = new Employee1(1, "gagan", "jind", 1000000.00);
//		Employee1 e4 = new Employee1(100, "akshat", "jind", 1000000.00);
//
//		list.add(e1);
//		list.add(e2);
//		list.add(e3);
//		list.add(e4);
//		System.out.println(list);
//		Collections.sort(list, new employeeComparator());
//		System.out.println(list);
	}
}
