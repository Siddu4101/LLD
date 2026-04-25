# 🏗️ Unified Modeling Language (UML) Guide

Notes:
Notes:

<p align="center">
  <img src="./sources/uml-diagram-1.jpg" alt="UML Diagram Illustration 1"></img><br>
  <img src="./sources/uml-diagram-2.jpg" alt="UML Diagram Illustration 2"></img><br>
  <img src="./sources/uml-diagram-3.jpg" alt="UML Diagram Illustration 3"></img>
</p>    

UML is the **standard way of visually representing the design and structure of a system**. Think of it as the "Blue Print" of software development, allowing you to design the system before writing a single line of code.

UML is mainly classified into two categories:
1.  **Structural:** Defines the static structure (Classes, Objects, Relationships).
2.  **Behavioral:** Defines the dynamic behavior over time (Interactions, Flow, Communication).

---

## 1. Class Diagram (Structural) 🧱
A Class Diagram represents the classes, their variables (properties), methods (behaviors), and how they relate to one another.

### 📋 Basic Rules & Structure
* **Class Box:** Divided into three sections: **Class Name**, **Properties**, and **Behaviors**.
* **Access Modifiers:**
    * `+` 🟢 Public
    * `-` 🔴 Private
    * `#` 🟡 Protected
* **Data Types:** Represented after the property or behavior using a colon (e.g., `age : int`).
* **Abstract Classes:** Indicated with the `<<abstract>>` keyword.

### 🔗 Relationship Types
UML uses specific arrows to define how objects interact:

| Relationship | Type | Visual Representation | Description |
| :--- | :--- | :--- | :--- |
| **Inheritance** | "Is a" | `---▷` | Child inherits from Parent. |
| **Simple Association** | "Has a" | `--->` | Weakest relationship (e.g., Arjun lives in a House). |
| **Aggregation** | "Has a" | `---◇` | Objects can exist independently (e.g., Room has a Table). |
| **Composition** | "Has a" | `---◆` | Strong dependency; objects cannot exist alone (e.g., Chair has a Seat). |

### 🐾 Example: Animal & Dog Class Diagram
```mermaid
classDiagram
    class Animal {
        <<abstract>>
        -age: int
        -name: string
        +setName(name: string) void
        #sayHello() void
        +setAge(age: int) void
    }
    class Dog {
        -isHandsome: bool
        #sayHello() void
    }
    Animal <|-- Dog : is a (Inheritance)
```

---

## 2. Sequence Diagram (Behavioral) ⏱️
Sequence Diagrams show how objects interact with each other in a particular order over time.

### 🧩 Basic Components
* **Lifeline:** Represented by a dashed vertical line, showing the lifespan of an object.
* **Activation Bar:** A thin rectangle on the lifeline showing when an object is active.
* **Messages:**
    * **Request:** Solid line with an arrow `->`
    * **Response:** Dashed line with an arrow `<--`
* **Actor/Object:** Represented as boxes at the top (e.g., User, ATM, Account).

### 🏧 Use Case: ATM Money Withdrawal
```mermaid
sequenceDiagram
    autonumber
    actor User
    participant ATM
    participant Transaction
    participant Account
    participant CashDispenser as Cash Dispenser

    User->>ATM: Provides Account No & Amount
    activate ATM
    ATM->>Transaction: Validate Account No & Amount
    activate Transaction
    Transaction->>Account: Validate
    activate Account
    Account-->>Transaction: true
    deactivate Account
    Transaction-->>ATM: true
    deactivate Transaction
    
    Note over ATM, Cash Dispenser: Withdrawal Logic
    
    ATM->>Cash Dispenser: Withdraw Amount (Request)
    activate Cash Dispenser
    Cash Dispenser-->>ATM: Withdrawn Amount (Response)
    deactivate Cash Dispenser
    
    ATM-->>User: Dispense Amount
    deactivate ATM
```

---

### 💡 Key Takeaways
* **Structural Diagrams** focus on *what* is in the system.
* **Behavioral Diagrams** focus on *how* the system works.
***