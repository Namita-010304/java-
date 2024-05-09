// class threads extends Thread {
//     public void run() {
//         try {
//             for (int i = 0; i <= 5; i++) {
//                 System.out.println(Thread.currentThread().getName() + " thread ");
//                 Thread.sleep(1000);
//             }
//         } catch (InterruptedException e) {
//             e.printStackTrace();
//         }
//     }
// }
// public class MultipleThreads {
//     public static void main(String[] args) {
//         MyThread thread1 = new MyThread();
//         MyThread thread2 = new MyThread();

//         // Start the threads
//         thread1.start();
//         thread2.start();
//     }
// }

// class A extends Thread{

//     A();
//     {
//         super("User");
// }
// public void run()
// {
//     try{
//         for(int i=1;i<=5;i++)
//         {
//             System.out.println(Thread.currentThread().getName() + " thread ");
//             Thread.sleep(1000);
//         }
//     }
//     catch(InterruptedException e){ }
// }
// }
// public class multiple 
// {
//     public static void main(String[] args) {
//         A ta= new A();
//     }
// }

// class ab implements Runnable
// {
//     Thread t;
//      ab()
//      {
//         t= new Thread(this,"user");
//         t.start();
//     }
//     public void run()
//     {
//         try{
//             for(int i=0;i<=3;i++)
//             {
//                 System.out.println(Thread.currentThread().getName()+"thread here");
//                 Thread.sleep(1000);
//             }
//         }catch(InterruptedException e){}
//     }
// }
// class runnableinterface
// {
//     public static void main(String[] args) {
//         ab ta= new ab();
//         try{
//             for(int i=0;i<=3;i++)
//             {
//                 System.out.println(Thread.currentThread().getName()+"thread here");
//                 Thread.sleep(1000);

//             }

//         }catch(InterruptedException e){}
//     }
// }
/**
 * thredas
 */
public class thredas {
    public static void main(String[] args) {
Thread t= new Thread(()->
{
for(int i=0;i<=3;i++)
{
    System.out.println(Thread.currentThread().getName()+"thread here");
    Thread.sleep(1000);

}
}
);
Thread x= new Thread(()->
{
for(int i=0;i<=3;i++)
{
    System.out.println(Thread.currentThread().getName()+"thread here");
    Thread.sleep(1000);
}
});
}
}

