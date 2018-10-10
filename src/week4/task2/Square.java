package week4.task2;

 class Square extends Rectangle{
    public double side;
    public void Square(){};
    public void Square(double side)
    {
        this.side=side;
    }
  public void Square(double side,String color,boolean filled)
  {
    this.side=side;
   setColor(color);
   setFilled(filled);
  }
    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
  public void setWidth(double side)
  {
      this.width=side;
  }
  public void setLength(double side)
  {
      this.length=length;
  }


    public String toString()
    {
        return getArea()+" "+getPerimeter()+" "+getColor()+" "+isFilled();
    }
}
