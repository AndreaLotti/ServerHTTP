
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
    
    public static void getPuntivendita(File WEB_ROOT, String FILE_XML){
        try{
            PuntiVendita pv = objMapper.readValue(new File(WEB_ROOT + "/puntiVendita.json"), PuntiVendita.class);//deserializzazione
            xmlMapper.writeValue(new File(WEB_ROOT + "/" + FILE_XML),pv);//serializzazione
            File file = new File(WEB_ROOT + "/" + FILE_XML);//scrittura su file
        }catch(Exception ex){
            ex.toString();
        }
    }
}
