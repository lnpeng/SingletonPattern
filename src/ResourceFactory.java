public class HolderClassSingleton {
    private static class InstanceHolder {
        static final HolderClassSingleton instance = new HolderClassSingleton();
    }

    public static HolderClassSingleton getInstance() {
        return InstanceHolder.instance;
    }
}
