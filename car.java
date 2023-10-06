import java.util.Random;

public class car {
    private String brand;
    private int speed;
    private int distancetraveled;
    public String Getbrand(){
        return brand;
    }
    public String getBrand(){
        return brand;
    }

    public int getSpeed(){
        return speed;
    }

    public int getDistancetraveled(){
        return distancetraveled;
    }

    public car(String brand,int speed){
        this.brand = brand;
        this.speed = speed;
        distancetraveled = 0;
    }
    public void updateDistance(int speed) {
        if (speed >= 0) {
            distancetraveled += speed;
        }
    }
        @Override
         public String toString(){ return "car " + brand + " Speed: " + speed + " km/h, Distance Traveled: " + distancetraveled + " km";}


}

