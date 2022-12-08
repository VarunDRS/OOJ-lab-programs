import java.util.*;
class book{
String name;
String author;
int price;
int num_pages;
book(){
name="";
author="";
price=0;
num_pages=0;
}
void set(){
System.out.println("Enter name of the book");
Scanner sc=new Scanner(System.in);
name=sc.nextLine();
System.out.println("Enter name of the author");
author=sc.nextLine();
System.out.println("Enter the price");
price=sc.nextInt();
System.out.println("Enter the number of pages");
num_pages=sc.nextInt();
}
public String toString(){

return("-----------------------------------------------------------------------\nName of the book : "+name+"\n"+"Author : "+author+"\n"+"Price : "+price+"\n"+"Number of pages"+num_pages);
}
}
class supply{
public static void main(String args[]){
int n;
System.out.println("Enter the number of books");
Scanner vb=new Scanner(System.in);
n=vb.nextInt();
book b1[]=new book[n];
for(int i=0;i<n;i++){
b1[i]=new book();
b1[i].set();
}
for(int i=0;i<n;i++){
System.out.println("Details of the book"+(i+1));
System.out.println(b1[i]);
}
}
}
