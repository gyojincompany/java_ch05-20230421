package exer;

public class Triangle {
	
	int x;//x좌표
	int y;//y좌표
	int width;//가로
	int height;//세로	
	String color;//도형의 색
	
	public void printArea1() {
		System.out.println(this.width * this.height * 0.5);
	}
}
