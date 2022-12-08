package de.hhn.ai.pmt.theatercomedy.model;

import java.time.LocalDateTime;
import java.util.Collection;

public class Veranstaltung {
	private LocalDateTime zeit;
	private int anzahlPlatz;
	private int dauer;
	private Collection<Veranstaltungsort> veranstaltungsort;
	private Collection<Ticket> tickets;

}