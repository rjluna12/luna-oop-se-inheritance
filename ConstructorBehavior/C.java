package ConstructorBehavior;
public class C extends A{
    double d;
    C(){
        super("hala nahulog");
        this.d = 0.0;
        System.out.println("C: Empty constructor loaded.");
    }
    void setD(double d){this.d=d;}    
}
