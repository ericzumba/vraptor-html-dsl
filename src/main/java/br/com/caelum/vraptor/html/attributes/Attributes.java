package br.com.caelum.vraptor.html.attributes;

/**
 * <p>Represents a collection of attributes of a HTML tag.</p>
 * @author luiz
 */
public class Attributes {
	private final Attribute[] attributes;

	public Attributes(Attribute...attributes) {
		this.attributes = attributes;
	}

	public Attribute[] array() {
		return this.attributes;
	}
}
