
public class TestSocialClass {

	public static void main(String[] args) {
		TwitterFeedReader tfr=new TwitterFeedReader();
		Message m=tfr.pollForNewMessage();
		System.out.println(m.getMessageId());
		System.out.println(m.getMessageSource());
		System.out.println(m.getMessageType());
		System.out.println(m.getMessage());
		System.out.println(m.getSender());
		
		
		System.out.println(" ");
		
		FaceBookReader fbr=new FaceBookReader();
		Message m1=fbr.pollForNewMessage();
		System.out.println(m1.getMessageId());
		System.out.println(m1.getMessageSource());
		System.out.println(m1.getMessageType());
		System.out.println(m1.getMessage());
		System.out.println(m1.getSender());


	}

}
