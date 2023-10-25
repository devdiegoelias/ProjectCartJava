
public class ValidLetter {

	public int converteCartaParaInt(String carta) {
		int valorCarta = -1;
		
		carta = carta.toUpperCase();
		
		try {
			valorCarta = Integer.parseInt(carta);
		}catch(Exception e) {
			
			if(carta.equals("A")) valorCarta = 1;
			if(carta.equals("J")) valorCarta = 11;
			if(carta.equals("Q")) valorCarta = 12;
			if(carta.equals("K")) valorCarta = 13;
		}
		
		return valorCarta;
	}
}
