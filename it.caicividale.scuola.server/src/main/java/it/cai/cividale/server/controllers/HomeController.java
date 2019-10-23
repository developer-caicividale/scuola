package it.cai.cividale.server.controllers;

import java.io.InputStream;
import java.util.Locale;
import java.util.jar.Attributes;
import java.util.jar.Manifest;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Handles requests for the application home page.
 */
@RestController
public class HomeController {

    @Autowired
    private ServletContext servletContext;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(Locale locale, Model model) {

	String versione = "non disponibile";
	try {
	    InputStream inputStream = servletContext.getResourceAsStream("/META-INF/MANIFEST.MF");
	    Manifest manifest;
	    manifest = new Manifest(inputStream);
	    Attributes attr = manifest.getMainAttributes();
	    String implementationVersion = attr.getValue("Implementation-Version");
	    if (implementationVersion != null) {

		versione = attr.getValue("Implementation-Version");
	    } else {
		versione = "In file manifest.mf, Implementation-Version non disponibile";
	    }

	} catch (Exception e) {
	    throw new RuntimeException(e);
	}

	String string = "Scuola cai server" + ".<br><br>" + "Versione: " + versione + ".<br><br>";

	return string;
    }
}
