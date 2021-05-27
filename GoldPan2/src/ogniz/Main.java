package ogniz;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Server;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.ComponentBuilder;
import net.md_5.bungee.api.chat.HoverEvent;
import net.md_5.bungee.api.chat.TextComponent;
import net.minecraft.server.v1_16_R3.MaterialPredicate;
import ogniz.GoldPanEvent;

public class Main extends JavaPlugin {
	
	ItemStack gpan;
	ArrayList<Material> planks = new ArrayList<Material>();
	
	@Override
    public void onEnable(){
        PluginManager pm = getServer().getPluginManager();
        pm.registerEvents(new GoldPanEvent(), this);
        GoldPanEvent.init();
        ItemStack goldPan = new ItemStack(Material.BOWL);
    	ItemMeta gpMeta = goldPan.getItemMeta();
    	gpMeta.setDisplayName(ChatColor.GOLD + "Gold Pan " + ChatColor.AQUA + "[ 10/10 ]");
    	gpMeta.addEnchant(Enchantment.DURABILITY, 1, true);
    	goldPan.setItemMeta(gpMeta);
    	gpan = goldPan;

    	planks.add(Material.ACACIA_PLANKS);
    	planks.add(Material.BIRCH_PLANKS);
    	planks.add(Material.CRIMSON_PLANKS);
    	planks.add(Material.DARK_OAK_PLANKS);
    	planks.add(Material.DARK_OAK_PLANKS);
    	planks.add(Material.JUNGLE_PLANKS);
    	planks.add(Material.OAK_PLANKS);
    	planks.add(Material.SPRUCE_PLANKS);
    	planks.add(Material.WARPED_PLANKS);
    	
    	planks.forEach(new Consumer<Material>() {

			@Override
			public void accept(Material t) {
				
				ShapedRecipe panRec = new ShapedRecipe(gpan);
		        panRec.shape("WWW", "WIW", "WWW");
		        panRec.setIngredient('W', t);
		        panRec.setIngredient('I', Material.IRON_INGOT);
		        getServer().addRecipe(panRec);
		        getLogger().info(t.name() + " goldpan crafting recipe added!");
				
			}
    		
    	});
        getLogger().info("GoldPan is enabled");
    }
   
   
    @Override
    public void onDisable(){
        getLogger().info("GoldPan is disabled");
    }
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String string, String[] args) {

			if(cmd.getName().equalsIgnoreCase("goldpan") && sender instanceof Player) {
			Player p = (Player) sender;
	    	String preMessage = ChatColor.GOLD + "[" + ChatColor.AQUA + "Gold-Pan" + ChatColor.GOLD  + "] ";
		    	p.sendMessage(preMessage + "Create a gold pan by making a chest pattern with an");
		    	p.sendMessage(ChatColor.GOLD + "iron ingot in the middle in a crafting bench.");
		    	p.sendMessage(ChatColor.GOLD+ "Made by"+ ChatColor.LIGHT_PURPLE + " IGN:OGNiz | DISCORD:rod#0922");
		    	TextComponent msg = new TextComponent("YouTube");
		    	msg.setColor(net.md_5.bungee.api.ChatColor.RED);
		    	msg.setClickEvent(new ClickEvent(ClickEvent.Action.OPEN_URL, "https://www.youtube.com/viscerator/subscribe/and/like/the/videos"));
		    	msg.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("YouTube.").create()));
		    	
		    	p.spigot().sendMessage(msg);
		    	
		    	TextComponent msg1 = new TextComponent("Spigot Page");
		    	msg1.setColor(net.md_5.bungee.api.ChatColor.LIGHT_PURPLE);
		    	msg1.setClickEvent(new ClickEvent(ClickEvent.Action.OPEN_URL, "https://www.spigotmc.org/members/viscerator.169890/"));
		    	msg1.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("Spigot Page").color(net.md_5.bungee.api.ChatColor.RED).create()));
		    	
		    	p.spigot().sendMessage(msg1);
		    	
		    	TextComponent msg2 = new TextComponent("Bukkit Page");
		    	msg2.setColor(net.md_5.bungee.api.ChatColor.LIGHT_PURPLE);
		    	msg2.setClickEvent(new ClickEvent(ClickEvent.Action.OPEN_URL, "https://dev.bukkit.org/members/og_riley"));
		    	msg2.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("Bukkit Page").color(net.md_5.bungee.api.ChatColor.RED).create()));
		    	
		    	p.spigot().sendMessage(msg2);
		}
		return true;
	}
}
