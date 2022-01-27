package LoginPage.Security;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

// used to encrypt te data entered by the user
public class Crypto {
    public static String encode(String value) throws UnsupportedEncodingException {
        Base64.Encoder encoder = Base64.getEncoder();
        return encoder.encodeToString((value.getBytes(StandardCharsets.UTF_8)));

    }
    public static String decode(String encrypted) throws UnsupportedEncodingException{
        byte[] b = Base64.getDecoder().decode(encrypted);
        return new String(b, StandardCharsets.UTF_8);
    }
    public static void main(String[] args) throws UnsupportedEncodingException {

        // See if the class is working properly
        /*
        System.out.println(encode("abc133"));

        System.out.println(decode("YWJjMTMz"));

         */
    }
}
