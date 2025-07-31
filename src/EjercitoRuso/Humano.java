package EjercitoRuso;

public abstract class Humano implements IHumanoExtremidad {
    private Integer id;
    private String  nombre;
    private Boolean brazoIzquierdo;
    private Boolean brazoDerecho;
    private Boolean piernaIzquierdo;
    private Boolean piernaDerecho;

    public Humano(Integer id, String nombre) { //constructor
        this.nombre = nombre;
        this.id = id;
        setBrazoIzquierdo(true);
        setBrazoDerecho(true);
        setPiernaIzquierdo(true);
        setPiernaDerecho(true);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getBrazoIzquierdo() {
        return brazoIzquierdo;
    }

    public void setBrazoIzquierdo(Boolean brazoIzquierdo) {
        this.brazoIzquierdo = brazoIzquierdo;
    }

    public Boolean getBrazoDerecho() {
        return brazoDerecho;
    }

    public void setBrazoDerecho(Boolean brazoDerecho) {
        this.brazoDerecho = brazoDerecho;
    }

    public Boolean getPiernaIzquierdo() {
        return piernaIzquierdo;
    }

    public void setPiernaIzquierdo(Boolean piernaIzquierdo) {
        this.piernaIzquierdo = piernaIzquierdo;
    }

    public Boolean getPiernaDerecho() {
        return piernaDerecho;
    }

    public void setPiernaDerecho(Boolean piernaDerecho) {
        this.piernaDerecho = piernaDerecho;
    }

}
