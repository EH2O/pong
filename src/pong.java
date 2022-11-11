public class pong {
    ball b;
    paddle p1;
    paddle p2;
    int width = 100;
    int height = 100;

    public pong(int H, int W){
        this.width = W;
        this.height = H;
        b = new ball(H/2, W/2);
        p1 = new paddle(2, H/2);
        p2 = new paddle(W-2, H/2);
    }

    public void update(){
        b.move();
        checkCollision();
    }
    public void checkCollision(){
        if(b.getBY() > height || b.getBY() < height){
            b.bounce();
        }
        if (b.getBX() >= width-4){
            b.bounce(p2);
        }
        if (b.getBX() <= 3){
            b.bounce(p1);
        }
    }

}
