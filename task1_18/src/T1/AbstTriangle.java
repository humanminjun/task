package T1;
//직각 이등변삼각형을 나타내는 추상 클래스
public abstract class AbstTriangle extends Shape {	
    private int length;		//필드
	
    public AbstTriangle(int length) {
        setLength(length);
    }
	
    public int getLength() {
        return length;
    }
	
    public void setLength(int length) {
        this.length = length;
    }
	
    public String toString() {
        return "AbstTriange(length:" + length + ")";
    }

}
