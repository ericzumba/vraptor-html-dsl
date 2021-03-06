package br.com.caelum.vraptor.html.tags;

import br.com.caelum.vraptor.html.attributes.Attributes;

public class Li implements Tag {
	private final Attributes attributes;
	private final NestedElement[] children;
	private final TagTransformer tagTransformer = new DefaultTagTransformer();

	public Li(Attributes attributes, NestedElement... children) {
		this.attributes = attributes;
		this.children = children;

	}

	public NestedElement[] getChildren() {
		return children;
	}

	public Attributes getAttributes() {
		return attributes;
	}

	public String toHtml() {
		return tagTransformer.transform(this);
	}
}
