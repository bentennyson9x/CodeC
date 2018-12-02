-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Aug 30, 2018 at 11:43 AM
-- Server version: 10.1.13-MariaDB
-- PHP Version: 5.6.21

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `eshop`
--
CREATE DATABASE IF NOT EXISTS `eshop` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
USE `eshop`;

-- --------------------------------------------------------

--
-- Table structure for table `catalog`
--

DROP TABLE IF EXISTS `catalog`;
CREATE TABLE IF NOT EXISTS `catalog` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(31) NOT NULL,
  `note` varchar(256) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `catalog`
--

INSERT INTO `catalog` (`id`, `title`, `note`) VALUES
(1, 'Laptop', 'Sản phẩm cao cấp thời thượng'),
(2, 'Bàn phím', 'Xịn, chế tạo từ nhựa nguyên chất'),
(3, 'Màn hình', 'Hãng Dell xịn'),
(4, 'Chuột Lô Gi Tếch', 'Dùng acqui'),
(5, 'Bàn laptop', 'Sản phẩm thân thiện ');

-- --------------------------------------------------------

--
-- Table structure for table `product`
--

DROP TABLE IF EXISTS `product`;
CREATE TABLE IF NOT EXISTS `product` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `idcat` int(11) NOT NULL,
  `name` varchar(32) NOT NULL,
  `price` double DEFAULT '0',
  `description` varchar(64) DEFAULT NULL,
  `detail` varchar(512) DEFAULT NULL,
  `imagelink` varchar(256) DEFAULT NULL,
  `inputdate` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `status` tinyint(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `product`
--

INSERT INTO `product` (`id`, `idcat`, `name`, `price`, `description`, `detail`, `imagelink`, `inputdate`, `status`) VALUES
(1, 1, 'HP Probook', 15000, 'Đập không vỡ', 'Đến cửa hàng mà xem kỹ nhá', 'images/hp123.png', '2018-08-02 11:56:22', 1),
(2, 1, 'Dell Lacture', 120000, 'Màn hình gương', 'Éo nói...', 'images/computer01.png', '2018-08-02 11:56:27', 1),
(3, 1, 'HP Probook', 15000, 'Đập không vỡ', 'Đến cửa hàng mà xem kỹ nhá', 'images/hp123.png', '2018-08-02 11:56:22', 1),
(4, 1, 'HP Probook', 15000, 'Đập không vỡ', 'Đến cửa hàng mà xem kỹ nhá', 'images/computer02.png', '2018-08-02 11:56:22', 1),
(5, 1, 'Dell Lacture', 120000, 'Màn hình gương', 'Éo nói...', 'images/dell789.png', '2018-08-02 11:56:27', 1),
(6, 1, 'HP Probook', 15000, 'Đập không vỡ', 'Đến cửa hàng mà xem kỹ nhá', 'images/computer03.png', '2018-08-02 11:56:22', 1),
(7, 1, 'HP Probook', 15000, 'Đập không vỡ', 'Đến cửa hàng mà xem kỹ nhá', 'images/hp123.png', '2018-08-02 11:56:22', 1),
(8, 1, 'Dell Lacture', 120000, 'Màn hình gương', 'Éo nói...', 'images/computer04.png', '2018-08-02 11:56:27', 1),
(9, 1, 'HP Probook', 15000, 'Đập không vỡ', 'Đến cửa hàng mà xem kỹ nhá', 'images/hp123.png', '2018-08-02 11:56:22', 1),
(10, 1, 'HP Probook', 15000, 'Đập không vỡ', 'Đến cửa hàng mà xem kỹ nhá', 'images/computer05.png', '2018-08-02 11:56:22', 1),
(11, 1, 'Dell Lacture', 120000, 'Màn hình gương', 'Éo nói...', 'images/dell789.png', '2018-08-02 11:56:27', 1),
(12, 1, 'HP Probook', 15000, 'Đập không vỡ', 'Đến cửa hàng mà xem kỹ nhá', 'images/computer06.png', '2018-08-02 11:56:22', 1),
(13, 4, 'Cáp sạc', 1000, 'Hàng xịn đấy', 'Ahihi', 'images/computer07.png', '2018-08-03 14:36:52', 1),
(14, 3, 'Cáp sạc 2', 2000, 'Đồ đểu', 'Ứ nói', 'images/computer08.png', '2018-08-03 14:37:40', 1);

-- --------------------------------------------------------

--
-- Table structure for table `tbluser`
--

DROP TABLE IF EXISTS `tbluser`;
CREATE TABLE IF NOT EXISTS `tbluser` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'Định danh, khóa chính',
  `username` varchar(32) NOT NULL COMMENT 'Tài khoản',
  `password` varchar(32) NOT NULL COMMENT 'Mật khẩu',
  `fullname` varchar(128) NOT NULL COMMENT 'Tên đầy đủ',
  `gender` tinyint(1) DEFAULT NULL COMMENT 'Giới tính',
  `email` varchar(64) NOT NULL COMMENT 'Thư điện tử',
  PRIMARY KEY (`id`),
  UNIQUE KEY `uq_email` (`email`),
  UNIQUE KEY `uq_username` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `tbluser`
--

INSERT INTO `tbluser` (`id`, `username`, `password`, `fullname`, `gender`, `email`) VALUES
(1, 'minhvt', '123456', 'Vutuanminh', 1, 'minh@yahoo.com'),
(2, 'adf', 'sdfsf', 'sdfsf', 1, 'sfsdf'),
(4, 'doanh', '123456', 'Trach Van Doanh', 0, 'doanh@gmail.com'),
(5, 'donghiep', '12345', 'Shin Dong Hiep', 0, 'hiep@jav.com'),
(6, 'Â´dfasdf', 'Â´dfsdf', 'Â´dfasdf', 1, 'Â´dfasdf'),
(7, 'thang', 'aaaaaaaa', 'duc thang', 1, 'thang@fsdhjsdb');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
