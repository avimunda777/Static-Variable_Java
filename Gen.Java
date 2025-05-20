class Gen
{
    static int a = 10;
    void fun()
    {
        int b = 10;
        System.out.println(a+" "+b); // 11 10
        ++a; ++b; // 11
    }
    public static void main(String[] args)
    {
        Gen r=new Gen();
        r.fun();
        r.fun();
    }
}