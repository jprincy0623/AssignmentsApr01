package week1.day1;

public class Mobile1{

	public void makeCall() {
		//String mobileModel="S23";
		//float mobileWeight=180.9f;
		System.out.println("Making a call");
	}
	public void sendMsg() {
	//	Boolean fullCharged=true;
	//	int mobileCost=51000;
		System.out.println("Messages are sent");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile1 connect=new Mobile1();
		connect.makeCall();
		connect.sendMsg();
		System.out.println("This is My mobile");
	}

}
