import java.util.Scanner;

public class square3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char ch = 'A';
        for(int i = 1;i<n;i++){
             
            for(int j =1 ;j<n;j++){
                System.out.print(ch);
                ch = (char)(ch+1);
            }
            System.out.println();
        }

    }
}
