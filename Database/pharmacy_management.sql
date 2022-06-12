-- phpMyAdmin SQL Dump
-- version 5.3.0-dev+20220611.3e6b0abbe2
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th6 12, 2022 lúc 01:46 PM
-- Phiên bản máy phục vụ: 10.4.24-MariaDB
-- Phiên bản PHP: 8.1.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `pharmacy_management`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `nhanvien`
--

CREATE TABLE `nhanvien` (
  `id` int(11) NOT NULL,
  `tennhanvien` varchar(40) COLLATE utf8mb4_unicode_ci NOT NULL,
  `ngaysinh` varchar(40) COLLATE utf8mb4_unicode_ci NOT NULL,
  `gioitinh` varchar(40) COLLATE utf8mb4_unicode_ci NOT NULL,
  `hocvan` varchar(40) COLLATE utf8mb4_unicode_ci NOT NULL,
  `sodienthoai` int(11) NOT NULL,
  `diachi` varchar(40) COLLATE utf8mb4_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `nhanvien`
--

INSERT INTO `nhanvien` (`id`, `tennhanvien`, `ngaysinh`, `gioitinh`, `hocvan`, `sodienthoai`, `diachi`) VALUES
(5, 'nghi', '27/10', 'Nữ', 'Cao đẳng', 123, 'asdf'),
(6, 'ng', '3', 'Nam ', 'Cấp 3', 134, '4'),
(7, 'sf', '24/1', 'Nam ', 'Cấp 3', 123, 'fd'),
(8, 's', 's', 'Nam ', 'Cấp 3', 3, 'sd'),
(9, 'ng', '123', 'Nữ', 'Cấp 3', 123, 'd'),
(10, 'ns', '12', 'Nam ', 'Cấp 3', 124, '43'),
(11, 'sdf', '12', 'Nam ', 'Cấp 3', 234, '124');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `pharmacy`
--

CREATE TABLE `pharmacy` (
  `mathuoc` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL,
  `tensanpham` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `dvt` varchar(15) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `gia` double DEFAULT NULL,
  `soluong` int(11) DEFAULT NULL,
  `cachdung` varchar(40) COLLATE utf8mb4_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `pharmacy`
--

INSERT INTO `pharmacy` (`mathuoc`, `tensanpham`, `dvt`, `gia`, `soluong`, `cachdung`) VALUES
('5', 'thuoc', 'Vỉ', 3000, 5, ''),
('6', 'thuoc2', 'Hộp', 600, 7, 'kjhbg');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `user`
--

CREATE TABLE `user` (
  `user_id` int(11) NOT NULL,
  `user_name` varchar(40) COLLATE utf8mb4_unicode_ci NOT NULL,
  `user_password` varchar(40) COLLATE utf8mb4_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `user`
--

INSERT INTO `user` (`user_id`, `user_name`, `user_password`) VALUES
(1, 'nghia', '123');

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `nhanvien`
--
ALTER TABLE `nhanvien`
  ADD PRIMARY KEY (`id`);

--
-- Chỉ mục cho bảng `pharmacy`
--
ALTER TABLE `pharmacy`
  ADD PRIMARY KEY (`mathuoc`);

--
-- Chỉ mục cho bảng `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`user_id`);

--
-- AUTO_INCREMENT cho các bảng đã đổ
--

--
-- AUTO_INCREMENT cho bảng `nhanvien`
--
ALTER TABLE `nhanvien`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT cho bảng `user`
--
ALTER TABLE `user`
  MODIFY `user_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;



