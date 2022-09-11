package net.foxes4life.foxclient.networking.shared;

public enum LoggedInWebsocketPacket {
    RESERVED((byte) 0), /* may be used in the future */
    JOIN_SERVER((byte) 1),
    LEAVE_SERVER((byte) 2),
    GET_PLAYERS_ON_SERVER((byte) 3); // parameter: server address - response: list of sha1 hashes of uuids
    LoggedInWebsocketPacket(byte id) {}

    public byte getId() {
        return (byte) ordinal();
    }
}
