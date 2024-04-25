package HomeWork.Lambda_Expressions_and_Functional_Interfaces.Worker;

@FunctionalInterface
public interface OnTaskDoneListener {
    void onDone(String result);
}
