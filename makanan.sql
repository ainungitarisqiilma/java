-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 14, 2020 at 08:37 AM
-- Server version: 10.3.15-MariaDB
-- PHP Version: 7.3.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `makanan`
--

-- --------------------------------------------------------

--
-- Table structure for table `menu_makanan`
--

CREATE TABLE `menu_makanan` (
  `kd_makanan` int(10) NOT NULL,
  `menu_makanan` varchar(20) NOT NULL,
  `harga_makanan` varchar(15) NOT NULL,
  `menu_minuman` varchar(11) NOT NULL,
  `harga_minuman` varchar(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `menu_makanan`
--

INSERT INTO `menu_makanan` (`kd_makanan`, `menu_makanan`, `harga_makanan`, `menu_minuman`, `harga_minuman`) VALUES
(1, 'Rendang', 'Rp.15000', 'Soda Gembir', 'Rp.10000'),
(2, 'nasi goreng', 'Rp.10000', 'es teh', 'Rp.5000'),
(3, 'Rawon', 'Rp.20000', 'capuccino', 'Rp.8000'),
(4, 'GURAMI BAKAR', 'Rp.18000', 'es jeruk', 'Rp.12000'),
(5, 'Cumi cumi', 'Rp.30000', 'marimas', 'Rp.5000');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `menu_makanan`
--
ALTER TABLE `menu_makanan`
  ADD PRIMARY KEY (`kd_makanan`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
