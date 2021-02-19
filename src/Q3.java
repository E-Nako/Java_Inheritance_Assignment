class Rectangle{
  int length;
  int breadth;

  public Rectangle(int l, int b){
    length = l;
    breadth = b;
  }

  public void printArea(){
    System.out.println(length*breadth);
  }

  public void printPerimeter(){
    System.out.println((2*length)+(2*breadth));
  }
  
}

class Square extends Rectangle{
	  int side;
	  public Square(int s){
	    super(s,s);
	  }
	}
public class Q3 {

	public static void main(String[] args) {
		 Rectangle r = new Rectangle(2,6);
		    r.printArea();
		    r.printPerimeter();

		    Square s = new Square(2);
		    s.printArea();
		    s.printPerimeter();

	}

}
