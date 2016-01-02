-- phpMyAdmin SQL Dump
-- version 3.5.1
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Dec 23, 2015 at 09:06 AM
-- Server version: 5.5.24-log
-- PHP Version: 5.3.13

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `bharatmotors`
--

-- --------------------------------------------------------

--
-- Table structure for table `accesories`
--

CREATE TABLE IF NOT EXISTS `accesories` (
  `MRP` int(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `accessories`
--

CREATE TABLE IF NOT EXISTS `accessories` (
  `Part_No` varchar(40) NOT NULL,
  `Item_Name` varchar(40) DEFAULT NULL,
  `Model` varchar(40) DEFAULT NULL,
  `Quantity` int(20) DEFAULT NULL,
  `In_Price` int(30) DEFAULT NULL,
  `MRP` int(30) DEFAULT NULL,
  PRIMARY KEY (`Part_No`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `accessories`
--

INSERT INTO `accessories` (`Part_No`, `Item_Name`, `Model`, `Quantity`, `In_Price`, `MRP`) VALUES
('a100', 'hj', '2010', 1, 300, 400);

-- --------------------------------------------------------

--
-- Table structure for table `bill`
--

CREATE TABLE IF NOT EXISTS `bill` (
  `Bill_No` int(50) NOT NULL,
  `Bill_Date` varchar(50) NOT NULL,
  `Cust_Name` varchar(50) NOT NULL,
  `Cust_Addr` varchar(50) NOT NULL,
  `P_Details` varchar(50) NOT NULL,
  `Amount` int(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `bill`
--

INSERT INTO `bill` (`Bill_No`, `Bill_Date`, `Cust_Name`, `Cust_Addr`, `P_Details`, `Amount`) VALUES
(1, '2015-5-5', 'abc', 'dsff', 'hdh', 2000),
(2, '11/12/2015', 'remya', 'fggdsh', ',(a100,hj,1),(s100,fjfg,2)', 1200),
(3, '12/12/2015', 'viji', 'fhjdj', ',(s100,fjfg,1)', 400),
(4, '12/12/2015', 'sneha', 'ghdgh', ',(s100,fjfg,1)', 400),
(5, '12/12/2015', 'sachin', 'gdjj', ',(l100,rty,1)', 700),
(6, '12/12/2015', 'remya', 'gjfjfjd', ',(m100,tvs bike,1)', 35000),
(7, '12/12/2015', 'fgjh', 'fgjgjnj', ',(a100,hj,1)', 400),
(8, '12/12/2015', 'arya', 'vbcmcmg', ',(m101,tvs scooty,1)', 37000),
(9, '15/12/2015', 'remya', 'abcdef', ',(s100,fjfg,10),(m100,tvs bike,1)', 34000);

-- --------------------------------------------------------

--
-- Table structure for table `details`
--

CREATE TABLE IF NOT EXISTS `details` (
  `Date` varchar(60) NOT NULL,
  `BuyerName` varchar(60) NOT NULL,
  `Address` varchar(60) NOT NULL,
  `class_Vehicle` varchar(60) NOT NULL,
  `Makers_Name` varchar(60) NOT NULL,
  `Chassis_No` varchar(60) NOT NULL,
  `Engine_No` varchar(5) NOT NULL,
  `Hourse_Power` int(40) NOT NULL,
  `Fuel_Used` int(60) NOT NULL,
  `No_Cylinder` int(60) NOT NULL,
  `Year_of_Manufacture` int(50) NOT NULL,
  `seating_Capacity` int(60) NOT NULL,
  `Unladen_Weight` int(60) NOT NULL,
  `color` varchar(60) NOT NULL,
  `Vehicle_Weight` int(60) NOT NULL,
  `Type_Body` varchar(60) NOT NULL,
  `Wheel_Base` int(60) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `details`
--

INSERT INTO `details` (`Date`, `BuyerName`, `Address`, `class_Vehicle`, `Makers_Name`, `Chassis_No`, `Engine_No`, `Hourse_Power`, `Fuel_Used`, `No_Cylinder`, `Year_of_Manufacture`, `seating_Capacity`, `Unladen_Weight`, `color`, `Vehicle_Weight`, `Type_Body`, `Wheel_Base`) VALUES
('15/12/2015', 'g', 'dhd', 'jtsje', 'tjse', 'jtse', 'tsjs', 0, 0, 2, 0, 5, 0, 'rtjr', 0, 'hfjd', 0),
('15/12/2015', 'arya', 'abc', 'lmv', 'tvs', 'tvs1163', '1235', 120, 0, 1, 0, 5, 500, 'yellow', 0, 'ethte', 0),
('16/12/2015', 'sachin', 'dhjn', 'fgjf', 'fgjfg', 'fdxh', 'dfhdh', 4564, 56, 2015, 2, 4, 546, 'ftghf', 546, 'xg', 564),
('14/12/2015', 'jithin', 'dshhdghs', 'gdh', 'dh', 'dh', 'dh', 45, 453, 545, 1, 45, 543, 'fghj', 4564, 'hdhgd', 45),
('13/1/2016', 'FG', 'fghfjh', 'dhdh', 'dhdh', 'dhd', 'dhd', 456, 4, 45354, 45, 4, 45, 'gyjgh', 45, 'ghjk', 4);

-- --------------------------------------------------------

--
-- Table structure for table `employee`
--

CREATE TABLE IF NOT EXISTS `employee` (
  `Emp_Id` varchar(40) NOT NULL,
  `Emp_Name` varchar(40) DEFAULT NULL,
  `Last_Name` varchar(40) DEFAULT NULL,
  `DOB` date DEFAULT NULL,
  `Address` varchar(60) DEFAULT NULL,
  `Phn_No` int(20) DEFAULT NULL,
  `Alt_No` int(20) DEFAULT NULL,
  `Designation` varchar(30) DEFAULT NULL,
  `Basic_Salary` int(50) DEFAULT NULL,
  `Wages_Day` int(30) DEFAULT NULL,
  PRIMARY KEY (`Emp_Id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `employee`
--

INSERT INTO `employee` (`Emp_Id`, `Emp_Name`, `Last_Name`, `DOB`, `Address`, `Phn_No`, `Alt_No`, `Designation`, `Basic_Salary`, `Wages_Day`) VALUES
('e100', 'remya', 'chandran', '1989-05-02', 'dgsg', 45545, 45686, 'staff', 10000, 100),
('e101', 'arya', 'r', '1993-05-24', 'ghhs', 854, 4534, 'staff', 10000, 100);

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE IF NOT EXISTS `login` (
  `username` varchar(35) NOT NULL,
  `password` varchar(35) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`username`, `password`) VALUES
('motors', 'motors'),
('motor', 'motor');

-- --------------------------------------------------------

--
-- Table structure for table `login1`
--

CREATE TABLE IF NOT EXISTS `login1` (
  `username` varchar(35) NOT NULL,
  `password` varchar(35) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `login1`
--

INSERT INTO `login1` (`username`, `password`) VALUES
('sales', 'sales');

-- --------------------------------------------------------

--
-- Table structure for table `login2`
--

CREATE TABLE IF NOT EXISTS `login2` (
  `username` varchar(40) NOT NULL,
  `password` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `lubricants`
--

CREATE TABLE IF NOT EXISTS `lubricants` (
  `Part_No` varchar(40) NOT NULL,
  `Item_Name` varchar(40) DEFAULT NULL,
  `Grade` varchar(40) DEFAULT NULL,
  `Quantity` int(30) DEFAULT NULL,
  `In_Price` int(30) DEFAULT NULL,
  `MRP` int(30) DEFAULT NULL,
  PRIMARY KEY (`Part_No`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `lubricants`
--

INSERT INTO `lubricants` (`Part_No`, `Item_Name`, `Grade`, `Quantity`, `In_Price`, `MRP`) VALUES
('l100', 'rty', 'n54', 1, 500, 700);

-- --------------------------------------------------------

--
-- Table structure for table `motors`
--

CREATE TABLE IF NOT EXISTS `motors` (
  `Type` varchar(40) DEFAULT NULL,
  `Part_No` varchar(40) NOT NULL,
  `Item_Name` varchar(50) DEFAULT NULL,
  `Model` varchar(40) DEFAULT NULL,
  `Chase_No` varchar(40) DEFAULT NULL,
  `Color` varchar(40) DEFAULT NULL,
  `Quantity` int(10) DEFAULT NULL,
  `In_Price` int(20) DEFAULT NULL,
  `MRP` int(30) DEFAULT NULL,
  PRIMARY KEY (`Part_No`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `motors`
--

INSERT INTO `motors` (`Type`, `Part_No`, `Item_Name`, `Model`, `Chase_No`, `Color`, `Quantity`, `In_Price`, `MRP`) VALUES
('bike', 'm100', 'tvs bike', '2012', '200', 'blue', 4, 30000, 30000),
('scooty', 'm101', 'tvs scooty', '2013', '301', 'yellow', 2, 35000, 37000);

-- --------------------------------------------------------

--
-- Table structure for table `salary`
--

CREATE TABLE IF NOT EXISTS `salary` (
  `Date1` varchar(20) DEFAULT NULL,
  `Emp_Id` varchar(40) DEFAULT NULL,
  `Emp_Name` varchar(40) DEFAULT NULL,
  `Basic_Salary` int(50) DEFAULT NULL,
  `Wages_Day` int(30) DEFAULT NULL,
  `No_Of_Leaves` int(10) DEFAULT NULL,
  `PF` int(20) DEFAULT NULL,
  `DF` int(20) DEFAULT NULL,
  `TA` int(20) DEFAULT NULL,
  `DA` int(20) DEFAULT NULL,
  `Total` int(40) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `spareparts`
--

CREATE TABLE IF NOT EXISTS `spareparts` (
  `Part_No` varchar(40) NOT NULL,
  `Item_Name` varchar(40) DEFAULT NULL,
  `Model` varchar(40) DEFAULT NULL,
  `Quantity` int(30) DEFAULT NULL,
  `In_Price` int(30) DEFAULT NULL,
  `MRP` int(30) DEFAULT NULL,
  PRIMARY KEY (`Part_No`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `spareparts`
--

INSERT INTO `spareparts` (`Part_No`, `Item_Name`, `Model`, `Quantity`, `In_Price`, `MRP`) VALUES
('s100', 'fjfg', '2', 440, 300, 400);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
