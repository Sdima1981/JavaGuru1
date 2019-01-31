package homework.circle;

public class TestCircle extends Circle {

    public static void main(String[] args) {

        Circle myTestCircle = new Circle ();
        myTestCircle.setRadius (2);

        System.out.println ("Окружность круга с радиусом " + myTestCircle.radius + " см Равна " + myTestCircle.calculateArea () + "см");

    }
}
