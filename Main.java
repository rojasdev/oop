
public class Main{

        public static void main(String[] args) {

                Human humanOne = new Human("Maria");
                Human humanTwo = new Human(("Jose"));
                humanOne.setAge(20);
                humanOne.setColor("Brown");
                humanOne.setGender("Female");
                System.out.println(humanOne.getName());
                System.out.println(humanOne.getYear());
                System.out.println(humanOne.getColor());
                System.out.println(humanOne.getGender());
                humanOne.run();
                humanOne.jump();

        }
}
