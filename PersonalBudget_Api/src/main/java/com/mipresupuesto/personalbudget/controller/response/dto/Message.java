package com.mipresupuesto.personalbudget.controller.response.dto;

import com.mipresupuesto.personalbudget.controller.response.enumeration.MessageLevel;

public class Message {
	
	private String text;
	private MessageLevel level;
	private String title;
	public Message(String text, MessageLevel level, String title) {
		super();
		setText(text);
		setLevel(level);
		setTitle(title);
	}
	
	public static Message createMessage(final String text, final MessageLevel level, final String title) {
		return new Message(text, level, title);
	}
	
	public static Message createFatalMessage(final String text, final String level, final String title) {
		return new Message();
	}

	public String getText() {
		return text;
	}
	public String getLevel() {
		return level;
	}
	public String getTitle() {
		return title;
	}
	private final void setText(final String text) {
		if(text==null || "".intern() == text.intern().trim()) {
			this.text = "";
		}else {
			this.text = text.trim();
		}
	}
	private void setLevel(MessageLevel level) {
		if(text==null) {
			this.text = MessageLevel;
		}else {
			this.text = text.trim();
		}
	}
	private void setTitle(String title) {
		this.title = title;
	}
	
	

}
