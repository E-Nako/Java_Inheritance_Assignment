
class Base{
	void Show() {
		System.out.println("This is parent class");
	}
}

class Derived extends Base{
	void display() {
		System.out.println("This is child class");
	}
}

class Q1{
	public static void main(String[] args) {
		Base b = new Base();
		Derived d = new Derived();
		
		b.Show();
		d.display();
		d.Show();
	}
}