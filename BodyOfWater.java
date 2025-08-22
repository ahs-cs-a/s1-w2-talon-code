public class BodyOfWater{
    private String name;
    private int largestDiameter;
    private double avgDepth;
    private boolean isSaltWater;

    public BodyOfWater(String n, int diameter, double depth, boolean salt){
        name = n;
        largestDiameter = diameter;
        avgDepth = depth;
        isSaltWater = salt;
    }

    public BodyOfWater(String n, double depth){
        name = n;
        avgDepth = depth;
    }

    public void setName(String n){
        name = n;
    }

    public void setlargestDiameter(int diameter){
        largestDiameter = diameter;
    }

    public void setavgDepth(double depth){
        avgDepth = depth;
    }

    public void setisSaltWater(boolean salt){
        isSaltWater = salt;
    }

    public void printState(){
        System.out.println(name);
        System.out.println(largestDiameter);
        System.out.println(avgDepth);
        System.out.println(isSaltWater);
    }

}

