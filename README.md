[<img src="./screenshots/DiagramMap.svg">](https://raw.githubusercontent.com/takaakit/design-pattern-examples-in-scala/master/screenshots/DiagramMap.svg)

Design Pattern Examples in Scala
===

Model and code examples of GoF Design Patterns for Scala.  
This project is available for the following objectives:  

* To understand GoF Design Pattern examples in Scala.
* To understand the mapping between UML model and Scala code.
* To try Model-Driven Development (MDD) using Astah and M PLUS plug-in.

> UML model example:

![](screenshots/CompositePattern.svg "Composite Pattern")

<a id="code-example"></a>
> Scala code example:

```scala:File class
// ˅
package structuralPatterns.composite

// ˄

class File(_name: String, _size: Int) extends FileSystemElement {
  // ˅
  
  // ˄

  private val name: String = _name

  private val size: Int = _size

  override def getName(): String = {
    // ˅
    name
    // ˄
  }

  override def getSize(): Int = {
    // ˅
    size
    // ˄
  }

  // Print this element with the "upperPath".
  override def print(upperPath: String): Unit = {
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
**UML Modeling Tool**
* Download the modeling tool [Astah](http://astah.net/download) UML or Professional, and install.  
* Download [M PLUS](https://sites.google.com/view/m-plus-plugin/download) plug-in **ver.2.7.6** or higher, and add it to Astah.  
  [How to add plugins to Astah](https://astahblog.com/2014/12/15/astah_plugins/)

**Scala Development Environment**
* Install Java Development Kit (JDK) and JavaFX.  
  If you don't want to install JavaFX, you need to remove the following packages that use JavaFX to prevent build errors.
  - src/main/scala/behavioralPatterns/command
  - src/main/scala/behavioralPatterns/mediator
  - src/main/scala/behavioralPatterns/state
* Optionally, install an IDE (e.g. [IntelliJ](https://www.jetbrains.com/idea/download/)).

Usage
-----
**Code Generation from UML**
  1. Open the Astah file (model/DesignPatternExamplesInScala.asta).
  2. Select model elements on the model browser of Astah.
  3. Click the **Generate Code** button.  
  ![](screenshots/GenerateCode.gif "Generate Code")  
  The generated code has **User Code Area**. The User Code Area is the area enclosed by "˅" and "˄". Handwritten code written in the User Code Area remains after a re-generation. [View code example](#code-example).  
  For detailed usage of the tools, please see [Astah Manual](http://astah.net/manual) and [M PLUS plug-in Tips](https://sites.google.com/view/m-plus-plugin-tips).

**Build and Run (if you use IntelliJ)**
  1. Open the project root directory (design-pattern-examples-in-scala) in IntelliJ.
  2. Open `Main.scala` for the pattern you want to run, and click `Run` icon in the left gutter.
     ![](screenshots/BuildAndRun.gif "Build and Run")  

References
----------
* Gamma, E. et al. Design Patterns: Elements of Reusable Object-Oriented Software, Addison-Wesley, 1994
* Hiroshi Yuki. Learning Design Patterns in Java [In Japanese Language], Softbank publishing, 2004

Licence
-------
This project is licensed under the Creative Commons Zero (CC0) license. The model and code are completely free to use.

[![CC0](http://i.creativecommons.org/p/zero/1.0/88x31.png "CC0")](http://creativecommons.org/publicdomain/zero/1.0/deed)
