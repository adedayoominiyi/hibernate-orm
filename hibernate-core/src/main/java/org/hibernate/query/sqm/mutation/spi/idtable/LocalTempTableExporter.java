/*
 * Hibernate, Relational Persistence for Idiomatic Java
 *
 * License: GNU Lesser General Public License (LGPL), version 2.1 or later
 * See the lgpl.txt file in the root directory or http://www.gnu.org/licenses/lgpl-2.1.html
 */
package org.hibernate.query.sqm.mutation.spi.idtable;

/**
 * @author Steve Ebersole
 */
public class LocalTempTableExporter extends IdTableExporterImpl {
	@Override
	protected String getCreateCommand() {
		return "create local temporary table";
	}
}