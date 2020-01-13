-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Aug 12, 2019 at 12:01 PM
-- Server version: 10.1.37-MariaDB
-- PHP Version: 7.3.1

use SalesManagement;
/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `salesmanagement`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE admin (
  Admin_id int NOT NULL identity primary key,
  Admin_first varchar(256) NOT NULL,
  Admin_last varchar(256) NOT NULL,
  Admin_email varchar(256) NOT NULL,
  Admin_Phone varchar(256) NOT NULL,
  Admin_Id_No int NOT NULL,
  Admin_uid varchar(256) NOT NULL,
  Admin_pass varchar(256) NOT NULL
);

--
-- Dumping data for table `admin`
--

INSERT INTO admin (Admin_first, Admin_last, Admin_email, Admin_Phone, Admin_Id_No, Admin_uid, Admin_pass) VALUES
('Admin', 'admin', 'admin@example.com', '0749382332', 37838237, 'admin', 'admin');

-- --------------------------------------------------------

--
-- Table structure for table `inventory`
--

CREATE TABLE inventory (
  item_id int NOT NULL identity primary key,
  item_name varchar(256) NOT NULL,
  item_number varchar(256) NOT NULL,
  username varchar(256) NOT NULL,
  item_Quantity int NOT NULL,
  date_of_sale datetime NOT NULL
) ;

-- --------------------------------------------------------

--
-- Table structure for table `items`
--

CREATE TABLE items (
  Item_id int NOT NULL identity primary key,
  Item_name varchar(256) NOT NULL,
  Item_number varchar(256) NOT NULL,
  Item_class varchar(256) NOT NULL,
  Item_description varchar(1000) NOT NULL,
  Item_Quantity int DEFAULT NULL,
  Item_Image image,
  Admin_Name varchar(256) DEFAULT NULL,
  item_price int DEFAULT NULL,
  Item_supplier varchar(256) DEFAULT NULL,
  Item_model varchar(300) DEFAULT NULL
) ;

--
-- Dumping data for table `items`
--


-- --------------------------------------------------------

--
-- Table structure for table `suppliers`
--

CREATE TABLE suppliers (
  Sup_id int NOT NULL identity primary key,
  sup_Name varchar(256) NOT NULL,
  Sup_Email varchar(256) NOT NULL,
  Sup_Phone varchar(256) NOT NULL,
  Sup_Address varchar(256) NOT NULL,
  Sup_Main varchar(5000) NOT NULL
);

--
-- Dumping data for table `suppliers`
--


-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE users (
  user_id int NOT NULL identity primary key,
  user_first varchar(256) NOT NULL,
  user_last varchar(256) NOT NULL,
  user_email varchar(256) NOT NULL,
  user_ID_No int NOT NULL,
  user_Phone varchar(256) NOT NULL,
  user_uid varchar(256) NOT NULL,
  user_Pass varchar(256) NOT NULL
);



/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
