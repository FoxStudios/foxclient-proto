package net.foxes4life.foxclient.networking.shared;

public enum LoggedInWebsocketPacket {
    RESERVED((byte) 0), /* may be used in the future */
    JOIN_SERVER((byte) 1), // C2S
    LEAVE_SERVER((byte) 2), // C2S
    PLAYERS_ON_SERVER((byte) 3); // parameter: server address (C2S) - response: players on server (uuids, sha1) (S2C)
    LoggedInWebsocketPacket(byte id) {}

    public byte getId() {
        return (byte) ordinal();
    }
}
