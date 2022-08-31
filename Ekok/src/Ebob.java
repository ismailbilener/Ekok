import java.util.Scanner;

public class Ebob {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ekok, n1,n2;
        System.out.print("n1  giriniz: ");
        n1=input.nextInt();

        System.out.print("n2 giriniz: ");
        n2=input.nextInt();
        int i=1;
        ekok=1;
        while(i<n1*n2){
            if (i%n1==0 && i%n2==0){
               ekok=i;
               break;
            }
            else
                i++;
        }
        System.out.println(ekok);
    }
}
