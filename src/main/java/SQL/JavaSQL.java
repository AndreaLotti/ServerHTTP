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
    
    public void getDatabaseXML(File WEB_ROOT, String FILE_DB_XML){
        try{
            xmlMapper.writeValue(new File(WEB_ROOT + "/" + FILE_DB_XML), alunni); //serializzazione in xml
            File file = new File(WEB_ROOT + "/" + FILE_DB_XML);//scrittura su file

        }catch(Exception e)
        {
            e.toString();
        }
    }
    
    public void getDatabaseJSON(File WEB_ROOT, String FILE_DB_JSON){
        try{
            objMapper.writeValue(new File(WEB_ROOT + "/" + FILE_DB_JSON), alunni); //serializzazione in json
            File file = new File(WEB_ROOT + "/" + FILE_DB_JSON);//scrittura su file
            
        }catch(Exception e)
        {
            e.toString();
        }
    }
    
}

