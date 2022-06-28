package testng_first.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import testng_first.dev.DevClass;
import testng_first.dev.WrongLoginException;
import testng_first.dev.WrongPasswordException;

import static testng_first.dev.DevClass.isValidPassword;

public class MyTest {

    private String validLogin = "asdfg_123";
    private String invalidLogin = "asdfg_123%^";
    private String invalidPassword = "asdfg_123%^";
    private String validPassword1 = "asdfg_123";
    private String validPassword2 = "asdfg123476";


    @Test
    public void firstTest(){
        String actual = DevClass.reverseWord( "1234");
        Assert.assertEquals(actual, "4321", "reverse word is not correct");

    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void checkNull(){
        String actual = DevClass.reverseWord( null);

    }
    @Test(expectedExceptions = IllegalArgumentException.class)
    public void oneSignTest(){
        String actual = DevClass.reverseWord( "1");

    }

    public static void logIn(String login, String password, String confirmPassword) {
        try {
            if (!(login.length() < 20 && isValidLogin(login))) {
                throw new WrongLoginException();
            }

        } catch (WrongLoginException e) {
            System.out.println("invalid login");
        }
        try {
            if (!(login.length() < 20 && isValidPassword(login) && password.equals(confirmPassword))) {
                throw new WrongPasswordException();
            }
        } catch (WrongPasswordException e) {
            System.out.println("invalid password");
        }
    }

    public static boolean isValidLogin(String text) {
        for (int i = 0; i < text.length(); i++) {
            int currChar = text.charAt(i);
            if (!(currChar >= 48 && currChar <= 57 ||
                    currChar >= 65 && currChar <= 90 ||
                    currChar >= 97 && currChar <= 122 ||
                    currChar == 95)) {
                return false;
            }
        }
        return true;
    }
//
//    public static boolean isValidPassword(String text) {
//        return isValidLogin(text);
//    }
//
//    }
    @Test
    public void secondTest () throws WrongPasswordException, WrongLoginException {
        boolean actual = DevClass.logIn(validLogin, validPassword1, validPassword1);
        Assert.assertTrue(actual, "actual is not true");
    }


}