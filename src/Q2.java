class Member{
	
	String name;
	int age;
	String Phone_No;
	String Address;
	float Salary;
	
	void printSalary() {
		System.out.println("Salary: " + Salary);
	}

}

class Employee extends Member{
	String Specialization;
	
}

class Manager extends Member{
	String Department;
}

public class Q2 {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.name = "John";
		e1.age = 34;
		e1.Phone_No = "0245389741";
		e1.Address = "Adenta 1st Street";
		e1.Salary = 350f;
		
		Manager m1 = new Manager();
		m1.name = "Edna";
		m1.age = 27;
		m1.Phone_No = "0592979541";
		m1.Address = "Oyarifa Bus Stop";
		m1.Salary = 750f;

		System.out.println("Employee 1:");
		System.out.println("Name: "+e1.name+" "+"Age: "+e1.age+" "+"Contact: "+e1.Phone_No+" "+"Address: "+e1.Address);
		e1.printSalary();
		
		System.out.println(" ");
		
		System.out.println("Manager:");
		System.out.println("Name: "+m1.name+" "+"Age: "+m1.age+" "+"Contact: "+m1.Phone_No+" "+"Address: "+m1.Address);
		m1.printSalary();
	}
	

}
