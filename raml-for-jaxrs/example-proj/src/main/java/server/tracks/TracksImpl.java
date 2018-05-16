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
package server.tracks;

import example.jsonschema.Track;
import example.jsonschema.Tracks;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

/**
 * Created by Jean-Philippe Belanger on 11/11/16. Just potential zeroes and ones
 */
public class TracksImpl implements Tracks {

  public static HashMap<String, Track> tracksMap = new HashMap<String, Track>();

  @Override
  public GetTracksResponse getTracks() {
    List<Track> tracks = new ArrayList<Track>(this.tracksMap.values());
    return GetTracksResponse.respond200WithApplicationJson(tracks);
  }

  @Override
  public PostTracksResponse postTracks(Track entity) {
    this.tracksMap.put(entity.getId(), entity);
    return PostTracksResponse.respond200WithApplicationJson(entity);
  }

  @Override
  public GetTracksByIdResponse getTracksById(String id) {
    return GetTracksByIdResponse.respond200WithApplicationJson(
        this.tracksMap.get(id));
  }
}
