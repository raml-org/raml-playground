package server.ricks;

import example.playground.types.JsonRick;
import example.playground.types.Rick;
import example.playground.resource.Ricks;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

public class RicksImpl implements Ricks {

  private HashMap<String, JsonRick> jsonRickMap = new HashMap<>();
  private HashMap<String, Rick> rickMap = new HashMap<>();

  @Override
  public GetRicksResponse getRicks() {
    List<Rick> ricks = new ArrayList<>(this.rickMap.values());
    return GetRicksResponse.respond200WithApplicationJson(ricks);
  }

  @Override
  public PostRicksResponse postRicks(Rick entity) {
    this.rickMap.put(entity.getSlug(), entity);
    return PostRicksResponse.respond200WithApplicationJson(entity);
  }

  @Override
  public GetRicksBySlugResponse getRicksBySlug(String slug) {
    return GetRicksBySlugResponse.respond200WithApplicationJson(
        this.jsonRickMap.get(slug));
  }
}
