
package PuntiVendita;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import java.io.File;

/**
 *
 * @author Andrea Lotti
 */
public class PuntiVenditaXML {
    private static ObjectMapper objMapper = new ObjectMapper();
    private static XmlMapper xmlMapper = new XmlMapper();
    
    public String getPuntivendita(String WEB_ROOT, String FILE_XML){
        String ser=null;
        try{
            PuntiVendita pv = objMapper.readValue(getClass().getResourceAsStream(WEB_ROOT + "/puntiVendita.json"), PuntiVendita.class);
            XmlMapper xmlMapper = new XmlMapper();
             ser = xmlMapper.writeValueAsString(pv);
        }catch(Exception ex){
            ex.toString();
        }
       return ser; 
    }
    
}
