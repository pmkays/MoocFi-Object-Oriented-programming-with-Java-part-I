import java.util.Random;

public class PasswordRandomizer {
    private int length;

    public PasswordRandomizer(int length) 
    {
        this.length = length; 
    }

    public String createPassword() {
        Random random = new Random(); 
        int count = 0; 
        String password = "";
        while(count < length)
        {
            char symbol = "abcdefghijklmnopqrstuvwxyz".charAt(random.nextInt(26));
            password += symbol; 
            count++; 
        }
        return password;
    }
}
