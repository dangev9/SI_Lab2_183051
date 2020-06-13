import java.util.List;

class User {
    String username;
    String password;
    String email;

    public User(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }
}

public class SILab2 {

    public boolean function (User user, List<String> allUsers) {
        String specialCharacters="!#$%&'()*+,-./:;<=>?@[]^_`{|}";//1
        if (user!=null) {//2
            if (user.getUsername()!=null && user.getPassword()!=null) {//3
                String password = user.getPassword();//4
                String passwordLower = password.toLowerCase();//4
                if (!passwordLower.contains(user.getUsername().toLowerCase()) && password.length()>=8) {//5
                    boolean digit = false, upper = false, special = false;//6
                    for (int i=0;i<password.length();i++) {//7(7.1,7.2,7.3)
                        if (Character.isDigit(password.charAt(i)))//8
                            digit = true;//9
                        if (Character.isUpperCase(password.charAt(i)))//10
                            upper = true;//11
                        if (specialCharacters.contains(String.valueOf(password.charAt(i))))//12
                            special = true;//13
                    }
                    if (digit && upper && special)//14
                        return true;//15
                }
            }
        }
        return false;//16
    }
    public static void main(String args[]){

    }
}