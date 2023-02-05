abstract class abs{
double a,b;
abs(double i,double j){
a=i;
b=j;
}
abstract double area();
}
class rec extends abs{
rec(double i,double j){
super(i,j);
}
double area(){
return (a*b);
}
}
class trian extends abs{
trian(double i,double j){
super(i,j);
}
double area(){
return (0.5*a*b);
}
}
class cir extends abs{
cir(double i,double j){
super(i,j);
}
double area(){
return (3.14*a*a);
}
}
class week4{
public static void main(String args[]){
rec r1=new rec(2.0,3.0);
trian t1=new trian(4.0,2.0);
cir c1=new cir(4.0,4.0);
abs a;
a=r1;
double area1=a.area();
a=t1;
double area2=a.area();
a=c1;
double area3=a.area();
System.out.println("Area of Rectengle is "+area1);
System.out.println("Area of Triangle is "+area2);
System.out.println("Area of Circle is "+area3);
}
}