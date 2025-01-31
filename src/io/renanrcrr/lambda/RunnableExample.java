package io.renanrcrr.lambda;

public class RunnableExample {
    public static void main(String[] args) {
        // Runnable traditional
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                int sum = 0;
                for (int i=0;i<10;i++)
                    sum+=i;
                System.out.println("Runnable Traditional: " + sum);
            }
        };
        new Thread(runnable).start();

        // Implement using lambda
        Runnable runnable1 = () -> {
          int sum = 0;
          for(int i=0;i<10;i++)
              sum+=i;
          System.out.println("Runnable Lambda: " + sum);
        };
        new Thread(runnable1).start();

        //Implement using Thread with lambda
        new Thread(() -> {
            int sum = 0;
            for(int i=0;i<10;i++)
                sum+=i;
            System.out.println("Thread Lambda: " + sum);
        }).start();
    }
}
