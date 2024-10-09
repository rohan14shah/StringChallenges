public class D_PasswordValidator {

    public static void main(String[] args) {
        D_PasswordValidator d = new D_PasswordValidator();
    }

    public D_PasswordValidator() {
        String password = "MyPassw0rd";
        System.out.println("Valid password: " + isValidPassword(password));
    }

    public boolean isValidPassword(String password) {
        boolean hasUppercase = false;
        boolean hasNumber = false;

        if (password.toLowerCase().contains("password")) {
            return false;
        }

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUppercase = true;
            }
            if (Character.isDigit(c)) {
                hasNumber = true;
            }
        }

        return hasUppercase && hasNumber;
    }
}