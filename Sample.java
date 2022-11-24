/*
    Syntax => Human Understandable/Readble
    Binary
    Source Code => | Compiler | => Binary Code

    Machine Independent
    JAVA is running on more than 10 billion devices
        J2SE    => Standard Edition => Core JAVA
        J2EE    => Enterprises Edition => Web/Network based application development
            JSP => Web Application/Front end architecture
            Servlets => Backend 
            RMI
            EJB => Enterprises JAVA Bean
            Spring/Spring Boot Framework                
        J2ME    => Micro/Mobile Edition
*/
/*

Access Specifiers
    public 
    private
    protected
    default/friendly => no keyword
    static | final => qualifier
class is the compilation unit of JAVA    

*/

//default class Sample => Executable Class




class Sample{


    public static void main(String[] arg){


        Sample s = new Sample();
        Sample s1 = new Sample();
        Sample s2 = new Sample();
        int result = s.add(10,20);
        // return;

        
        System.out.println("The result is " + result);
        // float f =3.14F;
        // int x = 10_1000;
        result = s.calc(10,'+',20);
        System.out.println("The result is " + result);
         System.out.println("The result is " + result);
    }
    int add(int a, int b){
        return a+b;
    }
    // int calc(int a, char op, int b){
    //     switch(op){
    //         case '+':
    //             return a+b;
    //         case '-':
    //             return a-b;
    //         case '/':
    //             return a/b;
    //         case '%':
    //             return a%b;
    //         case '*':
    //             return a*b;
    //     }
    //     return 0;
    // }
    int calc(int a, char op, int b){
        int resultx = 0;
        switch(op){
            case '+':
                resultx =  a+b; break;
            case '-':
                resultx =  a-b; break;
            case '/':
                resultx =  a/b; break;
            case '%':
                resultx =  a%b; break;
            case '*':
                resultx =  a*b; break;
        }
        return resultx;
        





    }    
}
/*
Literal
    's'
    "s"
    3.14

Methods/Functions
access-specifier qualifer return-type function-name(arguments,.....){
    method definitions
}
mandatory
return-type function-name(arguments,.....){
    method definitions
}    
int add(int b,int a){
    int sum = a+b;
    return sum
}

Fn doesn't returns any value => void
No of arguments
Type of those arguments And 
Refrences of those arguments

*/
