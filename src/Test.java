
public class Test {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("\nTEST POKEMON0 \n");
		Pokemon0 p1 = new Pokemon0("Rhinolove");
		Pokemon0 p2 = new Pokemon0("Chovsourir");
		p1.log(p1.toString());
		p2.log(p2.toString());
		p1.attaquer(p2);
		p2.log(p2.toString());
	
	}
}
