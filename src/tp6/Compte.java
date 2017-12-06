package tp6;

public class Compte {
	
	private float solde;
	
	public Compte(float solde) throws Exception {
		super();
		if(solde <= 0) throw new Exception("solde doit etre > 0");
		this.solde = solde;
	}

	/**
	 * Credite le compte du montant transmis en argument.
	 * @param credit
	 * @throws Exception si credit <= 0
	 */
	public void crediter(float credit) throws Exception{
		if(credit <= 0) throw new Exception("Credit doit etre > 0");
		solde = solde + credit;
	}

	public float getSolde() {
		return solde;
	}

	/**
	 * Debite le compte de la valeur transmise en argument
	 * @param debit
	 * @return le montant demande si le solde du compte est superieur au montant demande,
	 * retourne la valeur du solde si le solde est inferieur au montant demande. 
	 * @throws Exception si debit < 20 ou si debit > 1000 euros.
	 */
	public float debiter(float debit) throws Exception{
		if(debit <= 0) throw new Exception("Debit doit etre > 0");
		if(debit > solde) throw new Exception("Debit ne peut pas etre > " + solde);
		solde = solde - debit;
		return solde;
	}
	
	/**
	 * Reinitialise
	 * @param solde
	 * @throws Exception si solde <= 0
	 */
	void setSolde(float solde) throws Exception{
		if(solde <= 0) throw new Exception("Solde doit etre > 0");
		this.solde = solde;
	}

	@Override
	public String toString() {
		return "Compte [solde=" + solde + "]";
	}

	

}
