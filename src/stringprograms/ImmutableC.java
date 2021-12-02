package stringprograms;

public final class ImmutableC {
	private int i = 10;

	public ImmutableC(int i) {
		this.i = i;
	}

	public ImmutableC getI(int i) {
		if (this.i == i) {
			return this;
		} else {
			return new ImmutableC(i);
		}
	}

	public static void main(String[] args) {
		ImmutableC v = new ImmutableC(10);
		ImmutableC v1 = v.getI(10);
		ImmutableC v2 = v.getI(100);
		if (v2 == v1) {
			System.out.println("address same");
		} else {
			System.out.println("address different");
		}
	}

}
