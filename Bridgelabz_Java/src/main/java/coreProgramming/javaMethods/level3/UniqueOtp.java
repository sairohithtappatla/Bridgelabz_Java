package coreProgramming.javaMethods.level3;

public class UniqueOtp {

    public static int generateOtp() {
        return 100000 + (int) (Math.random() * 900000);
    }

    public static boolean areUnique(int[] otps) {

        for (int i = 0; i < otps.length; i++) {
            for (int j = i + 1; j < otps.length; j++) {
                if (otps[i] == otps[j]) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {

        final int OTP_COUNT = 10;

        int[] otps = new int[OTP_COUNT];

        for (int i = 0; i < otps.length; i++) {
            otps[i] = generateOtp();
        }

        System.out.println("Generated OTPs:");

        for (int otp : otps) {
            System.out.println(otp);
        }

        System.out.println(
            "All OTPs are unique: " + areUnique(otps)
        );
    }
}