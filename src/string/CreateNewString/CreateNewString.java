package string.CreateNewString;

public class CreateNewString {
    public static String createNewString(String input) {
        return new StringBuilder()
                .append(input.charAt(0))
                .append(input.charAt(5))
                .toString();
    }
}
