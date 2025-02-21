package gr.aueb.cf.ch19;

public class Main {

    public static void main(String[] args) {

        NodeOb nodeOb =new NodeOb();
        nodeOb.setItem("Coding");

        int item = (int) nodeOb.getItem();
        System.out.println(item);
    }
}
