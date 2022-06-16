-- phpMyAdmin SQL Dump
-- version 5.2.1-dev+20220611.bf084233ea
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th6 16, 2022 lúc 06:21 PM
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
-- Cấu trúc bảng cho bảng `doanhthu`
--

CREATE TABLE `doanhthu` (
  `id` int(11) NOT NULL,
  `ngay` varchar(12) NOT NULL,
  `total` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `doanhthu`
--

INSERT INTO `doanhthu` (`id`, `ngay`, `total`) VALUES
(58, '01/05/2022', 35000),
(59, '02/05/2022', 71000),
(60, '03/05/2022', 16000),
(61, '04/05/2022', 18000),
(62, '05/05/2022', 21000),
(63, '06/05/2022', 65000),
(64, '07/05/2022', 88000),
(65, '08/05/2022', 16000),
(66, '09/05/2022', 70000),
(67, '10/05/2022', 99000),
(68, '11/05/2022', 54000),
(69, '12/05/2022', 29000),
(70, '13/05/2022', 80000),
(71, '14/05/2022', 20000),
(72, '15/05/2022', 38000),
(73, '16/05/2022', 16000),
(74, '17/05/2022', 91000),
(75, '18/05/2022', 49000),
(76, '19/05/2022', 75000),
(77, '20/05/2022', 53000),
(78, '21/05/2022', 10000),
(79, '22/05/2022', 34000),
(80, '23/05/2022', 71000),
(81, '24/05/2022', 62000),
(82, '25/05/2022', 82000),
(83, '01/06/2022', 67000),
(84, '16/06/2022', 2285000);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `nhanvien`
--

CREATE TABLE `nhanvien` (
  `id` varchar(5) NOT NULL,
  `tennhanvien` varchar(50) NOT NULL,
  `ngaysinh` varchar(20) NOT NULL,
  `gioitinh` varchar(5) NOT NULL,
  `hocvan` varchar(40) NOT NULL,
  `sodienthoai` int(11) NOT NULL,
  `diachi` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `nhanvien`
--

INSERT INTO `nhanvien` (`id`, `tennhanvien`, `ngaysinh`, `gioitinh`, `hocvan`, `sodienthoai`, `diachi`) VALUES
('NV001', 'Trần Minh Ngọc', '12/3/2002', 'Nữ', 'Đại học', 1234567890, '27-28, ngõ 294 Vạn Phúc, Kim Mã'),
('NV002', 'Đỗ Trung Quân', '09/02/2005', 'Nam', 'Cấp 3', 907045623, '763 Quang Trung - P.12 - Gò vấp - HCM'),
('NV004', 'Võ Văn Nam', '15/5/2004', 'Nam', 'Cao đẳng', 908234764, '76C Quốc Lộ 13 - P.26 - Quận Bình Thạnh'),
('NV005', 'Trương Minh Ngọc', '25/5/2002', 'Nữ', 'Đại học', 943176551, '143 Dương Bá Trạc, Phường 01, Quận 08 TP HCM'),
('NV006', 'Lê Quang Đăng', '4/5/2006', 'Nam', 'Cấp 3', 987654321, '322 Tùng Thiện Vương P.13 Quận 8, Hồ Chí Minh'),
('NV007', 'Võ Tấn Phúc', '12/03/2004', 'Nam', 'Cao đẳng', 943176551, '1188 đường Kha Vạn Cân, KP1, P.Linh Chiểu, Q.Thủ Đức, TPHCM'),
('NV008', 'Hồ Ngọc Thảo', '27/10/1999', 'Nữ', 'Đại học', 987654321, 'Số 01, Quốc lộ 1A, Khu phố 6 - P.Linh Trung - Q.Thủ Đức'),
('NV010', 'Võ Lâm Trường', '24/2/2003', 'Nam', 'Cao đẳng', 902345789, '16/1L Nguyễn Ảnh Thủ ấp Hưng Lân, Bà Điểm - Huyện Hóc Môn'),
('NV011', 'Lê Đoan Trang', '12/12/2002', 'Nữ', 'Đại học', 1212121212, '55 Quang Trung, Nguyễn Du, Hai Bà Trưng, Hà Nội'),
('NV012', 'Lê Quang Linh', '23/11/1997', 'Nam', 'Đại học', 286297060, '456 Lê văn sỹ, Phường 14, Quận 03 TP.HCM'),
('NV013', 'Nguyễn Tuấn Mạnh', '12/01/1997', 'Nam', 'Đại học', 703724753, '349 Nguyễn Huệ - Phường 5, TP Tuy Hòa'),
('NV014', 'Vũ Tuyên Quang', '14/02/1986', 'Nam', 'Đại học', 768216273, '479 QL1A, TT Chí Thạnh, huyện Tuy An, Phú Yên'),
('NV015', 'Nguyễn Văn Toản', '23/01/1978', 'Nam', 'Cao đẳng', 23473643, 'Khánh Sơn, Thị trấn Khánh Hải, Ninh Hải, Ninh Thuận'),
('NV016', 'Nguyễn Văn Hoàng', '03/02/1987', 'Nam', 'Cấp 3', 723872354, 'Đường 477, Phố Tiến Yết, TT Me, Gia Viễn Ninh Bình'),
('NV017', 'Phạm Văn Phong', '12/03/2000', 'Nam', 'Cấp 3', 73738263, 'Phố 82, Phú Vinh, TT Phát Diệm, Kim Sơn, Ninh Bình\r\n\r\n'),
('NV018', 'Bùi Xuân Huấn', '23/9/1987', 'Nam', 'Cấp 3', 78736253, 'Phố Tân Nhất, TT Nho Quan, Ninh Bình'),
('NV019', 'Nguyễn Trọng Hoàng', '13/03/2000', 'Nam', 'Cao đẳng', 871726353, '184, tổ 3, Bắc Sơn, Tam Điệp, Ninh Bình'),
('NV020', 'Cao Thị Ngọc Hằng', '03/02/2006', 'Nữ', 'Cấp 3', 326349237, '18 Phan Châu Trinh, Q.Hải Châu, Đà Nẵng'),
('NV021', 'Nguyễn Thị Dung', '16/4/2002', 'Nữ', 'Cao đẳng', 243825291, '248 Cống Quỳnh, Q.1, TP HCM'),
('NV022', 'Lê Tiến Dũng', '23/9/2005', 'Nam', 'Cấp 3', 987654321, '88H/2 Nguyễn Ảnh Thủ, Phường Hiệp Thành, Quận 12, TP Hồ Chí Minh'),
('NV023', 'Cao Văn Dền', '8/8/2002', 'Nam', 'Đại học', 126265823, '51/4 - Đường Hà Huy Giáp - Khu phố 1 - P. Thạnh Xuân - Q.12 - TPHCM'),
('NV024', 'Võ Trường Toản', '6/3/2003', 'Nam', 'Cao đẳng', 326728124, '02 Lê Quý Đôn - Khu 3 - Thác Mơ - Phước Long - Bình Phước'),
('NV025', 'Đặng Phương Hoài', '12/3/2002', 'Nữ', 'Đại học', 987654321, '763 Quang Trung - P.12 - Gò vấp - HCM'),
('NV026', 'Đỗ Tấn Tài', '6/3/2003', 'Nam', 'Cao đẳng', 243825291, '878A Lê Đức Thọ - P15 - Gò Vấp'),
('NV027', 'Hồ Quang Thiện', '12/3/2002', 'Nam', 'Cao đẳng', 909678352, '12/12/3 Hồ Con Rùa, TP HCM'),
('NV028', 'ahaha', '12/12/1221', 'Nam', 'Đại học', 909262512, 'abc/xyz/123');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `pharmacy`
--

CREATE TABLE `pharmacy` (
  `mathuoc` varchar(10) NOT NULL,
  `tensanpham` varchar(100) NOT NULL,
  `dvt` varchar(15) DEFAULT NULL,
  `gia` double DEFAULT NULL,
  `soluong` int(11) DEFAULT NULL,
  `cachdung` varchar(255) DEFAULT NULL,
  `hansudung` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `pharmacy`
--

INSERT INTO `pharmacy` (`mathuoc`, `tensanpham`, `dvt`, `gia`, `soluong`, `cachdung`, `hansudung`) VALUES
('BT001', 'Bostogel', 'Hộp', 75000, 128, 'Uống với nước', '12/12/2025'),
('BT002', 'Trimeboston 100', 'Hộp', 90000, 252, 'Uống', '12/12/2025'),
('BT004', 'Bosphagel B', 'Hộp', 35000, 123, 'Uống', '12/12/2025'),
('BT005', 'Methylboston 4', 'Hộp', 50000, 48, 'Uống', '12/12/2025'),
('BT006', 'Soluboston', 'Vỉ', 55000, 71, 'Uống', '12/12/2025'),
('BT007', 'Methylboston 16', 'Vỉ', 69000, 65, 'Uống', '12/12/2025'),
('CC001', 'Calcium Corbière', 'Hộp', 195000, 303, 'Bẻ 1 đầu của ống rồi uống', '12/12/2025'),
('CS001', 'Vitamin C Sủi', 'Tuýp', 20000, 31, 'Bỏ vào nước đợi tan ra rồi uống', '12/12/2025'),
('DA001', 'Đau bụng ăn', 'Hộp', 9000, 6, 'Uống', '12/12/2025'),
('DB001', 'Đau bụng', 'Vỉ', 12500, 48, 'Uống khi đau bụng', '12/12/2025'),
('HH001', 'Hoạt Huyết Nhất Nhất', 'Hộp', 130000, 493, 'Ngày 2 lần, mỗi lần 2 viên. Với bệnh mạn tính nên uống liên tục ít nhất 3 tháng.', '12/12/2025'),
('HS001', 'Thuốc hạ sốt Aspirin', 'Hộp', 72000, 100, 'Tham khảo bác sĩ', '12/12/2025'),
('HS002', 'Thuốc hạ sốt Biragan', 'Hộp', 30000, 325, 'Hòa tan viên nang vào nước', '12/12/2025'),
('HS003', 'Thuốc hạ sốt E - cox 90', 'Hộp', 350000, 90, 'Tham khảo bác sĩ', '12/12/2025'),
('HS004', 'Thuốc hạ sốt Effaragent', 'Hộp', 50000, 34, '12/12/2025', 'Uống khi sốt'),
('HS005', 'Thuốc hạ sốt Coldacmin', 'Hộp', 58000, 50, 'Tham khảo bác sĩ', '12/12/2025'),
('HS006', 'Thuốc hạ sốt Pabemin', 'Hộp', 300000, 100, 'Uống cách 4 - 6 giờ', '12/12/2025'),
('HS007', 'Thuốc hạ sốt Panadol', 'Hộp', 120000, 100, 'Uống cách 4 - 6 giờ', '12/12/2025'),
('HS008', 'Thuốc hạ sốt Paracetamol', 'Hộp', 30000, 30, 'Tham khảo bác sĩ', '12/12/2025'),
('HS009', 'Thuốc hạ sốt Tiffy', 'Hộp', 105000, 25, 'Tham khảo bác sĩ', '12/12/2025'),
('HS010', 'Thuốc hạ sốt Uraf', 'Hộp', 90000, 65, 'Uống sau khi ăn no. Tham khảo bác sĩ', '12/12/2025'),
('NM001', 'Thuốc nhỏ mắt V.ROHTO', 'Hộp', 55000, 234, 'Nhỏ vào mắt', '12/12/2025'),
('OM001', 'Dầu Cá Omega3', 'Hộp', 189000, 15, 'Uống 2-4 viên/ngày', '12/12/2025'),
('SH001', 'Siro ho Bảo Thanh', 'Chai', 70000, 115, 'Uống', '12/12/2025'),
('SH002', 'Siro ho Bổ Phế Nam Hà', 'Chai', 42000, 128, 'Uống', '12/12/2025'),
('SH003', 'Siro ho Prospan', 'Chai', 85000, 273, 'Uống', '12/12/2025'),
('SN001', 'Sâm Nhung Bổ Thận TW3', 'Hộp', 170000, 68, 'Uống 2 viên/ngày, chia làm 2 lần uống, trước ăn 30 phút', '12/12/2025'),
('TD001', 'Vai Gáy Thái Dương', 'Hộp', 40000, 40, 'Ngày 2 lần', '12/12/2025');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `user`
--

CREATE TABLE `user` (
  `user_id` int(11) NOT NULL,
  `user_name` varchar(50) NOT NULL,
  `user_password` varchar(10) NOT NULL,
  `options` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `user`
--

INSERT INTO `user` (`user_id`, `user_name`, `user_password`, `options`) VALUES
(1, 'minhngoc', '12345', 'admin'),
(2, 'nghia', '12345', 'staff'),
(3, 'nguyen', '12345', 'staff');

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `doanhthu`
--
ALTER TABLE `doanhthu`
  ADD PRIMARY KEY (`id`);

--
-- Chỉ mục cho bảng `nhanvien`
--
ALTER TABLE `nhanvien`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `id` (`id`);

--
-- Chỉ mục cho bảng `pharmacy`
--
ALTER TABLE `pharmacy`
  ADD PRIMARY KEY (`mathuoc`),
  ADD UNIQUE KEY `mathuoc` (`mathuoc`);

--
-- Chỉ mục cho bảng `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`user_id`);

--
-- AUTO_INCREMENT cho các bảng đã đổ
--

--
-- AUTO_INCREMENT cho bảng `doanhthu`
--
ALTER TABLE `doanhthu`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=85;

--
-- AUTO_INCREMENT cho bảng `user`
--
ALTER TABLE `user`
  MODIFY `user_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
