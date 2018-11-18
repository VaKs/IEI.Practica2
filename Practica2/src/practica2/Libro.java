package practica2;


public class Libro {
    private String titulo;
    private String autor;
    private String precio;
    private String descuento;
    private String web;
    private String link;

    public Libro() {
    }
    
    public Libro(String web) {
        this.web = web;
    }

    public Libro(String titulo, String autor, String precio, String web, String link) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
        this.web= web;
    }

    public Libro(String titulo, String autor, String precio, String descuento, String web, String link) {
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

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getDescuento() {
        return descuento;
    }

    public void setDescuento(String descuento) {
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
