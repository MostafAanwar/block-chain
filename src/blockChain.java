import java.util.Scanner;

public class blockChain {
    public static Block[] bc;
    private int num = 1;

    blockChain() {
        Block[] bc = new Block[num];
    }

    int getNum() {
        return num;
    }

    void setNum() {
        Scanner myObj = new Scanner(System.in);
        num = myObj.nextInt();
    }


}
