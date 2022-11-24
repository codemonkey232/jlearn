/*
    abstract class
    abstract class class_name{

    }
    interface => pure abstract class
    interface interface_name{

    }

*/

// abstract class Vehicle{    
//     public abstract void start();
//     public abstract void stop();
//     public void display(){
//         System.out.println("Vehicle");
//     }
// }
interface Vehicle{
    public int x=100;
    public void start();
    public void stop();
}
class Car implements Vehicle{
    public void stop(){
        System.out.println("Car Stop");
    }
    public void start(){
        System.out.println("Car Start");
    }    
}
class Bus implements Vehicle{
    public void stop(){
        System.out.println("Bus Stop");
    }
    public void start(){
        System.out.println("Bus Start");
    }    
}
class Abs1{
    static final int x = 100;
    public static void main(String[] arg){        
        Vehicle v = new Bus();
        // x=10;
        v.start();
        v.stop();
        // v.display();
    }
}
/*
final varaibles are constant
    final varaible must be initialized at the time of declaration
    final variables cannot be modified/immutable
*/