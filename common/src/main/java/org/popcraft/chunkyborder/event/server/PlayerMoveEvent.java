package org.popcraft.chunkyborder.event.server;

import org.popcraft.chunky.event.Cancellable;
import org.popcraft.chunky.platform.Player;
import org.popcraft.chunky.platform.util.Location;

public class PlayerMoveEvent extends Cancellable {
    private final Player player;
    private final Location from;
    private final Location to;

    public PlayerMoveEvent(final Player player, final Location from, final Location to) {
        this.player = player;
        this.from = from;
        this.to = to;
    }

    public Player getPlayer() {
        return player;
    }

    public Location getFrom() {
        return from;
    }

    public Location getTo() {
        return to;
    }
}
