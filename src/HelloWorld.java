import java.lang.reflect.Array;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Person p = new Person("Tomasz");
        System.out.println("Witaj " + p.getName());

        try{
            showMeError();
        } catch(ArrayIndexOutOfBoundsException e){

        }
    }

    private static void showMeError() {
        int num[] = {0, 1, 2, 3};
        System.out.println(num[128]);

    }

}
