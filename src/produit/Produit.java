package produit;

public abstract class Produit {
	private String nom;

	public enum Unite {
		litre, gramme, kilogramme, piece, centilitre, millilitre
	}

	public Unite unite;

	public String getNom() {
		return nom;
	}

	public Produit(String nom, Unite unite) {
		this.nom = nom;
		this.unite = unite;

	}

	public abstract String decrireProduit();

}
