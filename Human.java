public class Human {
    int age;
    String gender;
    String color;
    String name;
    private int year;

    public Human(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getGender() {
        return gender;
    }

    public String getColor() {
        return color;
    }

    public String getName(){
        return name;
    }

    public int getYear(){
        year = 2022 - age;
        return year;
    }

    public void run(){
        System.out.println("The human is running.");
    }
    public void jump(){
        System.out.println("The human is jumping.");
    }

}
