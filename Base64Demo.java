import java.util.Base64;
public class Base64Demo {
    public static void main(String[] args) {
        String password="HelloJava2024";

// Getting encoder
        Base64.Encoder encoder = Base64.getEncoder();

// Encoding URL
        String eStr = encoder.encodeToString(password.getBytes());
        System.out.println("Encoded URL: "+eStr);

// Getting decoder
        Base64.Decoder decoder = Base64.getDecoder();

// Decoding URl
        String dStr = new String(decoder.decode(eStr));
        System.out.println("Decoded URL: "+dStr);
    }
}
