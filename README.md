# 🏦 Banking System with Fraud Detection (Core Java)

## 📌 Project Overview
This project is a backend-based banking system developed using Core Java. It simulates real-world banking operations such as account creation, deposits, withdrawals, and transaction tracking.

The system also includes **fraud detection mechanisms** to identify suspicious activities like high-frequency transactions and large withdrawals.

---

## 🚀 Features

- 🧾 Create Account  
- 💰 Deposit Money  
- 💸 Withdraw Money  
- 📊 Transaction History Tracking  
- 🚨 Fraud Detection  
- 📩 Alert System for suspicious activities  

---

## 🔥 Fraud Detection Logic

### 1️⃣ High-Frequency Transactions
- Uses **Sliding Window Algorithm**
- Tracks transactions in the last **1 minute (60000 ms)**
- More than **3 transactions → flagged as fraud**

---

### 2️⃣ Large Transaction Detection
- Any transaction above **₹50,000** is blocked

---

## 🧠 Key Concepts Used

- Object-Oriented Programming (OOP)
- Data Structures:
  - Deque (for sliding window)
  - HashMap (for storing accounts)
  - ArrayList (for transaction logs)
- Time-based logic using `System.currentTimeMillis()`
- Clean code structure (Model-Service architecture)

---

## 🏗️ Project Structure
banking-system/
│
├── model/
│ ├── Account.java
│ ├── Transaction.java
│
├── service/
│ ├── FraudDetector.java
│ ├── AlertService.java
│ ├── BankService.java
│
├── main/
│ ├── Main.java
---

## ▶️ How to Run

1. Clone the repository
2. Open in IntelliJ / Eclipse / VS Code
3. Run `Main.java`

---

## 🖥️ Sample Output
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

---

## 💡 Why This Project?

Unlike basic CRUD banking applications, this project focuses on:
- Real-world fraud scenarios
- Optimized detection using efficient data structures
- Practical backend logic used in financial systems

---

## 🧑‍💻 Author

Shanmukhi  
📧 shanmukhichinni9@gmail.com  
