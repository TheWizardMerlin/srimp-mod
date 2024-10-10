package srimp.srimp.sound;


import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import srimp.srimp.Srimp;

public class ModSounds {

    public static final SoundEvent ENTITY_SRIMP_HURT = registerSoundEvent("srimp_hurt");
    public static final SoundEvent ENTITY_SRIMP_DEATH = registerSoundEvent("srimp_death");
    public static final SoundEvent ENTITY_SRIMP_AMBIENT = registerSoundEvent("srimp_ambient");

    



    public static void registerSounds() {
        Srimp.LOGGER.info("Registering sounds for" + Srimp.MOD_ID);
    }
    private static SoundEvent registerSoundEvent(String id) {
        Identifier identifier = Identifier.of(Srimp.MOD_ID, id);
        return Registry.register(Registries.SOUND_EVENT, identifier, SoundEvent.of(identifier));
    }
}
