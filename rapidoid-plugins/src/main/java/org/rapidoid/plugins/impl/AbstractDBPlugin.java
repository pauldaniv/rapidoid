package org.rapidoid.plugins.impl;

import java.util.Comparator;
import java.util.List;
import java.util.Map;

import org.rapidoid.lambda.Callback;
import org.rapidoid.lambda.Operation;
import org.rapidoid.lambda.Predicate;
import org.rapidoid.plugins.spec.DBPlugin;

/*
 * #%L
 * rapidoid-plugins
 * %%
 * Copyright (C) 2014 - 2015 Nikolche Mihajlovski
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

/**
 * @author Nikolche Mihajlovski
 * @since 3.0.0
 */
public class AbstractDBPlugin implements DBPlugin {

	@Override
	public long insert(Object entity) {
		throw new AbstractMethodError("Not implemented!");
	}

	@Override
	public void update(Object entity) {
		throw new AbstractMethodError("Not implemented!");
	}

	@Override
	public void update(long id, Object entity) {
		throw new AbstractMethodError("Not implemented!");
	}

	@Override
	public long persist(Object record) {
		throw new AbstractMethodError("Not implemented!");
	}

	@Override
	public long insertOrGetId(Object record) {
		throw new AbstractMethodError("Not implemented!");
	}

	@Override
	public <T> List<T> getAll(Class<T> clazz) {
		throw new AbstractMethodError("Not implemented!");
	}

	@Override
	public void refresh(Object entity) {
		throw new AbstractMethodError("Not implemented!");
	}

	@Override
	public void delete(Object entity) {
		throw new AbstractMethodError("Not implemented!");
	}

	@Override
	public <T> List<T> find(Class<T> clazz, Predicate<T> match, Comparator<T> orderBy) {
		throw new AbstractMethodError("Not implemented!");
	}

	@Override
	public <E> List<E> find(Predicate<E> match) {
		throw new AbstractMethodError("Not implemented!");
	}

	@Override
	public <E> E entity(Class<E> entityType, Map<String, ?> properties) {
		throw new AbstractMethodError("Not implemented!");
	}

	@Override
	public <E> List<E> query(Class<E> clazz, String query, Object... args) {
		throw new AbstractMethodError("Not implemented!");
	}

	@Override
	public <RESULT> RESULT sql(String sql, Object... args) {
		throw new AbstractMethodError("Not implemented!");
	}

	@Override
	public <E> void each(Operation<E> lambda) {
		throw new AbstractMethodError("Not implemented!");
	}

	@Override
	public void transaction(Runnable transaction, boolean readOnly) {
		throw new AbstractMethodError("Not implemented!");
	}

	@Override
	public void transaction(Runnable tx, boolean readonly, Callback<Void> callback) {
		throw new AbstractMethodError("Not implemented!");
	}

	@Override
	public void deleteAllData() {
		throw new AbstractMethodError("Not implemented!");
	}

	@Override
	public <T> T get(Class<T> clazz, long id) {
		throw new AbstractMethodError("Not implemented!");
	}

	@Override
	public <T> T getIfExists(Class<T> clazz, long id) {
		throw new AbstractMethodError("Not implemented!");
	}

	@Override
	public <E> List<E> getAll() {
		throw new AbstractMethodError("Not implemented!");
	}

	@Override
	public <E> List<E> getAll(Class<E> clazz, long... ids) {
		throw new AbstractMethodError("Not implemented!");
	}

	@Override
	public <E> List<E> getAll(Class<E> clazz, Iterable<Long> ids) {
		throw new AbstractMethodError("Not implemented!");
	}

	@Override
	public <E> void delete(Class<E> clazz, long id) {
		throw new AbstractMethodError("Not implemented!");
	}

	@Override
	public <T> List<T> fullTextSearch(String query) {
		throw new AbstractMethodError("Not implemented!");
	}

	@Override
	public long size() {
		throw new AbstractMethodError("Not implemented!");
	}

}
