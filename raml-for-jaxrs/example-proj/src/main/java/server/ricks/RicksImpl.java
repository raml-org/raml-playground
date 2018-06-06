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
