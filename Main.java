package HomeWork.Lambda_Expressions_and_Functional_Interfaces.Worker;

public class Main {
    public static void main(String[] args) {

        OnTaskDoneListener listener = result -> System.out.println("Success: " + result);
        OnTaskErrorListener errorListener = error -> System.err.println("Error: " + error);

        Worker worker = new Worker(listener, errorListener);
        worker.start();
    }
}
