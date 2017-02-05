/*
 * Daniel Morales 15526
 */
 
public class Operaciones implements IHDT2 {
	private Character head;
	
	public Character getUltimo(){
		Character actualChar = head;
		if(actualChar == null)
			return actualChar;
		while(actualChar != null)
			actualChar = actualChar.getNext();
		return actualChar;
	}
	
	public void agregarCaracter(String character){
		Character end = getUltimo();
		if(end == null)
			head = new Character(character);
		else
			end.setNext(new Character(character));
	}
	
	public Character regresarCaracter(){
		return head;
	}
	
	public double operacion(String operacion, double num1, double num2){
		if(operacion.equals("+"))
			return num1 + num2;
		else if(operacion.equals("-"))
			return num1 - num2;
		else if(operacion.equals("*"))
			return num1 * num2;
		else if(operacion.equals("/"))
			return num1 / num2;
		return 0;	
	}

	public String operacion(String operacion) {
		if(operacion.equals("+"))
			return "Suma          ";
		else if(operacion.equals("-"))
			return "Resta         ";
		else if(operacion.equals("*"))
			return "Multiplicacion";
		else if(operacion.equals("/"))
			return "Division      ";
		return null;
	}
}
