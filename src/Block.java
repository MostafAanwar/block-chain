import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.*;

public class Block {
    private static String timeStamp;
    int index;
    private String data;
    String hash;
    String previousHash;

    Block(String data, String previousHash) {
        this.data = data;
        this.previousHash = previousHash;
        this.timeStamp = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(new Date());
    }

    Block() {
        timeStamp = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(new Date());
    }

    public static void main(String[] args) {
        System.out.println(timeStamp);
    }

    String hash_block() {
        //returns hash i think
        return "";
    }
}
