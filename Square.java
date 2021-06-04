/**
 * @author Gabriel Octa Mahardika 1972037
 */
public class Square extends TwoDimensionalShape{
    private double lenghtOfSide;

    public double getLenghtOfSide() {
        return lenghtOfSide;
    }
    public void setLenghtOfSide(double lenghtOfSide) {
        this.lenghtOfSide = lenghtOfSide;
    }
    public double getVolume(){
        double volume = lenghtOfSide*lenghtOfSide;
        return volume;
    }
    public double getCircumference(){
        double circum = 4*lenghtOfSide;
        return circum;
    }
    public String toString(){
        String nama = "Square";
        return nama;
    }
}
