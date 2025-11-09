package InterviewQuestion;

public class InheritanceExample {
    public static void main(String args[]){

        B b = new B();
        b.start();
        b.display();

        A a = new B();
       // a.start(); this line will give compile time error
        a.display();


    }
}


class A {

    public  void display(){
        System.out.println("Welcome ..!!");
    }
}

class B extends   A{

    public void start(){
        System.out.println("Welcome to Mumbai");
    }

}