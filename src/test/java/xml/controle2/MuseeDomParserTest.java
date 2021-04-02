package xml.controle2;

import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class MuseeDomParserTest {

    private MuseeParser museeParser ;

    @Before
    public void before() {
        museeParser = new MuseeDomParser();
    }

    @Test
    public void testParseInputStreamWithFile() throws IOException, ParseException {
        // given : an xml file corresponding to a musee
        InputStream inputStream = this.getClass().getResourceAsStream("/Musee-exemple.xml");

        // when : we parse the xml file with a musee parser instance
        Musee musee = museeParser.parse(inputStream);

        // then : we get a musee object initialize with values coming from the xml file
        assertThat(musee.getNom(), is("Musée Saint-Raymond"));
        assertThat(musee.getSousTitre(), is("Musée d'Archéologie de Toulouse"));
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        assertThat(sdf.format(musee.getDateInauguration()), is("2021-03-22T12:00:00"));
        assertThat(musee.getResume(), is("Le bâtiment est un ancien collège..."));
    }

}