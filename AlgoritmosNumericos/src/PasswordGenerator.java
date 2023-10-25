import java.security.SecureRandom;

public class PasswordGenerator {

    private static final String SYMBOLS = "!@#¿";
    private static final String WORDS = "abcdefghijklmnopqrstuvwxyz";
    private static final String DIGITS = "0123456789";
    private static final SecureRandom random = new SecureRandom();

    public static void main(String[] args) {
        String password = generatePassword();
        System.out.println("---------------------------------");
        System.out.println("GENERADOR DE CONTRASEÑAS ");
        System.out.println("Contraseña: " + password);
        System.out.println("Longitud: " + password.length());
        System.out.println("---------------------------------");
    }

    public static String generatePassword() {
        StringBuilder password = new StringBuilder();
        for (int i = 0; i < 12; i++) {
            char c = WORDS.charAt(random.nextInt(WORDS.length()));
            if (random.nextInt(10) > 5) {
                password.append(random.nextBoolean() ? Character.toUpperCase(c) : c);
            }
        }

        while (password.length() < 12) {
            switch (random.nextInt(3)) {
                case 0:
                    password.append(SYMBOLS.charAt(random.nextInt(SYMBOLS.length())));
                    break;
                case 1:
                    password.append(DIGITS.charAt(random.nextInt(DIGITS.length())));
                    break;
                case 2:
                    password.append(WORDS.charAt(random.nextInt(WORDS.length())));
                    break;
            }
        }
        return password.toString();
    }
}
