public class ThreadSleep {

    public static void main(String[] args) throws InterruptedException {


        long start=System.currentTimeMillis();
        Thread.sleep(2500);
        System.out.println("Sleep time in m/s: "+(System.currentTimeMillis()-start));



    }

}
