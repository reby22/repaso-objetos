package uaslp.objetos.escuela;

import java.time.LocalDate;

public class Alumno {
    private String nombre;
    private String clave;
    private String claveDeCarrera;
    private int anioDeIngreso;
    private LocalDate fechaNacimiento;

    public Alumno(String nombre, String clave, String claveDeCarrera, int anioDeIngreso, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.clave = clave;
        this.claveDeCarrera = claveDeCarrera;
        this.anioDeIngreso = anioDeIngreso;
        this.fechaNacimiento = fechaNacimiento;
    }

    public static Builder builder(){
        return new Builder() {
            @Override
            public Builder nombre(String nombre) {
                return super.nombre(nombre);
            }

            @Override
            public Builder clave(String clave) {
                return super.clave(clave);
            }

            @Override
            public Builder claveDeCarrera(String claveDeCarrera) {
                return super.claveDeCarrera(claveDeCarrera);
            }

            @Override
            public Builder anioDeIngreso(int anioDeIngreso) {
                return super.anioDeIngreso(anioDeIngreso);
            }

            @Override
            public Builder fechaNacimiento(LocalDate fechaNacimiento) {
                return super.fechaNacimiento(fechaNacimiento);
            }
        };
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setClave(String clave){
        this.clave = clave;
    }

    public void setClaveDeCarrera(String claveDeCarrera){
        this.claveDeCarrera = claveDeCarrera;
    }
    public void setAnioDeIngreso(int anioDeIngreso){
        this.anioDeIngreso = anioDeIngreso;
    }
    public void setFechaNacimiento(LocalDate fechaNacimiento){
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre(){
        return nombre;
    }

    public String getClave(){
        return clave;
    }

    public String getClaveDeCarrera(){
        return claveDeCarrera;
    }

    public int getAnioDeIngreso(){
        return anioDeIngreso;
    }
    public LocalDate getFechaNacimiento(){
        return fechaNacimiento;
    }

    public static class Builder{

        private String nombre;
        private String clave;
        private String claveDeCarrera;
        private int anioDeIngreso;
        private LocalDate fechaNacimiento;

        public Builder nombre(String nombre){
            this.nombre = nombre;
            return this;
        }
        public Builder clave(String clave){
            this.clave = clave;
            return this;
        }
        public Builder claveDeCarrera(String claveDeCarrera){
            this.claveDeCarrera = claveDeCarrera;
            return this;
        }
        public Builder anioDeIngreso(int anioDeIngreso){
            this.anioDeIngreso = anioDeIngreso;
            return this;
        }
        public Builder fechaNacimiento(LocalDate fechaNacimiento){
            this.fechaNacimiento = fechaNacimiento;
            return this;
        }

        public Alumno build() {
            return new Alumno(nombre, clave, claveDeCarrera, anioDeIngreso, fechaNacimiento);
        }
    }
}