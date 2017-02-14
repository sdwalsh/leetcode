package io.mirango;

import static io.mirango.LicenseKeyFormatting.licenseKeyFormatting;
import static io.mirango.TwoSum.twoSum;

public class Main {
    public static void main(String[] args) {
        System.out.println(licenseKeyFormatting("2-4A0r7-4k", 4));
        System.out.println(licenseKeyFormatting("--a-a-a-a--", 2));

        int[] sum = twoSum(new int[]{3,2,4}, 6);
        for(int x = 0; x < sum.length; x++) {
            System.out.println(sum[x]);
        }
    }

}
