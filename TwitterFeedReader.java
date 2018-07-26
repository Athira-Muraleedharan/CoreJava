public class TwitterFeedReader implements SocialFeedReader{

	@Override
	public Message pollForNewMessage() {
		//Create message object
		Message m1=new Message();
		//provide the data
		m1.setMessageId(1);
		m1.setMessageSource("Twitter");
		m1.setMessageType("String");
		m1.setMessage("Hello All...........I'am tweeting this");
		m1.setSender("Athira");
		return m1;
	}

}
