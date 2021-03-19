package rectangle;

public class RectangleApp {
	
    public static void main(String[] args) {
       Rectangle r = new Rectangle(3,5);
       r.draw();
       // 4. Uncomment these to test
        Square s1 = new Square();
        s1.draw();
        Square s = new Square(3);
        s.draw();
        
        s.area();
        
        r.area();
        
        Rectangle longRectangle = new LongRectangle(4);
        System.out.println("Length and width of longRectangle is:  " + longRectangle.getSides() );
        longRectangle.area();
        longRectangle.draw();
        
        
        
        
    }
}

	
