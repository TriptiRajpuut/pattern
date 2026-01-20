import java.util.scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of stars: ");
        int n = sc.nextInt();

        for(int i=0; i<n;i++){
            System.out.println("*");

        }
        for(int i=0;i<n-1;i++){
            System.out.print("*");
        }
    }
}