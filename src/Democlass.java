
public class Democlass {
    private int x;
    private int y;
    public Democlass() {
        this.x = 0; // default value
        this.y = 0; // default value
    }
    public void setValue(int a, int b)
    {
        this.x=a;
        this.y=b;
    }
    public void getValue()
    {
        System.out.println(this.x);
        System.out.println(this.y);
    }
    public static void main(String[] args)
    {
        Democlass dc=new Democlass();
        dc.setValue(10, 20);
        dc.getValue();
    }
}
