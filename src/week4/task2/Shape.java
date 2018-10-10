package week4.task2;

 class Shape {
    private String color = "red";
    private boolean filled = true;
    public void Shape() {};
    public void Shape(String color,boolean filled)
    {
    this.color=color;
    this.filled=filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public boolean isFilled()
    {
        return filled;
    }
    public String tostring()
    {
        return filled + " "+ color;
    }
}
