
public class Bateria {
 private String modelo;
 private Double tiempoDeInactividad;
 
public Bateria(String modelo, Double tiempoDeInactividad) {
	super();
	this.modelo = modelo;
	this.tiempoDeInactividad = tiempoDeInactividad;
}


@Override
public String toString() {
	return "Bateria [modelo=" + modelo + ", tiempoDeInactividad=" + tiempoDeInactividad + "]";
}


public Bateria(String modelo) {
	super();
	this.modelo = modelo;
}


public String getModelo() {
	return modelo;
}
public void setModelo(String modelo) {
	this.modelo = modelo;
}
public Double getTiempoDeInactividad() {
	return tiempoDeInactividad;
}
public void setTiempoDeInactividad(Double tiempoDeInactividad) {
	this.tiempoDeInactividad = tiempoDeInactividad;
}
 
 
}
