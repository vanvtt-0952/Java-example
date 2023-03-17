package FinalPractice2;

public class KetQuaHocTap {
	private String tenHocKy;
	private float diemTrungBinh;

	public KetQuaHocTap(String ten, float diemTrungBinh) {
		this.tenHocKy = ten;
		this.diemTrungBinh = diemTrungBinh;
	}

	public void hienThiThongTin() {
		System.out.println("++++ Ket qua hoc tap ++++");
		System.out.println("Ten Hoc Ky: " + tenHocKy);
		System.out.println("Diem trung binh: " + diemTrungBinh);
	}

	public String getTenHocKy() {
		return tenHocKy;
	}

	public void setTenHocKy(String tenHocKy) {
		this.tenHocKy = tenHocKy;
	}

	public float getDiemTrungBinh() {
		return diemTrungBinh;
	}

	public void setDiemTrungBinh(float diemTrungBinh) {
		this.diemTrungBinh = diemTrungBinh;
	}

}
