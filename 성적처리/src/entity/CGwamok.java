package entity;

import java.io.Serializable;

public class CGwamok implements Serializable{
	private static final long serialVersionUID = 1L;
	//attribute
	private int ID;
	private String name;
	private int hakjum;
	
	//setters&getters;
	public int getID() {return ID;}
	public void setID(int iD) {ID = iD;}
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public int getHakjum() {return hakjum;}
	public void setHakjum(int hakjum) {this.hakjum = hakjum;}
	
	
	
}
