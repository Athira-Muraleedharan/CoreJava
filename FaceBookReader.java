
public class FaceBookReader implements SocialFeedReader {
	@Override
	public Message pollForNewMessage() {
		//Create message object
		Message m1=new Message();
		//provide the data
		m1.setMessageId(2);
		m1.setMessageSource("FaceBook");
		m1.setMessageType("String");
		m1.setMessage("Hello User .......Welcome to FaceBook");
		m1.setSender("Muraleedharan");
		return m1;
	}


}
