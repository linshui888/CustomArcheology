package cn.myrealm.customarcheology.commands;

import org.bukkit.command.CommandSender;

import java.util.List;

public interface SubCommand {
    String getName();
    String getDescription();
    String getUsage();
    List<String> getSubCommandAliases();

    List<String> onTabComplete(int args_num);
    void execute(CommandSender sender, String[] args) throws Exception;
}