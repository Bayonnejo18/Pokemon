import java.util.Random;

public class Pokemon0 {
	private String nom;
	private int niveau;
	private int hp = 2*niveau;
	private int atk = (niveau /2) + 1;
	
	public Pokemon0 (String nom) {
		this.nom = nom;
		Random random = new Random();
		this.niveau = random.nextInt(1, 11);
	}

	public String getNom() {
		return nom;
	}

	public int getNiveau() {
		return niveau;
	}

	public int getHp() {
		return hp;
	}

	public int getAtk() {
		return atk;
	}
	
	public boolean isKO() {
		return (hp == 0);
	}
	
	public void soigner() {
		this.hp = 2*niveau;
	}
	
	public void attaquer(Pokemon0 p) {
		System.out.println("J'attaque "+ p.nom);
		p.hp -= this.atk;
	}

	@Override
	public String toString() {
		return "Pokemon0 [nom=" + nom + ", niveau=" + niveau + ", hp=" + hp + ", atk=" + atk + "]";
	}
	
	public void log(String msg) {
		System.out.println("msg");
	}

}
