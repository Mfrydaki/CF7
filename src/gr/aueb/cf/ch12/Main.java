package gr.aueb.cf.ch12;

import gr.aueb.cf.ch12.model.*;

public class Main {
    public static void main(String[] args) {
        Teacher teacher=new Teacher(1, "MARIA" ,"FRYDAKI");
        Point point=new Point(13,12);
        User user=new User("1234","CD" ,"COSTAS", "DIMIOTRIOU" ,1, true);
        Customer customer= new Customer(1,"MARIKA","LOERN","123456678","6789034251","WEST ATTICA","ATHENS","ATHENS","PATISION","4","5343");
        Order order= new Order(1, 4.5,"MEAT","ORDERED","2025-09-19");

        System.out.println("Order Timestamp: " + order.getFormatedTimetamp());
        System.out.println("User Name: " + user.getUsername());
        System.out.println("Teacher full name: " +teacher.getLastname());
        System.out.println("Customer's City: "+customer.getCity());
        System.out.printf("Point: {%d ,%d}\n",point.getX(),point.getY());

}}