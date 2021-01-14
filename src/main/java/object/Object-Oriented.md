# Object-Oriented Programming Concepts

## What is an object

An object is a *software bundle*（软件包）of related state and behavior. Software objects are often used to model the real-world objects that you find in everyday life. This lesson explains how state and behavior are represented within an object, introduces the concept of data *encapsulation*（封装）, and explains the benefits of designing your software in this manner.

Real-world objects share two characteristics: they all have state and behavior. Identifying the state and behavior for real-world objects is a great way to  begin thinking in terms of object-oriented programming.

Hiding internal state and requiring all interaction to be performed through an object's methods is known as data encapsulation—a fundamental principle of object-oriented programming.

Bundling code into individual software objects provides a number of benefits, including:

- Modularity（模块化）
- Information-hiding
- Code re-use
- Pluggability（可插拔性）and debugging ease

## What is a class

A class is a blueprint or prototype from which objects are created. This section defines a class that models the state and behavior of a real-world object. It intentionally focuses on the basics, showing how even a simple class can cleanly model state and behavior.

## What is inheritance

Object-oriented programming allows classes to inherit commonly used state and behavior from other classes. However, you must take care to properly document the state and behavior that each superclass defines, since that code will not appear in the source file of each subclass.

## What is an interface

An interface is a contract between a class and the outside world. When a class implements an interface, it promises to provide the behavior published by that interface.

As you've already learned, objects define their interaction with the outside world through the methods that they expose. Methods form the object's *interface* with the outside world;

## What is a package

A package is a namespace for organizing classes and interfaces in a logical manner. 