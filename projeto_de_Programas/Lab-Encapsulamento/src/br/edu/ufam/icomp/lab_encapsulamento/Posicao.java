package br.edu.ufam.icomp.lab_encapsulamento;

public class Posicao {
	private	double latitude;
	private	double	longitude;
	private	double	altitude;
	
	public Posicao(double latitude, double longitude, double altitude) {
		this.latitude = latitude;
		this.longitude = longitude;
		this.altitude = altitude;
	}
	void	setLatitude(double latitude) {}
	public double	getLatitude() {
		return latitude;
	}
	void setLongitude(double longitude) {}
	
	public double	getLongitude() {
		return longitude;
	}
	void	setAltitude(double altitude) {}
	public double	getAltitude() {
		return altitude;
	}
	
	public String	toString() {
		return "Posição: " + latitude + ", " + longitude + ", " + altitude + "";
	}

}


