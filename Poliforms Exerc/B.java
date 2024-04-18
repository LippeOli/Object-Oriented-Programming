
public class B extends A{
	
	public B(int m, int n) {
		super(m, n);
	}
	
	@Override 
	public void m1() {
		int atualM = getM();
		int atualN = getN();
		setM(atualM - atualN);
        
     }
	@Override
	public String toString() {
		return "B = ("+ getM() +", "+ getN() + ")";
	}
	public static void main(String[] args) {
		A a = new A(1, 2);
	    A b = new B(1, 2);
	    System.out.println(a + " " + b);
	    a.m1();
	    b.m1();
	    System.out.println(a + " " + b);

	}

}
