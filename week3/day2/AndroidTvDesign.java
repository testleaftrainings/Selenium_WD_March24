package week3.day2;

public abstract  class AndroidTvDesign  implements SmartTv{

	public abstract void enableWifi();
	
	
	public void enableBluetooth() {
		System.out.println("Bluetooth");
	}
	
	public void switchOnTv() {
		System.out.println("Switch on Tv");
	}

}
