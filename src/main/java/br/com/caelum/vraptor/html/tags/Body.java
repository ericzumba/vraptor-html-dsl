package br.com.caelum.vraptor.html.tags;

import br.com.caelum.vraptor.html.attributes.Attributes;

public class Body implements Tag {

	private final Tag[] children;
	private final Attributes attributes;

	public Body(Attributes attributes, Tag... children) {
		this.attributes = attributes;
		this.children = children;
	}

	public Tag[] getChildren() {
		return children;
	}

	public Attributes getAttributes() {
		return attributes;
	}

}