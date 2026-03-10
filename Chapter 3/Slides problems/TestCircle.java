public class TestCircle{
    public static void main(String args) {
        Circle c1 = new Circle();
        System.out.printf("The area of the first circle of radius %.2f is %.2f\n", c1.radius, c1.getArea());
        Circle c2 = new Circle(25);
        System.out.printf("The area of the second circle of radius %.2f is %.2f\n", c2.radius, c2.getArea());
        Circle c3 = new Circle(125);
        System.out.printf("The area of the third circle of radius %.2f is %.2f\n", c3.radius, c3.getArea());
        c2.radius = 100;
        System.out.printf("The area of the second circle of radius %.2f is %.2f\n", c2.radius, c2.getArea());
    }
}
}
