/**
 * @author Gabriel Octa Mahardika 1972037
 */
public abstract class TwoDimensionalShape extends Shape{
    public abstract double getVolume();

    public abstract double getCircumference();

    public void showDetail(){
        System.out.println("Area of "+ toString()+" is: "+getVolume());
        System.out.println("Circumference of "+ toString()+" is: "+getCircumference());
    }
}
