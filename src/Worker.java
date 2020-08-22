public class Worker {
    private OnTaskDoneListener callback;
    private OnTaskErrorListener errorCalback;

    public Worker(OnTaskDoneListener callback, OnTaskErrorListener errorCalback) {
        this.callback = callback;
        this.errorCalback = errorCalback;
    }

    public void start() {
        for (int i = 0; i < 100; i++) {
            if (i == 33) {
                errorCalback.onError("Task " + i + " is failed");
            } else {
                callback.onDone("Task " + i + " is done");
            }
        }
    }
}
