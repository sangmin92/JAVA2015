package view;

import control.CControl;

public class CView {
	//Attribute
	private CControl control;	//control과 연결시켜줌
	//Method
	public CControl getControl() {return control;}
	public void setControl(CControl control) {this.control = control;}
	
}
