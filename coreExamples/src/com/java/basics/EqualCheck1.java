package com.java.basics;

public class EqualCheck1 {
	int a;
	String name=new String();
    public EqualCheck1(int a, String name) {
		super();
		this.a = a;
		this.name = name;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + a;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		System.out.println(obj);
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EqualCheck1 other = (EqualCheck1) obj;
		if (a != other.a)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	public static void main(String[] args) {
       EqualCheck1 ec=new EqualCheck1(1,"vamsi");
       EqualCheck1 ec1=new EqualCheck1(1,"vamsi");
       System.out.println(ec.equals(ec1));
       System.out.println(ec.hashCode());
       System.out.println(ec1.name.hashCode());
      
		
	}

}
