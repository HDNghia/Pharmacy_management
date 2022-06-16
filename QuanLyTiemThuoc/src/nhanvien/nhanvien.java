package nhanvien;

public class nhanvien {
	private String hovaten, ngaysinh, gioitinh, diachi, hocvan, so_cccd;
	private String id;
	public nhanvien(String id, String hovaten, String ngaysinh, String gioitinh, int sodienthoai, String hocvan, String diachi) {
		super();
		this.id=id;
		this.hovaten = hovaten;
		this.ngaysinh = ngaysinh;
		this.gioitinh = gioitinh;
		this.diachi = diachi;
		this.hocvan = hocvan;
		this.sodienthoai = sodienthoai;
	}
	public nhanvien(String hovaten, String ngaysinh, String gioitinh, int sodienthoai, String hocvan, String diachi) {
		super();
		this.hovaten = hovaten;
		this.ngaysinh = ngaysinh;
		this.gioitinh = gioitinh;
		this.diachi = diachi;
		this.hocvan = hocvan;
		this.sodienthoai = sodienthoai;
	}
	public nhanvien(String hovaten, String ngaysinh, String gioitinh,String hocvan, int sodienthoai, String diachi) {
		super();
		this.hovaten = hovaten;
		this.ngaysinh = ngaysinh;
		this.gioitinh = gioitinh;
		this.diachi = diachi;
		this.hocvan = hocvan;
		this.sodienthoai = sodienthoai;
	}
	public String getID() {
		return id;
	}
	public void setID(String id) {
		this.id = id;
	}
	public String getHovaten() {
		return hovaten;
	}
	public void setHovaten(String hovaten) {
		this.hovaten = hovaten;
	}
	public String getNgaysinh() {
		return ngaysinh;
	}
	public void setNgaysinh(String ngaysinh) {
		this.ngaysinh = ngaysinh;
	}
	public String getGioitinh() {
		return gioitinh;
	}
	public void setGioitinh(String gioitinh) {
		this.gioitinh = gioitinh;
	}
	public String getDiachi() {
		return diachi;
	}
	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}
	public String getHocvan() {
		return hocvan;
	}
	public void setHocvan(String hocvan) {
		this.hocvan = hocvan;
	}
	public int getSodienthoai() {
		return sodienthoai;
	}
	public void setSodienthoai(int sodienthoai) {
		this.sodienthoai = sodienthoai;
	}
	private int sodienthoai;
	
}