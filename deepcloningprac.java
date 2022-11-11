class test{
    int x,y;
}
class test1 implements Cloneable{
    int a,b;
    test c = new test();
    public Object clone() throws CloneNotSupportedException{
        test1 t = (test1)super.clone();
        t.c = new test();
        return(t);
    }
}
public class deepcloningprac {
    public static void main(String[] args) {
        try{
            test1 ob = new test1();
            ob.a = 10;
            ob.b = 20;
            ob.c.x = 100;
            ob.c.y = 200;
            test1 ob1 = (test1)ob.clone();
            ob1.a=75;
            ob1.c.x=380;
            System.out.println(ob.a+" "+ob.b+" "+ob.c.x+" "+ ob.c.y);
            System.out.println(ob1.a+" "+ob1.b+" "+ob1.c.x+" "+ ob1.c.y);
        }
        catch(Exception e){
            System.out.println("Error: "+ e);
        }
    }
}
