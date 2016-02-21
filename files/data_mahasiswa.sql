-- phpMyAdmin SQL Dump
-- version 4.3.11
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Feb 21, 2016 at 04:49 AM
-- Server version: 5.6.24
-- PHP Version: 5.6.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `data_mahasiswa`
--

-- --------------------------------------------------------

--
-- Table structure for table `jurusan`
--

CREATE TABLE IF NOT EXISTS `jurusan` (
  `kode` varchar(10) NOT NULL,
  `nama_jurusan` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `jurusan`
--

INSERT INTO `jurusan` (`kode`, `nama_jurusan`) VALUES
('J1', 'TEKNIK INFORMATIKA'),
('J2', 'TEKNIK ELEKTRO');

-- --------------------------------------------------------

--
-- Table structure for table `mahasiswa`
--

CREATE TABLE IF NOT EXISTS `mahasiswa` (
  `nim` varchar(10) NOT NULL,
  `kode_jurusan` varchar(10) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `alamat` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `mahasiswa`
--

INSERT INTO `mahasiswa` (`nim`, `kode_jurusan`, `nama`, `alamat`) VALUES
('1003040001', 'J1', 'Abde Negara', 'Banjarnegara'),
('1003040002', 'J1', 'Ali', 'Banjarnegara'),
('1003040003', 'J1', 'Alex ED', 'Banjarnegara'),
('1003040004', 'J2', 'David Alaba', 'Tegal'),
('1003040005', 'J1', 'Beni', 'Banjarnegara'),
('1003040006', 'J1', 'Leni', 'Banjarnegara'),
('1003040007', 'J1', 'Lukas', 'Banjarnegara'),
('1003040008', 'J1', 'Iqbal', 'Banjarnegara');

-- --------------------------------------------------------

--
-- Table structure for table `mahasiswa_excel`
--

CREATE TABLE IF NOT EXISTS `mahasiswa_excel` (
  `nim` varchar(50) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `jurusan` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `jurusan`
--
ALTER TABLE `jurusan`
  ADD PRIMARY KEY (`kode`);

--
-- Indexes for table `mahasiswa`
--
ALTER TABLE `mahasiswa`
  ADD PRIMARY KEY (`nim`);

--
-- Indexes for table `mahasiswa_excel`
--
ALTER TABLE `mahasiswa_excel`
  ADD PRIMARY KEY (`nim`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
