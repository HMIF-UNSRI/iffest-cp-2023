package hmif.babak_penyisihan;

public class UsernameProblem {
    public static String solution(String username) {
        if (username.length() < 7 || username.length() > 30)
            return "Invalid";

        char first = username.charAt(0);
        if (!Character.isLetter(first))
            return "Invalid";

        if (!username.matches("[A-Za-z0-9_]+"))
            return "Invalid";

        return "Valid";
    }
}
