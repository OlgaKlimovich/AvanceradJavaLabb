/*Räkna ut antalet primtal inom intervallet 0 till 500'000. Dela upp intervallet på 2 eller
 flera trådar, som var för sig räknar på antalet primtal inom sin tilldelade del parallellt.
 Du kan t.ex. låta en tråd ta en första del (typ 0 till 350'000) och en annan tråd resten  350'001
 till 500'000. Det är dock givetvis tillåtet med något eget mer avancerat och effektivt upplägg också.
 */
package question4;

import java.util.ArrayList;

public class Question4 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(()->{
            int i,j;
            ArrayList<Integer> count=new ArrayList<>();
            boolean isPrime;
            for (i=2;i<350000;i++){
                isPrime=true;
                for (j=2;j<=i/j;j++)
                    if ((i%j)==0)
                        isPrime=false;
                if (isPrime) {
                    count.add(i);
                }
            }
            System.out.println(count.size());
        });

        Thread thread2 = new Thread(()->{
            int i,j;
            ArrayList<Integer> count=new ArrayList<>();
            boolean isPrime;
            for (i=350000;i<=500000;i++){
                isPrime=true;
                for (j=2;j<=i/j;j++)
                    if ((i%j)==0)
                        isPrime=false;
                if (isPrime) {
                    count.add(i);
                }
            }
            System.out.println(count.size());
        });

        thread1.start();
        thread2.start();
    }
}






