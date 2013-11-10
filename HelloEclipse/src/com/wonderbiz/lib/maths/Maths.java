package com.wonderbiz.lib.maths;

public class Maths {

	private int _num1;
	private int _num2;
	
	public Maths(int a, int b)
	{
		_num1= a;
		_num2 = b;
	}
	
	public int get_num1() {
		return _num1;
	}

	public void set_num1(int _num1) {
		this._num1 = _num1;
	}

	public int get_num2() {
		return _num2;
	}

	public void set_num2(int _num2) {
		this._num2 = _num2;
	}

	public int add()
	{
		return (_num1 + _num2);
	}

	public int subtract()
	{
		return (_num1 - _num2);
	}

	public int multiply()
	{
		return (_num1 * _num2);
	}

	public int divide()
	{
		return (_num1 / _num2);
	}
}
