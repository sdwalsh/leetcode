package io.mirango;

public class LicenseKeyFormatting {

    public static void main(String[] args) {
        System.out.println(licenseKeyFormatting("2-4A0r7-4k", 4));
        System.out.println(licenseKeyFormatting("--a-a-a-a--", 2));
    }

    static private String licenseKeyFormatting(String S, int K) {
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
