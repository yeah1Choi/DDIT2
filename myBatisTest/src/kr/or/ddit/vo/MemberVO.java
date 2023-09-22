package kr.or.ddit.vo;
/*
DB테이블에 있는 컬럼을 기준으로 데이터를 객체화 할 클래스

DB테이블의 '컬럼명'과 이름이 같은 '멤버변수'를 작성한다.

DB테이블의 컬럼과 클래스의 멤버변수를 매핑하는 역할을 수행한다.
*/
public class MemberVO {
	public String mem_id;
	public String mem_pass;
	public String mem_name;
	public String mem_tel;
	public String mem_addr;

	// VO클래스에서 별도의 생성자를 만들 때에는 기본 생성자도 반드시 같이 만들어준다.
	
	// getter, setter
	public String getMem_id() {
		return mem_id;
	}
	public void setMem_id(String mem_id) {
		this.mem_id = mem_id;
	}
	public String getMem_pass() {
		return mem_pass;
	}
	public void setMem_pass(String mem_pass) {
		this.mem_pass = mem_pass;
	}
	public String getMem_name() {
		return mem_name;
	}
	public void setMem_name(String mem_name) {
		this.mem_name = mem_name;
	}
	public String getMem_tel() {
		return mem_tel;
	}
	public void setMem_tel(String mem_tel) {
		this.mem_tel = mem_tel;
	}
	public String getMem_addr() {
		return mem_addr;
	}
	public void setMem_addr(String mem_addr) {
		this.mem_addr = mem_addr;
	}
	
	@Override
	public String toString() {
		return "MemberVO [mem_id=" + mem_id + ", mem_pass=" + mem_pass + ", mem_name=" + mem_name + ", mem_tel="
				+ mem_tel + ", mem_addr=" + mem_addr + "]";
	}
}
