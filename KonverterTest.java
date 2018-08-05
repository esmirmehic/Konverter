import java.util.Scanner;


public class KonverterTest {

	public static void main(String[] args) {
		Scanner unos= new Scanner (System.in);
		double x= 1;
		Konverter pretvaranje= new Konverter (x);
		pretvaranje.izbor1();
		System.out.println();
		System.out.println("Unesite koju pretvorbu zelite: ");
		double a=unos.nextDouble();
		System.out.println("Unesite kolicinu: ");
		x=unos.nextDouble();
		if (a==1) {
			System.out.println(x+ " kilograma iznosi "+ pretvaranje.vracaFunte()+ " funti");
		}
		if (a==2) {
			System.out.println(x+ " funti iznosi "+ pretvaranje.vracaKilograme()+ " kilograma");
		}
		if (a==3) {
			System.out.println(x+ " centimetara iznosi "+ pretvaranje.vracaInce()+ " inci");
		}
		if (a==4) {
			System.out.println(x+ " inci iznosi "+ pretvaranje.vracaCm()+ " centimetara");
		}
		if (a==5) {
			System.out.println(x+ " celzijusa iznosi "+ pretvaranje.vracaFarenhajte()+ " farenhajta");
		}
		if (a==6) {
			System.out.println(x+ " farenhajta iznosi "+ pretvaranje.vracaCelzijuse()+ " celzijusa");
		}
		
		
	}
}
