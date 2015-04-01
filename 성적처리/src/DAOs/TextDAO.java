package DAOs;

//ADD 파일오픈하고 쓰는것만드는것..
public class TextDAO implements IDAO { 

	@Override
	public Object read(String filename) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void write(Object object, String filename) {
		// TODO Auto-generated method stub
		//이걸리플렉션
		Field[] fields =object.getClass().getDeclaredFields();
		
	}

}
