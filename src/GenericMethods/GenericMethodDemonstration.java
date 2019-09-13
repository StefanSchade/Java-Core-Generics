package GenericMethods;

public class GenericMethodDemonstration {


    public static void main(String[] args) {

        String string = "abc";
        Integer integer = 3;
        Double dbl = 3.298798;

        GenericMethodDemonstration.staticGenericMethod(string, integer, dbl);

        System.out.println("Retrunvalue; " + GenericMethodDemonstration.staticGenericMethodwWithReturn(string, integer, dbl));

        GenericMethodDemonstration gmd = new GenericMethodDemonstration();

        gmd.genericInstanceMethod(string,integer,dbl);

        gmd.genericInstanceMethodWithReturn(string,integer,dbl);

    }


    public static <A, B, C> void staticGenericMethod(A a, B b, C c) {


        StringBuffer sb = new StringBuffer();
        sb.append("Static Generic Method Called:\n");
        sb.append("=============================\n\n");
        sb.append("A: " + a.getClass().getSimpleName() + " Value: " + a.toString() + "\n");
        sb.append("B: " + b.getClass().getSimpleName() + " Value: " + b.toString() + "\n");
        sb.append("C: " + c.getClass().getSimpleName() + " Value: " + c.toString() + "\n");

        System.out.println(sb);
    }

    public static <A, B, C> C staticGenericMethodwWithReturn(A a, B b, C c) {


        StringBuffer sb = new StringBuffer();
        sb.append("Static Generic Method With Returnvalue Called:\n");
        sb.append("==============================================\n\n");
        sb.append("A: " + a.getClass().getSimpleName() + " Value: " + a.toString() + "\n");
        sb.append("B: " + b.getClass().getSimpleName() + " Value: " + b.toString() + "\n");
        sb.append("C: " + c.getClass().getSimpleName() + " Value: " + c.toString() + "\n");

        System.out.println(sb);

        return c;

    }

    public <A, B, C> void genericInstanceMethod(A a, B b, C c) {


        StringBuffer sb = new StringBuffer();
        sb.append("Generic Instance Method Called:\n");
        sb.append("===============================\n\n");
        sb.append("A: " + a.getClass().getSimpleName() + " Value: " + a.toString() + "\n");
        sb.append("B: " + b.getClass().getSimpleName() + " Value: " + b.toString() + "\n");
        sb.append("C: " + c.getClass().getSimpleName() + " Value: " + c.toString() + "\n");

        System.out.println(sb);
    }

    public static <A, B, C> C genericInstanceMethodWithReturn(A a, B b, C c) {


        StringBuffer sb = new StringBuffer();
        sb.append("Generic Instance Method With Returnvalue Called:\n");
        sb.append("================================================\n\n");
        sb.append("A: " + a.getClass().getSimpleName() + " Value: " + a.toString() + "\n");
        sb.append("B: " + b.getClass().getSimpleName() + " Value: " + b.toString() + "\n");
        sb.append("C: " + c.getClass().getSimpleName() + " Value: " + c.toString() + "\n");

        System.out.println(sb);

        return c;

    }


}
