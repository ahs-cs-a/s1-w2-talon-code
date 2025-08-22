public class BodyOfWaterMain {
    public static void main(String[] args) {
        BodyOfWater b = new BodyOfWater("Talon", 18, 5.7, true);
        System.out.println("here");

        BodyOfWater b1 = new BodyOfWater("Finn", 25, 5.9, false);
        b1.setName("China");
        b.printState();
        b1.printState();
    }


}
