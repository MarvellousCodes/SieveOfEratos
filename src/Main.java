import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        int N = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the prime number ceiling: ");
        N = sc.nextInt();

        //go through and cross out prime numbers
        // numbers array boolean true donates primality

        boolean [] isPrime = new boolean[N];
        isPrime[0] = false;
        for (int c = 1; c < N; c++)
        {
            isPrime[c] = true;
        }

        // check every number >= 2 for primality
        for (int i = 2; i <= N; i++){

            // we knoww i is prime if it hasnt it been crossed off
            if(isPrime[i-1]){

                System.out.println(i);

                //cross of multiples of i
                for(int j = i*i; j <=N; j+=i){
                    isPrime[j-1] = false;
                }


            }
        }

    }
}