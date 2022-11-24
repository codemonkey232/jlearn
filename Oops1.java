/*
       
        Procedural Programming
            C
        Object Oriented Programming
            Class 
                Blueprint/Definition of an Object
                1. Attribute
                    Referes the state of the object
                2. Behavior
                    Behavior changes the state of the object
                    modifies the attribute
            Object/Entity
                Working entity
class_name reference = new constructor_call();
        
*/

class Car{
    String model;
    int fuel_level;
    int speed;
    int gear;
    Car(){
        System.out.println("Intializing Car");
    }
    void start(){
        fuel_level--;    
    }
    void stop(){
        speed=0;
    }
    void accelerate(){
        speed++;
        fuel_level--;
    }
    void brake(){
        speed--;
        fuel_level--;
    }
    void increaseGear(){
        gear++;
        speed++;
    }    
    void decreaseGear(){
        gear--;
        speed--;
    }        
}
//this => same class object
//Encapsulation
//Ambiquos // Paradox // Dilema
class Student{
    //Data Hiding    
    private String name;
    private int age;
    public Student(String name, int age){
        this.name = name;
        this.age = age;        
    }
    public Student(String name){
        this.name = name;
    }
    public Student(int age){
        this.age = age;
    }
    //Data Binding
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;        
    }
    public int getAge(){
        return age;
    }
}
/*
POJO    => Plain Old Java Object
    contains getter/setter methods for the attributes/variables
*/
class Oops1{
    public static void main(String[] arg){
        Car c1 = new Car();
        Car c2;         //Creating reference for an object
        c2 = new Car(); //Initializing the object => Memory allocation
        Car c3;
        // c2.start();
        new Car().start(); // Nameless Object => Onetime reference

        Student s = new Student("Sifat", 20);
        new Student("Arun");
        new Student(20);
    }
}

//Object can be intialized only by calling the constructor along with the keyword new
