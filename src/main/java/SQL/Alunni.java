
package SQL;

/**
 *
 * @author Andrea Lotti
 */
import java.util.ArrayList;


public class Alunni {
    
    private ArrayList <Alunno> arrayAlunni = new ArrayList<>();
    
    public void addAlunno(Alunno a){
        arrayAlunni.add(a);  
    }
    
    public ArrayList<Alunno> getAlunni(){
        return arrayAlunni;
    }

}
