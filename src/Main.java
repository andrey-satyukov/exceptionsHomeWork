import exeption.WrongLoginException;
import exeption.WrongPasswordException;

import java.util.Locale;

public class Main {


    public static void main(String[] args) {
        try {
            System.out.println(CheckLoginAndPassword.checker("vdfgdfgdfg", "jkgdfkljg", "jkgdfkljg"));
        } catch (WrongLoginException e) {
            System.out.println("Введен неверный логин");
        } catch (WrongPasswordException e) {
            System.out.println("Введен неверный пароль");
        }
    }
}