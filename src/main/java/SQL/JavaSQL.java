package SQL;

/**
 *
 * @author Andrea Lotti
 */

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import java.io.File;
import java.sql.*;
import java.util.ArrayList;

public class JavaSQL {
    
    private static ObjectMapper objMapper = new ObjectMapper();
    private static XmlMapper xmlMapper = new XmlMapper();
    private Alunni alunni = new Alunni();
    
    public void getDatabase(){
      try{
          Class.forName("com.mysql.cj.jdbc.Driver");
          Connection connessione = DriverManager.getConnection("jdbc:mysql://localhost:3306/EsTPSIT?user=root&password=12345&serverTimezone=Europe/Rome");
          Statement statement = connessione.createStatement();
          ResultSet resultSet = statement.executeQuery("SELECT Alunni.* FROM Alunni");
          while(resultSet.next())
          {
              String nome = resultSet.getString("Nome");
              String cognome = resultSet.getString("Cognome");
              Alunno a = new Alunno (nome, cognome);
              alunni.addAlunno(a);
          }
      }catch(ClassNotFoundException | SQLException e)
      {
          e.toString();
      }
    } 
    
    public String getDatabaseXML(String WEB_ROOT, String FILE_DB_XML){
        String s = null;
        try{
            s = xmlMapper.writeValueAsString(alunni); //serializzazione in xml

        }catch(Exception e)
        {
            e.toString();
        }
        return s;
    }
    
    public String getDatabaseJSON(String WEB_ROOT, String FILE_DB_JSON){
        String s=null;
        try{
            s = objMapper.writeValueAsString(alunni); //serializzazione in json
            
            
        }catch(Exception e)
        {
            e.toString();
        }
        return s;
    }
    
}

