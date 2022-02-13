    public class Main {
        public static void main(String[] args) {
            Cat cat = new Cat("Barsik", 5);
            Plate plate = new Plate(100);
            plate.info();
            cat.eat(plate);
            plate.info();
            System.out.println("/////////////////");
            Cat[] cats = {
                    new Cat("Lyolik", 4),
                    new Cat("Egg", 2),
                    new Cat("Misa", 3),
                    new Cat("Garfield", 10),
                    new Cat("Tom", 1)
            };
            for (Cat cat1 : cats) {
                cat1.eat(plate);
                System.out.println(cat1.getName() + ", " + cat1.isSatiety());
            }
            plate.increaseFood(5);
        }

}
