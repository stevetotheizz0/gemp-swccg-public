package com.gempukku.swccgo.logic.timing.results;

import com.gempukku.swccgo.game.PhysicalCard;
import com.gempukku.swccgo.game.SwccgGame;
import com.gempukku.swccgo.logic.GameUtils;
import com.gempukku.swccgo.logic.effects.PreventableCardEffect;
import com.gempukku.swccgo.logic.timing.EffectResult;

/**
 * The effect result that is emitted when a card begins to be relocated between locations.
 */
public class RelocatingBetweenLocationsResult extends EffectResult implements MovingResult {
    private PhysicalCard _actionSource;
    private PhysicalCard _cardMoving;
    private PhysicalCard _movingFrom;
    private PhysicalCard _movingTo;

    /**
     * Creates an effect result that is emitted when a card begins to be relocated between locations.
     * @param cardMoving the card that is moving
     * @param actionSource the source of the action
     * @param playerId the performing player
     * @param movingFrom the card the card is moving from
     * @param movingTo the card the card is moving to
     */
    public RelocatingBetweenLocationsResult(PhysicalCard cardMoving, PhysicalCard actionSource, String playerId, PhysicalCard movingFrom, PhysicalCard movingTo) {
        super(Type.RELOCATING_BETWEEN_LOCATIONS, playerId);
        _actionSource = actionSource;
        _cardMoving = cardMoving;
        _movingFrom = movingFrom;
        _movingTo = movingTo;
    }

    /**
     * Gets the card that was the source of the action.
     * @return the source of the action
     */
    public PhysicalCard getActionSource() {
        return _actionSource;
    }

    /**
     * Gets the card that is moving.
     * @return the card that is moving
     */
    @Override
    public PhysicalCard getCardMoving() {
        return _cardMoving;
    }

    /**
     * Gets the card the card is moving from.
     * @return the card the card is moving from
     */
    @Override
    public PhysicalCard getMovingFrom() {
        return _movingFrom;
    }

    /**
     * Gets the card the card is moving to.
     * @return the card the card is moving to
     */
    @Override
    public PhysicalCard getMovingTo() {
        return _movingTo;
    }

    /**
     * Determine if movement is a 'react'.
     * @return true or false
     */
    @Override
    public boolean isReact() {
        return false;
    }

    /**
     * Determine if movement is a 'move away'.
     * @return true or false
     */
    @Override
    public boolean isMoveAway() {
        return false;
    }

    /**
     * Gets the interface that can be used to prevent the card from moving, or null.
     * @return the interface
     */
    @Override
    public PreventableCardEffect getPreventableCardEffect() {
        return null;
    }

    /**
     * Gets the text to show to describe the effect result.
     * @param game the game
     * @return the text
     */
    @Override
    public String getText(SwccgGame game) {
        return "Relocating " + GameUtils.getCardLink(_cardMoving) + " from " + GameUtils.getCardLink(_movingFrom) + " to " + GameUtils.getCardLink(_movingTo);
    }
}

