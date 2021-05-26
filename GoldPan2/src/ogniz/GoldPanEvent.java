package ogniz;

import java.io.IOException;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.UUID;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.Server;
import org.bukkit.Sound;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerLoginEvent;
import org.bukkit.event.inventory.CraftItemEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class GoldPanEvent implements Listener{

    public static ItemStack gpan;
    public static ItemStack gpan9;
    public static ItemStack gpan8;
    public static ItemStack gpan7;
    public static ItemStack gpan6;
    public static ItemStack gpan5;
    public static ItemStack gpan4;
    public static ItemStack gpan3;
    public static ItemStack gpan2;
    public static ItemStack gpan1;

    public static int sand;
    public static int clay;
    public static int dirt;
    
	public boolean wasBanned = false;
	public int onlineAmt;
	public int maxAmt;

    public String preMessage = ChatColor.GOLD + "[" + ChatColor.AQUA + "Gold-Pan" + ChatColor.GOLD  + "] ";
	public String preDMessage = ChatColor.GOLD + "[" + ChatColor.AQUA + "Door" + ChatColor.GOLD  + "] ";
	
    public static ArrayList<ItemStack> pans = new ArrayList<ItemStack>();
    
    static void init() {
    	createGpan();
    	createGpan9();
    	createGpan8();
    	createGpan7();
    	createGpan6();
    	createGpan5();
    	createGpan4();
    	createGpan3();
    	createGpan2();
    	createGpan1();
    	pans.add(gpan);
    	pans.add(gpan9);
    	pans.add(gpan8);
    	pans.add(gpan7);
    	pans.add(gpan6);
    	pans.add(gpan5);
    	pans.add(gpan4);
    	pans.add(gpan3);
    	pans.add(gpan3);
    	pans.add(gpan2);
    	pans.add(gpan1);
    }
    private static void createGpan() {
    	ItemStack goldPan = new ItemStack(Material.BOWL);
    	ItemMeta gpMeta = goldPan.getItemMeta();
    	gpMeta.setDisplayName(ChatColor.GOLD + "Gold Pan " + ChatColor.AQUA + "[ 10/10 ]");
    	gpMeta.addEnchant(Enchantment.DURABILITY, 1, true);
    	goldPan.setItemMeta(gpMeta);
    	gpan = goldPan;
    }
    private static void createGpan9() {
    	ItemStack goldPan = new ItemStack(Material.BOWL);
    	ItemMeta gpMeta = goldPan.getItemMeta();
    	gpMeta.setDisplayName(ChatColor.GOLD + "Gold Pan " + ChatColor.AQUA + "[ 9/10 ]");
    	gpMeta.addEnchant(Enchantment.DURABILITY, 1, true);
    	goldPan.setItemMeta(gpMeta);
    	gpan9 = goldPan;
    }
    private static void createGpan8() {
    	ItemStack goldPan = new ItemStack(Material.BOWL);
    	ItemMeta gpMeta = goldPan.getItemMeta();
    	gpMeta.setDisplayName(ChatColor.GOLD + "Gold Pan " + ChatColor.AQUA + "[ 8/10 ]");
    	gpMeta.addEnchant(Enchantment.DURABILITY, 1, true);
    	goldPan.setItemMeta(gpMeta);
    	gpan8 = goldPan;
    }
    private static void createGpan7() {
    	ItemStack goldPan = new ItemStack(Material.BOWL);
    	ItemMeta gpMeta = goldPan.getItemMeta();
    	gpMeta.setDisplayName(ChatColor.GOLD + "Gold Pan " + ChatColor.AQUA + "[ 7/10 ]");
    	gpMeta.addEnchant(Enchantment.DURABILITY, 1, true);
    	goldPan.setItemMeta(gpMeta);
    	gpan7 = goldPan;
    }
    private static void createGpan6() {
    	ItemStack goldPan = new ItemStack(Material.BOWL);
    	ItemMeta gpMeta = goldPan.getItemMeta();
    	gpMeta.setDisplayName(ChatColor.GOLD + "Gold Pan " + ChatColor.AQUA + "[ 6/10 ]");
    	gpMeta.addEnchant(Enchantment.DURABILITY, 1, true);
    	goldPan.setItemMeta(gpMeta);
    	gpan6 = goldPan;
    }
    private static void createGpan5() {
    	ItemStack goldPan = new ItemStack(Material.BOWL);
    	ItemMeta gpMeta = goldPan.getItemMeta();
    	gpMeta.setDisplayName(ChatColor.GOLD + "Gold Pan " + ChatColor.AQUA + "[ 5/10 ]");
    	gpMeta.addEnchant(Enchantment.DURABILITY, 1, true);
    	goldPan.setItemMeta(gpMeta);
    	gpan5 = goldPan;
    }
    private static void createGpan4() {
    	ItemStack goldPan = new ItemStack(Material.BOWL);
    	ItemMeta gpMeta = goldPan.getItemMeta();
    	gpMeta.setDisplayName(ChatColor.GOLD + "Gold Pan " + ChatColor.AQUA + "[ 4/10 ]");
    	gpMeta.addEnchant(Enchantment.DURABILITY, 1, true);
    	goldPan.setItemMeta(gpMeta);
    	gpan4 = goldPan;
    }
    private static void createGpan3() {
    	ItemStack goldPan = new ItemStack(Material.BOWL);
    	ItemMeta gpMeta = goldPan.getItemMeta();
    	gpMeta.setDisplayName(ChatColor.GOLD + "Gold Pan " + ChatColor.AQUA + "[ 3/10 ]");
    	gpMeta.addEnchant(Enchantment.DURABILITY, 1, true);
    	goldPan.setItemMeta(gpMeta);
    	gpan3 = goldPan;
    }
    private static void createGpan2() {
    	ItemStack goldPan = new ItemStack(Material.BOWL);
    	ItemMeta gpMeta = goldPan.getItemMeta();
    	gpMeta.setDisplayName(ChatColor.GOLD + "Gold Pan " + ChatColor.AQUA + "[ 2/10 ]");
    	gpMeta.addEnchant(Enchantment.DURABILITY, 1, true);
    	goldPan.setItemMeta(gpMeta);
    	gpan2 = goldPan;
    }
    private static void createGpan1() {
    	ItemStack goldPan = new ItemStack(Material.BOWL);
    	ItemMeta gpMeta = goldPan.getItemMeta();
    	gpMeta.setDisplayName(ChatColor.GOLD + "Gold Pan " + ChatColor.AQUA + "[ 1/10 ]");
    	gpMeta.addEnchant(Enchantment.DURABILITY, 1, true);
    	goldPan.setItemMeta(gpMeta);
    	gpan1 = goldPan;
    }
	@EventHandler
	public void onInteract(PlayerInteractEvent e) {
		Player p = (Player) e.getPlayer();
		Action a = e.getAction();
		ItemStack i = e.getItem();
		BlockFace bf = e.getBlockFace();
		int uses = 10;
		if(p.getItemInHand().getType().equals(Material.AIR)) {
			return;
		}
		if(p.getItemInHand().equals(gpan)) {
			uses = 10;
		}
		else if(p.getItemInHand().equals(gpan9)) {
			uses = 9;
		}
		else if(p.getItemInHand().equals(gpan8)) {
			uses = 8;
		}
		else if(p.getItemInHand().equals(gpan7)) {
			uses = 7;
		}
		else if(p.getItemInHand().equals(gpan6)) {
			uses = 6;
		}
		else if(p.getItemInHand().equals(gpan5)) {
			uses = 5;
		}
		else if(p.getItemInHand().equals(gpan4)) {
			uses = 4;
		}
		else if(p.getItemInHand().equals(gpan3)) {
			uses = 3;
		}
		else if(p.getItemInHand().equals(gpan2)) {
			uses = 2;
		}
		else if(p.getItemInHand().equals(gpan1)) {
			uses = 1;
		}
		if(a.equals(Action.RIGHT_CLICK_AIR) || a.equals(Action.RIGHT_CLICK_BLOCK)) {
			if(e.getClickedBlock() == null) {
				return;
			}
			if(e.getClickedBlock().getType().equals(Material.CLAY) && e.getClickedBlock().getRelative(BlockFace.UP, 1).getType().equals(Material.WATER)) {
				Block b2 = e.getClickedBlock();
				if(pans.contains(i)) {
					Random rand = new Random();
					int num = rand.nextInt(2);	
					int amount = rand.nextInt(5);
					if(num == 1) {
						if(amount == 0) 
							amount = 3;
						
						p.getInventory().addItem(new ItemStack(Material.GOLD_NUGGET, amount));
						uses--;
						ItemMeta gpUpdate = i.getItemMeta();
						gpUpdate.setDisplayName(ChatColor.GOLD + "Gold Pan " + ChatColor.AQUA + "[ "+ uses +"/10 ]");
						i.setItemMeta(gpUpdate);
						p.sendMessage(preMessage + "You panned " + ChatColor.AQUA + amount + ChatColor.GOLD + " Gold Nuggets.");
					}
					p.sendMessage(preMessage + ChatColor.GRAY + "Unlucky, try again."); 
					if(uses == 0) {
						p.getItemInHand().setAmount(0);
						p.playSound(p.getLocation(), Sound.BLOCK_ANVIL_BREAK, 1, 2);
						p.sendMessage(preMessage + ChatColor.RED + "Uh oh. Your pan has broke!");
					}
				}
				
				return;
			}else if(e.getClickedBlock().getType().equals(Material.SAND) && e.getClickedBlock().getRelative(BlockFace.UP, 1).getType().equals(Material.WATER)) {
				Block b2 = e.getClickedBlock();
				if(pans.contains(i)) {
					Random rand = new Random();
					int num = rand.nextInt(4);
					int amount = rand.nextInt(4);
					if(num == 1) {
						if(amount == 0) 
							amount = 1;
						
						p.getInventory().addItem(new ItemStack(Material.GOLD_NUGGET, amount));
						uses--;
						ItemMeta gpUpdate = i.getItemMeta();
						gpUpdate.setDisplayName(ChatColor.GOLD + "Gold Pan " + ChatColor.AQUA + "[ "+ uses +"/10 ]");
						i.setItemMeta(gpUpdate);
						p.sendMessage(preMessage + "You panned " + ChatColor.AQUA + amount + ChatColor.GOLD + " Gold Nuggets.");
					}
					p.sendMessage(preMessage + ChatColor.GRAY + "Unlucky, try again."); 
					if(uses == 0) {
						p.getItemInHand().setAmount(0);
						p.playSound(p.getLocation(), Sound.BLOCK_ANVIL_BREAK, 1, 2);
						p.sendMessage(preMessage + ChatColor.RED + "Uh oh. Your pan has broke!");
					}
				}
				
				return;
			}else if(e.getClickedBlock().getType().equals(Material.DIRT) && e.getClickedBlock().getRelative(BlockFace.UP, 1).getType().equals(Material.WATER)) {
				Block b2 = e.getClickedBlock();
				if(pans.contains(i)) {
					Random rand = new Random();
					int num = rand.nextInt(3);
					int amount = rand.nextInt(4);
					if(num == 1) {
						if(amount == 0) 
							amount = 3;
						
						p.getInventory().addItem(new ItemStack(Material.GOLD_NUGGET, amount));
						uses--;
						ItemMeta gpUpdate = i.getItemMeta();
						gpUpdate.setDisplayName(ChatColor.GOLD + "Gold Pan " + ChatColor.AQUA + "[ "+ uses +"/10 ]");
						i.setItemMeta(gpUpdate);
						p.sendMessage(preMessage + "You panned " + ChatColor.AQUA + amount + ChatColor.GOLD + " Gold Nuggets.");
					}
					p.sendMessage(preMessage + ChatColor.GRAY + "Unlucky, try again."); 
					if(uses == 0) {
						p.getItemInHand().setAmount(0);
						p.playSound(p.getLocation(), Sound.BLOCK_ANVIL_BREAK, 1, 2);
						p.sendMessage(preMessage + ChatColor.RED + "Uh oh. Your pan has broke!");
					}
				}
				
				return;
			}
			
		}
		
		return;
	}
	
}
