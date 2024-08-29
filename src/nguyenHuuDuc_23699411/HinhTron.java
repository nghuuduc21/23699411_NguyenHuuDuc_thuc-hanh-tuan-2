package nguyenHuuDuc_23699411;

public class HinhTron {

	private double bk;
	private Tam ten;
	public static final double PI = 3.1416;
	
	public double getBk() {
		return bk;
	}
	
	public void setBk(double bk) throws Exception {
		// rang buoc 
		if(bk > 0)
			this.bk = bk;
		else
			throw new Exception("Loi");
	}
	
	public Tam getTam() {
		return ten;
	}
	
	public void setTam(Tam t) throws Exception {
		// rang buoc
		if(ten != null)
			this.ten = t;
		else
			throw new Exception("Loi");
	}
	
	// tao mot Object bang ham constructer
	public HinhTron(double bk, Tam t) throws Exception {
		
		if(bk > 0) {
					this.bk = bk;
		}
		else {
			throw new Exception("Loi");
		}
			
		//-------------------------------------
	}
	
	public double getDienTich() {
		return getBk() * getBk() * PI;
	}
	
	public double getChuVi() {
		return getBk() * 2 * PI;
	}
	
	@Override
	public String toString() {
		String c = "";
		c += String.format(",  %5s ,  %5s ,  %5s", getBk(), getDienTich(), getChuVi() );
		return c;
	}
	
	
	
}
