package xml.controle2;

import java.io.InputStream;

public interface MuseeParser {

    /**
     * Parse an xml file provided as an input stream
     *
     * @param inputStream the input stream corresponding to the xml file
     * @return the corresponding Musee object
     */
    public Musee parse(InputStream inputStream);

}
