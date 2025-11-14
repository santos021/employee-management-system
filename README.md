# 🧑‍💼 Employee Management System  
A full-stack Employee Management System built using **React.js** for the frontend and **Spring Boot** for the backend.  
It provides CRUD operations for employee data, including adding, updating, deleting, and viewing employees — with a clean UI and REST API integration.

---

## 🚀 Tech Stack

### **Frontend**
- React.js
- JavaScript (ES6+)
- Axios (API calls)
- HTML5, CSS3
- Vite (React build tool)

### **Backend**
- Spring Boot
- Spring Web
- Spring Data JPA
- MySQL Database
- Hibernate

---

## 📦 Project Structure

```text
Employee-Management-System/
│
├── Backend/                 # Spring Boot application
│   ├── src/main/java/com/skb/
│   │   ├── controller/
│   │   ├── entity/
│   │   ├── repository/
│   │   ├── service/
│   ├── pom.xml
│   └── application.properties
│
└── Frontend/                # React application
    ├── src/
    ├── public/
    ├── package.json
    └── vite.config.js
```
---

## ⚙️ Features

### **👨‍💼 Employee Module**
✔ Add new employee  
✔ Update employee details  
✔ Delete employee  
✔ View employee list  
✔ Fetch employee by ID  
✔ Responsive and clean UI  

### **🔗 API Integration**
- Axios used for frontend–backend communication  
- RESTful APIs implemented in Spring Boot

---

## 🔧 How to Run the Project

### **1️⃣ Clone the Repository**
```bash
git clone https://github.com/YOUR-USERNAME/Employee-Management-System.git

```

🖥️ Run Backend (Spring Boot)
1. Navigate to Backend

```bash
cd Backend
```
2. Configure MySQL

Update your credentials in:
```bash
src/main/resources/application.properties
```
Example:
```bash
spring.datasource.url=jdbc:mysql://localhost:3306/your-database-name
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
```
3. Run Backend
```bash
mvn spring-boot:run
```
Backend starts at:
👉 http://localhost:8080

🌐 Run Frontend (React)
1. Navigate to Frontend
```bash
cd Frontend
```
2. Install dependencies
```bash
npm install
```

3. Start the server
```bash
npm start
```
Frontend starts at:
👉 http://localhost:5173
 (or similar)

## 📡 API Endpoints (Spring Boot)

| Method | Endpoint                | Description            |
|--------|--------------------------|-------------------------|
| GET    | `/api/employees`         | Get all employees       |
| GET    | `/api/employees/{id}`    | Get employee by ID      |
| POST   | `/api/employees`         | Add new employee        |
| PUT    | `/api/employees/{id}`    | Update employee         |
| DELETE | `/api/employees/{id}`    | Delete employee         |

## 🧰 Tools Used

- VS Code

- IntelliJ IDEA / Eclipse

- Git & GitHub

- Postman

## 👨‍💻 Author

**Santos Kumar Biswal**  
📧 **Email:** santosbiswal543@gmail.com  
💼 **LinkedIn:** [linkedin.com/in/santos-biswal07](https://www.linkedin.com/in/santos-biswal07/)  
🐙 **GitHub:** [github.com/santos021](https://github.com/santos021)

## ⭐ If you like this project, don’t forget to star the repo!

If you want, I can also:

✅ Add project screenshots  
✅ Create badges (Java | Spring Boot | React | MySQL)  
✅ Add deployment instructions  
✅ Make a short version for LinkedIn post  

Just tell me!
