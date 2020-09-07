package Java_Praktica.practicheskoe_2_4;

public class MovablePoint extends Movable {

    int x=0, y=0, xSpeed=0, ySpeed=0;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public void moveUp() {
        y += ySpeed;
    }

    @Override
    public void moveDown() {
        y -= ySpeed;
    }

    @Override
    public void moveLeft() {
        x -= xSpeed;
    }

    @Override
    public void moveRight() {
        x += xSpeed;
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "\nx=" + x +
                ",\ny=" + y +
                ",\nxSpeed=" + xSpeed +
                ",\nySpeed=" + ySpeed +
                "\n}";
    }

}
