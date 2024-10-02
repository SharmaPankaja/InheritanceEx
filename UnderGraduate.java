package AssInheritance;

public class UnderGraduate extends Degree{
	public void getDegree()
	{
		System.out.println("I am an UnderGraduate.....");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Degree degree = new Degree();
		degree.getDegree();
		PostGraduate pg=new PostGraduate();
		pg.getDegree();
		UnderGraduate ug=new UnderGraduate();
		ug.getDegree();
		
	}

}
