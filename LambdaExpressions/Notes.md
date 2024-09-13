Defination?
--> Kind of like anonymous functions. has no name, takes input and returns a value. lets you define types
--> Can be implemented in body of a method

--> Interesting stuff
--> can be assigned to a variable if variable is type interface(interface can only have 1 method) .(but why do we need it though? just use regular funcs)

Why do we need the lambda expressions at all?
-->  because java needs a lot of code to do small stuff, lambda expressions make it a bit shorter
--> Also , this seems to be an option to write functional code in java

Why do we need to create custom interfaces to use lambda expressions?
--> Because we get custom method name, parameter and return type
--> So a bit of type safety, and some what readibility

What is functional interface?
Interface with just one method. Need to use @FunctionalInterface annotation to force it to have only one method



What is predicate interface?