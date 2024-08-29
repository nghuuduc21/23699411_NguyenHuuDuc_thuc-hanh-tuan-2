package nguyenHuuDuc_23699411;



public class Tam {

	private String ten;
	private double x;
	private double y;
	
	// dong goi
	public String getTen() {
		return ten;
	}
	
	public void setT(String t) throws Exception {
		if(ten != null)
			this.ten = t;
		else
			throw new Exception("Loi"); 
	}
	
	public double getX() {
		return x;
	}
	
	public void setX(double x) throws Exception {
		if( x > 0)
			this.x = x;
		else
			throw new Exception("Loi");
	}
	
	public double getY() {
		return y;
	}
	public void setY(double y) throws Exception {
		if( y > 0)
			this.y = y;
		else
			throw new Exception("Loi");
	}

	public Tam() {}
	// khoi tao Object constructer
	public Tam(String ten, double x, double y) {
		super();
		this.ten = ten;
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		
		String s = "";
		s += String.format("%3s(%3s, %3s)", getTen(), getX(), getY());
		return s;
	}
	
	
}
