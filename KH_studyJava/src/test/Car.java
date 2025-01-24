package test;

public class Car extends Vehicle{

    @Override
    public void accelerate(){
        setSpeed(getSpeed()+10);
    }
}
