-- phpMyAdmin SQL Dump
-- version 4.2.11
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Jul 04, 2015 at 03:53 PM
-- Server version: 5.6.21
-- PHP Version: 5.6.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `hostel`
--

DELIMITER $$
--
-- Procedures
--
CREATE DEFINER=`root`@`localhost` PROCEDURE `deleteFromTable`(IN tbl VARCHAR(255), IN mid INT)
BEGIN
		SET @GetName =
			CONCAT('DELETE FROM ', tbl, ' WHERE id=', mid);
		PREPARE stmt FROM @GetName;
		EXECUTE stmt;		
		DEALLOCATE PREPARE stmt;
	END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `getDataFromID`(IN tbl VARCHAR(255), IN mid INT)
BEGIN
		SET @GetName =
			CONCAT('Select * FROM ', tbl, ' WHERE id=', mid);
		PREPARE stmt FROM @GetName;
		EXECUTE stmt;		
		DEALLOCATE PREPARE stmt;
	END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `getDataFromUserIDPassword`(IN userID INT, IN pwd VARCHAR(255))
BEGIN
		SELECT * from users where id=userID AND password=pwd;
	END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `getDataFromUsernamePassword`(IN uname VARCHAR(255), IN pwd VARCHAR(255))
BEGIN
		SELECT * FROM users WHERE username=uname AND password = pwd AND status = 1;
	END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `getUserPassword`(IN userID VARCHAR(255), IN pwd VARCHAR(255))
BEGIN
		SELECT * from users where id=userID AND password=pwd;
	END$$

DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `deposit`
--

CREATE TABLE IF NOT EXISTS `deposit` (
`id` int(11) NOT NULL,
  `member_id` int(11) NOT NULL,
  `amount` int(50) NOT NULL,
  `status` tinyint(4) NOT NULL DEFAULT '1',
  `created_by` varchar(250) DEFAULT NULL,
  `created` datetime DEFAULT NULL,
  `modified_by` varchar(250) DEFAULT NULL,
  `modified` datetime DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `deposit`
--

INSERT INTO `deposit` (`id`, `member_id`, `amount`, `status`, `created_by`, `created`, `modified_by`, `modified`) VALUES
(1, 2, 6500, 2, '17', '2015-06-22 15:47:54', NULL, '2015-07-04 15:49:38'),
(4, 1, 25000, 2, '17', '2015-06-24 20:04:41', NULL, '2015-06-27 20:13:58'),
(7, 9, 1500, 2, '17', '2015-06-27 09:42:42', NULL, '2015-06-28 14:51:48'),
(8, 3, 6500, 1, '17', '2015-06-27 11:10:31', NULL, NULL),
(9, 5, 1000, 1, '17', '2015-06-27 11:10:41', NULL, NULL),
(10, 4, 6500, 2, '17', '2015-06-27 11:42:14', NULL, '2015-07-02 17:08:44'),
(11, 6, 6500, 1, '17', '2015-06-27 11:43:40', NULL, NULL),
(12, 8, 6500, 1, '1', '2015-06-27 19:35:39', NULL, NULL),
(13, 19, 6500, 1, '1', '2015-06-28 21:18:53', NULL, NULL),
(14, 18, 6500, 1, '1', '2015-06-28 21:20:03', NULL, NULL);

--
-- Triggers `deposit`
--
DELIMITER //
CREATE TRIGGER `deposit` BEFORE INSERT ON `deposit`
 FOR EACH ROW set new.created = now()
//
DELIMITER ;
DELIMITER //
CREATE TRIGGER `deposit_update` BEFORE UPDATE ON `deposit`
 FOR EACH ROW set new.modified = now()
//
DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `expenditure`
--

CREATE TABLE IF NOT EXISTS `expenditure` (
`id` int(50) NOT NULL,
  `descr` varchar(250) NOT NULL,
  `detail` varchar(250) NOT NULL,
  `amount` int(50) NOT NULL,
  `created_by` int(11) DEFAULT NULL,
  `created` datetime DEFAULT NULL,
  `modified_by` int(11) DEFAULT NULL,
  `modified` datetime DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `expenditure`
--

INSERT INTO `expenditure` (`id`, `descr`, `detail`, `amount`, `created_by`, `created`, `modified_by`, `modified`) VALUES
(1, 'Kitchen', 'sapdsfas', 12000, 1, '2015-06-27 21:12:43', NULL, NULL),
(2, 'Utensils', 'dsfdssd', 25000, 1, '2015-06-27 21:13:05', NULL, NULL),
(3, 'Electricity', 'dfdsf', 26141521, 1, '2015-06-27 21:15:14', NULL, NULL),
(4, 'Kitchen', 'Suman', 150000, 1, '2015-06-28 11:51:54', 1, '2015-06-28 12:04:22'),
(5, 'Salary', 'Didiq', 4000, 1, '2015-06-28 12:02:42', NULL, NULL),
(6, 'Others', 'Refunds', 6500, 17, '2015-07-04 15:49:38', NULL, NULL);

--
-- Triggers `expenditure`
--
DELIMITER //
CREATE TRIGGER `expenditure` BEFORE INSERT ON `expenditure`
 FOR EACH ROW set new.created = now()
//
DELIMITER ;
DELIMITER //
CREATE TRIGGER `expenditure_update` BEFORE UPDATE ON `expenditure`
 FOR EACH ROW set new.modified = now()
//
DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `income`
--

CREATE TABLE IF NOT EXISTS `income` (
`id` int(50) NOT NULL,
  `descr` varchar(250) NOT NULL,
  `detail` varchar(250) NOT NULL,
  `amount` int(50) NOT NULL,
  `created_by` int(11) DEFAULT NULL,
  `created` datetime DEFAULT NULL,
  `modified_by` int(11) DEFAULT NULL,
  `modified` datetime DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `income`
--

INSERT INTO `income` (`id`, `descr`, `detail`, `amount`, `created_by`, `created`, `modified_by`, `modified`) VALUES
(1, 'Donation', 'checks', 50000, 0, '2015-06-26 21:03:11', 0, '2015-07-04 15:58:11'),
(2, 'Additional', 'checks', 50000, 0, '2015-06-26 21:03:42', 0, '2015-07-04 15:58:23'),
(3, 'Tuitions', 'Tulsi', 250000, 17, '2015-04-27 11:20:40', 1, '2015-06-27 21:41:16'),
(4, 'Others', 'sdaffds', 150000, 17, '2015-06-27 11:25:27', NULL, NULL),
(5, 'Others', 'Payments', 11500, 17, '2015-06-27 11:44:55', NULL, NULL),
(6, 'Others', 'Payments', 8500, 1, '2015-06-27 19:14:18', NULL, NULL),
(7, 'Others', 'Payments', 5000, 1, '2015-06-27 19:18:59', NULL, NULL),
(8, 'Others', 'Payments', 32500, 1, '2015-06-27 19:35:39', NULL, NULL),
(9, 'Tuitions', 'Sajan', 150000, 17, '2015-06-27 20:21:43', 1, '2015-06-28 11:51:20'),
(10, 'Tuitions', 'Rmaesh sir', 15000, 1, '2015-06-27 21:33:34', NULL, NULL),
(11, 'Tuitions', 'samer', 150000, 1, '2015-06-28 11:32:14', 1, '2015-06-28 11:48:31'),
(12, 'Others', 'Payments', 6500, 1, '2015-06-28 21:18:54', NULL, NULL),
(13, 'Others', 'Payments', 6500, 1, '2015-06-28 21:20:03', NULL, NULL),
(14, 'Others', 'Payments', 6500, 17, '2015-07-04 17:29:14', NULL, NULL),
(15, 'Others', 'Payments', 26000, 17, '2015-07-04 17:30:53', NULL, NULL),
(16, 'Others', 'Payments', 26000, 17, '2015-07-04 17:30:54', NULL, NULL),
(17, 'Others', 'Payments', 6500, 17, '2015-07-04 19:08:31', NULL, NULL),
(18, 'Others', 'Payments', 6500, 17, '2015-07-04 19:10:43', NULL, NULL),
(19, 'Others', 'Payments', 6500, 17, '2015-07-04 19:10:50', NULL, NULL),
(20, 'Others', 'Payments', 65000, 17, '2015-07-04 19:13:38', NULL, NULL),
(21, 'Others', 'Payments', 6500, 17, '2015-07-04 19:15:49', NULL, NULL);

--
-- Triggers `income`
--
DELIMITER //
CREATE TRIGGER `income` BEFORE INSERT ON `income`
 FOR EACH ROW set new.created = now()
//
DELIMITER ;
DELIMITER //
CREATE TRIGGER `income_update` BEFORE UPDATE ON `income`
 FOR EACH ROW set new.modified = now()
//
DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `member`
--

CREATE TABLE IF NOT EXISTS `member` (
`id` int(11) NOT NULL,
  `fname` varchar(100) NOT NULL,
  `lname` varchar(100) NOT NULL,
  `address` varchar(255) NOT NULL,
  `gender` varchar(10) NOT NULL,
  `email` varchar(100) NOT NULL,
  `contact` varchar(100) NOT NULL,
  `parent` varchar(100) NOT NULL,
  `parentno` varchar(100) NOT NULL,
  `date` date NOT NULL,
  `paid_upto` date NOT NULL,
  `status` int(11) NOT NULL DEFAULT '0',
  `created_by` int(11) DEFAULT NULL,
  `created` datetime DEFAULT NULL,
  `modified_by` int(11) DEFAULT NULL,
  `modified` datetime DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `member`
--

INSERT INTO `member` (`id`, `fname`, `lname`, `address`, `gender`, `email`, `contact`, `parent`, `parentno`, `date`, `paid_upto`, `status`, `created_by`, `created`, `modified_by`, `modified`) VALUES
(1, 'Leena', 'Lasiw', 'asdfdsf', 'Female', 'rdfjlds', '151', 'dslkfa;jdsl', '212', '0006-06-15', '2015-06-05', 2, NULL, NULL, 17, '2015-07-04 19:20:56'),
(2, 'Ramesh', 'Suakmani', 'Bhaktapur', 'Male', 'rsus', '5', 'sdf', '23', '2015-04-15', '2015-07-04', 2, NULL, NULL, 17, '2015-07-04 19:21:01'),
(3, 'Leena', 'Lasiwa', 'byasi-10, Bhaktapur', 'Female', 'llasiwa@yahoo.com', '9841693224', 'Laxmi', '941', '0006-02-15', '2015-06-27', 2, NULL, NULL, 17, '2015-07-02 16:55:04'),
(4, 'Ramesh', 'Suakmani', 'Bhaktapur', 'Male', 'rsus', '5', 'sdf', '23', '2015-06-14', '2015-06-27', 3, NULL, NULL, 17, '2015-07-02 17:35:19'),
(5, 'Dinesh', 'Sukamani', 'Bhaktapur', 'Male', 'sakamura09@yahoo.com', '9841110140', 'Krishna', '9841380936', '2015-06-10', '2015-06-27', 2, NULL, NULL, 17, '2015-07-02 16:52:18'),
(6, 'shanti', 'Shrestha', 'bkt', 'Female', 'shant@gmail.com', '98555', 'krina', '9855', '2015-06-14', '2015-06-27', 2, NULL, NULL, 17, '2015-07-02 16:56:01'),
(7, 'Bimala', 'Kusi', 'Suryamadhi, bkt', 'Female', 'bimal@sdfs.com', '9855246', 'bishnu', '9552', '0006-03-15', '2015-06-27', 2, NULL, NULL, 17, '2015-07-02 17:01:16'),
(8, 'Susa', 'sth', 'Sindhupalchok', 'Male', 'rsf_dsf@yahoo.com', '451545', 'as', '45', '2015-06-20', '2015-07-27', 1, NULL, NULL, 17, '2015-07-04 19:10:50'),
(9, 'Bimala', 'Kusi', 'Bhaktapur', 'Male', 'bimal@sdfs.com', '9855246', 'bishnu', '9552', '0006-02-15', '2015-07-04', 1, NULL, '2015-06-13 21:16:43', 17, '2015-07-04 19:08:31'),
(13, 'Matina', 'Kusi', 'Suryamadhi', 'Female', 'matina@yahoo.com', '1234545', 'bishnu', '1232315', '2015-06-20', '2015-06-20', 0, 17, '2015-06-20 10:15:13', 17, '2015-07-04 15:20:21'),
(15, 'Simran', 'sohena', 'kathmand', 'Female', 'rshdf', '65242', 'df', '652', '2015-06-27', '2015-06-27', 0, 1, '2015-06-27 18:21:23', NULL, NULL),
(16, 'Sohena', 'Samjhana', 'lkjdsfa', 'Female', 'dsfas', '232', 'sdfads', '5656', '2015-06-27', '2015-06-27', 0, 1, '2015-06-27 18:27:35', 1, '2015-06-27 19:01:37'),
(17, 'Aahana', 'suakamni', 'sdfjal', 'Female', '11512', '12512', '111', '1212', '2015-06-27', '2015-06-27', 0, 1, '2015-06-27 18:28:57', NULL, NULL),
(18, 'Manita', 'Kusi', 'durbar', 'Female', 'dlskfjdsa', '12345', 'dsfds', '1233', '2015-06-27', '2015-06-28', 1, 1, '2015-06-27 18:33:16', 1, '2015-06-28 21:20:03'),
(19, 'Saajan', 'sfsa', 'dsfa', 'Male', 'gfgdf', '4545', 'dsafdsf', '4545', '2015-06-27', '2015-06-28', 1, 1, '2015-06-27 18:55:13', 1, '2015-06-28 21:18:54'),
(20, 'Kalpana', 'Dhaubanjar', 'Australia', 'Female', 'kalpu@yahoo.com', '6542323', 'radlsfjl', '5656565', '2015-05-05', '2015-05-05', 0, 17, '2015-07-04 15:19:49', NULL, NULL);

--
-- Triggers `member`
--
DELIMITER //
CREATE TRIGGER `member` BEFORE INSERT ON `member`
 FOR EACH ROW set new.created = now()
//
DELIMITER ;
DELIMITER //
CREATE TRIGGER `member_update` BEFORE UPDATE ON `member`
 FOR EACH ROW set new.modified = now()
//
DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `payment`
--

CREATE TABLE IF NOT EXISTS `payment` (
`id` int(50) NOT NULL,
  `member_id` int(50) NOT NULL,
  `pay_date` date NOT NULL,
  `pay_other` int(50) NOT NULL,
  `pay_deduct` int(50) NOT NULL,
  `pay_total` int(50) NOT NULL,
  `rent_id` int(11) DEFAULT NULL,
  `deposit_id` int(11) DEFAULT NULL,
  `created_by` varchar(250) DEFAULT NULL,
  `created` datetime DEFAULT NULL,
  `modified_by` varchar(250) DEFAULT NULL,
  `modified` datetime DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=32 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `payment`
--

INSERT INTO `payment` (`id`, `member_id`, `pay_date`, `pay_other`, `pay_deduct`, `pay_total`, `rent_id`, `deposit_id`, `created_by`, `created`, `modified_by`, `modified`) VALUES
(1, 2, '2015-04-15', 5000, 500, 23000, 2, 2, '17', '2015-06-22 15:49:27', NULL, NULL),
(2, 2, '2015-04-15', 5000, 5000, 18500, 3, 3, '17', '2015-06-22 15:52:48', NULL, NULL),
(3, 1, '0006-06-15', 0, 2500, 35500, 6, 6, '17', '2015-06-24 20:05:03', NULL, NULL),
(4, 2, '2015-04-15', 0, 0, 13000, 10, 0, '17', '2015-06-24 20:37:49', NULL, NULL),
(5, 9, '2015-03-15', 0, 0, 8000, 11, 7, '17', '2015-06-27 09:42:42', NULL, NULL),
(6, 7, '2015-03-15', 0, 0, 500, 12, 0, '17', '2015-06-27 09:56:20', NULL, NULL),
(7, 9, '2015-03-15', 0, 0, 65000, 13, 0, '17', '2015-06-27 10:00:54', NULL, NULL),
(8, 9, '2015-03-15', 0, 0, 560, 14, 0, '17', '2015-06-27 10:03:36', NULL, NULL),
(9, 9, '2015-03-15', 0, 0, 6500, 15, 0, '17', '2015-06-27 10:05:37', NULL, NULL),
(10, 7, '2015-03-15', 0, 0, 5200, 16, 0, '17', '2015-06-27 10:07:04', NULL, NULL),
(11, 9, '2015-03-15', 0, 0, 65200, 17, 0, '17', '2015-06-27 10:09:29', NULL, NULL),
(12, 9, '2015-03-15', 0, 0, 2500, 18, 0, '17', '2015-06-27 10:12:50', NULL, NULL),
(13, 3, '2015-03-15', 0, 0, 13000, 19, 8, '17', '2015-06-27 11:10:31', NULL, NULL),
(14, 5, '2015-03-15', 0, 0, 16000, 20, 9, '17', '2015-06-27 11:10:41', NULL, NULL),
(15, 4, '2015-03-15', 1500, 500, 27000, 21, 10, '17', '2015-06-27 11:42:14', NULL, NULL),
(16, 4, '2015-03-15', 1500, 500, 27000, 21, 10, '17', '2015-06-27 11:42:14', NULL, NULL),
(17, 6, '2015-05-15', 2500, 500, 15000, 22, 11, '17', '2015-06-27 11:43:40', NULL, NULL),
(18, 6, '2015-05-15', 6500, 1500, 11500, 23, 0, '17', '2015-06-27 11:44:55', NULL, NULL),
(19, 2, '2015-02-15', 2500, 500, 8500, 24, 0, '1', '2015-06-27 19:14:18', NULL, NULL),
(20, 7, '2015-03-15', 0, 0, 5000, 25, 0, '1', '2015-06-27 19:18:59', NULL, NULL),
(21, 8, '2015-02-15', 0, 0, 32500, 26, 12, '1', '2015-06-27 19:35:39', NULL, NULL),
(22, 19, '2015-06-27', 0, 0, 6500, 0, 13, '1', '2015-06-28 21:18:54', NULL, NULL),
(23, 18, '2015-06-27', 0, 0, 6500, 0, 14, '1', '2015-06-28 21:20:03', NULL, NULL),
(24, 2, '2015-06-27', 0, 0, 6500, 27, 0, '17', '2015-07-04 17:29:14', NULL, NULL),
(25, 1, '2015-03-15', 0, 0, 26000, 28, 0, '17', '2015-07-04 17:30:53', NULL, NULL),
(26, 1, '2015-03-15', 0, 0, 26000, 29, 0, '17', '2015-07-04 17:30:54', NULL, NULL),
(27, 9, '2015-06-27', 0, 0, 6500, 30, 0, '17', '2015-07-04 19:08:31', NULL, NULL),
(28, 8, '2015-06-27', 0, 0, 6500, 31, 0, '17', '2015-07-04 19:10:43', NULL, NULL),
(29, 8, '2015-06-27', 0, 0, 6500, 32, 0, '17', '2015-07-04 19:10:50', NULL, NULL),
(30, 1, '2014-07-04', 0, 0, 65000, 33, 0, '17', '2015-07-04 19:13:38', NULL, NULL),
(31, 1, '2015-05-05', 0, 0, 6500, 34, 0, '17', '2015-07-04 19:15:49', NULL, NULL);

--
-- Triggers `payment`
--
DELIMITER //
CREATE TRIGGER `pay_modify` BEFORE UPDATE ON `payment`
 FOR EACH ROW set new.modified = now()
//
DELIMITER ;
DELIMITER //
CREATE TRIGGER `payment` BEFORE INSERT ON `payment`
 FOR EACH ROW set new.created = now()
//
DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `rate`
--

CREATE TABLE IF NOT EXISTS `rate` (
`id` int(50) NOT NULL,
  `monthly_rate` varchar(255) NOT NULL,
  `deposit_rate` varchar(255) NOT NULL,
  `modified_by` varchar(255) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `rate`
--

INSERT INTO `rate` (`id`, `monthly_rate`, `deposit_rate`, `modified_by`) VALUES
(1, '6500', '6500', '17');

-- --------------------------------------------------------

--
-- Table structure for table `refund`
--

CREATE TABLE IF NOT EXISTS `refund` (
`id` int(50) NOT NULL,
  `member_id` int(11) NOT NULL,
  `fname` varchar(250) NOT NULL,
  `lname` varchar(250) NOT NULL,
  `refundeddep` int(11) NOT NULL,
  `refundedother` int(11) NOT NULL,
  `refundedtotal` int(11) NOT NULL,
  `created_by` varchar(250) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `rent`
--

CREATE TABLE IF NOT EXISTS `rent` (
`id` int(11) NOT NULL,
  `member_id` int(11) NOT NULL,
  `amount` int(50) NOT NULL,
  `created_by` varchar(250) NOT NULL,
  `created` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `modified_by` varchar(250) DEFAULT NULL,
  `modified` datetime DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=35 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `rent`
--

INSERT INTO `rent` (`id`, `member_id`, `amount`, `created_by`, `created`, `modified_by`, `modified`) VALUES
(1, 2, 12000, '17', '2015-06-22 15:47:53', NULL, NULL),
(2, 2, 12000, '17', '2015-06-22 15:49:27', NULL, NULL),
(3, 2, 12000, '17', '2015-06-22 15:52:48', NULL, NULL),
(4, 1, 13000, '17', '2015-06-24 20:04:41', NULL, NULL),
(5, 1, 13000, '17', '2015-06-24 20:04:59', NULL, NULL),
(6, 1, 13000, '17', '2015-06-24 20:05:03', NULL, NULL),
(7, 2, 13000, '17', '2015-06-24 20:13:40', NULL, NULL),
(8, 2, 13000, '17', '2015-06-24 20:37:28', NULL, NULL),
(9, 2, 13000, '17', '2015-06-24 20:37:31', NULL, NULL),
(10, 2, 13000, '17', '2015-06-24 20:37:49', NULL, NULL),
(11, 9, 6500, '17', '2015-06-27 09:42:41', NULL, NULL),
(12, 7, 500, '17', '2015-06-27 09:56:20', NULL, NULL),
(13, 9, 65000, '17', '2015-06-27 10:00:54', NULL, NULL),
(14, 9, 560, '17', '2015-06-27 10:03:36', NULL, NULL),
(15, 9, 6500, '17', '2015-06-27 10:05:37', NULL, NULL),
(16, 7, 5200, '17', '2015-06-27 10:07:04', NULL, NULL),
(17, 9, 65200, '17', '2015-06-27 10:09:29', NULL, NULL),
(18, 9, 2500, '17', '2015-06-27 10:12:50', NULL, NULL),
(19, 3, 6500, '17', '2015-06-27 11:10:30', NULL, NULL),
(20, 5, 15000, '17', '2015-06-27 11:10:40', NULL, NULL),
(21, 4, 19500, '17', '2015-06-27 11:42:14', NULL, NULL),
(22, 6, 6500, '17', '2015-06-27 11:43:40', NULL, NULL),
(23, 6, 6500, '17', '2015-06-27 11:44:55', NULL, NULL),
(24, 2, 6500, '1', '2015-06-27 19:14:18', NULL, NULL),
(25, 7, 5000, '1', '2015-06-27 19:18:58', NULL, NULL),
(26, 8, 26000, '1', '2015-06-27 19:35:39', NULL, NULL),
(27, 2, 6500, '17', '2015-07-04 17:29:13', NULL, NULL),
(28, 1, 26000, '17', '2015-07-04 17:30:53', NULL, NULL),
(29, 1, 26000, '17', '2015-07-04 17:30:53', NULL, NULL),
(30, 9, 6500, '17', '2015-07-04 19:08:31', NULL, NULL),
(31, 8, 6500, '17', '2015-07-04 19:10:43', NULL, NULL),
(32, 8, 6500, '17', '2015-07-04 19:10:50', NULL, NULL),
(33, 1, 65000, '17', '2015-07-04 19:13:38', NULL, NULL),
(34, 1, 6500, '17', '2015-07-04 19:15:49', NULL, NULL);

--
-- Triggers `rent`
--
DELIMITER //
CREATE TRIGGER `rent` BEFORE INSERT ON `rent`
 FOR EACH ROW set new.created = now()
//
DELIMITER ;
DELIMITER //
CREATE TRIGGER `rent_update` BEFORE UPDATE ON `rent`
 FOR EACH ROW set new.modified = now()
//
DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `roles`
--

CREATE TABLE IF NOT EXISTS `roles` (
`id` int(11) NOT NULL,
  `role_name` varchar(100) NOT NULL,
  `created_by` int(11) DEFAULT NULL,
  `created` datetime DEFAULT NULL,
  `modified_by` int(11) DEFAULT NULL,
  `modified` datetime DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `roles`
--

INSERT INTO `roles` (`id`, `role_name`, `created_by`, `created`, `modified_by`, `modified`) VALUES
(1, 'Administrator', 1, '2014-05-26 17:52:06', 1, '2015-06-01 19:13:54'),
(2, 'Account', 1, '2014-05-31 11:51:04', 1, '2015-06-01 19:14:08'),
(3, 'Warden', 1, '2014-05-31 11:51:16', 1, '2015-06-01 19:14:18');

--
-- Triggers `roles`
--
DELIMITER //
CREATE TRIGGER `roles` BEFORE INSERT ON `roles`
 FOR EACH ROW SET NEW.created = NOW()
//
DELIMITER ;
DELIMITER //
CREATE TRIGGER `roles_update` BEFORE UPDATE ON `roles`
 FOR EACH ROW SET NEW.modified = NOW()
//
DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `room`
--

CREATE TABLE IF NOT EXISTS `room` (
`id` int(50) NOT NULL,
  `room_no` varchar(250) NOT NULL,
  `capacity` int(11) NOT NULL,
  `created_by` int(11) NOT NULL,
  `created` datetime NOT NULL,
  `modified_by` int(11) NOT NULL,
  `modified` datetime NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `room`
--

INSERT INTO `room` (`id`, `room_no`, `capacity`, `created_by`, `created`, `modified_by`, `modified`) VALUES
(1, 'Room No. 1', 3, 1, '2015-06-28 16:00:43', 0, '0000-00-00 00:00:00'),
(2, 'Room No. 2', 5, 1, '2015-07-02 15:44:11', 0, '0000-00-00 00:00:00'),
(3, 'Room No. 3', 3, 1, '2015-07-02 15:44:29', 0, '2015-07-02 17:00:34'),
(4, 'Room No. 4', 3, 1, '2015-07-02 17:00:05', 0, '0000-00-00 00:00:00'),
(5, 'Room No. 5', 1, 1, '2015-07-02 17:00:18', 0, '0000-00-00 00:00:00');

--
-- Triggers `room`
--
DELIMITER //
CREATE TRIGGER `room` BEFORE INSERT ON `room`
 FOR EACH ROW set new.created = now()
//
DELIMITER ;
DELIMITER //
CREATE TRIGGER `room_modify` BEFORE UPDATE ON `room`
 FOR EACH ROW set new.modified = now()
//
DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `room_status`
--

CREATE TABLE IF NOT EXISTS `room_status` (
`id` int(50) NOT NULL,
  `room_id` int(50) NOT NULL,
  `member_id` int(11) NOT NULL,
  `created_by` int(11) DEFAULT NULL,
  `created` datetime DEFAULT NULL,
  `modified_by` int(11) DEFAULT NULL,
  `modified` datetime DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `room_status`
--

INSERT INTO `room_status` (`id`, `room_id`, `member_id`, `created_by`, `created`, `modified_by`, `modified`) VALUES
(1, 1, 1, 1, '2015-06-28 19:52:03', NULL, NULL),
(2, 1, 7, 1, '2015-07-02 15:40:11', NULL, '2015-07-02 17:26:26'),
(3, 2, 9, 1, '2015-07-02 15:40:33', NULL, '2015-07-02 17:28:38'),
(4, 1, 3, 1, '2015-07-02 15:50:24', NULL, NULL),
(5, 2, 5, 1, '2015-07-02 16:16:48', NULL, NULL),
(7, 2, 2, 17, '2015-07-02 16:39:48', NULL, NULL),
(8, 2, 5, 17, '2015-07-02 16:52:18', NULL, NULL),
(9, 2, 3, 17, '2015-07-02 16:55:04', NULL, NULL),
(11, 3, 6, 17, '2015-07-02 16:56:01', NULL, NULL),
(12, 3, 8, 17, '2015-07-02 17:01:06', NULL, NULL),
(13, 5, 7, 17, '2015-07-02 17:01:16', NULL, NULL);

--
-- Triggers `room_status`
--
DELIMITER //
CREATE TRIGGER `roomst` BEFORE INSERT ON `room_status`
 FOR EACH ROW set new.created = now()
//
DELIMITER ;
DELIMITER //
CREATE TRIGGER `roomst_up` BEFORE UPDATE ON `room_status`
 FOR EACH ROW set new.modified = now()
//
DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE IF NOT EXISTS `users` (
`id` int(11) NOT NULL,
  `fname` varchar(100) NOT NULL,
  `lname` varchar(100) NOT NULL,
  `username` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL,
  `email` varchar(255) DEFAULT NULL,
  `Contact` varchar(255) DEFAULT NULL,
  `role_id` int(11) NOT NULL,
  `status` tinyint(4) DEFAULT '1',
  `created_by` int(11) DEFAULT NULL,
  `created` datetime DEFAULT NULL,
  `modified_by` int(11) DEFAULT NULL,
  `modified` datetime DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`id`, `fname`, `lname`, `username`, `password`, `email`, `Contact`, `role_id`, `status`, `created_by`, `created`, `modified_by`, `modified`) VALUES
(1, 'Pratik', 'Shrestha', 'admin', '6877c0ec4bb3aa33fb6fde737d229411', NULL, '655695', 1, 1, NULL, '2014-05-28 17:44:22', NULL, '2015-06-27 16:35:53'),
(17, 'Ramesh', 'Sukamani', 'sukamani', 'cfb7c60f5b8092e991e77ab8557a57b6', NULL, '9841358420', 1, 1, NULL, '2015-06-06 15:03:20', NULL, '2015-06-27 16:36:09'),
(19, 'Kishor', 'Mahato', 'kishor', 'b6e28edf4932d81cfcdbaf4622ebc11e', NULL, '98', 1, 1, NULL, '2015-06-06 15:04:28', NULL, '2015-06-27 16:36:04'),
(21, 'Manita', 'Kusi', 'manyata', '6877c0ec4bb3aa33fb6fde737d229411', NULL, '9955', 4, 1, NULL, '2015-06-06 19:30:25', NULL, '2015-06-27 16:36:15'),
(23, 'Leena', 'Lasiwa', 'leena1', '37f414056d5dfd4618e8c41df4e7deb7', NULL, '98', 3, 1, NULL, '2015-06-06 21:38:04', NULL, '2015-06-27 16:36:21'),
(24, 'Dinesh', 'Sukamani', 'dinesh', '6877c0ec4bb3aa33fb6fde737d229411', NULL, '9841110140', 3, 1, NULL, '2015-06-13 11:22:20', NULL, '2015-06-27 17:44:44'),
(25, 'Bimal', 'Kusi', 'bimal', '6877c0ec4bb3aa33fb6fde737d229411', NULL, '9851125421', 2, 1, NULL, '2015-06-13 13:00:42', NULL, '2015-06-27 17:55:37'),
(26, 'Manoj', 'Kusi', 'munna', '6877c0ec4bb3aa33fb6fde737d229411', NULL, '121145', 3, 1, NULL, '2015-06-13 20:33:18', NULL, '2015-06-27 17:16:29'),
(29, 'Manita', 'Kusi', 'manita', '6877c0ec4bb3aa33fb6fde737d229411', NULL, '9843268759', 4, 1, NULL, '2015-06-27 16:31:35', NULL, '2015-06-27 17:51:40');

--
-- Triggers `users`
--
DELIMITER //
CREATE TRIGGER `users` BEFORE INSERT ON `users`
 FOR EACH ROW SET NEW.created = NOW()
//
DELIMITER ;
DELIMITER //
CREATE TRIGGER `users_update` BEFORE UPDATE ON `users`
 FOR EACH ROW SET NEW.modified = NOW()
//
DELIMITER ;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `deposit`
--
ALTER TABLE `deposit`
 ADD PRIMARY KEY (`id`);

--
-- Indexes for table `expenditure`
--
ALTER TABLE `expenditure`
 ADD PRIMARY KEY (`id`);

--
-- Indexes for table `income`
--
ALTER TABLE `income`
 ADD PRIMARY KEY (`id`);

--
-- Indexes for table `member`
--
ALTER TABLE `member`
 ADD PRIMARY KEY (`id`);

--
-- Indexes for table `payment`
--
ALTER TABLE `payment`
 ADD PRIMARY KEY (`id`);

--
-- Indexes for table `rate`
--
ALTER TABLE `rate`
 ADD PRIMARY KEY (`id`);

--
-- Indexes for table `refund`
--
ALTER TABLE `refund`
 ADD PRIMARY KEY (`id`);

--
-- Indexes for table `rent`
--
ALTER TABLE `rent`
 ADD PRIMARY KEY (`id`);

--
-- Indexes for table `roles`
--
ALTER TABLE `roles`
 ADD PRIMARY KEY (`id`);

--
-- Indexes for table `room`
--
ALTER TABLE `room`
 ADD PRIMARY KEY (`id`);

--
-- Indexes for table `room_status`
--
ALTER TABLE `room_status`
 ADD PRIMARY KEY (`id`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
 ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `deposit`
--
ALTER TABLE `deposit`
MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=15;
--
-- AUTO_INCREMENT for table `expenditure`
--
ALTER TABLE `expenditure`
MODIFY `id` int(50) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=7;
--
-- AUTO_INCREMENT for table `income`
--
ALTER TABLE `income`
MODIFY `id` int(50) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=22;
--
-- AUTO_INCREMENT for table `member`
--
ALTER TABLE `member`
MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=21;
--
-- AUTO_INCREMENT for table `payment`
--
ALTER TABLE `payment`
MODIFY `id` int(50) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=32;
--
-- AUTO_INCREMENT for table `rate`
--
ALTER TABLE `rate`
MODIFY `id` int(50) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `refund`
--
ALTER TABLE `refund`
MODIFY `id` int(50) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `rent`
--
ALTER TABLE `rent`
MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=35;
--
-- AUTO_INCREMENT for table `roles`
--
ALTER TABLE `roles`
MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT for table `room`
--
ALTER TABLE `room`
MODIFY `id` int(50) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT for table `room_status`
--
ALTER TABLE `room_status`
MODIFY `id` int(50) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=14;
--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=30;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
