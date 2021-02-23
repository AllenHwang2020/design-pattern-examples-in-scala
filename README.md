[<img src="./screenshots/DiagramMap.svg">](https://raw.githubusercontent.com/takaakit/design-pattern-examples-in-scale/master/screenshots/DiagramMap.svg)

Design Pattern Examples in Scala
===

Model and code examples of design patterns for Scala.  
You can utilize this examples as follows.

* You try Model-Driven Development (MDD) using Astah and M PLUS plug-in.
* You understand the mapping between UML model and Scala code.
* You understand the design pattern examples in Scala.  
  etc.

> UML model example:

![](screenshots/CompositePattern.png "Composite Pattern")

> Scala code example:

```scala:File class
// ˅
package structuralPatterns.composite

// ˄

class File(_name: String, _size: Int) extends FileSystemElement {
  // ˅

  // ˄

  override protected val name: String = _name

  override protected val size: Int = _size

  // Print this element with the "upperPath".
  override def print(upperPath: String) = {
    // ˅
    println(f"$upperPath/$this")
    // ˄
  }

  // ˅

  // ˄
}

// ˅

// ˄
```

Installation
------------
**Astah**
* Download Astah UML or Professional from [Change Vision site](http://astah.net/download), and install.  

**M PLUS plug-in**
* Download the plug-in from [M PLUS plug-in site](https://sites.google.com/view/m-plus-plugin/download), and install.  
  **Use ver.2.0 or higher.**

**Development Environment for Scala and JavaFX**
* Prepare an arbitrary development environment for Scala and JavaFX. If you don't want to install JavaFX, you need to remove the following packages that use JavaFX to prevent build errors.
  - src/main/scala/behavioralPatterns/command
  - src/main/scala/behavioralPatterns/mediator
  - src/main/scala/behavioralPatterns/state

Usage
-----
* Select model elements on the model browser of Astah, and press the "Generate code" button to generate.  
* The generated code has "User Code Area". The "User Code Area" is the area enclosed by "˅" and "˄". Handwritten code written in the "User Code Area" remains after a re-generation.
* You can run the program from "Main.scala" for each design pattern.
* For detailed usage of the tools, please see [Astah Manual](http://astah.net/manual) and [M PLUS plug-in Tips](https://sites.google.com/view/m-plus-plugin/tips).

![](screenshots/Usage.gif "Usage")

References
----------
* Gamma, E. et al. Design Patterns: Elements of Reusable Object-Oriented Software, Addison-Wesley, 1994
* Hiroshi Yuki. Learning Design Patterns in Java [In Japanese Language], Softbank publishing, 2004

Licence
-------
This project is licensed under the Creative Commons Zero (CC0) license. The model and code are completely free to be used.

[![CC0](http://i.creativecommons.org/p/zero/1.0/88x31.png "CC0")](http://creativecommons.org/publicdomain/zero/1.0/deed)
