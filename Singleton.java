///
/// Singleton Class
///
class Singleton
{
    // Singleton instance stored in private static variable
    private static Singleton _instance;
    
    //Private Constructor
    private Singleton()
    {
        
    }

    //Static method handles Singleton object creation
    public static Singleton getSingletonInstance()
    {
        if(_instance == null)
        {
            _instance = new Singleton();
        }
        return _instance;
    }

    public static void performSomeLogic()
    {

    }
}
