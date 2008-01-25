/*******************************************************************************
* Copyright (c) 2007 Oracle. All rights reserved.
* This program and the accompanying materials are made available under the terms of
* the Eclipse Public License v1.0, which accompanies this distribution and is available at
* http://www.eclipse.org/legal/epl-v10.html.
*
* Contributors:
*     Oracle - initial API and implementation
******************************************************************************/
package org.eclipse.persistence.tools.workbench.uitools.cell;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractCellEditor;
import javax.swing.JTree;
import javax.swing.tree.TreeCellEditor;

/**
 * A tree cell editor that acts like a check box embedded in the cell.
 */
public class CheckBoxTreeCellEditor extends AbstractCellEditor implements TreeCellEditor {

	/** delegate some behavior to a renderer */
	protected CheckBoxTreeCellRenderer renderer;


	// ********** constructors/initialization **********

	private CheckBoxTreeCellEditor() {
		super();
	}

	/**
	 * Construct a cell editor that behaves like a check box and
	 * looks like the specified renderer.
	 */
	public CheckBoxTreeCellEditor(CheckBoxTreeCellRenderer renderer) {
		this();
		this.initialize(renderer);
	}

	protected void initialize(CheckBoxTreeCellRenderer r) {
		this.renderer = r;
		r.setEditing(true);
		// listen to the check box so we know when to stop editing
		r.addActionListener(this.buildActionListener());
	}

	protected ActionListener buildActionListener() {
		return new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// when the check box fires an action event, we stop editing
				CheckBoxTreeCellEditor.this.stopCellEditing();
			}
		};
	}

	// ********** CellEditor implementation **********

	/**
	 * @see javax.swing.CellEditor#getCellEditorValue()
	 */
	public Object getCellEditorValue() {
		return this.renderer.getValue();
	}


	// ********** TreeCellEditor implementation **********

	/**
	 * @see javax.swing.tree.TreeCellEditor#getTreeCellEditorComponent(javax.swing.JTree, java.lang.Object, boolean, boolean, boolean, int)
	 */
	public Component getTreeCellEditorComponent(JTree tree, Object value, boolean selected, boolean expanded, boolean leaf, int row) {
		return this.renderer.getTreeCellRendererComponent(tree, value, selected, expanded, leaf, row, true);
	}

}
