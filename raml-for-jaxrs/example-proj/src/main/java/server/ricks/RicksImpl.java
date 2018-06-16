package server.ricks;

import example.playground.types.RamlRick;
import example.playground.types.Rick;
import example.playground.resource.Ricks;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

public class RicksImpl implements Ricks {

  private HashMap<String, RamlRick> ramlRickMap = new HashMap<>();
  private HashMap<String, Rick> rickMap = new HashMap<>();

  @Override
  public GetRicksResponse getRicks() {
    List<RamlRick> ricks = new ArrayList<>(this.ramlRickMap.values());
    return GetRicksResponse.respond200WithApplicationJson(ricks);
  }

  @Override
  public PostRicksResponse postRicks(RamlRick entity) {
    this.ramlRickMap.put(entity.getSlug(), entity);
    return PostRicksResponse.respond200WithApplicationJson(entity);
  }

  @Override
  public GetRicksBySlugResponse getRicksBySlug(String slug) {
    return GetRicksBySlugResponse.respond200WithApplicationJson(
        this.rickMap.get(slug));
  }
}
