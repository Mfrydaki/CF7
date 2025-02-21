package gr.aueb.cf.ch14.services;

import gr.aueb.cf.ch12.model.Teacher;

public class Main {

    public static void main(String[] args) {

        Teacher teacher1 = new Teacher(1, "Kelas", "Mixalis");
        Teacher teacher2 = new Teacher(2, "Makis", "Kapetis");


        HelloUtil.sayHello();
        System.out.println("Hello people!");

        CodingFactorySingleton cf3 = CodingFactorySingleton.getInstance();
        CodingFactorySingleton cf2 = CodingFactorySingleton.getInstance();

        System.out.println(cf2);
}}