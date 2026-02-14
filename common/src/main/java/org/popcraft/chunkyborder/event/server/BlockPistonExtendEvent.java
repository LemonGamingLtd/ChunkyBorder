package org.popcraft.chunkyborder.event.server;

import org.popcraft.chunky.event.Cancellable;
import org.popcraft.chunky.platform.util.Location;

import java.util.List;

public class BlockPistonExtendEvent extends Cancellable {
    private final Location pistonLocation;
    private final List<Location> affectedBlocks;

    public BlockPistonExtendEvent(final Location pistonLocation, final List<Location> affectedBlocks) {
        this.pistonLocation = pistonLocation;
        this.affectedBlocks = affectedBlocks;
    }

    public Location getPistonLocation() {
        return pistonLocation;
    }

    public List<Location> getAffectedBlocks() {
        return affectedBlocks;
    }
}
