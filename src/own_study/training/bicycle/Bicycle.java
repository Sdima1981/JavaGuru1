package own_study.training.bicycle;

class Bicycle {
    String make;
    int frame;
    String color;
    int weight;
    double speed;

    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle ();

        bicycle.color = "Yellow as a submarine";
        bicycle.frame = 19;
        bicycle.make = "DRAG";
        bicycle.speed = 15.0;
        bicycle.weight = 9;

        System.out.println (bicycle.speed);
        System.out.println (bicycle.color);
        System.out.println (bicycle.frame);
        System.out.println (bicycle.make);
        System.out.println (bicycle.weight);

        bicycle.roll ();

    }

    public void roll() {
        System.out.println (speed + " this is speed I`m rolling on");
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getFrame() {
        return frame;
    }

    public void setFrame(int frame) {
        this.frame = frame;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
}
