package lab1;

// Find prime numbers

public class Primes
{
    public static void main(String[] args)
    {
        int nValues = 10000;
        label : for (int i = 2; i <= nValues; i++) {
                    for (int j = 2; j < Math.sqrt(i); j++){
                        if (i % j == 0) continue label;
                    }
                    System.out.println(i);
        }
    }
}


/**
 2
 3
 5
 7
 11
 13
 17
 19
 23
 29
 31
 37
 41
 43
 47
 */
