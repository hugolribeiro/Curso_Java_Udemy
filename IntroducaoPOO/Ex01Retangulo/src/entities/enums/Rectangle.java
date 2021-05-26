package entities.enums;

public class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(){

    }

    private double area(){
        return this.width * this.height;
    }

    private double perimeter(){
        return (this.width * 2 + this.height * 2);
    }

    private double diagonal(){
        return Math.sqrt((Math.pow(this.width, 2)) + (Math.pow(this.height, 2)));
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "AREA = " + String.format("%.2f", this.area()) +
                "\nPERIMETER = " + String.format("%.2f", this.perimeter()) +
                "\nDIAGONAL = " + String.format("%.2f", this.diagonal());
    }
}
