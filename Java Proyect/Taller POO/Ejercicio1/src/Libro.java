public class Libro {
    private String lugar;
    private String nombre;
    private String genero;
    private String editorial;
    private int paginas;

    public Libro() {
    }

    public Libro(String lugar, String nombre, String genero, String editorial, int paginas) {
        this.lugar = lugar;
        this.nombre = nombre;
        this.genero = genero;
        this.editorial = editorial;
        this.paginas = paginas;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public void mostrarInfo(){
        System.out.println("El libro se encuentra en: " + getLugar() + "\n" +
                "El nombre del libro es: " + getNombre() + "\n" +
                "El genero del libro es: " + getGenero() + "\n" +
                "La editorial del libro es: " + getEditorial() + "\n" +
                "El numero de paginas del libro es: " + getPaginas() + "\n");
    }
}
