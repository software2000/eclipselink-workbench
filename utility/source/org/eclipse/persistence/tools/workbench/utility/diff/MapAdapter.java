/*******************************************************************************
* Copyright (c) 2007 Oracle. All rights reserved.
* This program and the accompanying materials are made available under the terms of
* the Eclipse Public License v1.0, which accompanies this distribution and is available at
* http://www.eclipse.org/legal/epl-v10.html.
*
* Contributors:
*     Oracle - initial API and implementation
******************************************************************************/
package org.eclipse.persistence.tools.workbench.utility.diff;

import java.util.Iterator;
import java.util.Map;

/**
 * This adapter assumes that two containers are Maps.
 * Use a map entry differentiator to compare the entries' values.
 */
public class MapAdapter
	implements ContainerDifferentiator.Adapter
{

	// singleton
	private static MapAdapter INSTANCE;

	/**
	 * Return the singleton.
	 */
	public static synchronized MapAdapter instance() {
		if (INSTANCE == null) {
			INSTANCE = new MapAdapter();
		}
		return INSTANCE;
	}

	/**
	 * Allow subclasses.
	 */
	protected MapAdapter() {
		super();
	}

	/**
	 * @see ContainerDifferentiator.Adapter#diffIsFatal(Object, Object)
	 */
	public boolean diffIsFatal(Object object1, Object object2) {
		if ( ! (object1 instanceof Map)) {
			return true;
		}
		if ( ! (object2 instanceof Map)) {
			return true;
		}
		return false;
	}

	/**
	 * @see ContainerDifferentiator.Adapter#containerClass()
	 */
	public Class containerClass() {
		return Map.class;
	}

	/**
	 * @see ContainerDifferentiator.Adapter#size(Object)
	 */
	public int size(Object container) {
		return ((Map) container).size();
	}

	/**
	 * @see ContainerDifferentiator.Adapter#iterator(Object)
	 */
	public Iterator iterator(Object container) {
		return ((Map) container).entrySet().iterator();
	}

	/**
	 * @see Object#toString()
	 */
	public String toString() {
		return "MapAdapter";
	}

}
