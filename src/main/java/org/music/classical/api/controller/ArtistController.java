package org.music.classical.api.controller;

import java.util.List;

import org.music.classical.api.model.Artist;
import org.music.classical.api.service.ArtistService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/api/artists")
@Tag(name = "Artist Management", description = "Operations related to artists in the classical music API")
public class ArtistController {

    private final ArtistService artistService;

    public ArtistController(ArtistService artistService) {
        this.artistService = artistService;
    }

    @GetMapping
    @Operation(summary = "Get all artists", description = "Retrieves a list of all artists")
    public List<Artist> getAllArtists() {
        return artistService.getAllArtists();
    }

    @GetMapping("/{id}")
    @Operation(summary = "Get artist by ID", description = "Retrieves a single artist by their ID")
    public Artist getArtistById(@PathVariable Long id) {
        return artistService.getArtistById(id);
    }

    @PostMapping
    @Operation(summary = "Create a new artist", description = "Adds a new artist to the system")
    public Artist createArtist(@RequestBody Artist artist) {
        return artistService.createArtist(artist);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Delete an artist", description = "Removes an artist from the system by their ID")
    public void deleteArtist(@PathVariable Long id) {
        artistService.deleteArtist(id);
    }
}
