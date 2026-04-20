package main.java.ch03_class.basic.sec09;

public class Car {
    String model;
    int speed;

    public void run() {
        System.out.println(model + "가 달립니다.(시속: " + speed + "km/h)");
    }

    public Car() {
    }

    public Car(String model) {
        this.model = model;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
