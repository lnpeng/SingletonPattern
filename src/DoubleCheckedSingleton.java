public class DoubleCheckedSingleton {
    private volatile DoubleCheckedSingleton instance;

    public DoubleCheckedSingleton getInstance() {
        DoubleCheckedSingleton result = instance;
        if (result == null) {
            synchronized (this) {
                result = instance;
                if (result == null) {
                    instance = result = new DoubleCheckedSingleton();
                }
            }
        }
        return result;
    }
}
