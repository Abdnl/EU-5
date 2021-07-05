package day44_oopreview.callcenter;

public class CallCnter {

	public static void main(String[] args) {

		WhatsApp wa = new WhatsApp();
		wa.launch();
		wa.allOSCompatible = true;
		wa.isFree = true;
		wa.name = "Whats App";
		wa.call("Ozzy");
		wa.sendMessage("Thank you...");
		wa.videoCall();
		wa.accept();

		VoiceCallable.decline();
		System.out.println(VoiceCallable.CAN_CALL);

		wa.getCount();
		wa.setCount(4);

		System.out.println("---------------");

		VoiceCallable obj = new WhatsApp();

		((WhatsApp) obj).launch();					// Casting

		((MessagingApp) obj).allOSCompatible = false;	// Casting

		obj.call("Mr Tom");					

		((WhatsApp) obj).videoCall();					// Casting

		((VideoCallable) obj).videoCall();				// Casting

	}

}
