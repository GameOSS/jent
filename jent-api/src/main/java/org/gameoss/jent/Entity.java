package org.gameoss.jent;

import java.util.Collection;

/**
 * An entity.
 * 
 * @author Elvir Bahtijaragic
 */
public interface Entity {
	/**
	 * The unique id of this {@link Entity}
	 * 
	 * @return
	 */
	String id();
	
	/**
	 * Gets this {@link Entity}'s children.
	 * 
	 * @return this {@link Entity}'s children or an empty {@link Collection} if this {@link Entity} doesn't have any children
	 */
	Collection<Entity> children();
	
	/**
	 * Gets this {@link Entity}'s parent.
	 * 
	 * @return this {@link Entity}'s parent or null if this is a root {@link Entity}
	 */
	Entity parent();
	
	/**
	 * Adds the child {@link Entity}s to this {@link Entity}.
	 * 
	 * @param entity the child {@link Entity} to add
	 * @return this {@link Entity}
	 */
	Entity addChild(Entity entity);
	
	/**
	 * Removes the given {@link Entity} child from this {@link Entity}.
	 * 
	 * @param entity the {@link Entity} to remove
	 * @return this {@link Entity}
	 */
	Entity removeChild(Entity entity);
	
	/**
	 * Gets this {@link Entity}'s {@link Component}s.
	 * 
	 * @return this {@link Entity}'s {@link Component}s or an empty {@link Collection} if this {@link Entity} doesn't have any {@link Component}s
	 */
	Collection<Component> components();
	
	/**
	 * Gets the first {@link Component} of the given type in this {@link Entity}.
	 * 
	 * @param componentClass the class of the {@link Component} to retrieve
	 * @return the first {@link Component} of the given type in this {@link Entity} or null if this {@link Entity} doesn't contain a component of the given type
	 */
	<T extends Component> T component(Class<T> componentClass);
	
	/**
	 * /**
	 * Gets this {@link Entity}'s {@link Component}s of the given class.
	 * 
	 * @param componentClass the class of the {@link Component}s to retrieve
	 * @return this {@link Entity}'s {@link Component}s of the given class or an empty {@link Collection} if this {@link Entity} doesn't have any {@link Component}s of the given class
	 */
	<T extends Component> Collection<T> components(Class<T> componentClass);
	
	/**
	 * Adds the given {@link Component} to this {@link Entity}.
	 * 
	 * @param component the {@link Component} to add into this {@link Entity}
	 * @return this {@link Entity}
	 */
	<T extends Component> Entity addComponent(T component);

	/**
	 * Adds the given {@link Component} to this {@link Entity} by constructing the {@link Component}'s using its default constructor.
	 * 
	 * @param componentClass the class of the {@link Component}s to add into this {@link Entity}
	 * @return this {@link Entity}
	 */
	<T extends Component> Entity addComponent(Class<T> componentClass);
	
	/**
	 * Removes the given {@link Component} from this {@link Entity}.
	 * 
	 * @param component the {@link Component} to remove
	 * @return this {@link Entity}
	 */
	Entity removeComponent(Component component);
}
