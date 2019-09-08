//
// Created by BONNe
// Copyright - 2019
//


package world.bentobox.challenges.database.object.requirements;


import com.google.gson.annotations.Expose;
import java.util.HashSet;
import java.util.Set;


/**
 * This abstract class allows to define requirements for each challenge.
 */
public abstract class Requirements
{
	/**
	 * Constructor Requirements creates a new Requirements instance.
	 */
	public Requirements()
	{
		// Empty Constructor
	}


// ---------------------------------------------------------------------
// Section: Getters and Setters
// ---------------------------------------------------------------------


	/**
	 * Method Requirements#getRequiredPermissions returns the requiredPermissions of this object.
	 *
	 * @return the requiredPermissions (type Set<String>) of this object.
	 */
	public Set<String> getRequiredPermissions()
	{
		return requiredPermissions;
	}


	/**
	 * Method Requirements#setRequiredPermissions sets new value for the requiredPermissions of this object.
	 * @param requiredPermissions new value for this object.
	 *
	 */
	public void setRequiredPermissions(Set<String> requiredPermissions)
	{
		this.requiredPermissions = requiredPermissions;
	}


// ---------------------------------------------------------------------
// Section: Other Methods
// ---------------------------------------------------------------------


	/**
	 * Method Requirements#clone allows to clone Requirements object, to avoid changing content when it is necessary
	 * to use it.
	 * @return Requirements clone
	 */
	@Override
	public abstract Requirements clone();


// ---------------------------------------------------------------------
// Section: Variables
// ---------------------------------------------------------------------


	/**
	 * This set contains all permission strings that ir required for player to complete challenge.
	 */
	@Expose
	private Set<String> requiredPermissions = new HashSet<>();
}

