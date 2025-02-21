package gr.aueb.cf.ch16.interfaces.default_static;

public class CodingWelcome implements IWelcome{

    public static void staticMethod(){
        System.out.println("Static method from CodingWelcome hides IWelcome");
    }

    @Override
    public void defaultMethod() {
        IWelcome.super.defaultMethod();
        System.out.println("Overridden method");
    }
}
