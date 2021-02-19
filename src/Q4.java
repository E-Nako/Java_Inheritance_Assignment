
public class Q4 {

	public static void main(String[] args) {
		 Rectangle r = new Rectangle(2,6);
		    r.printArea();
		    r.printPerimeter();

		    Square s = new Square(2);
		    s.printArea();
		    s.printPerimeter();
		    

		    Square[] a = new Square[10];
		    int q = 5;
		    for(int i = 0;i<10;i++){
		      a[i] = new Square(q);
		      q++;
		    }

		    for(int i = 0;i<10;i++){
		      a[i].printArea();
		      a[i].printPerimeter();
		    }
		  }
	}


