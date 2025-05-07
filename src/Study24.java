public class Study24 {
    public static void main(String[] args) {
        S24A s24a = new S24A();
        S24B s24b = new S24B();
        // s24a.run();
        // s24b.run();
        s24b.call(s24a, s24b);

    }

    
}    

    class S24AB {
        public void run() {
            System.out.println(this + "안녕하세요.");

}
    }


    class S24A extends S24AB {
       public void call(S24A s24a, S24B s24b) {
         s24a.run();
         s24b.call(s24a, s24b);
       }
    }

    class S24B extends S24AB{
        public void call(S24A s24a, S24B s24b) {
            s24b.run();
            s24a.call(s24a, s24b);
        }
    }
  

