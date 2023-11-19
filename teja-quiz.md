```yaml
11/14/2023:
 - Classes, Object, Object initiation
 - Constructors, NoArg, All Arg, Access modifiers, (pending default and protected), covered private and public
 ```

> 11/18/2023
 ```yaml
 What are the different access modifiers in Java?:
  - default, public, private, protected
 Can we access the class with 'default' access modifier outside the declared package?:
  - No, explain? - 
 ```

 ```java
 package com.test1;

 class Animal {
    public void eat(){
     // dosoemthing; 
    }
 }
//
package com.test2;

import com.test1.Animal;
class Main {
    // will the code compile
    Animal animal = new Animal();
}
 ```