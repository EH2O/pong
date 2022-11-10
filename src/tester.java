public class tester {
    public static void main(String[] args) {
        int x = 0;
        ball b = new ball(10,10);
        for (int i = 0; i < 1000000; i++) {
            b.move();
            if (b.y > 10 || b.y < 0){
                b.bounce();
                x++;
            }
        }
        System.out.println(x);
    }
}
