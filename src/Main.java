import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Circle[] list = new Circle[3];
        // سه حالت مختلف برای پر کردن این آرایه
        //list[0] = new Circle(2);
        //list[1] = new Circle(5);
        //list[2] = new Circle(4);
        int j = 0;
        for (Circle c : list) {
            list[j++] = new Circle(new Random().nextInt(1, 11)); //از یک تا ده میره
            
        }
        //for (int i = 0; i < list.length; i++) {
        //    list[i] = new Circle(new Random().nextInt(1, 10));
        //}

        Sort s = new Sort();
        s.setList(list);
        s.operate();
        for (int i = 0; i < 3; i++) {
            System.out.println(list[i]);
        }
    }
}