package gr.aueb.cf.ch20;

public class RegExMain {
    public static void main(String[] args) {

        String s = "red";
        System.out.println(isRed(s));
    }

    /**
     * ελέγχει αν είναι κόκκινο
     */
    public static boolean isRed(String s) {
        return s.matches("red");
    }

    /**
     * ελέγχει αν είναι κόκκινο ή πράσινο
     */
    public static boolean isRedOrGreen(String s) {
        return s.matches("red|green");
    }

    /**
     * ελέγχει αν είναι κόκκινο ή πράσινο που ξεκιναει με πεζό ή κεφαλαίο
     */
    public static boolean isrRedOrGreen(String s) {
        return s.matches("[rR]ed|[gG]reen");
    }

    public static boolean beginsWithOneUpperCaseAndEndsIning(String s) {
        return s.matches("[A-Z]ing");
    }

    /**
     * ξεκινάει με κεφαλαίο ή πεζό και τελείωνει σε ing
     */
    public static boolean isOneLetterEndsIng(String s) {
        return s.matches("[A-Za-z]ing");
    }

    /** Επιστρέφει true αν τελειώνει με έναν κενό χαρακτήρα ακολουθούμενο από ένα ψηφίο */

     public static boolean whitespaceDigit(String s){
        return s.matches("\\s\\d$");
    }
    /** έλεγχος εγκυρότητας email*/

    public static  boolean isEmail(String s){
         return s.matches("\\w*\\.?\\w+@\\w+\\.[a-z]{2,4}");
    }
}