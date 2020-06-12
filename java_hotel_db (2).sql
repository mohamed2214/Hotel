-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 12, 2020 at 11:59 AM
-- Server version: 10.4.11-MariaDB
-- PHP Version: 7.2.29

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `java_hotel_db`
--

-- --------------------------------------------------------

--
-- Table structure for table `clients`
--

CREATE TABLE `clients` (
  `id` int(11) NOT NULL,
  `first_name` varchar(100) NOT NULL,
  `last_name` varchar(100) NOT NULL,
  `email` varchar(150) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `clients`
--

INSERT INTO `clients` (`id`, `first_name`, `last_name`, `email`) VALUES
(2, 'Mohamed', 'Ashraf', 'mohamed@gmail.com'),
(3, 'Ahmed', 'Ehab', 'ahmed@yahoo.com'),
(4, 'Sayed', 'Ali', 'ahme22d@yahoo.com'),
(5, 'Mostsfa', 'Tamer', 'kk@gmai.com'),
(6, 'Ali', 'khaled', 'd@gmai.com'),
(7, 'ahmed', 'ali', 'amhedally@yhooo.com'),
(11, 'mohammed', 'hussein', 'mh@gmail.com'),
(12, 'mohamed', 'magdy', 'mg@gmail.com'),
(14, 'ahmed', 'ali', 'amhedally@yhooo.com'),
(15, 'ehab', 'ashmed', 'ehab@yahoo.com'),
(16, 'asmaa', 'ashmed', 'ehab@yahoo.com'),
(17, 'ramadan', 'sayad', 'sayed3922@yahoo.com'),
(18, 'Martyn', 'Lutz', 'nismail.zdzz@hanoi24h.'),
(19, 'Fred', '4fabrico.briittoj@inacup.gq', '4fabrico.briittoj@inacup.gq'),
(20, 'Aryn', 'Abdo', 'jamesfader78@yahoo.com'),
(21, 'Samir ', 'Huq', 'leonelanderson61@yahoo.com'),
(22, 'Sharad', 'Arif', 'markjackowski97@yahoo.com'),
(23, 'Hasan', 'Shaheed', 'ishaantormey17@yahoo.com'),
(24, 'Wajeeda', 'Diab', 'javionbabyak87@yahoo.com'),
(25, 'Nibal', 'Burki', 'diamondwilliams76@yahoo.com'),
(26, 'Hamid', 'Baluch', 'diamondwilliams76@yahoo.com'),
(27, 'Amir', 'Mir', 'abrahameady41@yahoo.com');

-- --------------------------------------------------------

--
-- Table structure for table `phone`
--

CREATE TABLE `phone` (
  `phone number` varchar(50) NOT NULL,
  `Client ID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `phone`
--

INSERT INTO `phone` (`phone number`, `Client ID`) VALUES
('300', 2),
('500', 2),
('456', 3),
('654', 3),
('789', 4),
('987', 4),
('147', 5),
('741', 5),
('258', 6),
('852', 6),
('369', 7),
('963', 7),
('010', 11),
('011', 11),
('158', 12),
('169', 12),
('10000', 14),
('15000', 14),
('14783178', 15),
('525558', 15),
('1478317886', 16),
('525558669', 16),
('1478', 17),
('3639', 17),
('01055553425', 18),
('7391', 18),
('27558', 19),
('31432', 19),
('30297', 20),
('8888', 20),
('19240', 21),
('24414', 21),
('886028287', 22),
('942049262', 22),
('691468070', 23),
('949060516', 23),
('6914468070', 24),
('9490605516', 24),
('1074656786', 25),
('667963137', 25),
('409056871', 26),
('882970519', 26),
('1011519467', 27),
('161428480', 27);

-- --------------------------------------------------------

--
-- Table structure for table `reservations`
--

CREATE TABLE `reservations` (
  `id` int(11) NOT NULL,
  `client_id` int(11) NOT NULL,
  `room_number` int(11) NOT NULL,
  `date_in` date NOT NULL,
  `date_out` date NOT NULL,
  `RepID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `reservations`
--

INSERT INTO `reservations` (`id`, `client_id`, `room_number`, `date_in`, `date_out`, `RepID`) VALUES
(17, 3, 3, '2020-05-17', '2020-05-23', 2),
(27, 4, 1, '2020-05-17', '2020-05-31', 1),
(43, 4, 4, '2020-05-12', '2020-05-14', 2),
(44, 7, 5, '2020-05-12', '2020-05-14', 1),
(45, 6, 2, '2020-05-14', '2020-05-16', 3),
(47, 15, 10, '2020-06-20', '2020-06-28', 1),
(48, 16, 11, '2020-06-20', '2020-06-28', 1),
(49, 17, 12, '2020-06-20', '2020-06-28', 1),
(50, 18, 13, '2020-06-20', '2020-06-28', 1),
(51, 19, 14, '2020-06-20', '2020-06-28', 1),
(52, 12, 15, '2020-06-20', '2020-06-30', 1);

-- --------------------------------------------------------

--
-- Table structure for table `rooms`
--

CREATE TABLE `rooms` (
  `r_number` int(11) NOT NULL,
  `type` int(11) NOT NULL,
  `phone` varchar(25) NOT NULL,
  `reserved` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `rooms`
--

INSERT INTO `rooms` (`r_number`, `type`, `phone`, `reserved`) VALUES
(1, 1, '123456789', 'Yes'),
(2, 2, '123456789', 'Yes'),
(3, 2, '123456789', 'Yes'),
(4, 1, '65487654', 'Yes'),
(5, 1, '645646', 'Yes'),
(6, 1, '125636', 'No'),
(7, 1, '586', 'No'),
(8, 3, '5869', 'No'),
(9, 3, '5869', 'No'),
(10, 4, '596200', 'Yes'),
(11, 2, '678', 'Yes'),
(12, 3, '9999', 'Yes'),
(13, 5, '99999', 'Yes'),
(14, 1, '2222', 'Yes'),
(15, 2, '111', 'Yes');

-- --------------------------------------------------------

--
-- Table structure for table `type`
--

CREATE TABLE `type` (
  `id` int(11) NOT NULL,
  `label` varchar(100) NOT NULL,
  `price` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `type`
--

INSERT INTO `type` (`id`, `label`, `price`) VALUES
(1, 'single', '100'),
(2, 'double', '200'),
(3, 'triple', '300'),
(4, 'family', '400'),
(5, 'suite', '750');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `id` int(11) NOT NULL,
  `username` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`id`, `username`, `password`) VALUES
(1, 'test1', 'test1'),
(2, 'test2', 'test2'),
(3, 'test3', 'test3'),
(4, 'test4', 'test4'),
(5, 'test5', 'test5'),
(6, 'test6', 'test6'),
(7, 'test7', 'test7'),
(8, 'test8', 'test8'),
(9, 'test9', 'test9'),
(10, 'test10', 'test10');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `clients`
--
ALTER TABLE `clients`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `phone`
--
ALTER TABLE `phone`
  ADD UNIQUE KEY `phone number` (`phone number`),
  ADD KEY `Client ID` (`Client ID`);

--
-- Indexes for table `reservations`
--
ALTER TABLE `reservations`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_client_id` (`client_id`),
  ADD KEY `fk_room_number` (`room_number`),
  ADD KEY `RepID` (`RepID`);

--
-- Indexes for table `rooms`
--
ALTER TABLE `rooms`
  ADD PRIMARY KEY (`r_number`),
  ADD KEY `fk_type_id` (`type`);

--
-- Indexes for table `type`
--
ALTER TABLE `type`
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
-- AUTO_INCREMENT for table `clients`
--
ALTER TABLE `clients`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=28;

--
-- AUTO_INCREMENT for table `reservations`
--
ALTER TABLE `reservations`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=53;

--
-- AUTO_INCREMENT for table `rooms`
--
ALTER TABLE `rooms`
  MODIFY `r_number` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- AUTO_INCREMENT for table `type`
--
ALTER TABLE `type`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `phone`
--
ALTER TABLE `phone`
  ADD CONSTRAINT `phone_ibfk_1` FOREIGN KEY (`Client ID`) REFERENCES `clients` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `reservations`
--
ALTER TABLE `reservations`
  ADD CONSTRAINT `fk_client_id` FOREIGN KEY (`client_id`) REFERENCES `clients` (`id`) ON DELETE CASCADE,
  ADD CONSTRAINT `fk_room_number` FOREIGN KEY (`room_number`) REFERENCES `rooms` (`r_number`) ON DELETE CASCADE,
  ADD CONSTRAINT `reservations_ibfk_1` FOREIGN KEY (`RepID`) REFERENCES `users` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `rooms`
--
ALTER TABLE `rooms`
  ADD CONSTRAINT `fk_type_id` FOREIGN KEY (`type`) REFERENCES `type` (`id`) ON DELETE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
