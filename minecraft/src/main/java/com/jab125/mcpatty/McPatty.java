package com.jab125.mcpatty;

import net.minecraft.client.main.Main;


// utility for quickly launching minecraft
public class McPatty {
    public static void main(String[] args) {
       // LivingEntity
        Main.main(new String[]{"--accessToken", "", "--version", "DEV", "--assetsDir", "/Users/josephyap/Documents/GitHub/packager/output/assets", "--assetIndex", "5"});
    }
}
