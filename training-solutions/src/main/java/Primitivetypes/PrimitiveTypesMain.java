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

        boolean k = true;
        System.out.println(k);
        Boolean l = true;
        System.out.println(l);
        boolean m = Boolean.valueOf(true);
        System.out.println(m);
        Boolean n = Boolean.valueOf(true);
        System.out.println(n);
        boolean o = Boolean.parseBoolean("TrUe");
        System.out.println(o);
        Boolean p = Boolean.parseBoolean("TrUe");
        System.out.println(p);
        boolean q = Boolean.parseBoolean("TreU");
        System.out.println(q);
        Boolean r = Boolean.parseBoolean("TreU");
        System.out.println(r);
    }
}
