import java.util.Random;

public class Pokemon0 {
	private String nom;
	private int niveau;
	protected int hp;
	private int atk; 
	
	public Pokemon0 (String nom) {
		this.nom = nom;
		Random random = new Random();
		this.niveau = random.nextInt(1, 11);
		this.hp = 2*niveau;
		this.atk = (niveau /2) + 1;
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
		System.out.println(prefixe() + "J'attaque "+ p.nom);
		p.hp -= this.atk;
	}

	@Override
	public String toString() {
		return "Je m'appelle " + nom + 
				"\n \t je suis de niveau " + niveau + "\n \t j'ai " + hp + 
				" points de vie \n \t mon attaque de base est de " + atk ;
	}
	
	private String prefixe() {
		return "[Pokemon " + nom + "] : ";
	}
	
	public void log(String msg) {
		System.out.println(prefixe()+ msg);
	}
	
}
