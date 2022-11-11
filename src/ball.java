public class ball {
    private int x;
    private int y;
    private int vx = 1;
    private int vy = 1;

    public ball(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void move(){
        x += vx;
        y += vy;
    }

    public void bounce(){
        vy = vy*-1;
    }
    public void bounce(paddle p){
        if (x <= p.getX() + p.getW()/2 || x >= p.getX() - p.getW()/2){
            vx = vx*-1;
        }

    }
    public int getBX(){
        return x;
    }
    public int getBY(){
        return y;
    }

}
