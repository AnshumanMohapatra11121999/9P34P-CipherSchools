import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        //How Long is Your Burp??
        System.out.println("How Long is Your Burp??");
        Scanner sc = new Scanner(System.in);

        int bp = sc.nextInt();
        String msg = "";
        for(int i =0;i<= bp;i++){
            msg = msg+"r";

        }
      System.out.println("Bu"+msg+"p");

    }
    
}
