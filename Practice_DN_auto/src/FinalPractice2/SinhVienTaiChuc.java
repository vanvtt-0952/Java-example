package FinalPractice2;

import java.time.LocalDate;
import java.time.Year;
import java.util.List;

public class SinhVienTaiChuc extends SinhVien {
	private String noiLienKetDaoTao;

	public SinhVienTaiChuc(String maSV, String ten, LocalDate ngaySinh, Year namNhapHoc, float diemDauVao,
			List<KetQuaHocTap> listKetQuaHocTap, String noiLienKetDaoTao) {
		super(maSV, ten, ngaySinh, namNhapHoc, diemDauVao, listKetQuaHocTap);
		this.noiLienKetDaoTao = noiLienKetDaoTao;
	}

	@Override
	public void hienThiThongTin() {
		System.out.println("=====Sinh Vien ");
		super.hienThiThongTin();
		System.out.println("Noi lien ket dao tao: " + noiLienKetDaoTao);
	}

	public String getNoiLienKetDaoTao() {
		return noiLienKetDaoTao;
	}

	public void setNoiLienKetDaoTao(String noiLienKetDaoTao) {
		this.noiLienKetDaoTao = noiLienKetDaoTao;
	}

}
