package Teoria1;

public class Teoria1 {

	public static void main(String []args) {
		
		String [] colec={"curso", "double","devplace", "personas", "coder", "alumnado"};
		char letra;
		
		for (int i=0; i<colec.length;i++) {
			System.out.print(colec[i] + " - ");
		}
	    
		System.out.println("");
		
		for (int x = 0; x < colec.length; x++) {
	       
	        for (int y = 0; y < colec.length - 1; y++) {
	      
	            String elementoActual = colec[y];
	            String elementoSiguiente = colec[y + 1];
	            int pos=0;
	            while (elementoActual.charAt(pos)==elementoSiguiente.charAt(pos)) {
	            	pos++;
	            }
	            if (elementoActual.charAt(pos) > elementoSiguiente.charAt(pos)) {
	                colec[y] = elementoSiguiente;
	                colec[y + 1] = elementoActual;
	            }
	        }
	    }
		
		for (int i=0; i<colec.length;i++) {
			System.out.print(colec[i]+ " - ");
		}
	    
	}
}

