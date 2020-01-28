package generics;

public class Car {  //implements Comparable<Car> 
	protected int speed;
	protected int price;
	protected String color;
	
	public Car(int speed, int price, String color) {
		super();
		this.speed = speed;
		this.price = price;
		this.color = color;
	}

	@Override
	public String toString() {
		return "Car [speed=" + speed + ", price=" + price + ", color=" + color + "]";
	}

//	@Override
//	public int compareTo(Car other) {
//		// TODO Auto-generated method stub
////		return this.speed - other.speed;
////		return other.price - this.price;
//		return this.color.compareTo(other.color);
//	}
}
