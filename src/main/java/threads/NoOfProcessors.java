package main.java.threads;

/**
 * This class prints the no of processors on standard output stream.
 */
public class NoOfProcessors {

    public static void main(String arg[]) {
        System.out.println("No of processors - "+Runtime.getRuntime().availableProcessors());
    }

}
