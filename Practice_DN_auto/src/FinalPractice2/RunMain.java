package FinalPractice2;

import java.time.LocalDate;
import java.time.Year;
import java.util.ArrayList;
import java.util.List;

public class RunMain {

	public static void main(String[] args) {
		// Nhập và khởi tạo data cho sinh viên 1
		KetQuaHocTap result1OfSV1 = new KetQuaHocTap("KH 1", 6.5f);
		KetQuaHocTap result2OfSV1 = new KetQuaHocTap("KH 2", 6.5f);
		KetQuaHocTap result3OfSV1 = new KetQuaHocTap("KH 3", 6.5f);
		List<KetQuaHocTap> resutlsOfSV1 = new ArrayList<KetQuaHocTap>();
		resutlsOfSV1.add(result1OfSV1);
		resutlsOfSV1.add(result2OfSV1);
		resutlsOfSV1.add(result3OfSV1);
		SinhVien sv1 = new SinhVienChinhQuy("sv_01", "Sinh vien 1", LocalDate.of(1993, 1, 10), Year.of(2022), 8.0f,
				resutlsOfSV1);

		// Nhập và khởi tạo data cho sinh viên 2
		KetQuaHocTap result1OfSV2 = new KetQuaHocTap("KH 1", 7.0f);
		KetQuaHocTap result2OfSV2 = new KetQuaHocTap("KH 2", 7.2f);
		KetQuaHocTap result3OfSV2 = new KetQuaHocTap("KH 3", 8.5f);
		List<KetQuaHocTap> resutlsOfSV2 = new ArrayList<KetQuaHocTap>();
		resutlsOfSV2.add(result1OfSV2);
		resutlsOfSV2.add(result2OfSV2);
		resutlsOfSV2.add(result3OfSV2);
		SinhVien sv2 = new SinhVienTaiChuc("sv_02", "Sinh vien 2", LocalDate.of(1993, 1, 15), Year.of(2022), 6.3f,
				resutlsOfSV2, "Hue");

		// Nhập và khởi tạo data cho sinh viên 3
		KetQuaHocTap result1OfSV3 = new KetQuaHocTap("KH 1", 8.0f);
		KetQuaHocTap result2OfSV3 = new KetQuaHocTap("KH 2", 7.0f);
		KetQuaHocTap result3OfSV3 = new KetQuaHocTap("KH 3", 8.0f);
		List<KetQuaHocTap> resutlsOfSV3 = new ArrayList<KetQuaHocTap>();
		resutlsOfSV3.add(result1OfSV3);
		resutlsOfSV3.add(result2OfSV3);
		resutlsOfSV3.add(result3OfSV3);
		SinhVien sv3 = new SinhVienChinhQuy("sv_03", "Sinh vien 3", LocalDate.of(1992, 4, 10), Year.of(2022), 9.0f,
				resutlsOfSV3);

		// Nhập và khởi tạo data cho sinh viên 4
		KetQuaHocTap result1OfSV4 = new KetQuaHocTap("KH 1", 6.0f);
		KetQuaHocTap result2OfSV4 = new KetQuaHocTap("KH 2", 7.0f);
		KetQuaHocTap result3OfSV4 = new KetQuaHocTap("KH 3", 8.0f);
		List<KetQuaHocTap> resutlsOfSV4 = new ArrayList<KetQuaHocTap>();
		resutlsOfSV4.add(result1OfSV4);
		resutlsOfSV4.add(result2OfSV4);
		resutlsOfSV4.add(result3OfSV4);
		SinhVien sv4 = new SinhVienChinhQuy("sv_03", "Sinh vien 3", LocalDate.of(1993, 4, 20), Year.of(2022), 9.0f,
				resutlsOfSV4);
		
		// Nhập và khởi tạo data cho Khoa
		List<SinhVien> danhSachSinhVien = new ArrayList<SinhVien>();
		danhSachSinhVien.add(sv3);
		danhSachSinhVien.add(sv1);
		danhSachSinhVien.add(sv2);
		danhSachSinhVien.add(sv4);
		Khoa khoa = new Khoa("Khoa tu do" , danhSachSinhVien);
		
		System.out.println("\nHiển thị thông tin khoa và Danh sách Sinh viên của Khoa");
		// Hiển thị thông tin khoa và Danh sách Sinh viên của Khoa
		khoa.hienThiThongTin();
		

		System.out.println("\nHiển thị  điểm trung bình của từng sinh viên");
		// Đồng thời hiển thị điểm trung bình của từng sinh viên
		khoa.getListSinhVien().forEach(sv -> sv.pointAvgOfStudent());

		System.out.println("\nHiển thị Danh sách sinh viên chính quy");
		// Hiển thị Danh sách sinh viên chính quy
		khoa.getListSinhVien().forEach(sv -> sv.showTypeStudent());

		System.out.println("\nSinh viên có điểm đầu vào cao nhất");
		// Lấy ra Sinh viên có điểm đầu vào cao nhất
		khoa.sinhVienCoDiemDauVaoCaoNhat().forEach(sv -> sv.hienThiThongTin());
		
		
		
	}

}
