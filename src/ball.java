public class ball {
    int x;
    int y;
    int vx = 1;
    int vy = 1;

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
        if (p.getY() == y){
            vx = vx*-1;
        }

    }

}
