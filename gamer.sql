-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Generation Time: Mar 07, 2019 at 12:04 PM
-- Server version: 5.7.24-log
-- PHP Version: 7.2.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `gamer`
--

-- --------------------------------------------------------

--
-- Table structure for table `gamers`
--

CREATE TABLE `gamers` (
  `gamer_id` int(11) NOT NULL,
  `gamer_name` varchar(30) NOT NULL,
  `gamer_email` varchar(30) NOT NULL,
  `gamer_password` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `gamers`
--

INSERT INTO `gamers` (`gamer_id`, `gamer_name`, `gamer_email`, `gamer_password`) VALUES
(1, 'Jane Doe', '1@1.com', '101'),
(2, 'Maximus', 'max@.min.com', '123'),
(3, 'Toxic', 'toxic@gamerz.com', 'qwerty'),
(4, 'Toxic', 'toxic@gamerz.com', 'qwerty'),
(5, 'Toxic', 'toxic@gamerz.com', 'qwerty'),
(6, 'Ms. Marble', 'marble@solveyourcrimes.com', 'the butler did it!'),
(7, 'Ms. Marble', 'marble@solveyourcrimes.com', 'the butler did it!'),
(8, 'Bob', '1@1.com', '1234'),
(9, 'Bob', '1@1.com', '1234'),
(10, 'Bob', '1@1.com', '1234'),
(11, 'Bob', '1@1.com', '1234'),
(12, 'Bob', '1@1.com', '1234'),
(13, 'Bob', '1@1.com', '1234'),
(14, 'Bob', '1@1.com', '1234'),
(15, 'Bob', '1@1.com', '1234'),
(16, 'Bob', '1@1.com', '1234'),
(17, 'Bob', '1@1.com', '1234'),
(18, 'Bob', '1@1.com', '1234'),
(19, 'Craig', '1@1.com', '1234'),
(20, 'Craig', '1@1.com', '1234'),
(21, 'Craig', '1@1.com', '1234'),
(22, 'Craig', '1@1.com', '1234'),
(23, 'Craig', '1@1.com', '1234'),
(24, 'Craig', '1@1.com', '1234'),
(25, 'Somebody', '2222@22222.com', 'qwerty');

-- --------------------------------------------------------

--
-- Table structure for table `hero`
--

CREATE TABLE `hero` (
  `hero_id` int(11) NOT NULL,
  `hero_name` varchar(30) NOT NULL,
  `hero_lvl` int(11) NOT NULL,
  `hero_ownerid` int(11) NOT NULL,
  `hero_class` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `hero`
--

INSERT INTO `hero` (`hero_id`, `hero_name`, `hero_lvl`, `hero_ownerid`, `hero_class`) VALUES
(1, 'Slayer', 60, 1, 'Warrior'),
(2, 'Pip', 60, 2, 'Warlock'),
(3, 'Bankoo', 56, 0, 'Mage'),
(4, 'Kira', 60, 0, 'Warlock'),
(5, 'Spartacus', 60, 0, 'Warrior'),
(6, '--XXxxDruidMasterxxXX--', 60, 0, 'Druid'),
(7, 'ToyFriendChip', 12, 0, 'Monk'),
(8, 'theKingzman', 59, 0, 'Death Knight'),
(9, 'noobKillah', 15, 0, 'Druid');

-- --------------------------------------------------------

--
-- Table structure for table `heroclass`
--

CREATE TABLE `heroclass` (
  `heroclass_id` int(11) NOT NULL,
  `heroclass_name` varchar(30) NOT NULL,
  `heroclass_ability` varchar(30) NOT NULL,
  `heroclass_ownerid` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `heroclass`
--

INSERT INTO `heroclass` (`heroclass_id`, `heroclass_name`, `heroclass_ability`, `heroclass_ownerid`) VALUES
(1, 'Hunter', 'Beast mastery', 3),
(2, 'Shaman', 'Restoration', 5);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `gamers`
--
ALTER TABLE `gamers`
  ADD PRIMARY KEY (`gamer_id`);

--
-- Indexes for table `hero`
--
ALTER TABLE `hero`
  ADD PRIMARY KEY (`hero_id`);

--
-- Indexes for table `heroclass`
--
ALTER TABLE `heroclass`
  ADD PRIMARY KEY (`heroclass_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `gamers`
--
ALTER TABLE `gamers`
  MODIFY `gamer_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=26;

--
-- AUTO_INCREMENT for table `hero`
--
ALTER TABLE `hero`
  MODIFY `hero_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT for table `heroclass`
--
ALTER TABLE `heroclass`
  MODIFY `heroclass_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
