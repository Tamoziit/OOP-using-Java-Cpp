public class Thread2 {
    public static void main(String[] args) {
        // (i) Get current thread
        Thread currentThread = Thread.currentThread();

        // Print original name, priority, and thread group
        System.out.println("Original Thread Name: " + currentThread.getName());
        System.out.println("Thread Priority: " + currentThread.getPriority());
        System.out.println("Thread Group: " + currentThread.getThreadGroup().getName());

        // (ii) Change the name of the thread
        currentThread.setName("MyThread");

        // (iii) Display updated thread details
        System.out.println("\nUpdated Thread Details:");
        System.out.println("Thread Name: " + currentThread.getName());
        System.out.println("Thread Priority: " + currentThread.getPriority());
        System.out.println("Thread Group: " + currentThread.getThreadGroup().getName());
        System.out.println("Full Thread Info: " + currentThread);
    }
}
