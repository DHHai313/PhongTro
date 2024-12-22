package util;

import java.security.MessageDigest;
import java.util.Base64;

public class PassWordUtil {
    //SHA-1
    public static String toSHA1(String s) {
        String salt = "quoiwyrbfbm,abfief83@0092ksdf";
        String result = null;
        s = s + salt;
        try {
            byte[] dataBytes = s.getBytes("UTF-8");
            MessageDigest md = MessageDigest.getInstance("SHA-1");
            byte[] hashBytes = md.digest(dataBytes); // Tính toán SHA-1
            result = Base64.getEncoder().encodeToString(hashBytes); // Chuyển sang Base64
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return result;
    }

    public static void main(String[] args) {
     
    }
}
