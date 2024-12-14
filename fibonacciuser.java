import java.util.Scanner;
class fibonacciuser{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number of term for the Fibonacci series:");
        int n=scanner.nextInt();
        int firstTerm=0,secondTerm=1;
        System.out.println("Fibonacci series till"+n+"terms");
        for (int i=1;i<=n;i++){
            System.out.println(firstTerm+"  ");
            int nextTerm=firstTerm+secondTerm;
            firstTerm=secondTerm;
            secondTerm=nextTerm;
        }
        scanner.close();

    }
}
