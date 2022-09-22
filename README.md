# Homeworksep21
================================Know Your Variables=================================

A variable is just a cup. A container. It holds something.
Variables must have a type and a name.
Primitives hold fundamental values including integers, booleans, and floating point numbers 

=================================How Objects Behave=================================

We know that objects have state and behavior, represented by instance variables and methods. 
a class describes what an object knows and what an object does. A class is the blue print for an object. 
Every instance of a class has the same methods, but the methods can behave differently based on the value of the instance variable 

=================================Serious Polymorphism================================

Polymorphism means many forms. 
for example, you can create a sing method that is inherited amongst 3 subclasses of a superclass. however each inherited method is unique to the subclass
depending on the return 
subclasses are extensions of a superclass which is why we use the extends keyword

==============================Life and Death of an Object===========================

The stack and the Heap: Where things live

The stack: Where method invocations and local variables live.
The Heap: Where all objects live also known as the garbage collectible Heap 

methods are stacked.when you call a method, the method lands on the top of a call stack. That new thing thats actually pushed onto the stack is the stack frame,
and it holds the state of the method including which line of code is executing, and the values of all local variables 
The method at the top is always the curently running method for that stack.

The object always goes to the heap. no matter where the reference variable is declared
