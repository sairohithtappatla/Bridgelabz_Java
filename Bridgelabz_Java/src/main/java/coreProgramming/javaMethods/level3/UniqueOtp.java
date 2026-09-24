package coreProgramming.javaMethods.level3;

public class UniqueOtp {

    // Method to generate a six-digit OTP
    public static int generateOtp() {

        // Generate OTP between 100000 and 999999
        return (int) (Math.random() * 900000) + 100000;
    }

    // Method to check whether an OTP already exists
    public static boolean isUnique(int[] otps, int count, int otp) {

        // Compare OTP with previously generated OTPs
        for (int i = 0; i < count; i++) {

            // Return false if duplicate is found
            if (otps[i] == otp) {
                return false;
            }
        }

        // OTP is unique
        return true;
    }

    public static void main(String[] args) {

        // Create array to store 10 OTPs
        int[] otps = new int[10];

        // Generate 10 unique OTPs
        for (int i = 0; i < otps.length; i++) {

            // Generate initial OTP
            int otp = generateOtp();

            // Regenerate while duplicate exists
            while (!isUnique(otps, i, otp)) {
                otp = generateOtp();
            }

            // Store unique OTP
            otps[i] = otp;
        }

        // Display generated OTPs
        System.out.println("Unique OTPs:");

        for (int otp : otps) {
            System.out.println(otp);
        }
    }
}