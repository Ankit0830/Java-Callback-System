# Java Callback System

## 📌 Description
This project demonstrates the **callback mechanism** in Java using an interface.  
The `Store` class can **register customers** (who implement the `Member` interface) and later **invite them for a sale** by triggering their `CallBack()` method.  

It’s a simple example of **event-driven communication** between classes, where one object notifies another when an event occurs.

---

## 📂 Project Structure
callbacksystem/
│
├── Member.java # Interface defining the callback method
├── Store.java # Class that maintains registered members and sends notifications
├── Customer.java # Implements Member to respond to store invitations
└── CallBackSystem.java # Main class to run the program

## ⚙️ How It Works
1. **Member Interface** – Declares the `CallBack()` method to be implemented by customers.
2. **Store Class** – Registers members and calls their `CallBack()` method to invite them.
3. **Customer Class** – Implements `CallBack()` to print a message when invited.
4. **Main Class** – Takes customer name as input, registers them in the store, and sends an invitation.

---

## 🚀 How to Run
1. Clone this repository:
   ```bash
   git clone https://github.com/your-username/Java-Callback-System.git
Navigate to the folder:

cd Java-Callback-System
Compile the Java files:

javac callbacksystem/*.java
Run the program:

java callbacksystem.CallBackSystem

## 📌 Sample Output
Enter Customer Name : Ravi
Ravi :Ok, I will visite
