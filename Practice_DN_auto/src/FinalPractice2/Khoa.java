package FinalPractice2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Khoa {
	private String ten;
	private List<SinhVien> listSinhVien;

	public Khoa(String ten, List<SinhVien> listSinhVien) {
		this.ten = ten;
		this.listSinhVien = listSinhVien;
	}

	// tổng số sinh viên chính quy của khoa
	public int countSinhVienChinhQuy() {
		// cách truyền thống tường minh =))
//		int count = 0;
//		for (SinhVien student : this.getListSinhVien()) {
//			if (student instanceof SinhVienChinhQuy) {
//				count += 1;
//			}
//		}
//		return count;
		// cach 2
		return (int) this.getListSinhVien().stream().filter(student -> student instanceof SinhVienChinhQuy).count();
	}

	// sinh viên có điểm đầu vào cao nhất của khoa
	public List<SinhVien> SinhVienCoDiemDauVaoCaoNhat() {
//		Float maxPoint = Float.MIN_VALUE;
//		List<SinhVien> listSinhVienCoDiemCaoNhat = new ArrayList<SinhVien>();
//
//		for (SinhVien sinhVien : this.getListSinhVien()) {
//			if (maxPoint > sinhVien.getDiemDauVao()) {
//				continue;
//			}
//			if (maxPoint < sinhVien.getDiemDauVao()) {
//				listSinhVienCoDiemCaoNhat.clear();
//				maxPoint = sinhVien.getDiemDauVao();
//			}
//			listSinhVienCoDiemCaoNhat.add(sinhVien);
//		}
//
//		return listSinhVienCoDiemCaoNhat;
		
		// Cach 2
		/*
		 * Lấy ra điểm cao nhất
		 * Lấy ra danh sách sinh viên có điểm bằng điểm cao nhất
		 */
		
		 Float max = (float) this.getListSinhVien()
			      .stream()
			      .mapToDouble(v -> v.getDiemDauVao())
			      .max().orElse(0);
		 
		 return this.listSinhVien.stream().filter(sv -> sv.getDiemDauVao() == max).collect(Collectors.toList());
		 
		 // cái này dùng khi chỉ tìm ra sinh viên điểm cao nhất - sinh viên đầu tiên
//		SinhVien maxByPoint = this.getListSinhVien()
//			      .stream()
//			      .max(Comparator.comparing(SinhVien::getDiemDauVao))
//			      .orElse(null);
		

		
	}

	public void hienThiThongTin() {
		System.out.println("===== Khoa ");
		System.out.println("Name: " + ten);

		System.out.println("____ Danh sach sinh vien cua khoa ____ ");
		listSinhVien.forEach(sv -> sv.hienThiThongTin());
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public List<SinhVien> getListSinhVien() {
		return listSinhVien;
	}

	public void setListSinhVien(List<SinhVien> listSinhVien) {
		this.listSinhVien = listSinhVien;
	}

}
