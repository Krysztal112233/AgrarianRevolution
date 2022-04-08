package dev.krysztal.advagri.events;

public class AdvAgriEvents {

    private static final AdvAgriEvents advAgriEvents = new AdvAgriEvents();

    private AdvAgriEvents() {

    }

    public static AdvAgriEvents getInstance() {
        return advAgriEvents;
    }

    public void InitAllEvents() {
        LootTableEvent.getInstance().Init();
    }
}
