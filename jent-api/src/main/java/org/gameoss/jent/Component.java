package org.gameoss.jent;

/**
 * A component.
 * 
 * @author Elvir Bahtijaragic
 */
public interface Component {
	/**
	 * Gets this {@link Component}'s {@link Entity}.
	 * 
	 * @return this {@link Component}'s {@link Entity} or null if this {@link Component} isn't bound to an {@link Entity} yet
	 */
	Entity entity();
}
