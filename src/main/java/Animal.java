    public class Animal {
    public int obstacleLength;
    public String name;
    public static int k = 0;


    public Animal(String name){
        this.name = name;
        Animal.k++;
        System.out.println("\nAnimal number " + (Animal.k));
    }
    public void run(int obstacleLength) {
        System.out.println(name + " пробежал " + obstacleLength + "м");
    }

    public void swim(int obstacleLength) {
        System.out.printf("%s проплыл %dм", name, obstacleLength);
        System.out.println();
    }


    public static void main(String[] args) {

        Animal animal = new Animal("Jerry");
        animal.run(123);
        animal.swim(598);
        Cat cat1 = new Cat("Garfield");
        Cat cat2 = new Cat("Tom");
        Dog dog1 = new Dog("Rex");
        Dog dog2 = new Dog("Bobby");
        Dog dog3 = new Dog("Tuzik");
        System.out.println("\nNumber of animals is  " + (Animal.k));

    }

}