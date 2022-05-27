package T2;//마지막으로 부여한 식별 번호를 반환하는 클래스

class Id {
	private static int counter = 0; // 몇 번까지 식별 부여를 했는가
	private int id;          //식별 번호
	
	
	//--생성자--//
	public Id() {
		id = ++counter;
	}
	
	//--식별 번호 가져오기--//
	public int getId() {return id;}
	
	//--마지막에 부여할 식별 번호 가져오기--//
	public static int getMaxId() {
		return counter;
	}
}



