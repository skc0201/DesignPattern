public class ThreadPool1 implements Runnable{
    @Override
    public void run() {
        SingletonThreadPool singletonThreadPool = SingletonThreadPool.getInstance();
        System.out.println("HasCode of Thread -1: "+ singletonThreadPool );
    }
}
