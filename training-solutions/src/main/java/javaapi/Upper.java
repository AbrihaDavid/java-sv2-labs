package javaapi;

public class Upper {

    private String st = "Hello World!";

    public String toUpperCase(){

        return st.toUpperCase();

    }


    public static void main(String[] args) {

        Upper up = new Upper();
        System.out.println(up.toUpperCase());

    }


}
