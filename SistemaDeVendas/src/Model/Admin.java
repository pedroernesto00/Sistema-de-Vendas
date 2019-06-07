package Model;

public class Admin {
    private static String username = "Admin";
    private static String password = "Admin";

    private Admin(){}

    private static Admin admin = new Admin();

    public static Admin getInstance(){
        return admin;
    }

    public static String getUsername() {
        return username;
    }

    public static void setUsername(String username) {
        Admin.username = username;
    }

    public static String getPassword() {
        return password;
    }

    public static void setPassword(String password) {
        Admin.password = password;
    }
}
