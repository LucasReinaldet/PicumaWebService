package model;

public class FotoGaleria {

	private int idFotoGaleria;
	private Byte fotoGaleria;
	private String descricaoFoto;
	Galeria galeria = new Galeria();
	
	public int getIdFotoGaleria() {
		return idFotoGaleria;
	}
	public void setIdFotoGaleria(int idFotoGaleria) {
		this.idFotoGaleria = idFotoGaleria;
	}
	public Byte getFotoGaleria() {
		return fotoGaleria;
	}
	public void setFotoGaleria(Byte fotoGaleria) {
		this.fotoGaleria = fotoGaleria;
	}
	public String getDescricaoFoto() {
		return descricaoFoto;
	}
	public void setDescricaoFoto(String descricaoFoto) {
		this.descricaoFoto = descricaoFoto;
	}
	public Galeria getGaleria() {
		return galeria;
	}
	public void setGaleria(Galeria galeria) {
		this.galeria = galeria;
	}
}
