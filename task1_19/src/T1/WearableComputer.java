package T1;

public class WearableComputer implements Wearable {

	@Override
	public void putOn() {
		System.out.println("캄푸터를 실행했습니다.");
	}
	@Override
	public void putOff() {
		System.out.println("컴퓨터를 껐습니다.");
	}
	public void reset() {
		System.out.println("컴퓨터를 재시작했습니다.");
	}
}
