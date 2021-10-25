package Primitivetypes;

public class PrimitiveTypesMain {

    public static void main(String[] args) {

        int a = 2;
        System.out.println(a);
        Integer b = 2;
        System.out.println(b);
        Integer c = a;
        System.out.println(c);
        Integer d = b;
        System.out.println(d);
        Integer e = new Integer(2);
        System.out.println(e);
        int f = new Integer(2);
        System.out.println(f);
        int g = new Integer(a);
        System.out.println(g);
        int h = new Integer(c);
        System.out.println(h);
        int i = Integer.parseInt("2");
        System.out.println(i);
        Integer j = Integer.valueOf("2");
        System.out.println(j);
    }
}
