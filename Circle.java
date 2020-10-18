public class Circle
{
    public Point centre = new Point();
    private double radius;

    public Circle(){
        this.centre.setCoorX(0);
        this.centre.setCoorY(0);
        this.radius = 0;
    }

    public Circle(double r, double x, double y){
        this.radius = r;
    }

    public double getRadius(){
        return this.radius;
    }

    public double setRadius(double r){
        return this.radius = r;
    }
}
