package sample;

public class NarrowCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double doubleValue = 567.89;
        int intValue = (int) doubleValue;
        System.out.println("Double value: " + doubleValue);
        System.out.println("Int value after narrow casting: " + intValue);
        int intValue2 = 560;
        byte byteValue = (byte) intValue2;

        System.out.println("Int value: " + intValue2);
        System.out.println("Byte value after narrow casting: " + byteValue);

	}

}
