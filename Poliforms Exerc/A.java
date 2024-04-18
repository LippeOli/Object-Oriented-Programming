class A {

	private int m;
    private int n;
    public A(int mIn, int nIn) {
        m = mIn;
        n = nIn;
    }

    public void m1() {
        m = m + n;
    }

	public int getM() {
		return m;
	}

	public void setM(int m) {
		this.m = m;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}
	
	@Override
	public String toString() {
		return "A = ("+ getM() +", "+ getN() + ")";
	}
}

