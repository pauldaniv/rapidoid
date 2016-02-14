package org.rapidoid.reload;

/*
 * #%L
 * rapidoid-integration-tests
 * %%
 * Copyright (C) 2014 - 2016 Nikolche Mihajlovski and contributors
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

import org.rapidoid.http.On;
import org.rapidoid.http.Req;

/**
 * Demo for class reloading. E.g. try changing the Abc class...
 */
public class ReloadDemo {

	public static void main(String[] args) {
		On.bootstrap();

		On.changes().reload();
//		On.changes().restart();

		On.get("/aa").json((Req req, String x) -> x + ":" + req);
	}

}
