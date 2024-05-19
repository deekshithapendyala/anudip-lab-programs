package sample;

public class Palindrome {

	public static void main(String[] args) {
		int number = 374;

        boolean isPalindrome = isPalindrome(number);

        if (isPalindrome) {
            System.out.println(number + " is a palindrome no.");
        } else {
            System.out.println(number + " is not a palindrome no.");
        }
    }

public static boolean isPalindrome(int number) {
	int reversedNumber = reverseNumber(number);
    return number == reversedNumber;
}

public static int reverseNumber(int num) {
	int rev= 0;
    while (num != 0) {
        int digit = num % 10;
        rev = rev * 10 + digit;
        num /= 10;
    }
    return rev;

	}

}
