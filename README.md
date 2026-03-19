# 🏦 Banking System with Fraud Detection (Core Java)

## 📌 Overview

This project is a backend-based banking system developed using Core Java.
It simulates real-world banking operations such as deposits, withdrawals, and transaction tracking, with an added focus on **fraud detection mechanisms**.

---

## 🚀 Features

* 💰 Create Account
* 💸 Deposit & Withdraw Money
* 📊 Transaction History Tracking
* 🚨 Fraud Detection System:

  * High-frequency transaction detection (Sliding Window Algorithm)
  * Large transaction threshold monitoring
* 📩 Alert System for suspicious activities

---

## 🧠 Key Concepts Used

* Object-Oriented Programming (OOP)
* Data Structures (Deque, HashMap, ArrayList)
* Sliding Window Algorithm
* Time-based event tracking using `System.currentTimeMillis()`
* Clean architecture (Model-Service structure)

---

## 🔥 Fraud Detection Logic

### 1️⃣ High-Frequency Transactions

* Uses **Sliding Window Algorithm**
* Tracks transactions in the last **1 minute (60000 ms)**
* If more than 3 transactions occur → flagged as fraud

### 2️⃣ Large Transaction Detection

* Any transaction above ₹50,000 is blocked

---

## 🏗️ Project Structure

```
banking-system/
│
├── model/
│   ├── Account.java
│   ├── Transaction.java
│
├── service/
│   ├── FraudDetector.java
│   ├── AlertService.java
│   ├── BankService.java
│
├── main/
│   ├── Main.java
```

---

## ▶️ How to Run

1. Clone the repository
2. Open in IntelliJ / Eclipse / VS Code
3. Run `Main.java`

---

## 🖥️ Sample Output

```
Deposited: 10000
Withdrawn: 10000
Withdrawn: 10000
Withdrawn: 10000

🚨 Too many transactions!
📩 ALERT [Account 1]
👉 Multiple rapid transactions detected

🚨 Large transaction blocked!
📩 ALERT [Account 1]
👉 Attempted ₹60000

Balance: 80000.0
```

---

## 💡 Why This Project?

Unlike basic CRUD banking applications, this project focuses on:

* Real-world fraud scenarios
* Optimized detection using efficient data structures
* Practical backend logic used in financial systems

---

## 🧑‍💻 Author

Shanmukhi
📧 [shanmukhichinni9@gmail.com](mailto:shanmukhichinni9@gmail.com)
