package gr.aueb.cf.ch16.interfaces.function;

public class Main {
    public static void main(String[] args) {
        ICalculator addition = new AdditionalCalculator();
         int result = addition.operate(1,1);
            System.out.println(result);

        }

    }

