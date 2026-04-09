# 🌾 Agriculture Management System (AGMS)
### 🚀 Advanced Microservices-Based Precision Farming Platform

AGMS is a scalable and secure **Spring Boot Microservices system** designed to optimize agricultural operations using **IoT data, automation, and real-time processing**.

---

## 🏛️ System Architecture

The system is built using a **decentralized microservices architecture** to ensure:

- High scalability  
- Fault tolerance  
- Independent service deployment  
- Loose coupling between services  

### 🔧 Core Components

- **Service Discovery (Netflix Eureka)**  
  Enables dynamic service registration and communication  

- **API Gateway (Spring Cloud Gateway)**  
  Acts as the single entry point for all client requests  

- **Microservices**
  - Zone Service  
  - Sensor Service  
  - Automation Service  
  - Crop Service  
  - Staff Service  

---

## 🔒 Security & Authentication

AGMS follows a **Zero-Trust Security Model** with centralized control at the API Gateway.

### 🔐 Features

- **JWT Authentication**
  - Validates requests using `Authorization: Bearer <token>`

- **Global Authentication Filter**
  - Intercepts all incoming requests at the gateway  

- **Role-Based Access Control (RBAC)**
  - Public endpoints → Login & Register  
  - Protected endpoints → Require valid JWT  

- **Stateless Security**
  - No session storage, fully token-based  

---

## 🔄 Intelligent Data Flow

The system supports **real-time automation using IoT data**.

### ⚙️ Workflow

1. **Sensor Data Collection**
   - Sensor Service fetches external IoT data  

2. **Telemetry Processing**
   - Data sent to Automation Service  

3. **Threshold Validation**
   - Compared with Zone Service configurations  

4. **Automated Response**
   - Triggers:
     - 💧 Irrigation  
     - 🌬️ Ventilation  
     - 💡 Lighting  

---

## 📊 System Validation

### ✅ Service Discovery
- All microservices successfully registered in Eureka  

### 🐳 Docker Deployment
- Fully containerized using Docker Compose  

### 📬 API Testing
- Tested using Postman:
  - Gateway routing  
  - JWT authentication  
  - End-to-end flow  

---

## 🛠️ Tech Stack

- **Backend:** Spring Boot, Spring Cloud  
- **Microservices:** Eureka, OpenFeign, API Gateway  
- **Security:** Spring Security, JWT  
- **Database:** MySQL  
- **Containerization:** Docker, Docker Compose  
- **Testing:** Postman  

---

## 🚦 Deployment Guide

### 🔁 Startup Order

1. Eureka Server (Port 8761)  
2. API Gateway (Port 8080)  
3. Microservices:
   - Zone  
   - Sensor  
   - Automation  
   - Crop  
   - Staff  
---
## 📷 Screenshots
---

## 🐳 Run with Docker

```bash
docker-compose up --build -d

