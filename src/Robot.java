public class Robot {
    int x;
    int y;
    Direction dir;

    public Robot (int x, int y, Direction dir) {
        this.x = x;
        this.y = y;
        this.dir = dir;
    }
    public Direction getDirection() {return dir;}
    public int getX() {return x;}
    public int getY() {return y;}
    public void turnLeft() {
        if (dir == Direction.DOWN) {dir = Direction.RIGHT;}
        else if (dir == Direction.LEFT) {dir = Direction.DOWN;}
        else if (dir == Direction.RIGHT) {dir = Direction.UP;}
        else if (dir == Direction.UP) {dir = Direction.LEFT;}
        System.out.println("i'm turn LEFT");
    }
    public void turnRight() {
        if (dir == Direction.UP) {dir = Direction.RIGHT;}
        else if (dir == Direction.RIGHT) {dir = Direction.DOWN;}
        else if (dir == Direction.DOWN) {dir = Direction.LEFT;}
        else if (dir == Direction.LEFT) {dir = Direction.UP;}
    }
    public void stepForward() {
        if (dir == Direction.UP) {y++;}
        if (dir == Direction.DOWN) {y--;}
        if (dir == Direction.LEFT) {x--;}
        if (dir == Direction.RIGHT) {x++;}
        System.out.println("I'm moving FORWARD..");
    }

}
