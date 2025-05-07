public class Study22_1 {

    int a = 5;
    int b = 7;
    int c = 12;

    public Study22_1() {}
    public Study22_1(int a, int b) {}
    public Study22_1(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;    
    }

    public String toString() {
        return a + "*" + c + "=" + (a*c);

    }
}
