package net.md_5.bungee.protocol.packet.rewriter.serverside;

import io.netty.buffer.ByteBuf;
import net.md_5.bungee.protocol.packet.rewriter.PacketRewriter;

public class ServerPositionRewriter extends PacketRewriter
{
    @Override
    public void rewrite(ByteBuf in, ByteBuf out)
    {
        out.writeBytes( in.readBytes( in.readableBytes() - 1 ) ); // -1 to ignore the onGround
        out.writeByte( 0 );
    }
}