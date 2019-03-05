import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.*;

public class Block {
    private static String timeStamp;
    int index;
    String[] data;
    String hash;
    String prevHash;

    Block() {
        timeStamp = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(new Date());
    }

    public static void main(String[] args) {
        System.out.println(timeStamp);
    }

    String hash_block() {
        return "";
    }
}
