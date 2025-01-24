package test;

public abstract class Vehicle {
    private int speed;

    public abstract void accelerate();

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
