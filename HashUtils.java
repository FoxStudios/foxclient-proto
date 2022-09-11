package net.foxes4life.foxclient.networking.shared;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class HashUtils {
    public static String hash(String str) {
        MessageDigest md = null;
        try {
            md = MessageDigest.getInstance("SHA-1");
        } catch (NoSuchAlgorithmException e) {
            return null;
        }
        byte[] strBytes = str.getBytes(StandardCharsets.UTF_8);
        return new String(md.digest(strBytes));
    }
}
