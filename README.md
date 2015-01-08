h1. JavaFX 2-way Data Binding Example

This is an incredibly barebones example of how Data Binding in JavaFX2 can simplify MVC organized application
development. It does so in the context of a well organized project with clearly defined MVC components.

This example should clearly demonstrate why you want to jump right in to fully embracing the data-binding capabilities
of JavaFX2 rather than writing your own <code>ChangeListeners</code> and <code>onChange()</code> methods and wiring up
everything yourself. In fact, the code really is contained in once very simple line:

```java
  guiWidget.valueProperty().bindBidirectional(inMemoryObj.property());
```

Now changes in the underlying data represented in the GUI Widget will be automatically reflected in the in-memory data
model, and vice-versa.  One line of code, that's it.

*no Listeners, no Event handlers, no extra wiring = awesome (IMO)...*

Take a look! It is a really simple project but that is the point, right?

_NOTE:_
I included my intelliJ-14 project files if you'd like to open it in that IDE. If anyone asks I'll output the Eclipse
project files too.

_NOTE2:_
BTW, my motivation for sharing this was partly due to my own current research (Jan 2015) into using JavaFX resulting in
the realization that a lot of tutorials, code examples, and StackOverflow answers all suggest that the _best practice_
when handling data binding in JavaFX still requires your own Listeners and wiring. *False!* If you have any problems
transforming one object to another so that you can use the <code>.bindBidirectional()</code> methods, most likely you
need to review the <code>Bindings</code> class for the appropriate converter / wiring. _In my example, I do wire an
Integer model property to a GUI text label without any custom Listeners, for example:_

```java
   Bindings.bindBidirectional(intLabel.textProperty(), inMemoryObj.prop1Property(), new NumberStringConverter());
```