import exeption.WrongLoginException;
import exeption.WrongPasswordException;

import java.util.Locale;

public class CheckLoginAndPassword {
    public static boolean checker(String login, String password, String confirmPassword) {
        boolean flag = true;
        if (chekLength(login) || checkSymbols(login) == false) {
            flag = false;
            throw new WrongLoginException();
        }
        if (chekLength(password) || checkSymbols(password) == false || checkConfirm(password, confirmPassword) == false) {
            flag = false;
            throw new WrongPasswordException();
        }
        return flag;
    }
    private static boolean chekLength(String word) {
        return word.length() > 20;
    }

    private static boolean checkSymbols(String word) {
        String s = "qwertyuiopasdfghjklzxcvbnm1234567890_";
        word = word.toLowerCase(Locale.ROOT);
        for (int i = 0; i < word.length(); i++) {
            String currentLetter = Character.toString(word.charAt(i));
            if (s.contains(currentLetter) == false) {
                return false;
            }
        }
        return true;
    }

    private static boolean checkConfirm(String password, String confirmPassword) {
        for (int i = 0; i < password.length(); i++) {
            if (password.charAt(i) != confirmPassword.charAt(i)) {
                return false;
            }
        }
        return true;
    }

}
