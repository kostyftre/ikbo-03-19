public class Ball {

    private String color;
    private String Size;
    private String BallMaster;

    public Ball(String color, String size, String ballMaster) {
        this.color = color;
        Size = size;
        BallMaster = ballMaster;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return Size;
    }

    public void setSize(String size) {
        Size = size;
    }

    public String getBallMaster() {
        return BallMaster;
    }

    public void setBallMaster(String ballMaster) {
        BallMaster = ballMaster;
    }

    @Override
    public String toString() {
        return String.format("Размер мяча: %s \nЦвет мяча: %s \nХозяин: %s", this.Size, this.color, this.BallMaster);
    }
}