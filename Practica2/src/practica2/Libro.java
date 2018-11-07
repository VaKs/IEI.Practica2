package practica2;


public class Libro {
    private String titulo;
    private String autor;
    private double precio;
    private double descuento;
    private String web;
    private String link;

    public Libro() {
    }
    
    public Libro(String web) {
        this.web = web;
    }

    public Libro(String titulo, String autor, double precio, String web, String link) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
        this.web= web;
    }

    public Libro(String titulo, String autor, double precio, double descuento, String web, String link) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
        this.descuento = descuento;
        this.web = web;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
    
    
}
