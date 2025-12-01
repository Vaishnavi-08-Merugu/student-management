public class login {
    public static boolean authenticate(String u, String p){
        // dummy auth
        return "student".equals(u) && "pass".equals(p);
    }
}
