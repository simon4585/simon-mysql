package kr.or.member;

public class MemberVO {
	//private 내부접근으로 get,set이용해야함. 데이터 무결성을 위함.
		private String name;
		private int age;
		private String phoneNum;
		
		public String getName() {
	    return name;
		}
			public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getPhoneNum() {
			//this.phoneNum = this.phoneNum + "개인전화번호";
			return phoneNum;
		}
		public void setPhoneNum(String phoneNum) {
			this.phoneNum = phoneNum;
		}
}
