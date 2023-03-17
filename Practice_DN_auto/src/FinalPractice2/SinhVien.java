package FinalPractice2;

import java.time.Year;
import java.util.List;
import java.util.Locale;

public abstract class SinhVien {
	private String maSV;
	private String ten;
	private Locale ngaySinh;
	private Year namNhapHoc;
	private float diemDauVao;
	private List<KetQuaHocTap> listKetQuaHocTap;

	// Kiểm tra loại Sinh viên
	public void showTypeStudent() {
		if (this instanceof SinhVienChinhQuy) {
			System.out.println(this.getTen() + " la sinh vien chinh quy");
			return;
		}

		if (this instanceof SinhVienTaiChuc) {
			System.out.println(this.getTen() + " la sinh vien tai chuc");
			return;
		}

		System.out.println("Chua the xac dinh");
	}

	// điểm trung bình các kỳ học của 1 sinh viên
	public void pointAvgOfStudent() {
		// cach 1 - java 8
//		float pointAVG = (float) this.listKetQuaHocTap.stream()
//		    .mapToDouble(KetQuaHocTap::getDiemTrungBinh)
//		    .average()
//		    .orElse(Float.NaN);
//		System.out.println("Diem trung binh la: " + pointAVG);

		// Cách 2: Dùng method có sẵn
//		DoubleSummaryStatistics sumPoint = this.listKetQuaHocTap.stream().mapToDouble(result -> result.getDiemTrungBinh()).summaryStatistics();
//		System.out.println("Diem trung binh la: " + sumPoint.getAverage());

//		Cách truyền thống: sum thủ công và chia thủ công
		float sumPoint = 0;
		for (KetQuaHocTap ketQuaHocTap : listKetQuaHocTap) {
			sumPoint += ketQuaHocTap.getDiemTrungBinh();
		}
		System.out.println("Diem trung binh la: " + sumPoint / listKetQuaHocTap.size());
		// ngoài ra còn ... n cách nữa =))
	}

	public void hienThiThongTin() {
		System.out.println("=====Sinh Vien ");
		System.out.println("maSV: " + maSV);
		System.out.println("Name: " + ten);
		System.out.println("ngay Sinh: " + ngaySinh);
		System.out.println("nam Nhap Hoc: " + namNhapHoc);
		System.out.println("diemDauVao: " + diemDauVao);
	}

	public String getMaSV() {
		return maSV;
	}

	public void setMaSV(String maSV) {
		this.maSV = maSV;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public Locale getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(Locale ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public Year getNamNhapHoc() {
		return namNhapHoc;
	}

	public void setNamNhapHoc(Year namNhapHoc) {
		this.namNhapHoc = namNhapHoc;
	}

	public float getDiemDauVao() {
		return diemDauVao;
	}

	public void setDiemDauVao(float diemDauVao) {
		this.diemDauVao = diemDauVao;
	}

	public List<KetQuaHocTap> getListKetQuaHocTap() {
		return listKetQuaHocTap;
	}

	public void setListKetQuaHocTap(List<KetQuaHocTap> listKetQuaHocTap) {
		this.listKetQuaHocTap = listKetQuaHocTap;
	}

}
