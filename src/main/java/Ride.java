public class Ride {
    private String name;
    private String type;
    private int minAge;
    private int minHeight;

    public Ride(String name, String type, int minAge, int minHeight) {
        this.name = name;
        this.type = type;
        this.minAge = minAge;
        this.minHeight = minHeight;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getMinAge(){
        return minAge;
    }

    public int getMinHeight(){
        return minHeight;
    }
}
