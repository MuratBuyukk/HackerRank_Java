package Advanced;

class Singleton{

    public String str;
    private static Singleton singleton = new Singleton();

    private Singleton()
    {
    }
    static Singleton getSingleInstance()
    {
        return singleton;
    }
}
public class Java_Singleton_Patern {
}
