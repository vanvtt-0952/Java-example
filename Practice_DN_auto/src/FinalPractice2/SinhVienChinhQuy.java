package FinalPractice2;

import java.time.LocalDate;
import java.time.Year;
import java.util.List;

public class SinhVienChinhQuy extends SinhVien {

	public SinhVienChinhQuy(String maSV, String ten, LocalDate ngaySinh, Year namNhapHoc, float diemDauVao,
			List<KetQuaHocTap> listKetQuaHocTap) {
		super(maSV, ten, ngaySinh, namNhapHoc, diemDauVao, listKetQuaHocTap);
	}

}
