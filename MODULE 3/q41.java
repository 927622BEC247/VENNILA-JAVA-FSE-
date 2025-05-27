import java.util.concurrent.*;

public class q41 {
    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        Callable<String> task = () -> "Result from thread";
        Future<String> result = executor.submit(task);
        System.out.println(result.get());
        executor.shutdown();
    }
}
