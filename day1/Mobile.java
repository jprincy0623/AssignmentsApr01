package week1.day1;

public class Mobile {
	public void sendSms() {
		System.out.println("Messages can be sent");
	}
protected void allowVoicecall() {
	System.out.println("Only voice call allowed");
}
private void takeVideo() {
	System.out.println("Videos can be recorded");
}
public static void main(String[] args) {
	System.out.println("Creating an Object for the class and Calling a Method:");
	Mobile obj=new Mobile();
	obj.sendSms();
	obj.allowVoicecall();
	obj.takeVideo();
}
}

