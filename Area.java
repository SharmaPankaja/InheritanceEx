package AssInheritance;

public class Area {
	private
	int length,breadth,side;
	
	public 
	void printArea(int length,int breadth)
	{
		this.length=length;
		this.breadth=breadth;
		System.out.println("Area of Reactangle = "+length*breadth);
	}
	void printArea(int side)
	{
		this.side=side;
		System.out.println("Area of Square = "+side*side);
	}
	void printPerimeter(int length,int breadth)
	{
		this.length=length;
		this.breadth=breadth;
		System.out.println("Perimeter of Reactangle = "+2*(length+breadth));
	}
	void printPerimeter(int side)
	{
		this.side=side;
		System.out.println("Perimeter of Square = "+4*side);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Area a=new Area();
		
		a.printArea(4, 5);
		a.printPerimeter(4, 5);
		a.printArea(4);
		a.printPerimeter(4);

	}

}
