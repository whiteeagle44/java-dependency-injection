# Dependency injection example in Java and Spring

## About
Dependency injection is used to decouple conventional dependendency relationships between two objects,
so that objects are not tied to each other.

## Implementation
* in pure Java

    In this program the 'Drawing' class is independent of the shape it's drawing. 
    This depends on which dependency is injected in the "Main" class.
* in Spring framework 
    * XML based configuration (old)

    In the "App" class we set the application context file location and a class of type Triangle or Rectangle is created depending on which is mentioned in the spring.xml file (Rectangle in this case).

    `spring.xml`

    ```
    <bean id="shape" class="org.example.Rectangle"/> 
    ```

    * Annotation based configuration

    We can mark appropriate classes with annotation "@Component". Then Spring will autodetect these classes for dependency injection.  We need to specify the class that we want to use in the "App" class. It will be automatically found and used when annotation-based configuration and classpath scanning is set up in _spring.xml_. 
    
    `App.java`

    ```
        Shape shape = (Shape) applicationContext.getBean("rectangle");
    ```

    `spring.xml`

    ``` 
    <context:component-scan base-package="org.example"/>
    ```


