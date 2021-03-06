# Dependency injection example in Java and Spring

## About
Dependency injection is used to decouple conventional dependendency relationships between two objects,
so that objects are not tied to each other.

## Implementation
* in pure Java
    In this program the 'Drawing' class is independent of the shape it's drawing. 
    This depends on which dependency is injected in the "Main" class.
* in Spring framework 
    In the Spring framework the dependency is injected based on the content of the spring.xml file. Thanks to this we can change the shape drawn without recompiling the Java code. In the "App" class we set the application context file location and create a class which is of type Triangle or Rectangle depending on which is mentioned in the spring.xml file.
