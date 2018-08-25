import pattern.RedShapeDecorator;
import shape.Circle;
import shape.Shape;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("### draw shape normal");
		
		Shape circle = new Circle();
		circle.draw();
		
//		Shape rectangle = new Rectangle();
//		rectangle.draw();
		
		System.out.println("### draw shape with dacorator");
		
		Shape redCircle = new RedShapeDecorator(new Circle());
		redCircle.draw();
		
//		Shape redRectangle = new RedShapeDecorator(new Rectangle());
//		redRectangle.draw();
	}

}
