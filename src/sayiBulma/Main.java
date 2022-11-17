package sayiBulma;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] sayilar= {2,4,22,15,64,38,9};
		
		int aranacak=64;
		
		boolean state=false;
		
		for (int i = 0; i < sayilar.length; i++) {
			
			if(sayilar[i]==aranacak) {
				state=true;
				break;
			}
			
		}
		
		if(state) {
			System.out.println("Sayi vardir");
		}else {
			System.out.println("Sayi yoktur");
		}

	}

}
