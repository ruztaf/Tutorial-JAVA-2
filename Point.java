public class Point
{
    private double x;
    private double y;

    public Point(double x, double y){
       this.x = x;
       this.y = y;
    }
    public Point(){
        this.x = 0;
        this.y = 0;
    }
    public double getCoorX(){
        return this.x;
    }
    public double getCoorY(){
        return this.y;
    }
    public void setCoorX(double x){
        this.x = x;
    }
    public void setCoorY(double y){
        this.y = y;
    }
}