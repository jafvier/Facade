
package pkgClases;

public class ClsEstudiantes {

    private String strNombre;
    private String strApellidos;
    private String strDirecion;
    private String strEdad;
    private String strUsuario;
    private String strPassword;

    public ClsEstudiantes() {
        //para incluir en fachada
    }

    public ClsEstudiantes(String strNombre, String strApellidos, String strDirecion, String strEdad, String strUsuario, String strPassword) {
        this.strNombre = strNombre;
        this.strApellidos = strApellidos;
        this.strDirecion = strDirecion;
        this.strEdad = strEdad;
        this.strUsuario = strUsuario;
        this.strPassword = strPassword;
    }

    public String getStrNombre() {
        return strNombre;
    }

    public void setStrNombre(String strNombre) {
        this.strNombre = strNombre;
    }

    public String getStrApellidos() {
        return strApellidos;
    }

    public void setStrApellidos(String strApellidos) {
        this.strApellidos = strApellidos;
    }

    public String getStrDirecion() {
        return strDirecion;
    }

    public void setStrDirecion(String strDirecion) {
        this.strDirecion = strDirecion;
    }

    public String getStrEdad() {
        return strEdad;
    }

    public void setStrEdad(String strEdad) {
        this.strEdad = strEdad;
    }

    public String getStrUsuario() {
        return strUsuario;
    }

    public void setStrUsuario(String strUsuario) {
        this.strUsuario = strUsuario;
    }

    public String getStrPassword() {
        return strPassword;
    }

    public void setStrPassword(String strPassword) {
        this.strPassword = strPassword;
    }

}
