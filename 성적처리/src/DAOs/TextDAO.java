package DAOs;

//ADD ���Ͽ����ϰ� ���°͸���°�..
public class TextDAO implements IDAO { 

	@Override
	public Object read(String filename) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void write(Object object, String filename) {
		// TODO Auto-generated method stub
		//�̰ɸ��÷���
		Field[] fields =object.getClass().getDeclaredFields();
		
	}

}
