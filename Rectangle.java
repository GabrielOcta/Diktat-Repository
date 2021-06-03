/**
 * @author Gabriel Octa Mahardika 1972037
 */
public class Rectangle extends Shape{
    private double lenght;
    private double width;

    public Rectangle() {
    }
    public Rectangle(double lenght, double width) {
        this.lenght = lenght;
        this.width = width;
    }
    public double getLenght() {
        return lenght;
    }
    public void setLenght(double lenght) {
        this.lenght = lenght;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    @Override
    public double getArea() {
        double luas = lenght*width;
        return luas;
    }
}
