public class ClassesandObjects {
    public static void main(String[] args) {
      Person person1 = new Person();
      person1.name = "Роман";
      person1.age = 5;
      System.out.println("My name is "+person1.name+", I am "+person1.age);
    }
}
class Person{
    String name;
    int age;
    }
