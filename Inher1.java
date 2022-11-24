/*
Inheritance
class =>
    Methods | Behaviors
Parent Class => super class
Child Class => sub class

class sub_class_name extends superclass_name{

}

Types
    * 1. Single
    * 2. Hire
      3. Multiple 
    * 4. Multi Level
      5. Hybrid = Hire + Mutlple

*/

class Parent{ // extends Object
    int val = 100;
    Parent(){
        System.out.println("Parent Class");
    }
    Parent(String s){
        System.out.println("Parent Class " + s);
    }
    // Parent(int x, float f, String s)
    public void display(){
        System.out.println("Parent Class");
    }
}

class Child extends Parent{
    int val = 1000;
    Child(){
        super("Hello");//super keyword must be used as the first statement inside a constructor
        System.out.println("Child Class");         
    }
    Child(String s){
        super(s);
        System.out.println("Child Class " + s);
    }
    //Overriding => Defining the super class method in the sub class
    @Override
    public void display(){ // Shadowing the super class method 
        super.display();
        System.out.println("Child Class " + super.val);
    }
}

class Inher1{
  public static void main(String[] arg){
    // Child c = new Child();
    // c.display();

    // Parent p = new Child();
    // p.display();
    // p = new Parent();
    // p.display();

    //Child c = new Parent(); //Compile time error
    //Child c = (Child) new Parent(); //Runtime error
    //c.display();

    Child c = new Child();
    c.display();

  }
}