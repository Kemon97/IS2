package com.mipresupuesto.personalbudget.controller.response.dto;

import com.mipresupuesto.personalbudget.controller.response.enumeration.MessageLevel;

public class Message {
	
	private String text;
	private String title;
	private MessageLevel level;
	
	
	public Message(String text, String title, MessageLevel level) {
		super();
		setText(text);
		setTitle(title);
		setLevel(level);
	}
	
	public static Message createMessage(final String text, final String title, final MessageLevel level)  {
		return new Message(text, title, level);
	}
	
	public static Message createMessage(final String text, final MessageLevel level)  {
		return new Message(text, text, level);
	}
	
	
	public static Message createFatalMessage(final String text)  {
		return new Message(text, text, MessageLevel.FATAL);
	}
	
	
	public static Message createErrorMessage(final String text)  {
		return new Message(text, text, MessageLevel.ERROR);
	}
	public static Message createWarningMessage(final String text)  {
		return new Message(text, text, MessageLevel.WARNING);
	}
	public static Message createInformationMessage(final String text)  {
		return new Message(text, text, MessageLevel.INFORMATION);
	}
	public static Message createSuccessMessage(final String text)  {
		return new Message(text, text, MessageLevel.SUCCESS);
	}
	
	public final String getText() {
		return text;
	}
	public final String getTitle() {
		return title;
	}
	public final MessageLevel getLevel() {
		return level;
	}
	private final void setText(final String text) {
		
		if(title == null || "".intern() == title.intern().trim()) {
			this.title = "";
		}
		else {
			this.title = title.trim();
		}
	}
	private final void setTitle(final String title) {
		if(title == null || "".intern() == title.intern().trim()) {
			this.title = "";
		}
		else {
			this.title = title.trim();
		}
	}
	private final void setLevel(final MessageLevel level) {
		if(title == null) {
			this.level = MessageLevel.FATAL;
		}
		else {
			this.level = level;
		}
	}
	
	

}
