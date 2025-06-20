package minevalley.regions.api.events;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import minevalley.core.api.vehicles.Vehicle;
import minevalley.regions.api.core.Region;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import javax.annotation.Nonnull;

/**
 * This event is called when a vehicle enters a region.
 */
@Getter
@RequiredArgsConstructor
@SuppressWarnings("unused")
public class VehicleEnterRegionEvent extends Event implements Cancellable {

    public static final HandlerList HANDLER_LIST = new HandlerList();

    @Setter
    private boolean cancelled = false;

    /**
     * Vehicle that enters the region.
     */
    private final Vehicle vehicle;

    /**
     * Region that is entered by the vehicle.
     */
    private final Region region;

    public static HandlerList getHandlerList() {
        return HANDLER_LIST;
    }

    @Override
    public @Nonnull HandlerList getHandlers() {
        return HANDLER_LIST;
    }
}