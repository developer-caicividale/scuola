package it.caicividale.corsicai.ui.services;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.sql.Connection;
import java.util.Map;
import java.util.Properties;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.swt.program.Program;

import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.export.JRPdfExporter;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.export.ExporterInput;
import net.sf.jasperreports.export.OutputStreamExporterOutput;
import net.sf.jasperreports.export.SimpleExporterInput;
import net.sf.jasperreports.export.SimpleOutputStreamExporterOutput;
import net.sf.jasperreports.export.SimplePdfExporterConfiguration;

public class StampeManager {
	private static final StampeManager INSTANCE = new StampeManager();

	private static Properties reportProperties;

	// Singleton
	public static StampeManager getInstance() {
		return INSTANCE;
	}

	private StampeManager() {
		try {
			reportProperties = new Properties();
			URL url = new URL("platform:/plugin/it.caicividale.corsicai.stampa/reports.xml");
			InputStream inputStream = url.openConnection().getInputStream();
			reportProperties.loadFromXML(inputStream);

		} catch (IOException e) {
			throw new RuntimeException(e.getMessage());
		}
	}

	public void getReport(String name, Map<String, Object> parameters) {
		try {

			// URL url = new URL();

			// JasperReport jasperReport =
			// JasperCompileManager.compileReport("C:\\Users\\913725\\JaspersoftWorkspace\\MyReports\\modulo_iscrizione.jrxml");
			URL url = new URL(reportProperties.getProperty("report.path") + reportProperties.getProperty(name));
			File file = new File(FileLocator.resolve(url).toURI());

			JasperReport jasperReport = (JasperReport) JRLoader.loadObject(file);

			Connection conn = ConnectionManager.getConnection();

			JasperPrint print = JasperFillManager.fillReport(jasperReport, parameters, conn);

			// PDF Exportor.
			JRPdfExporter exporter = new JRPdfExporter();
			ExporterInput exporterInput = new SimpleExporterInput(print);
			// ExporterInput
			exporter.setExporterInput(exporterInput);
			// ExporterOutput

			File tempFile = File.createTempFile("report-", ".pdf");
			OutputStreamExporterOutput exporterOutput = new SimpleOutputStreamExporterOutput(
					tempFile.getAbsolutePath());
			// Output
			exporter.setExporterOutput(exporterOutput);

			SimplePdfExporterConfiguration configuration = new SimplePdfExporterConfiguration();
			exporter.setConfiguration(configuration);
			exporter.exportReport();

			Program.launch(tempFile.getAbsolutePath());

			// JasperExportManager.exportReportToPdfFile(print,
			// "D:\\temp\\report\\report.pdf");

		} catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		}

	}
}
