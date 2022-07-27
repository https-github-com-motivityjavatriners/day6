package org;

class Vechicle  {
    public void speed(){
        System.out.println("speed is : ");

    }
}
 class Car extends Vechicle{
    public void speed(){
        System.out.println("Car speed is 80kms");
    }
}
class Bus extends Vechicle{
    public void speed(){
        System.out.println("Bus speed is 60 kms");
    }
}
public class Overridding {
    public static void main(String[] args) {
        Vechicle vechicle=new Vechicle();
        vechicle.speed();
        vechicle=new Bus();
        vechicle.speed();
        vechicle=new Car();
        vechicle.speed();
    }
}