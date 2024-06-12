package nested;

public class Out {
    public int a = 5;

    public class In {
        public int a = 10;

        public void run(){
            System.out.println(a);
            System.out.println(this.a);
        }
    }
    public void run(){
        In in = new In();
        in.run();
    }

}
