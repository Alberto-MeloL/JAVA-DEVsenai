import java.io.Serializable;

public class Agendamentos implements Serializable{
 
    
    private String data;
    private String hora;
    private String descricao;
    private Usuarios usuario;

    public Agendamentos(String data, String hora, String descricao, Usuarios usuario) {

        this.data = data;
        this.hora = hora;
        this.descricao = descricao;
        this.usuario = usuario;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Usuarios getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuarios usuario) {
        this.usuario = usuario;
    }
}
