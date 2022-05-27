package T1; //일렬 번호를 생성하는 클래스

public class Id {    //ID 클래스
	static int counter = 0;    //몇 번까지 식별 부여했는가
	private int id;            //식별 번호
	
	//--생성자--//
	public Id() {
		id = ++counter;        //식별 번호
	}
	
	//--식별번호 가져오기--//
	public int getId() {
		return id;
	}
}
