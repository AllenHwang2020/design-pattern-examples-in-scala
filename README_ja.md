Design Pattern Examples in Scala
===

[English](README.md) | 日本語

Scala向けに作成したデザインパターンのモデル＆コード例です。  
次のような目的で活用ください。

* Astah と M PLUS プラグインを使ってモデル駆動開発を試す。
* UML モデルと Scala コードのマッピングを知る。
* Scala で記述したデザインパターンのコード例を知る。  
  など  

> UML モデル例:

![](screenshots/CompositePattern.png "Composite Pattern")

> Scala コード例:

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

インストール
------------
**Astah**
* [チェンジビジョンのサイト](http://astah.change-vision.com/ja/download.html)から Astah の Community or UML or Professional をダウンロードしインストールしてください。  
  Community は無償、UML と Professional は有償です。  

**M PLUS プラグイン**
* [M PLUS プラグインのサイト](https://sites.google.com/view/m-plus-plugin/download)からプラグインをダウンロードしインストールしてください。  
  **バージョン 2.0 以降をダウンロードしてください。**  

**Scala 開発環境**
* 任意の Scala 開発環境を用意してください。[IntelliJ](https://www.jetbrains.com/idea/download/) など。


使い方
------
* Astah のモデルブラウザ上でモデル要素を選択し、コード生成ボタンを押すとコードが生成されます。  
* 生成されたコードにはユーザコードエリアが挿入されます。ユーザコードエリアは "˅" と "˄" で挟まれた領域です。ユーザコードエリア内に書いた手書きコードは繰り返しコード生成しても維持されます。  
* パターン毎に用意した Main.scala からプログラムを実行できます。
* ツールの詳しい使い方は、[Astah のマニュアル](http://astah.change-vision.com/ja/manual.html)や [M PLUS の Tips](https://sites.google.com/view/m-plus-plugin/tips) を見てください。

![](screenshots/Usage.gif "Usage")

参考文献
--------

* Gamma, E. et al. Design Patterns: Elements of Reusable Object-Oriented Software, Addison-Wesley, 1994
* 結城浩. Java 言語で学ぶデザインパターン入門. SB クリエイティブ, 2004

Contributing
----
We welcome your contributions. Function addition, bug fix, refactoring, etc.  
The procedure is as follows.

1. Fork the repository and create your branch from master.
2. If you've changed model or code, check that the model and code are not separate. The check procedure is as follows.
    1. Select a project element on the model browser of Astah.  
    ![](screenshots/SelectModelElements.png "")
    2. Press the "Generate code" button.  
    ![](screenshots/PressCodeGenerationButton.png "")
    3. Check that the generated code is not updated.  
    ![](screenshots/CheckGeneratedCode.png "")
3. Issue the pull request!

Licence
----------
このプロジェクトは Creative Commons Zero（CC0）ライセンスです。モデルとコードは自由に使用できます。

[![CC0](http://i.creativecommons.org/p/zero/1.0/88x31.png "CC0")](http://creativecommons.org/publicdomain/zero/1.0/deed.ja)