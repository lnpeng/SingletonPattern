# SingletonPattern

The Singleton Pattern ensures a class has only one instance, and provides a global point of access to it.

`ResourceFactory` is a thread safe singleton factory class. It uses `ResourceHolder` class whose only purpose is to initialize the `Resource`. The JVM defers initializing the `ResourceHolder` class until it is actually used. Because the `Resource` is initialized with a static initialzer, no synchrozation is needed. The first call to `getResource` by any thread causes `ResourceHolder` to be loaded and initialized, at which time the initialization of the `Resource` happens through the static initialization.
