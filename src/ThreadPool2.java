public class ThreadPool2 implements Runnable {

    @Override
    public void run() {
        SingletonThreadPool singletonThreadPool = SingletonThreadPool.getInstance();
        System.out.println("HasCode of Thread -2: "+ singletonThreadPool);
    }
}
