/**
 * NIM : 10120081
 * NAMA : Naufal Mahdy
 * KELAS : IF-2
 */
package com.uas_akb_if2_10120081.helper;

public class StringHelper {
    // Generate Username From Email
    public static String usernameFromEmail(String email) {
        if (!email.contains("@")) return email;

        return email.split("@")[0];
    }
}
