package id.ac.undiksha.siak;

import id.ac.undiksha.siak.people.Mahasiswa;
import id.ac.undiksha.siak.people.Dosen;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mahasiswa ani = new Mahasiswa();
		ani.setNim("1234");
		ani.setJenisKelamin(true);
		ani.setAlamat("singaraja");
		ani.setNama("ani");
		ani.setTanggalLahir("1 Januari");
		ani.setProdi("Ilmu Komputer");
		
		System.out.println(ani.getNim());
		System.out.println(ani.getNama());
		System.out.println(ani.getAlamat());
		System.out.println(ani.getJenisKelamin());
		System.out.println(ani.getTanggalLahir());
		System.out.println(ani.getProdi());
		
		Dosen yudhi = new Dosen();
		yudhi.setNama("Yudhi");
		yudhi.setNip("231423");
		yudhi.setTanggalLahir("5 Maret");
		yudhi.setAlamat("singaraja");
		yudhi.setJenisKelamin(false);
		yudhi.setFakultas("Teknik Dan Kejuruan");
		
		System.out.println(yudhi.getNip());
		System.out.println(yudhi.getNama());
		System.out.println(yudhi.getAlamat());
		System.out.println(yudhi.getTanggalLahir());
		System.out.println(yudhi.getJenisKelamin());
		System.out.println(yudhi.getFakultas());
		
		
		/*ani.nim 			= "12345";
		ani.nama 			= "Ani";
		ani.alamat 			= "Singaraja";
		ani.tanggalLahir 	= "1 Januari 2000";
		ani.jenisKelamin 	= true;
		ani.prodi 			= "Ilmu Komputer";
		
		System.out.println(ani.nim);
		System.out.println(ani.nama);
		System.out.println(ani.alamat);
		System.out.println(ani.tanggalLahir);
		System.out.println(ani.jenisKelamin);
		System.out.println(ani.prodi);*/
	}

}
