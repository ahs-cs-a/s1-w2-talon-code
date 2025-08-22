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

    public void setName(String n){
        name = n;
    }

    public void setlargestDiameter(int diameter){
        largestDiameter = diameter;
    }

      public void setavgDepth(String depth){
        avgDepth = depth;
    }

    public void setisSaltWater(int salt){
        isSaltWater = salt;
    }

}

