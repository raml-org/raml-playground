/*
 * Copyright 2013-2017 (c) MuleSoft, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific
 * language governing permissions and limitations under the License.
 */
package server.ricks;

import example.jsonschema.Rick;
import example.jsonschema.Ricks;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

public class RicksImpl implements Ricks {

  public static HashMap<String, Rick> ricksMap = new HashMap<String, Rick>();

  @Override
  public GetRicksResponse getRicks() {
    List<Rick> ricks = new ArrayList<Rick>(this.ricksMap.values());
    return GetRicksResponse.respond200WithApplicationJson(ricks);
  }

  @Override
  public PostRicksResponse postRicks(Rick entity) {
    this.ricksMap.put(entity.getSlug(), entity);
    return PostRicksResponse.respond200WithApplicationJson(entity);
  }

  @Override
  public GetRicksBySlugResponse getRicksBySlug(String slug) {
    return GetRicksBySlugResponse.respond200WithApplicationJson(
        this.ricksMap.get(slug));
  }
}
