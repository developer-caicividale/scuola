package it.caicividale.scuola.ui.widget;

import java.time.LocalDate;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.DateTime;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.wb.swt.ResourceManager;

public class LocalDateComposite extends Composite {
    private static final long serialVersionUID = 8729750596540867702L;

    private final LocalDateText text;
    private final Label calendar;
    private DateTime dateTime;

    private final Dialog calendarDialog = new Dialog(getShell()) {
	private static final long serialVersionUID = 6701750858423204436L;
	private Shell shell;

	// @Override
	protected void prepareOpen() {
	    shell = new Shell(LocalDateComposite.this.getShell(), SWT.MODELESS | SWT.BORDER);
	    createDialogArea(shell);
	    configureShell(shell);
	}

	protected void configureShell(Shell shell) {
	    shell.setLayout(new FillLayout());
	    Point location = calendar.toDisplay(1, 1);
	    Point preferredSize = shell.computeSize(SWT.DEFAULT, SWT.DEFAULT);
	    shell.setBounds(location.x, location.y, preferredSize.x, preferredSize.y);
	    shell.addListener(SWT.Deactivate, event -> shell.close());
	}

	protected Control createDialogArea(Composite parent) {
	    dateTime = new DateTime(parent, SWT.CALENDAR);

	    LocalDate localDate = text.getLocalDate();
	    if (localDate != null) {
		dateTime.setDate(localDate.getYear(), localDate.getMonthValue() - 1, localDate.getDayOfMonth());
	    }

	    dateTime.addSelectionListener(new SelectionAdapter() {
		private static final long serialVersionUID = 7495397192524381725L;

		@Override
		public void widgetDefaultSelected(SelectionEvent e) {
		    text.setLocalDate(LocalDate.of(dateTime.getYear(), dateTime.getMonth() + 1, dateTime.getDay()));
		    shell.close();
		}
	    });
	    return dateTime;
	}
    };

    public LocalDateComposite(Composite parent, int style) {
	super(parent, SWT.NONE);

	GridLayout gridLayout = new GridLayout(2, false);
	gridLayout.marginHeight = 0;
	gridLayout.marginWidth = 0;
	gridLayout.marginLeft = 10;
	this.setLayout(gridLayout);

	text = new LocalDateText(this, style);
	text.setLayoutData(GridDataFactory.fillDefaults(). // @formatter:off
		hint(70, SWT.DEFAULT).minSize(70, SWT.DEFAULT).grab(true, false).create()); // @formatter:on
	text.addMouseListener(new MouseAdapter() {
	    private static final long serialVersionUID = 5198532353233354518L;

	    @Override
	    public void mouseDoubleClick(MouseEvent e) {
		calendarDialog.open(null);
	    }
	});

	calendar = new Label(this, SWT.NONE);
	calendar.setImage(ResourceManager.getPluginImage("it.caicividale.scuola.ui", "iconstext_calendar16x16.png"));
	calendar.setCursor(parent.getDisplay().getSystemCursor(SWT.CURSOR_HAND));
	calendar.addMouseListener(new MouseAdapter() {
	    private static final long serialVersionUID = -3799950963797108955L;

	    @Override
	    public void mouseUp(MouseEvent e) {
		calendarDialog.open(null);
	    }
	});
    }

    @Override
    public Control[] getTabList() {
	return new Control[] { text };
    }

    public LocalDate getLocalDate() {
	return text.getLocalDate();
    }

    public void setLocalDate(LocalDate localDate) {
	text.setLocalDate(localDate);
    }

    @Override
    public void setData(Object data) {
	text.setData(data);
    }

    @Override
    public void setData(String key, Object value) {
	text.setData(key, value);
    }

    @Override
    public Object getData() {
	return text.getData();
    }

    @Override
    public Object getData(String key) {
	return text.getData(key);
    }

    LocalDateText getLocalDateText() {
	return text;
    }
}
