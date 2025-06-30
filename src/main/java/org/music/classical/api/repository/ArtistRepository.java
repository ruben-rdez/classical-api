package org.music.classical.api.repository;

import java.util.ArrayList;
import java.util.List;

import org.music.classical.api.model.Artist;
import org.springframework.stereotype.Repository;

@Repository
public class ArtistRepository {

    private final List<Artist> artists = new ArrayList<>();

    public ArtistRepository() {
        artists.add(new Artist(1L, "Ludwig van Beethoven", "Germany", "A crucial figure in the transition between the Classical and Romantic eras in Western music."));
        artists.add(new Artist(2L, "Johann Sebastian Bach", "Germany", "Known for instrumental compositions such as the Brandenburg Concertos and the Goldberg Variations."));
        artists.add(new Artist(3L, "Wolfgang Amadeus Mozart", "Austria", "A prolific and influential composer of the Classical era."));
    }

    public List<Artist> findAll() {
        return artists;
    }

    public Artist findById(Long id) {
        return artists.stream()
                .filter(artist -> artist.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public Artist save(Artist artist) {
        artists.add(artist);
        return artist;
    }

    public void deleteById(Long id) {
        artists.removeIf(artist -> artist.getId().equals(id));
    }
}
