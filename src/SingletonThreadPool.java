public class SingletonThreadPool {
    private static SingletonThreadPool instance;
    private SingletonThreadPool(){}

    public static SingletonThreadPool getInstance(){
        if(instance == null){
            synchronized (SingletonThreadPool.class){
                if(instance == null){
                    instance = new SingletonThreadPool();
                }
            }
        }
        return  instance;
    }
}
