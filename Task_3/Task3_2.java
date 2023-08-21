package Task_3;

public class Task3_2 {
    public static void main(String[] args) {
        String str = "racecar";

        boolean isPalindrome = checkPalindrome(str);

        if (isPalindrome) {
            System.out.println("Это палиндром.");
        } else {
            System.out.println("Это не палиндром.");
        }
    }

    public static boolean checkPalindrome(String str) {
        str = str.replaceAll("[^a-zA-Z]", "").toLowerCase(); // Удаляем все символы, кроме букв, и переводим в нижний регистр
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}

