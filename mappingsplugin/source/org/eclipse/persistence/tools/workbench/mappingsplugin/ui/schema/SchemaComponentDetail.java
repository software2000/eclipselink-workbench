/*******************************************************************************
* Copyright (c) 2007 Oracle. All rights reserved.
* This program and the accompanying materials are made available under the terms of
* the Eclipse Public License v1.0, which accompanies this distribution and is available at
* http://www.eclipse.org/legal/epl-v10.html.
*
* Contributors:
*     Oracle - initial API and implementation
******************************************************************************/
package org.eclipse.persistence.tools.workbench.mappingsplugin.ui.schema;

import org.eclipse.persistence.tools.workbench.mappingsmodel.schema.MWSchemaComponent;
import org.eclipse.persistence.tools.workbench.utility.AbstractModel;
import org.eclipse.persistence.tools.workbench.utility.events.StateChangeEvent;
import org.eclipse.persistence.tools.workbench.utility.events.StateChangeListener;


abstract class SchemaComponentDetail 
	extends AbstractModel 
{
	protected MWSchemaComponent component;
	
	private String value;
		public final static String VALUE_PROPERTY = "value";
	
	
	SchemaComponentDetail(MWSchemaComponent component) {
		super();
		this.initialize(component);
		this.postInitialize();
	}
	
	protected void initialize(MWSchemaComponent component) {
		this.component = component;
		component.addStateChangeListener(this.buildStateChangeListener());
	}
	
	private void postInitialize() {
		this.value = this.getValueFromComponent();
	}
	
	private StateChangeListener buildStateChangeListener() {
		return new StateChangeListener() {
			public void stateChanged(StateChangeEvent e) {
				SchemaComponentDetail.this.valueChanged();
			}
		};
	}
	
	protected void valueChanged() {
		String oldValue = this.value;
		String newValue = this.getValueFromComponent();
		this.value = newValue;
		this.firePropertyChanged(VALUE_PROPERTY, oldValue, newValue);
	}
	
	protected abstract String getName();
	
	protected String getValue() {
		return this.value;
	}
	
	protected abstract String getValueFromComponent();
}
