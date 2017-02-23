import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * Created by Jonsy on 2017/2/23.
 */
public class Test {


    public static void main(String[] args) {
        String pass = "123456";
        BCryptPasswordEncoder encode = new BCryptPasswordEncoder();
        String hashPass = encode.encode(pass);
        System.out.println(hashPass);
    }
}
