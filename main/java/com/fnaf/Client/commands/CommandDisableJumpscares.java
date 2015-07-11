package com.fnaf.Client.commands;

import java.util.List;

import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;

public class CommandDisableJumpscares extends CommandBase
{
	public String getCommandName() 
	{
		return "disableJumpscares";
	}

	public String getCommandUsage(ICommandSender icommandsender) 
	{
		return "/disableJumpscares <player>";
	}

	public void processCommand(ICommandSender icommandsender, String[] astring) 
	{
		if (icommandsender instanceof EntityPlayer)
		{
			EntityPlayer player = (EntityPlayer)icommandsender;

			if(astring.length == 0)
			{
				icommandsender.addChatMessage(new ChatComponentText(EnumChatFormatting.RED + "Usage: /disableJumpscaress <player>"));
				return;
			}

			icommandsender.addChatMessage(new ChatComponentText("�5Disabled Jumpscares for " + ", type /enablejumpscares <Player> to renable them."));
		}
	}
	
	public List addTabCompletionOptions(ICommandSender icommandsender, String[] astring)
    {
        return astring.length >= 1 ? getListOfStringsMatchingLastWord(astring, MinecraftServer.getServer().getAllUsernames()) : null;
    }
}