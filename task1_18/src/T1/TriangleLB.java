package T1;
//왼쪽 아래가 직각인 이등변 삼각형
public class TriangleLB extends AbstTriangle {
	
    public TriangleLB(int length) {
        super(length);
    }
	
    public String toString() {
        return "TriangleLB(length:" + getLength() + ")";
    }
	
    public void draw() {
        for(int i=1; i<=getLength(); i++) {
            for(int j=1; j<=i; j++)
            System.out.print('*');
            System.out.println();
        }
    }

	
}

