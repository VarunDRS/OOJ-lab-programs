import java.util.*;
abstract class a
{
    double a, b;
    a(double i, double j)
    {
        a = i;
        b = j;
    }
    abstract double area();
}
class rectangle extends a
{
    rectangle(double i, double j)
    {
        super(i, j);
    }
    double area()
    {
        return a * b;
    }
}
class triangle extends a
{
    triangle(double i, double j)
    {
        super(i, j);
    }
    double area()
    {
        return 0.5 * a * b;
    }
}
class circle extends a
{
    circle(double i)
    {
        super(i, i);
    }
    double area()
    {
        return 3.14 * a * b;
    }
}
class areas
{
    public static void main(String[] args) 
    {
        rectangle r = new rectangle(8, 6);
        triangle t = new triangle(5, 4);
        circle c = new circle(7);
        System.out.println("Area of the rectangle is "+r.area());
        System.out.println("Area of the triangle is "+t.area());
        System.out.println("Area of the circle is "+c.area());

    }
}