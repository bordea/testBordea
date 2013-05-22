package InnerClasses;

public class LocalInnerClass {

    static String regularExpression = "[^0-9]";

    public static void validatePhoneNumber(final String phoneNumber1, final String phoneNumber2) {
        final int numberLength = 10;

        class PhoneNumber {

            String formattedPhoneNumber = null;

            PhoneNumber(String phoneNumber) {

                String currentNumber = phoneNumber.replaceAll(regularExpression, "");
                if (currentNumber.length() == numberLength){
                    formattedPhoneNumber = currentNumber;
                }
                else{
                    formattedPhoneNumber = null;
                }
            }

            public String getNumber() {
                return formattedPhoneNumber;
            }

            public void printOriginalNumbers() {
               System.out.println("Original nubmers are " + phoneNumber1 + " and " + phoneNumber2);
            }
        }

        PhoneNumber myNumber1 = new PhoneNumber(phoneNumber1);
        PhoneNumber myNumber2 = new PhoneNumber(phoneNumber2);

        if (myNumber1.getNumber() == null){
            System.out.println("First number is invalid");
        }
        else{
            System.out.println("First number is " + myNumber1.getNumber());
        }
        if (myNumber2.getNumber() == null){
            System.out.println("Second number is invalid");
        }
        else{
            System.out.println("Second number is " + myNumber2.getNumber());
        }
    }

    public static void main(String... args) {
        validatePhoneNumber("123-456-7890", "456-7890");
    }
}