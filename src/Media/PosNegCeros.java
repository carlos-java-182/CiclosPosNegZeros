package Media;

import javax.swing.JOptionPane;

public class PosNegCeros {

	public static void main(String[] args) {
		
		
		int num, pos=0, neg = 0, ceros = 0, cont_pos = 0, cont_neg = 0;
		float prom_pos, prom_neg;
		
		for(int i=1; i<=10;i++) {
			num=Integer.parseInt(JOptionPane.showInputDialog("Digita un número"));
			
			if(num>0) {
				pos+=num;
				cont_pos++;
			}
			else if(num<0) {
				neg-=num;
				cont_neg++;
			}
			else if(num==0) {
				ceros++;
			}
		}
		
		
		
		if(cont_pos==0) {
			System.out.println("No se puede sacar la media de números positivos");
		}
		else {
		
			prom_pos=pos/cont_pos;
			System.out.println("La media de los positivos es: "+prom_pos);
		
		}
		
		if(cont_neg==0) {
			System.out.println("No se puede sacar la media de números negativos");
		}
		else {
			prom_neg=neg/cont_neg;
			System.out.println("La media de los negativos es: "+prom_neg);
		}
		if(ceros==0) {
			System.out.println("La cantidad de ceros es: "+ceros);
		}
		else {
			System.out.println("La cantidad de ceros es: "+ceros);
		}

}
}