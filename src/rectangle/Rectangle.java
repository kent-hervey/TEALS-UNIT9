package rectangle;

class Rectangle
{
    private int length;
    private int width;

    public Rectangle()
    {
       length = 1;
       width = 1;
    }

    public Rectangle(int l, int w)
    {
       length = l;
       width = w;
    }

    public void draw()
    {
      for(int i=0; i < length; i++)
      {
         for(int j=0; j < width; j++)
             System.out.print("* ");
          System.out.println();
      }
      System.out.println();
    }

    public void area() {
    	int area = this.length * this.width;
    	System.out.println("area is:  " + area);
    	
    }

    public String getSides() {
    	return "length:  " + this.length + ", and width is:  " + this.width;
    }
    
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}
    
    
    
}

