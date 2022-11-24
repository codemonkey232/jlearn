class Vehicle{
    public void start(){
        System.out.println("Vehicle Started");
    }
}
class Car extends Vehicle{
    public void start(){
        System.out.println("Car Started");
    }
}
class Bus extends Vehicle{
    public void start(){
        System.out.println("Bus Started");
    }
}
class Rto{
    public void geteTests(Vehicle v){
        if(v instanceof Car){
            System.out.println("Car Tests");
        }else if(v instanceof Bus){
            System.out.println("Bus Tests");
        }
    }
}
class Inher2{
    public static void main(String[] arg){
        Vehicle v = new Car();
        v.start();
        // v = new Bus();
        // v.start();                
        // if(v instanceof Car ){
        //     System.out.println("Car Instance");
        // } else if(v instanceof Bus ){ 
        //     System.out.println("Bus Instance");
        // }
        Rto rto = new Rto();
        rto.geteTests(v);
    }    
}