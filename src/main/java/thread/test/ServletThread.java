package thread.test;

public class ServletThread {
//    private static String usernameref;
//    private static String passwordref;

    public static void doPost(String username, String password){
//        usernameref = username;
//        passwordref = password;
        System.out.println("用户名："+username+"--密码："+password);
    }
}
