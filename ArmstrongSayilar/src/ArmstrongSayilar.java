import java.util.Scanner;

public class ArmstrongSayilar {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int girilensayi, birler, onlar, yuzler, sonuc;
		
		System.out.print("100 ile 1000 arasinda bir sayi giriniz ==> ");
		girilensayi = input.nextInt();
		
		while(girilensayi < 100 || girilensayi > 1000) {
			System.out.print("Gecerli bir sayi giriniz ==> ");
			girilensayi = input.nextInt();
		}
		
		birler = girilensayi % 10;
		
		onlar = (girilensayi - birler) % 100 / 10;
		
		yuzler = (girilensayi - onlar - birler) / 100;
		
		sonuc = (birler * birler * birler) + (onlar * onlar * onlar) + (yuzler * yuzler * yuzler);
		
		if(sonuc == girilensayi) {
			System.out.println(girilensayi + " bir armstrong sayisidir.");
		}
		else {
			System.out.println(girilensayi + " bir armstrong sayisi degildir.");
		}
		
		input.close();
	}

}
