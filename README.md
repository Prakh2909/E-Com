# Design Document: E-commerce Platform

## 1. Introduction

### Purpose
The purpose of this document is to provide an overview of the design and architecture of the e-commerce platform implemented in Java using IntelliJ IDEA.

### Scope
This document covers the key components, functionalities, and design decisions made for the e-commerce platform.

## 2. Architecture Overview

### Components
1. **Buyer Management**:
   - Manages creation and retrieval of buyers.
   - Stores buyer information including name and address.

2. **Product Management**:
   - Manages creation and retrieval of products.
   - Stores product information including name, inventory, price, and pickup address.

3. **Pincode Serviceability Management**:
   - Manages serviceability rules between source and destination pin codes.
   - Determines if a product can be shipped to a destination based on COD or prepaid serviceability.

4. **Order Management**:
   - Manages creation and validation of orders.
   - Checks inventory availability and pincode serviceability before confirming an order.

### Technologies Used
- **Programming Language**: Java
- **IDE**: IntelliJ IDEA
- **Version Control**: Git
- **GitHub**: Used for remote repository hosting


### Class Descriptions

1. **Buyer**:
   - Represents a buyer with attributes `buyerId`, `name`, and `address`.
   - Manages basic information about buyers.

2. **Product**:
   - Represents a product with attributes `productId`, `name`, `inventory`, `price`, and `pickupAddress`.
   - Stores details related to product inventory and shipping.

3. **PincodeServiceability**:
   - Represents serviceability rules between source and destination pin codes.
   - Defines whether COD or prepaid service is available for shipping between pin codes.

4. **BuyerManager**, **ProductManager**, **PincodeServiceabilityManager**:
   - Manage the respective entities (`Buyer`, `Product`, `PincodeServiceability`).
   - Responsible for CRUD operations and retrieval of entities.

5. **OrderManager**:
   - Manages the creation and validation of orders.
   - Checks product availability and pincode serviceability before confirming an order.
