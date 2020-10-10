### Dive Into Design Patterns

####Basics of OOP
1. Objects -> data and behaviour in a bundle.
2. data - state
3. behaviour - methods

class is blueprint to constructs objects.
---
####UML:
1. Fields (state)
2. Methods (behaviour)
3. '+ public
4. '- private
5. empty triangle - inheritance. Cat sub class -> Animal(super class)
  empty triangle with dashed line- class implements interfaces.
  simple arrow means class depends on the other.
6. Collectively fields and methods can be referenced as the members of the class.
7. Object - concerte instances of the class.
---
####Class Hierarchies
1. Dog and Cat ( Animal)  common state and behaviour is moved to parent class.
2. parent class - super class
3. children sub class
4. sub classes inherit the state and behaviour  from their parent, defining only the attributes and behaviour that differ.
5. sub classes can override the behaviour of methods that they inherit from parent. can either completely replace default behaviour or 
enchance with some stuff.
---
####Pillars of OOP
1. Abstraction
2. Polymorphism
3. Encapsulation
4. Inheritance

#####Abstraction : 
   model of real world objects
#####Encapsulation: 
Interface to under the hood. interface - public part of the object, open interactions with other objects.
   1. ability of an object to hide parts of its state and behavoiours from other objects.
   2. private- only accessible within the methods of its own class.
   3. protected - little less restrictive. lets the subclass to access the members of the class.

Interfaces and Abstract class are based on Abstraction and Encapsultation.

1. Interface- define the contract with the object.
2. Interface cares only about the behaviour of the object and cant declare the field in the interface.

#####Inheritance
1. ability to build new classes on top of existing ones.
2. code reuse.
3. If a super class implements an interface, all of its sub classes must also implement it.
4. sub class can extend only one superclass.
---
###Relation with Objects

1. **UML Association**
    <p>Association is a type of relationship in which one object uses or interacts with another.
    association - represents something like a field in a class. or a link like interface.. example: ask an order for its customer.
    simple arrow between class.</p>
2. **UML Dependency**
     <p>weaker variant of association that implies no permanent link between objects.
     dependency exists between classes if changes to the definition of one class result in modifications in another class.
     dashed --> line</p>
3. **UML Composition**
    <p>"whole-part" relationship between two objects
     line with a <i>filled diamond</i> at the container end and an arrow at the end pointing toward the component.</p>
4. **UML Aggregation**
    <p>less strict variant of composition, where one object merely contains a reference to another.
    line with a <i>empty diamond.</i></p>
---
### Creational Patterns
#### Factory Method
   ***a.ka. Virtual Construtor***
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

#### Abstract Factory

   ***a.k.a Kit***
    <p>
    Creational patterns that provides an interface for creating similiar / family objects in a
    superclass, but allows subclasses to alter the type of the objects that will be created.   </p>
  - Structure:
    - Abstract Products - Interfaces --> set of distinct related products
    - Concrete product implementing products interfaces. 
    - Abstract Factory interface declares a set of methods for creating each of the abstract products.
    - Concrete Factories - implement creation methods of the Abstract Factory.
    - Although concrete factories instantiate concrete products -> must return abstract products.
        Client Code uses the factory doesnt get coupled to the specific variant of the product it gets from a factory.
---