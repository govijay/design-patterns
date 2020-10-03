### Dive Into Design Patterns
#### Creational Patterns
- Factory Method
   <p>a.ka. Virtual Construtor</p>
   <p>
   Creational patterns that provides an interface for creating objects in a
   superclass, but allows subclasses to alter the type of the objects that will be created.   </p>
 - Structure:
   - Interface --> product
     <p>Product declares the interface, which is common to all objects that are produced
     by the creator and its subclasses</p>
   - Concrete product implementing product interface. 
     <p> Concrete product are different implementation of Product Interfaces.</p>
   - Abstract/ Concrete class --> Creator
      <p>Creator class declares the factory method(CreateProduct()) that return new Product Objects </p>
   - Concrete sub class extends creator and override the CreateProduct() factory method.
      <p> Concrete Creators override the base factory method so it returns a different type of product</p>