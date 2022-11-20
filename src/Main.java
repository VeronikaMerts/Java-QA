
public class Main {
    public static void main(String[] args) {
      Person tom = new Person("Tom", 25);
      Person betty = new Person("Betty", 28);



        Phone apple = new Phone(12345, "12Pro", 250);
        Phone nokia = new Phone(54321, "c30", 280);
        Phone xiaomi = new Phone(67890, "9c", 310);
        System.out.println(apple.getNumber() + "" + apple.getModel() + "" + apple.getWeight());
        System.out.println(nokia.getNumber() + "" + nokia.getModel() + "" + nokia.getWeight());
        System.out.println(xiaomi.getNumber() + "" + xiaomi.getModel() + "" + xiaomi.getWeight());

        apple.reciveCall("Tom");
        nokia.reciveCall("Betty");
        xiaomi.reciveCall("David");
    }


}

