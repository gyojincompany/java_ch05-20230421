package exer;

public class TriangleH extends Shape{

	@Override
	public void printArea1() {
		System.out.println(this.width * this.height * 0.5);
	}
	
	//부모 클래스에서 상속받은 메소드의 내용을 변경 -> 오버라이딩
//	public void printArea1() {
//		System.out.println(this.width * this.height * 0.5);
//	}

	
}
