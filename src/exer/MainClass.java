package exer;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RectangleH recH1 = new RectangleH();
		recH1.width = 10;
		recH1.height = 20;
		recH1.printArea1();
		
		
		TriangleH triH1 = new TriangleH();
		triH1.printArea1();//오버라이딩 되었으므로 삼각형의 넓이가 출력
		
	}

}
