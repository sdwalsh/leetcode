package io.mirango;

public class LicenseKeyFormatting {
    static public String licenseKeyFormatting(String S, int K) {
        StringBuilder license = new StringBuilder();
        int count = 0;
        for(int x = S.length() - 1; x >= 0; x--) {
            if (S.charAt(x) != '-') {
                if (count % K == 0 && count != 0) {
                    license.append('-');
                }
                count++;
                license.append(S.charAt(x));
            }
        }
        license.reverse();
        return license.toString().toUpperCase();
    }
}
