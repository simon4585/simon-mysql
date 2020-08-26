package kr.or.test;

public class Chatting {

	public static void main(String[] args) {
		Chatting chat = new Chatting();
		chat.startChat("홍길동");

	}
	void startChat(String chatId) {
		final String nickName = chatId;		
	    Chat chat = new Chat() {
	    @Override
		public void start() {
	    while(true){
	    String inputData = "안녕하세요";
		String message = "[" + nickName +"]" + inputData;
		sendMessage(message);	
		break; //add
	    }//end while
			   
		   }//end start()
		 };//end chat()
		 chat.start();
	}//end startChat()
    class Chat {
    	void start () {}
    	void sendMessage(String message) {
    	System.out.println(message);    	
    }
    }
}
