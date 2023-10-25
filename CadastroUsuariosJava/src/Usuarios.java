/**
 * Usuarios
 */
public class Usuarios {

    private String name;
    private int cpf;
    private int age;
    private String sex;
    private int cep;

    public Usuarios(String name, int cpf, int age, String sex, int cep) {
        this.name = name;
        this.cpf = cpf;
        this.age = age;
        this.sex = sex;
        this.cep = cep;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    
}