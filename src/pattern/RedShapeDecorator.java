package pattern;

import shape.Circle;
import shape.Shape;

public class RedShapeDecorator implements ShapeDecorator {
	Shape decorator;

	public RedShapeDecorator(Shape decorator) {
		this.decorator = decorator;
	}

	@Override
	public void draw() {
		decorator.draw();
		System.out.println("Color: Red");
	}

}
