package com.wiley.test1.canvasEvent;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EventBO {
	
	Event e;
	static int i=0;
	Event [] events;
	public void addEvent(Event [] events, Event e)
	{
		events[i]=e;
		i++;
	}
	public Event[] searchEvent(Event [] events,String type)
	{
		List<Event> res=Stream.of(events).filter(e->e.getType().equals(type)).collect(Collectors.toList());
		int j=0;
		/*this.events=new Event[events.length];
		for(Event e:events)
		{
			if(e.getType().equals(type))
				this.events[j++]=e;
		}*/
		//System.out.println(res);
		for(Event e:res)
			events[j++]=e;
		
		return this.events;
	}
	public void displayAll(Event [] evs)
	{
		this.events=evs;
		for(Event e:events)
			System.out.println(e);
		System.out.println("----------------------------");
		
	}

}
