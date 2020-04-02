package Exemplos.Cap_17;

public class BlocoSincronizado {
	
	public void testar(){
		
		System.out.println("N�o sincronizado");
		synchronized(this){
			System.out.println("Sincronizado");
		}
	}
}
