package aoespire.relics;

import static aoespire.ModFile.makeID;

import aoespire.CharacterFile;
import com.megacrit.cardcrawl.cards.AbstractCard;
import com.megacrit.cardcrawl.dungeons.AbstractDungeon;
import com.megacrit.cardcrawl.powers.DexterityPower;
import com.megacrit.cardcrawl.actions.common.ApplyPowerAction;

public class AngyMask extends AbstractEasyRelic {
    public static final String ID = makeID("AngyMask");

    public AngyMask() {
        super(ID, RelicTier.RARE, LandingSound.FLAT);
    }

    @Override
    public AbstractEasyRelic makeCopy() {
        return new AngyMask();
    }

    // @Override
	// public void atBattleStartPreDraw() {
    //     int wrathCards = 0;
    //     for (AbstractCard c : AbstractDungeon.player.drawPile.group) {
    //         if (c.type == AbstractCard.CardType.ATTACK && c.color == AbstractCard.CardColor.PURPLE) {
    //             wrathCards++;
    //         }
    //     }
    //     addToBot(new ApplyPowerAction(AbstractDungeon.player, AbstractDungeon.player, new DexterityPower(AbstractDungeon.player, wrathCards)));
	// }
}
