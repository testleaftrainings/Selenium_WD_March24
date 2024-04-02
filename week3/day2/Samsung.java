package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class Samsung implements AndroidDesign,SamsungDesign {

	@Override
	public void makeCall() {
	System.out.println("Make call");
		
	}

	@Override
	public void startPhone() {
		System.out.println("Start phone");
		
	}

	@Override
	public void sendSMS() {
		System.out.println("Send sms");
	}

	

	public void samsungNote() {
		System.out.println("Samsung Note");
	}
	public static void main(String[] args) {
		//AndroidDesign design =new AndroidDesign();
		
		Samsung mobile =new Samsung();
		mobile.sendSMS();
		mobile.startPhone();
		mobile.takeSnap();
		mobile.makeCall();
		mobile.samsungNote();
		mobile.faceAuthendication();
		mobile.voiceRecoznization();
		
		//Scope restrication
		//Interface name
		SamsungDesign obj=new Samsung();
		obj.faceAuthendication();
		obj.voiceRecoznization();
		
		List<String> obj2=new ArrayList<String>();
		AndroidDesign android=new Samsung();
		android.sendSMS();
		android.startPhone();
		android.takeSnap();
		android.makeCall();
//		android.samsungNote();
//		android.faceAuthendication();
//		android.voiceRecoznization();
	}

	@Override
	public void faceAuthendication() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void voiceRecoznization() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void takeSnap() {
		// TODO Auto-generated method stub
		
	}

	
	}

