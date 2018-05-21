public class Customer {
    private String name;
    private String type;
    private int age;
    private int height;
    private int money;

    public Customer(String name, String type, int age, int height, int money) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.height = height;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getAge(){
        return age;
    }

    public int getHeight(){
        return height;
    }

    public int getMoney(){
        return money;
    }
}
