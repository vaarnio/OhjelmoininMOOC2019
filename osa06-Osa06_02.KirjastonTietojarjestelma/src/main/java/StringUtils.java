public class StringUtils {
    public static boolean sisaltaa(String sana, String haettava){
        sana = sana.toUpperCase().trim();
        haettava = haettava.toUpperCase().trim();
        if(sana.contains(haettava)){
            System.out.println("true");
            return true;
        } else {
            System.out.println("false");
            return false;
        }
    }
}
