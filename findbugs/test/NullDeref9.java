
class NullDeref9 {

	protected void error() {
		throw new RuntimeException("You've got error");
		}
	protected void jspError() {
		throw new RuntimeException("You've got error");
		}

	public void foo(Object o) {
		if (o == null) error();
		System.out.println(o.hashCode());
		}
	public void bar(Object o) {
		if (o == null) jspError();
		System.out.println(o.hashCode());
		}
	}
