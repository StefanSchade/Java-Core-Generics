package GenericMethods;

public class SimpleGenericMethod {

    public static void main(String[] args) {

        System.out.println("The Returnvalue is "+ showItem("Hello World"));
        System.out.println("The Returnvalue is "+ showItem('c'));
        System.out.println("The Returnvalue is "+ showItem(42));

    }

    public static <T> T showItem (T t) {
        System.out.println("The item is: " + t );
        return t;
    }

    public <T> void showArray(T[] array) {
        for (T t : array) {
            System.out.println(t.toString());
        }
    }




}
