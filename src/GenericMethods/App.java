package GenericMethods;

import java.util.logging.SimpleFormatter;

public class App {

    public static void main(String[] args) {


        SimpleGenericMethod sgm = new SimpleGenericMethod();


        Integer[] numbers = {1,2,3};
        String[] names = {"Joe", "b"};

        sgm.showArray(numbers);
        sgm.showArray(names);

    }

}
