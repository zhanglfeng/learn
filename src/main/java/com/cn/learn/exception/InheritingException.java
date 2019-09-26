package com.cn.learn.exception;

class SimpleException extends Exception {
	private static final long serialVersionUID = -3071122700337551143L;
}

public class InheritingException {

	public void f() throws SimpleException {
		System.out.println("Throw SimpleException from f()");
		throw new SimpleException();
	}

	public static void main(String[] args) {
		
		InheritingException sed = new InheritingException();
		try {
			sed.f();
		} catch (SimpleException e) {
			e.printStackTrace();
		}
	}

}
