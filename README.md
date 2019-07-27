# Java tricky output related Interview Questions


Q1. What would be the output of below code?

```java
class A
{
    public static void Main(String[] args){
        int a = 10;
        if (true){
             a=a-1;
            System.out.println(a+10);
            break;
        }
    }
}
```

a. 19

b. 910

c. Compile time error

d. Runtime error


>	Answer : C
	Break statement can only be used with loop or switch. So, using break with if statement causes error: break outside switch or loop

------------------------------------------------------------------------

Q.2 What is the output of

```java
class A {
    public static void main(String[] args)
    {
        System.out.println('k' + 'a' + 'm' + 'a' + 'l');
    }
} 
```
 

a. kamal

b. 0

c. Error

d. 518


>	Answer : D
	In this example we have used character literals and not String literals. Therefore output won't be kamal. It would be ascii sum of all characters.
	107 + 97 + 109 + 97 + 108 = 518

------------------------------------------------------------------------

Q3. What would be the output of below code?

```java
 class Parent {
    public void m1() {
       System.out.println("Parent m1");
    }
}
 
class Child extends Parent {
    public void m1() {
       System.out.println("Child m1");
    }
}
 
public class Main {
    public static void main(String[] args) {
        Parent obj = new Child();;
        obj.m1();
    }
} 
```

a. Parent m1

b. Child m1

c. Parent m1 followed by Child m1

d. Child m1 followed by Parent m1


>	Answer : Child m1

------------------------------------------------------------------------

Q 4. What would be the output of below code?

```java
class Parent {
    public void m1() {
       System.out.println("Parent m1");
    }
}
 
class Child extends Parent {
    public void m1() {
       System.out.println("Child m1");
    }
}
 
public class Main {
    public static void main(String[] args) {
        Child obj = new Parent();
        obj.m1();
    }
}
```

a. Parent m1

b. Child m1

c. Parent m1 followed by Child m1

d. Compilation error


>	Answer : Compilation error 
	error: incompatible types: Parent cannot be converted to Child
        Child obj = new Parent()
                    ^

------------------------------------------------------------------------

Q5. What would be the output of below code?

```java
class Parent {
    public Parent() {
       System.out.println("Parent");
    }
}
 
class Child extends Parent {
    public Child() {
       System.out.println("Child");
    }
}
 
public class Main {
    public static void main(String[] args) {
        Child obj = new Child();
    }
}
```

a. Parent
Child

b. Child
Parent

c. Parent

d. Child


>	Answer: a

------------------------------------------------------------------------

Q6. What would be the output of below code?

```java
class Parent {
    public Parent() {
       System.out.println("Parent");
    }
}
 
class Child extends Parent {
    public Child() {
       System.out.println("Child");
    }
}
 
public class Main {
    public static void main(String[] args) {
        Parent obj = new Child();
    }
}
```

a. Parent
Child

b. Child
Parent

c. Parent

d. Child


>	Answer: a

------------------------------------------------------------------------

Q7. What would be the output of below code?

```java
class Parent {
    public Parent() {
       System.out.println("Parent");
    }
}
 
class Child extends Parent {
    public Child() {
       System.out.println("Child");
    }
}
 
public class Main {
    public static void main(String[] args) {
        Parent obj = new Parent();
    }
}
```

a. Parent
Child

b. Child
Parent

c. Parent

d. Child


>	Answer:c


------------------------------------------------------------------------

Q8. What would be the output of below code?

```java
class Parent {
    public Parent() {
       System.out.println("Parent");
       m1();
    }
    public void m1(){
        System.out.println("Parent m1");
    }
}
 
class Child extends Parent {
    public Child() {
       System.out.println("Child");
    }
}
 
public class Main {
    public static void main(String[] args) {
        Parent obj = new Child();
    }
}
```
 
a. Parent
Parent m1
Child

b. Child
Parent
Parent m1

c. Parent
Child
Parent m1

d. Child


>	Answer: a

------------------------------------------------------------------------

Q9. What would be the output of below code?

```java
class Parent {
    public Parent() {
       System.out.println("Parent");
       Child obj = new Child();
    }
}
 
class Child extends Parent {
    public Child() {
       System.out.println("Child");
    }
}
 
public class Main {
    public static void main(String[] args) {
        Child obj = new Child();
    }
}
```

a. Compile time Error

b. Parent
Child
Child

c. Parent
Child

d. Runtime error


>	Answer: Runtime error : Exception in thread "main" java.lang.StackOverflowError

------------------------------------------------------------------------

Q10. What would be the output of below code?

```java
class Parent {
    public Parent() {
       System.out.println("Parent");
    }
}
 
class Child extends Parent{
    public Child() {
       System.out.println("Child");
    }
}
 
public class Main {
    public static void main(String[] args) {
        Child obj = new Child();
    }
    static
    {
        System.out.println("Static block");   
    }
}
```
 

a. Parent
Child

b. Parent
Child
Static block

c. Child
Parent
Static block

d. Static block
Parent
Child


>	Answer : d

------------------------------------------------------------------------

Q11. What would be the output of below code?

```java
class Parent {
    public Parent() {
       System.out.println("Parent");
    }
}
 
class Child extends Parent{
    public Child() {
       System.out.println("Child");
    }
    static
    {
        System.out.println("Static block 1");   
    }
}
 
public class Main {
    public static void main(String[] args) {
        Child obj = new Child();
    }
    static
    {
        System.out.println("Static block 2");   
    }
}
```
 

a. Static block 2
Static block 1
Parent
Child

b.Static block 1
Static block 2
Parent
Child

c. Static block 2
Parent
Child 

d. Static block 1
Parent
Child

e. Parent
Child

f. Parent
Static block 1
Child
Static block 2

 
>	Answer : a

------------------------------------------------------------------------

Q12. What would be the output of below code?

```java
class Parent {
    public Parent() {
       System.out.println("Parent");
    }
    static
    {
        System.out.println("Static block 1");   
    }
}
 
class Child extends Parent{
    public Child() {
       System.out.println("Child");
    }
    static
    {
        System.out.println("Static block 2");   
    }
}
 
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Kamal");
    }
    static
    {
        System.out.println("Static block 3");   
    }
}
```

a. Static block 3
Hello Kamal

b. Hello Kamal
Static block 3

c. Static block 3
Static block 2
Static block 1 
Hello Kamal

d. Static block 1
Static block 2
Static block 3 
Hello Kamal


>	Answer : a

------------------------------------------------------------------------

Q13. What would be the output of below code?

```java
class Parent {
    public Parent() {
       System.out.println("Parent");
    }
    static
    {
        System.out.println("Static block 1");   
    }
}
 
class Child extends Parent{
    public Child() {
       System.out.println("Child");
    }
    static
    {
        System.out.println("Static block 2");   
    }
}
 
public class Main {
    public static void main(String[] args) {
        Child obj = new Child();
        System.out.println("Hello Kamal");
    }
    static
    {
        System.out.println("Static block 3");   
    }
}
```

a. Static block 3
Parent
Child
Hello Kamal

b. Static block 3
Static block 1
Static block 2
Parent
Child
Hello Kamal

c. Static block 3
Static block 2
Parent
Child
Hello Kamal

d. Error


>	Answer: b

------------------------------------------------------------------------

Q 14. What would be the output of below code?
