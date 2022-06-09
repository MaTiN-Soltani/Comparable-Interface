public class Main {
    public static void main(String[] args) {
        Circle[] list = new Circle[3];
        list[0] = new Circle(2);
        list[1] = new Circle(5);
        list[2] = new Circle(4);

        Sort s = new Sort();
        s.setList(list);
        s.operate();
        for (int i = 0; i < 3; i++) {
            System.out.println(list[i]);
        }
    }
}