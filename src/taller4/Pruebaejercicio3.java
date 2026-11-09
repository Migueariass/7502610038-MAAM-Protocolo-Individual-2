package taller4;

class Usuario {
    private String claveSecreta;

    public Usuario(String claveSecreta) {
        this.claveSecreta = claveSecreta;
    }
}

class ArchivoProtegido {
    private String contenidoConfidencial;

    public ArchivoProtegido(String contenidoConfidencial) {
        this.contenidoConfidencial = contenidoConfidencial;
    }
}

class PruebaEjercicio3 {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("12345Password");

        // Punto 1: Descomentar la siguiente línea genera error de compilación (claveSecreta es privado)
        // System.out.println(usuario.claveSecreta);

        System.out.println("Punto 1: El acceso directo a un atributo privado fue bloqueado por el compilador.");

        // Punto 2: Objeto sin métodos get/set
        ArchivoProtegido archivo = new ArchivoProtegido("Datos sensibles");
        System.out.println("Punto 2: El objeto fue creado, pero su atributo privado es inaccesible desde fuera.");
    }
}