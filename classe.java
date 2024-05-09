public class classe 
{
    static int x=2;
    static int y=3;
        int a=10;
        static int b=20;
        private int c=30;
        void s1()
        {
            int f= a+c;
            System.out.println(f);
        }
        class inner
        {
            void sum()
            {
                int d= a+b+c;
                System.out.println(d);
            }
            void sub()
            {
                int e= a-c;
                System.out.println(e);
            }
        }

        static class imner
        {
            void sumn()
            {
                int f;
                f= x+y;
                System.out.println(f);
            }
        }
        public static void main(String[] args) {
            classe m= new classe();
            classe.inner n=m.new inner();
            n.sum();
            n.sub();
            m.s1();

            classe.imner q =new imner();
            q.sumn();
        }
    }
