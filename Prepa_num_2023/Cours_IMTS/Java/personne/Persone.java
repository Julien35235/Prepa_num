package personne;


public class Persone {
    private String name;
    private String password;

    private String mail;
    private int age;

    public String getName() {
        return name;

    }

    public Persone setName(String name) {
        this.name = name;
        return this;

    }

    public int getAge() {
        return age;

    }

    public Persone setAge(int age) {
        this.age = age;
        return this;
        //TODO Ajouter le password et le mail puis tester

    }

    public Persone setPassword(String password) {
        this.password = password;
        return this;

    }

    public String getPassword() {
        return password;
    }

    public Persone setMaile(String mail) {
        this.mail = mail;
        return this;

    }

    public String getMail() {
        return mail;
    }
}
