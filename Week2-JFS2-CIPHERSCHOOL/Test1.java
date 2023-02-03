//This KeyWord Video2.
public class Test1 {
  int arg = 5;
   Test1(){
    System.out.println("Hi I am The Default Constructor");
  }
  Test1(int arg){
    this();//This() Will Call The Default Constructor;
    this.arg = arg;//In this Case We are Assigning value of a local variable arg to the class Variable arg..


  }
  public static void main(String[] args) {
    int arg = 10;
    Test1 obj = new Test1(10);
    System.out.println(obj.arg);
  }
}
