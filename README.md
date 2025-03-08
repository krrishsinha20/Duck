# Duck Behavior - Strategy Pattern

## Overview
This project demonstrates the **Strategy Pattern** using different duck behaviors. Ducks can either **fly or not fly**, and they can **swim, float, or drown**. The behavior of each duck is determined dynamically using interfaces and concrete implementations.

## Design Pattern Used: Strategy Pattern
The **Strategy Pattern** is used to encapsulate different behaviors (flying and swimming) and allow ducks to dynamically change behavior without modifying existing code.

---

## **Project Structure**

### **1. Interfaces (Behavior Definitions)**
- `FlyBehavior.java` - Interface defining the `fly()` method.
- `SwimBehavior.java` - Interface defining the `swim()` method.

### **2. Behavior Implementations**
- `Fly.java` - Implements `FlyBehavior` (ducks that can fly).
- `NotFly.java` - Implements `FlyBehavior` (ducks that cannot fly).
- `Swim.java` - Implements `SwimBehavior` (ducks that swim).
- `Float.java` - Implements `SwimBehavior` (ducks that float).
- `Drown.java` - Implements `SwimBehavior` (ducks that drown).

### **3. Duck Base Class**
- `Duck.java` - Abstract base class containing references to `FlyBehavior` and `SwimBehavior`. All duck types extend this class.

### **4. Specific Duck Types**
- `MallardDuck.java` - A mallard duck (can fly and swim).
- `RubberDuck.java` - A rubber duck (cannot fly, floats).
- `DecoyDuck.java` - A decoy duck (cannot fly, drowns).

### **5. Main Class (Testing Execution)**
- `DuckSimulator.java` - Runs the program and tests different duck behaviors.

---

## **How to Run the Project**
1. Clone the repository:
   ```sh
   git clone [Your GitHub Repository URL]
   ```
2. Navigate to the project folder:
   ```sh
   cd DuckBehavior-StrategyPattern
   ```
3. Compile and run the program:
   ```sh
   javac *.java
   java DuckSimulator
   ```

---

## **Expected Output (When Running `DuckSimulator.java`)**
```
I am a Mallard Duck.
I can fly!
I am swimming.

I am a Rubber Duck.
I can't fly.
I am floating on water.

I am a Decoy Duck.
I can't fly.
I am drowning!
```

---

## **Strategy Pattern Explanation**
Instead of implementing different behaviors directly in the `Duck` class, we define **separate behavior interfaces** (`FlyBehavior` and `SwimBehavior`) and implement them in different classes. This allows ducks to change their behavior dynamically, promoting **code reusability and flexibility**.

### **Advantages of Strategy Pattern in This Project:**
✅ **Encapsulation of behaviors** - Flying and swimming behaviors are separate from the duck classes.
✅ **Easier maintenance** - Changing behavior does not affect existing duck classes.
✅ **More flexibility** - New behaviors can be added without modifying existing classes.

---

## **GitHub Repository**
[Insert your GitHub repository link here]

---

## **Submission Guidelines**
✅ **Convert all Java files into a single PDF** (`DuckBehavior_StrategyPattern.pdf`).
✅ **Attach this GitHub repository link** at the end of the PDF.
✅ **Ensure separate commits** for each behavior/class in the repository.

---

## **Contributors**
- **Krrish Sinha**  
- **23070126063**  
- **2023-2027**  

---

### **Thank you for reviewing this project! 🚀**

