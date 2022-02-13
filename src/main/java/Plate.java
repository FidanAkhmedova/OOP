public class Plate {
    private int food;

    public Plate(int food){
        this.food = food;
    }
    public boolean decreaseFood(int n){
        if (food >= n && n >= 3) {
            food -= n;
            return true;
        }
        return false;
    }
    public void info(){
        System.out.println("Plate " + food);
    }
    public void increaseFood(int n){
        food += n;
        System.out.println("Increasing food on " + n);
    }
}
