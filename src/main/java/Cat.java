public class Cat extends Animal{
   // public String name;
public static int k = 0;
    public Cat(String name){
        super(name);this.k = k+1;
        System.out.println(countOfCat(k));
    }
    public int countOfCat(int k){

        System.out.println("Cat number" + k);
        return k;
    }
    @Override
    public void run(int obstacleLength) {
        if (obstacleLength <= 200)
            super.run(obstacleLength);
        else System.out.println("Cat can't run more than 200 m.");
    }


    @Override
    public void swim(int obstacleLength) {
        System.out.println("Cat can't swim.");
    }
}
