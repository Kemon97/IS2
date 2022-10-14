package com.mipresupuesto.personalbudget.domain.builder;

import java.util.UUID;

import com.mipresupuesto.personalbudget.domain.YearDomain;

/**
 * @author ksmp1
 *
 */
public class YearDomainBuilder {
	
	private UUID id;
	private int year;
	
	private YearDomainBuilder() {
		setYear(0);
	}
	public static final YearDomainBuilder get() {
		return new YearDomainBuilder();
	}

	public final YearDomainBuilder setId(final UUID id) {
		this.id=(id==null) ? UUID.randomUUID(): id;
		return this;
	}

	public final YearDomainBuilder setYear(int year) {
		this.year = year;
		return this;
	}

	
	public YearDomain build() {
		return YearDomain.create(id, year);
	}

}
