# 🚀 SOLID Principles in Low-Level Design (LLD)
Notes:

<p align="center">
  <img src="./resource/solid-principleas-1.jpg" alt="SOLID principles illustration 1"></img><br>
  <img src="./resource/solid-principleas-2.jpg" alt="SOLID principles illustration 2"></img><br>
  <img src="./resource/solid-principleas-3.jpg" alt="SOLID principles illustration 3"></img><br>
  <img src="./resource/solid-principleas-4.jpg" alt="SOLID principles illustration 4"></img><br>
  <img src="./resource/solid-principleas-5.jpg" alt="SOLID principles illustration 5"></img><br>
  <img src="./resource/solid-principleas-6.jpg" alt="SOLID principles illustration 6"></img>
</p>
    

---

## 📌 1. Single Responsibility Principle (SRP)
> **"A class should have only one reason to change."**

### ❌ The Problem
A single `Cart` class handles pricing, invoice printing, and persistence.

### ✅ The Solution
Split responsibilities into focused classes.

### ✂️ Short Example
```java
Cart cart = new Cart(products);

InvoicePrinter printer = new InvoicePrinter(cart);
printer.printInvoice();

ProductStorage storage = new ProductStorage(cart);
storage.saveProductsToDatabase();
```

```mermaid
classDiagram
    direction LR

    class Product {
        +price: BigDecimal
        +productName: String
        +getPrice(): BigDecimal
    }

    class Cart {
        -products: List~Product~
        +calTotalPrice(): BigDecimal
        +getProducts(): List~Product~
    }

    class InvoicePrinter {
        -cart: Cart
        +printInvoice(): void
    }

    class ProductStorage {
        -cart: Cart
        +saveProductsToDatabase(): void
    }

    Cart "1" *-- "*" Product : contains
    InvoicePrinter ..> Cart : reads
    ProductStorage ..> Cart : persists
```

---

## 🛠️ 2. Open-Closed Principle (OCP)
> **"Software entities should be open for extension, but closed for modification."**

### ❌ The Problem
Storage logic grows by adding new methods in the same class.

### ✅ The Solution
Keep one storage contract and add new implementations.

### ✂️ Short Example
```java
ProductStorage postgres = new PostgresProductStorage();
postgres.saveProducts(cart);

ProductStorage mongo = new MongoProductStorage();
mongo.saveProducts(cart);

ProductStorage file = new FileProductStorage();
file.saveProducts(cart);
```

```mermaid
classDiagram
    direction LR

    class ProductStorage {
        <<interface>>
        +saveProducts(cart: Cart): void
    }

    class PostgresProductStorage {
        +saveProducts(cart: Cart): void
    }

    class MongoProductStorage {
        +saveProducts(cart: Cart): void
    }

    class FileProductStorage {
        +saveProducts(cart: Cart): void
    }

    ProductStorage <|.. PostgresProductStorage
    ProductStorage <|.. MongoProductStorage
    ProductStorage <|.. FileProductStorage
```

---

## 🦆 3. Liskov Substitution Principle (LSP)
> **"Objects of a superclass should be replaceable with objects of its subclass without breaking the program."**

### ❌ Violation Example
`Penguin` is forced into `fly()` and throws an exception.

### ✅ Corrected Approach
Move `fly()` into a narrower abstraction used only by flying birds.

### ✂️ Short Example
```java
void activate(Bird bird) {
    bird.eat();
    if (bird instanceof FlyingBirds flyingBird) {
        flyingBird.fly();
    }
}
```

```mermaid
classDiagram
    direction TB

    class Bird {
        <<abstract>>
        +eat(): void
    }

    class FlyingBirds {
        <<abstract>>
        +fly(): void
    }

    class Parrot
    class Penguin

    Bird <|-- FlyingBirds
    FlyingBirds <|-- Parrot
    Bird <|-- Penguin
```

---

## 🧩 4. Interface Segregation Principle (ISP)
> **"Clients should not be forced to implement methods they do not need."**

### ❌ The Problem
A single shape contract forces 2D objects to implement `volume()`.

### ✅ The Solution
Split contracts by capability.

### ✂️ Short Example
```java
TwoDimensionalShape rectangle = new Rectangle(2, 2);
rectangle.area();

ThreeDimensionalShape cube = new Cube(2);
cube.area();
cube.volume();
```

```mermaid
classDiagram
    direction LR

    class TwoDimensionalShape {
        <<abstract>>
        +area(): void
    }

    class ThreeDimensionalShape {
        <<abstract>>
        +area(): void
        +volume(): void
    }

    class Rectangle {
        +area(): void
    }

    class Cube {
        +area(): void
        +volume(): void
    }

    TwoDimensionalShape <|-- Rectangle
    ThreeDimensionalShape <|-- Cube
    TwoDimensionalShape <|-- ThreeDimensionalShape
```

---

## 🔌 5. Dependency Inversion Principle (DIP)
> **"High-level modules should not depend on low-level modules. Both should depend on abstractions."**

### ❌ The Problem
High-level logic directly depends on concrete DB classes.

### ✅ The Solution
Depend on a persistence abstraction and inject implementations.

### ✂️ Short Example
```java
Application postgresApp = new Application(new PostgresDatabase());
postgresApp.saveToDatabase();

Application mongoApp = new Application(new MongoDatabase());
mongoApp.saveToDatabase();

Application cassandraApp = new Application(new CassandraDatabase());
cassandraApp.saveToDatabase();
```

```mermaid
classDiagram
    direction LR

    class Application {
        -persistence: PersistenceForDatabase
        +saveToDatabase(): void
    }

    class PersistenceForDatabase {
        <<interface>>
        +save(): void
    }

    class PostgresDatabase
    class MongoDatabase
    class CassandraDatabase

    Application --> PersistenceForDatabase
    PersistenceForDatabase <|.. PostgresDatabase
    PersistenceForDatabase <|.. MongoDatabase
    PersistenceForDatabase <|.. CassandraDatabase
```

---

## 📝 Real-World Example: Document Editor
A combined example showing SOLID ideas together.

### Without SOLID (single class does too much)
```java
DocumentEditor editor = new DocumentEditor();
editor.addText("Hey I am Sid");
editor.addImage("profile.png");
StringBuilder output = editor.renderedDoc();
editor.saveDoc();
```
```mermaid
classDiagram
    class DocumentEditor {
        -elements :List IDocRenderer
        -renderedDoc: String
        +addElement()
        +saveDoc()
        +renderDoc()
    }
```

### With SOLID (separated contracts and implementations)
```java
DocumentEditor editor = new DocumentEditor(new Document(), new DocFilePersistence());
editor.addElement(new TextRenderer("Hey I am Sid"));
editor.addElement(new ImageRenderer("profile.png"));
StringBuilder output = editor.renderDoc();
editor.save();
```

### 🏗️ Architecture
* **Document:** Handles element management.
* **DocPersist:** Interface for saving (Postgres, File).
* **DocRenderer:** Interface for rendering different content types (Text, Image, Table).



With Solid
```mermaid
classDiagram
    direction LR

%% --- Main Orchestrator ---
    class DocumentEditor {
        -IDocument document
        -IDocPersist docPersist
        -IDocRenderer docRender
        +addElement() void
        +saveDOC() void
        +renderDoc() StringBuilder
        +save()
    }

%% --- Interfaces ---
    class IDocument {
        <<interface>>
        +addElement(IDocRenderer r) void
    }

    class IDocPersist {
        <<interface>>
        +save() void
    }

    class IDocRenderer {
        <<interface>>
        +render(String data) void
    }

%% --- Concrete Implementations ---
    class Document {
        -elements :List IDocRenderer
        +addElement(IDocRenderer) void
    }

    class Postgres {
        +save() void
    }

    class File {
        +save() void
    }

    class TextRender {
        +render(String data) void
    }

    class ImgRender {
        +render(String data) void
    }

    class TableRender {
        +render(String data) void
    }

%% --- Relationships ---
    DocumentEditor --> IDocument : Delegates To
    DocumentEditor --> IDocPersist : Delegates To
    DocumentEditor --> IDocRenderer : Delegates To

    IDocument <|.. Document : Strategy
    IDocPersist <|.. Postgres : Strategy
    IDocPersist <|.. File : Strategy

    IDocRenderer <|.. TextRender : Strategy
    IDocRenderer <|.. ImgRender : Strategy
    IDocRenderer <|.. TableRender : Strategy

%% Inter-dependency
    Document ..> IDocRenderer : Uses for elements
```

---

## 🧠 Quick Revision
- **SRP:** one responsibility per class.
- **OCP:** add new behavior via new class, not changing old class.
- **LSP:** child should not break parent expectations.
- **ISP:** smaller, role-specific contracts.
- **DIP:** high-level logic depends on abstraction, not concrete type.
