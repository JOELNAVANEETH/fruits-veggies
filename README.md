# 🍎 Fruits & Veggies App

A full-stack web application to manage products and place orders, built using **Spring Boot**, **React**, and **MySQL**.

---

## 🚀 Tech Stack

### 🔹 Backend

* Java 21
* Spring Boot
* Spring Data JPA
* MySQL

### 🔹 Frontend

* React (Create React App)
* JavaScript (Fetch API)

---

## 📂 Project Structure

```
fruits-veggies-app/
├── Fruits-veggies/      # Spring Boot Backend
└── fruits-frontend/     # React Frontend
```

---

## ⚙️ Features

### 🥕 Product Management

* Add products
* View all products
* Track available quantity

### 🛒 Order System

* Place orders
* Multiple items per order
* Automatic stock reduction
* Total amount calculation

---

## 🔗 API Endpoints

### 📦 Products

* `GET /products` → Get all products
* `POST /products` → Add new product

### 🛒 Orders

* `GET /orders` → Get all orders
* `POST /orders` → Place order

---

## 🧪 Sample Request (Place Order)

```json
{
  "customerName": "John",
  "items": [
    {
      "product": { "id": 1 },
      "quantity": 2
    }
  ]
}
```

---

## ▶️ How to Run

### 🔹 Backend

```bash
cd Fruits-veggies
./mvnw spring-boot:run
```

Runs on:

```
http://localhost:8080
```

---

### 🔹 Frontend

```bash
cd fruits-frontend
npm install
npm start
```

Runs on:

```
http://localhost:3000
```

---

## ⚠️ Configuration

Update your database credentials in:

```
src/main/resources/application.properties
```

Example:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/fruits_db
spring.datasource.username=root
spring.datasource.password=YOUR_PASSWORD
```

---

## 🌐 CORS Configuration

Global CORS is enabled to allow frontend communication:

```java
.allowedOrigins("http://localhost:3000")
```

---

## 🎯 Future Improvements

* Add authentication (Login/Register)
* Improve UI with Tailwind CSS
* Add cart system (multiple products)
* Deploy to cloud (Render + Netlify)

---

## 👨‍💻 Author

**Joel Navaneeth**

---

## ⭐ If you like this project

Give it a ⭐ on GitHub!
"# fruits-veggies-app" 
