package HomeWork.Lambda_Expressions_and_Functional_Interfaces.Worker;

public class Worker {

    private OnTaskDoneListener callback;
    private OnTaskErrorListener errorCallback;

    public Worker(OnTaskDoneListener callback, OnTaskErrorListener errorCallback) {
        this.callback = callback;
        this.errorCallback = errorCallback;
    }

    public void start() {
        for (int i = 0; i < 100; i++) {
            if (i == 33) {
                errorCallback.onError("Task " + i + " is not done");
            } else {
                callback.onDone("Task " + i + " is done");
            }
        }
    }
}
