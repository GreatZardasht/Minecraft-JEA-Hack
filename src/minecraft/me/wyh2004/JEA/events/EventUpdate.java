package me.wyh2004.JEA.events;

import com.darkmagician6.eventapi.events.Event;

public class EventUpdate implements Event{
	
	public boolean Cancellable;

	public boolean isCancellable() {
		return Cancellable;
	}

	public void setCancellable(boolean cancellable) {
		Cancellable = cancellable;
	}
	
}
