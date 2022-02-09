public class Dog extends Animal{
    public  static int k = 0;
    public Dog(String name){
        super(name);
        this.k = k+1;
        System.out.println(countOfDog(k));
    }
    public int countOfDog(int k){
       // k = k+1;
        System.out.println("Dog number" + k);
        return k;
    }
    @Override
    public void run(int obstacleLength) {
        if (obstacleLength <= 500)
            super.run(obstacleLength);
        else System.out.println("Dog can't run more than 500 m.");
    }

    @Override
    public void swim(int obstacleLength) {
        if (obstacleLength <= 10)
            super.swim(obstacleLength);
        else System.out.println("Dog can't swim more than 10 m.");
    }
}
