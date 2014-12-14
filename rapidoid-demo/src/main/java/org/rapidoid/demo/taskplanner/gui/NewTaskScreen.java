package org.rapidoid.demo.taskplanner.gui;

/*
 * #%L
 * rapidoid-demo
 * %%
 * Copyright (C) 2014 Nikolche Mihajlovski
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

import org.rapidoid.annotation.Session;
import org.rapidoid.db.DB;
import org.rapidoid.demo.taskplanner.model.Priority;
import org.rapidoid.demo.taskplanner.model.Task;
import org.rapidoid.html.Tag;
import org.rapidoid.html.tag.FormTag;

public class NewTaskScreen extends GUI {

	@Session
	private Task task = new Task("Buy milk!", Priority.MEDIUM);

	public Object content() {

		Tag caption = h1("Add new task");

		FormTag frm = edit(task, SAVE_CANCEL, "title", "priority");

		Tag recent = h3("Most recent tasks:");

		Tag grid = grid(Task.class, "-id", 3, "id", "priority", "title");

		return row(caption, frm, recent, grid);
	}

	public void onSave() {
		DB.insert(task);
		task = null;
	}

	public void onCancel() {
		task = new Task("Buy milk!", Priority.MEDIUM);
	}

}
