package example;

import arc.*;
import arc.util.*;
import mindustry.*;
import mindustry.content.*;
import mindustry.game.EventType.*;
import mindustry.gen.*;
import mindustry.mod.*;
import mindustry.ui.dialogs.*;



public class Javapod extends Mod{

    public Javapod(){
        Echo("It is working? no?");
    }

    @Override
    public void loadContent(){
        Log.info("Loading some example content.");
    }

}
