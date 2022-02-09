    abstract public class Animal {
    public int obstacleLength;
    public String name;
    public static int k = 0;


    public Animal(String name){
        this.name = name;
        Animal.k++;
       // System.out.println("\nAnimal number " + (Animal.k));
    }
    abstract public void run(int obstacleLength);

    abstract public void swim(int obstacleLength);

    public static void main(String[] args) {

        Cat cat1 = new Cat("Garfield");
        Cat cat2 = new Cat("Tom");
        Dog dog1 = new Dog("Rex");
        Dog dog2 = new Dog("Bobby");
        Dog dog3 = new Dog("Tuzik");
        System.out.println("\nNumber of animals is  " + (Animal.k));
        System.out.println();
        cat1.run(122);
        dog3.run(200);
        cat2.swim(154);
        dog1.swim(10);


    }

}