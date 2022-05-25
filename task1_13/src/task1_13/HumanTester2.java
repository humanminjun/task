package task1_13;

public class HumanTester2 {
	public static void main(String[] args) {
		Human2 gildong = new Human2("길동", 170, 60);
		Human2 chulsu = new Human2("철수", 166, 72);
		
		gildong.gainWeight(3);
		chulsu.reduceWeight(5);
		
		System.out.println("이름:" + gildong.getName());
		System.out.println("신장:" + gildong.getheight() + "cm");
		System.out.println("체중:" + gildong.getweight() + "kg");
		System.out.println();
		
		System.out.println("이름:" + chulsu.getName());
		System.out.println("신장:" + chulsu.getheight() + "cm");
		System.out.println("체중:" + chulsu.getweight() + "kg");

	}

}
