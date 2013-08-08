
package examples;

interface MonsterStats {
	int DAMAGE = 10;
	int HEALTH = 100;
}

abstract class TwoDShape {
	private double width;
	private double height;
	private String name;
	
	TwoDShape() {
		setWidth(setHeight(0.0));
		setName("none");
	}
	
	TwoDShape(double w, double h, String n) {
		setWidth(w);
		setHeight(h);
		setName(n);
	}
	
	/**
	 * @return the width
	 */
	public double getWidth() {
		return width;
	}

	/**
	 * @param width the width to set
	 */
	public void setWidth(double width) {
		this.width = width;
	}

	/**
	 * @return the height
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * @param height the height to set
	 */
	public double setHeight(double height) {
		this.height = height;
		return height;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	abstract double area();
}

class Circle extends TwoDShape {
	private String style;
	
	Circle(double w, double h, String s) {
		super(w, h, "Circle");
		style = s;
	}
	
	String getStyle() { return style; }
	
	double area() {
		return getWidth() * getHeight();
	}
}

public class Example {
	
	
	public static void main(String[] args) {
		
		Circle c = new Circle(10, 10, "Bilog");
		System.out.println(c.getWidth() + " " + c.getHeight() + " " + c.getStyle());
		/*
		StringBuffer str = new StringBuffer();
		StringBuffer str2 = new StringBuffer();
		str = str2;
		str.append("halo");
		System.out.println(str);
		System.out.println("-" + str2);
		if(str == str2) System.out.println("==");
		
		if(str.equals(str2)) System.out.println("equals");
		
		short i = 123;
		i >>= 1;
		int[] arr = {1, 2, 3};
		System.out.println("hello".charAt(2) + " " + i);
		System.out.println(arr[-1]);
		*/
		
		
	}

}
