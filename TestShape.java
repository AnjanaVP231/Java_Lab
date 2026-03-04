public class TestShape {
	static class Shape {
	    void draw() {
		System.out.println("Drawing a shape");
	    }
	}

	static class Circle extends Shape {
	    
	    void draw() {
		System.out.println("Drawing a circle");
	    }
	}

	static class Rectangle extends Shape {
	    
	    void draw() {
		System.out.println("Drawing a rectangle");
	    }
	}


   	public static void main(String[] args) {

		Shape s;

		s = new Circle();
		s.draw();

		s = new Rectangle();
		s.draw();
    	}
}
