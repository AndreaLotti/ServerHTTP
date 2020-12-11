
package SQL;

/**
 *
 * @author Andrea Lotti
 */
public class Alunno {
    private String nome;
    private String cognome;

    public Alunno(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }
}
