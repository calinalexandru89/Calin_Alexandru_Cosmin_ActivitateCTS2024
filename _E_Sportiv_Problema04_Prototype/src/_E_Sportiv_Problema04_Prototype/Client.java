package _E_Sportiv_Problema04_Prototype;

class Client implements Cloneable {
    private String nume;
    private String email;

    public Client(String nume, String email) {
        this.nume = nume;
        this.email = email;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public Client clone() {
        try {
            return (Client) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(); // Nu ar trebui să se întâmple
        }
    }

    @Override
    public String toString() {
        return "Client{" +
                "nume='" + nume + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
