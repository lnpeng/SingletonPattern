public class ResourceFactory {
    private static class ResourceHolder {
        static final Resource instance = new Resource();
    }

    public static Resource getResource() {
        return ResourceHolder.instance;
    }
    
    static class Resource {
    }
}
