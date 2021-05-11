public class ThreadWake {

    public static void main(String[] args)  {

     ThreadB b= new ThreadB();
     b.start();


     synchronized (b){
         System.out.println("waiting for b to complete");
         try {
             b.wait();
         } catch (InterruptedException e) {
             e.printStackTrace();
         }
         System.out.println("Total is: " +b.total);

     }
            }

       static class ThreadB extends Thread{
        int total;
        @Override
        public void run(){
            synchronized (this){
                for(int i=0; i<100; i++){
                    total+=i;
                }
                notify();
            }
        }

        }










}
