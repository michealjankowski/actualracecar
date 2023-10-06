import java.util.Random;

public class racetrack {
    private static int INITIAL_SPEED_MIN = 105;
    private static int INITIAL_SPEED_MAX = 110;
    private static int DISTANCE_TO_FINISH = 500;
    private static int MILLIDELAY = 1000;

    public static void main(String[] args) {
        car honda = new car("honda", getRandomSpeed());
        car dodge = new car("dodge", getRandomSpeed());

        System.out.println("Initial Information:");
        System.out.println(honda);
        System.out.println(dodge);
        System.out.println("LET THE RACE BEGIN!\n");

        while (honda.getDistancetraveled() < DISTANCE_TO_FINISH && dodge.getDistancetraveled() < DISTANCE_TO_FINISH) {
            race(honda, dodge);
            try {
                Thread.sleep(MILLIDELAY);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


        String winner;
        if (honda.getDistancetraveled() >= DISTANCE_TO_FINISH && dodge.getDistancetraveled() >= DISTANCE_TO_FINISH) {
            winner = (honda.getDistancetraveled() > dodge.getDistancetraveled()) ? honda.getBrand() : dodge.getBrand();
        }if (honda.getDistancetraveled() == dodge.getDistancetraveled()) {
            winner = "It's a tie!";
        }else{
            winner = (honda.getDistancetraveled() >= DISTANCE_TO_FINISH) ? honda.getBrand() : dodge.getBrand();
        }
        System.out.println(winner + " WON THE RACE");
    }
    private static int getRandomSpeed() {
        Random random = new Random();
        return random.nextInt(INITIAL_SPEED_MAX - INITIAL_SPEED_MIN + 1) + INITIAL_SPEED_MIN;
    }
    private static void race(car vehicle1, car vehicle2){
        int speed1 = vehicle1.getSpeed();
        int speed2 = vehicle2.getSpeed();

        vehicle1.updateDistance(speed1);
        vehicle2.updateDistance(speed2);

        System.out.println(vehicle1);
        System.out.println(vehicle2);
    }

}
