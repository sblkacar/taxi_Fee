import java.util.Scanner;

public class Taxi {
    public static void main(String[] args) {
       float fee;
        float feeForKm=2.20F;
        float MinFee=20;
        float km;
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen Gidilen Km'yi giriniz: ");
        km=input.nextFloat();
        fee=km*feeForKm;
        float tax= fee>20 ? fee:MinFee; //döngüsüz koşul örneği
        System.out.println("ödemeniz gereken tutar"+tax);


    }
}
