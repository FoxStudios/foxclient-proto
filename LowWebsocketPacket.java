package net.foxes4life.foxclient.networking.shared;

public enum LowWebsocketPacket {
    PING_RESERVED((byte) 0), /* may be used in the future */
    C2S_LOGIN_REQUEST((byte) 1), /* username uuid client hash */
    S2C_LOGIN_ENCRYPTION_KEY_REQUEST((byte) 2),
    C2S_LOGIN_ENCRYPTION_KEY_RESPONSE((byte) 3),
    /* server verifies shit idk yes */
    S2C_LOGIN_SUCCESS((byte) 4),
    COMMON_LOGGED_IN_PACKET((byte) 5);

    LowWebsocketPacket(byte id) {}

    public byte getId() {
        return (byte) ordinal();
    }
}
