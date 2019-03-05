import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.*;

public class Block {
    private static long timeStamp;
    public String hash;
    public String previousHash;
    private String data;

    public Block(String data, String previousHash) {
        this.data = data;
        this.previousHash = previousHash;
        timeStamp = new Date().getTime();
    }

    public static void main(String[] args) {
        System.out.println(timeStamp);
    }

    String hash_block() {
        //returns hash i think
        return "";
    }
}
