/**
 * 
 */
package circle;

/**
 * @author Michael Dadi
 *
 */


public class Circle extends GraphicObject implements Cloneable {

	// No use of encapsulation
	public double centerX, centerY;
	public double radius;
	public int windowNumber;

	/**
	 * 
	 */
	public Circle() {
	}

	// overloaded method in Circle
	// overridden method from GraphicObject
	@Override
	void draw() {
		System.out.println("Drawing a Circle...");
	}

	// overloaded method in Circle
	// Not overridden as it does follow the signature in GraphicObject
	public void draw(int color) {
		System.out.println("Drawing a Circle in color...");
	}

	public double circumference() {
		return 2.0 * 3.141529 * radius;
	}

	public double area() {
		return 3.141529 * radius * radius;
	}

	public boolean overlaps(Circle other) {
		return ((centerX - other.centerX) * (centerX - other.centerX)
				+ (centerY - other.centerY) * (centerY - other.centerY)) < ((radius + other.radius)
						* (radius + other.radius));
	}

	@Override
	void moveTo(int newX, int newY) {
	}

	@Override
	public String toString() {
		return "Circle: centerX = " + centerX + " centerY = " + centerY + " radius = " + radius;
	}

	@Override
	public boolean equals(Object obj) {
		// If obj is compared with itself
		if (obj == this) {
			return true;
		}
		// If obj is not a Circle object
		if (!(obj instanceof Circle)) {
			return false;
		}
		// Cast obj to Circle to compare vals
		Circle c = (Circle) obj;
		// Compare vals and return
		return Double.compare(centerX, c.centerX) == 0
				&& Double.compare(centerY, c.centerY) == 0
				&& Double.compare(radius, c.radius) == 0;
	}

	/**
	 * @return an exact copy of the Circle that is a new instance 
	 */
	 @Override
	 protected Object clone() throws CloneNotSupportedException {
		 Circle c2 = new Circle();
		 c2.centerX = centerX;
		 c2.centerY = centerY;
		 c2.radius = radius;

		 return c2;
	 }
}
