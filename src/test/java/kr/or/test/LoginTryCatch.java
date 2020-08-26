package kr.or.test;

class NotExistIDException extends Exception{
   //아이디가 존재하지 않을때 예외사항 처리 내용
   //extends앞에 있는 내용은 우리가 만드는거 그 뒤에 내용은 자바에서 공급받은거
   public NotExistIDException() {} //위 클래스에 대한 생성자 메소드△
   public NotExistIDException(String message) {
	   super(message);
   }//오버로딩 매소드  
}

class WrongPasswordException extends Exception{
   //패스워드 입력 오류에 대한 예외사항 처리 내용
   public WrongPasswordException() {}//위 클래스에 대한 생성자 메소드 △
   public WrongPasswordException(String message) {
	   super(message);
   }
   
}
public class LoginTryCatch {

   public static void main(String[] args) {
      try {
		login("white", "12345"); //로그인1
	} catch (NotExistIDException e) {
		
		e.printStackTrace();
	} catch (WrongPasswordException e) {
		
		e.printStackTrace();
	}
      try {
		login("blue", "54321"); //로그인2
	} catch (NotExistIDException e) {
		
		e.printStackTrace();
	} catch (WrongPasswordException e) {
		
		e.printStackTrace();
	}
   }
 public static void login(String id, String password) throws NotExistIDException, WrongPasswordException {
   //id가 'blue'가 아니라면 NotExistIDException 발생시킴
    if(!id.equals("blue")) {
    	//강제 오류예외발생 - NotExistIDException
       throw new NotExistIDException("아이디가 존재하지 않습니다.");
    }
    //password가 "12345"가 아니라면 WrongPasswordException을 발생시킴
    if(!password.equals("12345")){
    	//강제 오류예외발생 - NotExistIDException
       throw new WrongPasswordException("패스워드가 일치하지 않습니다.");
    }
 }
}