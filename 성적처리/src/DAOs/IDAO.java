package DAOs;

//인터페이스만들기 함수만가짐
public interface IDAO {
	public Object read(Class clazz, String filename);
	public void write(Object object,String filename);
	//
}
