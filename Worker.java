
public class Worker {

    private OnTaskDoneListener callback;
    private OnTaskErrorListener errorCallback;

    public Worker(OnTaskDoneListener callback) {
        this.callback = callback;
    }

    public Worker(OnTaskErrorListener errorCallback) {
        this.errorCallback = errorCallback;
    }

    public void start() {
        for (int i = 0; i < 100; i++) {
            if (i == 33) {
                OnTaskErrorListener listenerError=System.out::println;
                Worker worker= new Worker(listenerError);
                worker.errorCallback.onError("Error.Task " + i + " is not done");
            } else {
                callback.onDone("Task " + i + " is done");
            }
        }
    }


    @FunctionalInterface
    public interface OnTaskDoneListener {
        void onDone(String result);
    }

    public interface OnTaskErrorListener {
        void onError(String result);
    }

}
