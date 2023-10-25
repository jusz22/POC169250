public class wariant403 {
    public static void main(String[] args) {
        Vehicle TIR = new Vehicle();
        TIR.setRegistrationNumber("WR12313");
        System.out.println(TIR.getCount());
    }
}
class Vehicle{
    private String registrationNumber;
    public void setRegistrationNumber(String number) {
        registrationNumber = number;
    }
    public int getCount(){
        return registrationNumber.length();
    }
}
