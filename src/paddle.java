public class paddle {
    int x;
    int y;
    int width = 10;

    public paddle(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }
    public int getY(){
        return y;
    }

    public void MoveUp(int y) {
        this.y = y;
    }
    public int GetWidth() {
        return width;
    }
    public void MoveDown(int y) {
        this.y -= y;
    }
}
