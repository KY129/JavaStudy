public class Study25 {

    public static void main(String[] args) {
        new Study25_C().run();
    }
    
}

class Study25_C implements Study25_I {

    @Override
    public void run() {
        System.out.println(txt);
    }

}

interface Study25_I {
    public final String txt = "인터페이스";
    public void run();
}
