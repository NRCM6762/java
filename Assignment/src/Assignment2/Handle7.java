package Assignment2;

class DeviceFailureException extends Exception {
	 DeviceFailureException(String message) {
	     super(message);
	 }
	}
	class Device {
	 public static void use(String deviceName) throws DeviceFailureException {
	     if (deviceName.equals("printer1") || deviceName.equals("printer3")) {
	         System.out.println("Available");
	     } else {
	         throw new DeviceFailureException("Device failure: Not Available");
	     }
	 }
	}
	public class Handle7{
	 public static void main(String[] args) {
	     try {
	         if (args.length == 0) {
	             System.out.println("Please provide the device name as a command line argument.");
	             return;
	         }

	         String deviceName = args[0];
	         Device.use(deviceName);

	     } catch (DeviceFailureException e) {
	         System.out.println(e.getMessage());
	     }
	 }
	}

