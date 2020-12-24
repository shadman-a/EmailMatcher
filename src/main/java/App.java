import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) {

        String message = "He merry, santa.2007@northpole.io christmas eve!";

        Pattern emailPattern = Pattern.compile("[a-z0-9.]+@[a-z0-9]+\\.[a-z]{2,5}");
        

        System.out.println("Hello World");
    }
}
