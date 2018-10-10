package week4.task2;

 class Rectangle extends Shape {
    public double width =1.0;
   public double length=1.0;
    public void  Rectangle(){};
    public void Rectangle(double width,double length)
    {
        this.length=length;
        this.width=width;
    }
    public void Rectangle(double width,double length,String color,boolean filled)
    {
        this.width=width;
        this.length=length;
        setColor(color);
       setFilled(filled);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getArea()
    {
        return width*length;
    }
    public double getPerimeter()
    {
        return 2*(width+length);
    }
    public String toString()
    {
        return getArea()+" "+getPerimeter()+" "+getColor()+" "+isFilled();
    }
}
