package DTO;

public class DTOPersonaTipo {
    private Integer IdPersonaTipo;
    private String Tipo;
    private String Estado;
    private String FechaCreacion;
    private String FechaModifica;

    public DTOPersonaTipo() {}

    public DTOPersonaTipo(Integer idPersonaTipo, String tipo, String estado, String fechaCreacion, String fechaModifica) {
        IdPersonaTipo = idPersonaTipo;
        Tipo = tipo;
        Estado = estado;
        FechaCreacion = fechaCreacion;
        FechaModifica = fechaModifica;
    }

    
    public Integer getIdPersonaTipo() {
        return IdPersonaTipo;
    }

    public void setIdPersonaTipo(Integer idPersonaTipo) {
        IdPersonaTipo = idPersonaTipo;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String estado) {
        Estado = estado;
    }

    public String getFechaCreacion() {
        return FechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        FechaCreacion = fechaCreacion;
    }

    public String getFechaModifica() {
        return FechaModifica;
    }

    public void setFechaModifica(String fechaModifica) {
        FechaModifica = fechaModifica;
    }

    @Override
    public String toString() {
        return "[+] PersonaTipoDTO" +
               "\n    IdPersonaTipo: " + getIdPersonaTipo() +
               "\n    Tipo: " + getTipo() +
               "\n    Estado: " + getEstado() +
               "\n    FechaCreacion: " + getFechaCreacion() +
               "\n    FechaModifica: " + getFechaModifica();
    }
}