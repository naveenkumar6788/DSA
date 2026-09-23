import java.util.*;
public class substr1{
    public static void main(String[] args) {
        substr("","12345");
    }
    static void substr(String p,String up){
        if(up.isEmpty()){
            System.out.println(p); 
            return;
        }
        char ch=up.charAt(0);
        substr(p,up.substring(1));
        substr(p+ch,up.substring(1));
    }
    
}