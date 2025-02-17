
public class BibliotecaTest {
	public static void main(String[] args) {
		
		Biblioteca biblioteca = new Biblioteca("Biblioteca MA");
		
		Libro libro1 = new Libro("Casa Negra","Stephen King","SM",2001,"978-23-25-1");
		Libro libro2 = new Libro("El Quijote","Miguel de Cervantes","Sintesis",1605,"128-13-43-3");
		
		biblioteca.altaLibro(libro1);
		biblioteca.altaLibro(libro2);
		
		System.out.println("Libros en biblioteca:");
		System.out.println(biblioteca.mostrarLibros());
		
		System.out.println("Libros en biblioteca del autor Stephen King:");
		System.out.println(biblioteca.buscarLibroAutor("Stephen King"));
		
		System.out.println("Elimino el libro con isbn: 978-23-25-1");
		biblioteca.eliminarLibro("978-23-25-1");

		System.out.println("Libros en biblioteca:");
		System.out.println(biblioteca.mostrarLibros());
		
		
	}
}
