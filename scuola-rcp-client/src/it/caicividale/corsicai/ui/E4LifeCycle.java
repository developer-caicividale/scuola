package it.caicividale.corsicai.ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import org.apache.commons.lang3.SystemUtils;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.ui.workbench.lifecycle.PostContextCreate;
import org.eclipse.e4.ui.workbench.lifecycle.PreSave;
import org.eclipse.e4.ui.workbench.lifecycle.ProcessAdditions;
import org.eclipse.e4.ui.workbench.lifecycle.ProcessRemovals;

/**
 * This is a stub implementation containing e4 LifeCycle annotated methods.<br />
 * There is a corresponding entry in <em>plugin.xml</em> (under the <em>org.eclipse.core.runtime.products' extension point</em>) that references this class.
 **/
@SuppressWarnings("restriction")
public class E4LifeCycle {

    @PostContextCreate
    void postContextCreate(IEclipseContext workbenchContext) {
	String line;
	Boolean isWindows = SystemUtils.IS_OS_WINDOWS;
	if (isWindows) {
	    try {

		Process proc = Runtime.getRuntime().exec(System.getenv("windir") + "\\system32\\" + "tasklist.exe");
		BufferedReader input = new BufferedReader(new InputStreamReader(proc.getInputStream()));
		OutputStreamWriter oStream = new OutputStreamWriter(proc.getOutputStream());
		oStream.write("process where name='explorer.exe'");
		oStream.flush();
		oStream.close();
		while ((line = input.readLine()) != null) {
		    String processo = line;
		    if (line.toUpperCase().contains("ONEDRIVE.EXE")) {
			processo += " - ****** TROVATO *****";
			System.out.println(processo);
		    }

		}
		input.close();
	    } catch (IOException ioe) {
		ioe.printStackTrace();
	    }
	}

    }

    @PreSave
    void preSave(IEclipseContext workbenchContext) {
    }

    @ProcessAdditions
    void processAdditions(IEclipseContext workbenchContext) {
    }

    @ProcessRemovals
    void processRemovals(IEclipseContext workbenchContext) {
    }
}
