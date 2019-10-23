package it.caicividale.scuola.ui.services;

import java.io.InputStream;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class ConnectionManager {

	private static Connection conn = null;

	public static Connection getConnection() {
		URL url;
		try {
			if (conn == null) {
				Properties dbProperties = new Properties();
				url = new URL("platform:/plugin/it.caicividale.corsicai.stampa/db.conf.xml");
				InputStream inputStream = url.openConnection().getInputStream();
				dbProperties.loadFromXML(inputStream);
				Class.forName("org.sqlite.JDBC");
				String connectionURL = dbProperties.getProperty("connection.url");
				String userName = dbProperties.getProperty("connection.username");
				String password = dbProperties.getProperty("connection.password");
				conn = DriverManager.getConnection(connectionURL, userName, password);
			}

			return conn;

		} catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		}
	}

}
