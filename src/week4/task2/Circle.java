package week4.task2;

 class Circle extends Shape{
    private double radius = 1.0;
    private double pi=3.14;
    public void Circle(){};
    public void Circle(double radius)
    {
        this.radius=radius;
    }
    public void Circle(double radius,String color,boolean filled)
    {
        this.radius=radius;
        setColor(color);
        setFilled(filled);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea()
    {
        return 2*radius*pi;
    }
    public double getPerimeter()
    {
        return radius*radius*pi;
    }
    public String toString()
    {
        return getArea()+" "+getPerimeter()+" "+getColor()+" "+isFilled();
    }
}
