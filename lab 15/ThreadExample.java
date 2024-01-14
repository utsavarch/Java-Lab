public class ThreadExample {
    public static int sharedVariable = 0;

    public static void main(String[] args) {
        // Creating a thread by extending Thread class
        Thread extendingThread = new Thread() {
            public void run() {
                sharedVariable++;
            }
        };
        extendingThread.start();

        // Creating a thread by implementing Runnable interface
        Runnable myRunnable = () -> {
            sharedVariable++;
        };
        Thread implementingThread = new Thread(myRunnable);
        implementingThread.start();

        // Displaying thread states
        System.out.println("Extending Thread State: " + extendingThread.getState());
        System.out.println("Implementing Thread State: " + implementingThread.getState());

        try {
            extendingThread.join();
            implementingThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Handling concurrency problems
        System.out.println("Shared Variable after threads execution: " + sharedVariable);

        // Setting thread priorities
        extendingThread.setPriority(Thread.MAX_PRIORITY);
        implementingThread.setPriority(Thread.MIN_PRIORITY);

        System.out.println("Extending Thread Priority: " + extendingThread.getPriority());
        System.out.println("Implementing Thread Priority: " + implementingThread.getPriority());

        // Main thread priority
        System.out.println("Main Thread Priority: " + Thread.currentThread().getPriority());
    }
}
