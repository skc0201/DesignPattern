public class Main {
    public static void main(String[] args) {
        System.out.println("Thread Pool Singleton Design pattern");
        ThreadPool1 threadPool1 = new ThreadPool1();
        threadPool1.run();
        ThreadPool2 threadPool2 = new ThreadPool2();
        threadPool2.run();
        ThreadPool1 threadPool3 = new ThreadPool1();
        threadPool3.run();
    }
}