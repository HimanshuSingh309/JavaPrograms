package stringManipulation;

public class GetIntFromString {

    public static void main(String[] args) {
        String str = "your transaction id is: 12345 and reference id is 34567 and customer id is 1023293";

        // Use regular expression to match and extract digits
        String digits = str.replaceAll("\\D+", " ");

        // Trim and replace multiple spaces with a comma along with single space
        digits = digits.trim().replaceAll(" +", ", ");

        System.out.println("Numeric values are: " + digits);
    }
}

