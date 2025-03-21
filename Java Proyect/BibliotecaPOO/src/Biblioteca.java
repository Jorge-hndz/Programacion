
import java.util.ArrayList;

public class Biblioteca {
	private String nombre;
	private ArrayList<Libro> libros;
	
	public Biblioteca(String nombre) {
		this.nombre=nombre;
		this.libros=new ArrayList<>();
	}

	public Biblioteca(String nombre, ArrayList<Libro> libros) {
		super();
		this.nombre = nombre;
		this.libros = libros;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Libro> getLibros() {
		return libros;
	}
	
	public void altaLibro(Libro libro) {
		libros.add(libro);
	}
	
	public String buscarLibroAutor(String autor) {
		String texto="";
		
		for (Libro libroAux: libros) {
			if (libroAux.getAutor().equalsIgnoreCase(autor)){
				texto=libroAux.detalleLibro();
			}
		}
		return texto;
	}
	
	public String mostrarLibros() {
		String texto="";
		
		for (Libro libroAux: libros) {
				texto=texto + "\n" + libroAux.detalleLibro();
			}
		return texto;
	}
	
	public void eliminarLibro(String isbn) {
		//Elimina un libro de la lista de libros, utilizando el isbn
		
		for (int i = 0;i<libros.size();i++) {
			if (libros.get(i).getIsbn()==isbn) {
				libros.remove(i);
				break;
			}
		}
		
	}
	
}
