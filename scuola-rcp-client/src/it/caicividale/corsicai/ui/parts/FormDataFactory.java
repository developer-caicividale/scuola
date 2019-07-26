package it.caicividale.corsicai.ui.parts;

import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.widgets.Control;

class FormDataFactory {
	private final FormData data;

	private FormDataFactory(FormData formData) {
		this.data = formData;
	}

	public static final FormDataFactory fillDefaults() {
		FormData data = new FormData();
		return new FormDataFactory(data);
	}

	public FormDataFactory left(Control control) {
		data.left = new FormAttachment(control);
		return this;
	}

	public FormDataFactory left(int numerator) {
		data.left = new FormAttachment(numerator);
		return this;
	}

	public FormDataFactory left(Control control, int offset) {
		data.left = new FormAttachment(control, offset);
		return this;
	}

	public FormDataFactory left(int numerator, int offset) {
		data.left = new FormAttachment(numerator, offset);
		return this;
	}

	public FormDataFactory left(Control control, int offset, int alignment) {
		data.left = new FormAttachment(control, offset, alignment);
		return this;
	}

	public FormDataFactory left(int numerator, int denominator, int offset) {
		data.left = new FormAttachment(numerator, denominator, offset);
		return this;
	}

	public FormDataFactory right(Control control) {
		data.right = new FormAttachment(control);
		return this;
	}

	public FormDataFactory right(int numerator) {
		data.right = new FormAttachment(numerator);
		return this;
	}

	public FormDataFactory right(Control control, int offset) {
		data.right = new FormAttachment(control, offset);
		return this;
	}

	public FormDataFactory right(int numerator, int offset) {
		data.right = new FormAttachment(numerator, offset);
		return this;
	}

	public FormDataFactory right(Control control, int offset, int alignment) {
		data.right = new FormAttachment(control, offset, alignment);
		return this;
	}

	public FormDataFactory right(int numerator, int denominator, int offset) {
		data.right = new FormAttachment(numerator, denominator, offset);
		return this;
	}

	public FormDataFactory top(Control control) {
		data.top = new FormAttachment(control);
		return this;
	}

	public FormDataFactory top(int numerator) {
		data.top = new FormAttachment(numerator);
		return this;
	}

	public FormDataFactory top(Control control, int offset) {
		data.top = new FormAttachment(control, offset);
		return this;
	}

	public FormDataFactory top(int numerator, int offset) {
		data.top = new FormAttachment(numerator, offset);
		return this;
	}

	public FormDataFactory top(Control control, int offset, int alignment) {
		data.top = new FormAttachment(control, offset, alignment);
		return this;
	}

	public FormDataFactory top(int numerator, int denominator, int offset) {
		data.top = new FormAttachment(numerator, denominator, offset);
		return this;
	}

	public FormDataFactory bottom(Control control) {
		data.bottom = new FormAttachment(control);
		return this;
	}

	public FormDataFactory bottom(int numerator) {
		data.bottom = new FormAttachment(numerator);
		return this;
	}

	public FormDataFactory bottom(Control control, int offset) {
		data.bottom = new FormAttachment(control, offset);
		return this;
	}

	public FormDataFactory bottom(int numerator, int offset) {
		data.bottom = new FormAttachment(numerator, offset);
		return this;
	}

	public FormDataFactory bottom(Control control, int offset, int alignment) {
		data.bottom = new FormAttachment(control, offset, alignment);
		return this;
	}

	public FormDataFactory bottom(int numerator, int denominator, int offset) {
		data.bottom = new FormAttachment(numerator, denominator, offset);
		return this;
	}

	public FormDataFactory height(int height) {
		data.height = height;
		return this;
	}

	public FormDataFactory width(int width) {
		data.width = width;
		return this;
	}

	public FormData create() {
		return data;
	}
}
