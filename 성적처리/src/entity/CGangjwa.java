package entity;

import java.io.Serializable;
import java.util.Vector;

public class CGangjwa extends CEntity{
	private static final long serialVersionUID = 1L;
	private int ID;
	private String name;
	private int suganginwon;
	private Vector<String> times; //현재는 글자의 어레이
		private int gangjwaID;
	public int getID() {return ID;}
	public void setID(int iD) {ID = iD;}
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public int getSuganginwon() {return suganginwon;}
	public void setSuganginwon(int suganginwon) {this.suganginwon = suganginwon;}
	public Vector<String> getTimes() {return times;}
	public void setTimes(Vector<String> times) {this.times = times;}
	public int getGangjwaID() {return gangjwaID;}
	public void setGangjwaID(int gangjwaID) {this.gangjwaID = gangjwaID;}
	//속성들을 읽고쓰는 함수 오브젝트말고 엔티티로받기
	public void read(){}
	public void write(){
		
	}
}
